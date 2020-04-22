/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.btpn.opera.operationsurvey.service.impl;

import com.btpn.opera.operationsurvey.exception.ValueException;
import com.btpn.opera.operationsurvey.model.Answers;
import com.btpn.opera.operationsurvey.service.base.AnswersLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.Validator;
import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * The implementation of the answers local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.btpn.opera.operationsurvey.service.AnswersLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AnswersLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.btpn.opera.operationsurvey.model.Answers",
	service = AopService.class
)
public class AnswersLocalServiceImpl extends AnswersLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.btpn.opera.operationsurvey.service.AnswersLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.btpn.opera.operationsurvey.service.AnswersLocalServiceUtil</code>.
	 */

	public List<Answers> getAllAnswers()
	{
		return answersPersistence.findAll();
	}

	public Answers getAnswersById(long id) throws PortalException
	{
		return answersPersistence.findByPrimaryKey(id);
	}

	public Answers addAnswers(String answer, double value, long questionsId, ServiceContext serviceContext) throws PortalException
	{
		long id = counterLocalService.increment();
		Answers answers = answersPersistence.create(id);

		validation(value);

		answers.setAnswer(answer);
		answers.setValue(value);
		answers.setQuestionsId(questionsId);

		return answersPersistence.update(answers);
	}

	public Answers editAnswers(long id, String answer, double value, long questionsId, ServiceContext serviceContext) throws PortalException
	{
		Answers answers = answersPersistence.findByPrimaryKey(id);

		answers.setAnswer(answer);
		answers.setValue(value);
		answers.setQuestionsId(questionsId);

		return answersPersistence.update(answers);
	}

	public Answers deleteAnswersById(long id) throws PortalException
	{
		return answersPersistence.remove(id);
	}

	public List<Answers> getAnswersByQuestionsId(long questionsId)
	{
		return answersPersistence.findByQuestionsId(questionsId);
	}

	public void validation(double value) throws PortalException
	{
		if (Validator.isNull(value))
		{
			throw new ValueException();
		}
	}
}