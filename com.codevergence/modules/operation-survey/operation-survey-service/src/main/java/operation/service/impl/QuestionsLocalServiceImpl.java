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

package operation.service.impl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.Validator;
import operation.exception.QuestionsQuestionException;
import operation.model.Questions;
import operation.service.base.QuestionsLocalServiceBaseImpl;

import org.omg.IOP.ServiceContext;
import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * The implementation of the questions local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>operation.service.QuestionsLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuestionsLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=operation.model.Questions",
	service = AopService.class
)
public class QuestionsLocalServiceImpl extends QuestionsLocalServiceBaseImpl
{
	public List<Questions> getAllQuestions()
	{
		return questionsPersistence.findAll();
	}

	public Questions addQuestions(String question, String answer, double value, ServiceContext serviceContext) throws PortalException
	{
		long id = counterLocalService.increment();
		Questions questions = questionsPersistence.create(id);

		validation(question);

		questions.setQuestion(question);
		questions.setAnswer(answer);
		questions.setValue(value);

		return questionsPersistence.update(questions);
	}

	public Questions editQuestions(long id, String question, String answer, double value, ServiceContext serviceContext) throws PortalException
	{
		Questions questions = questionsPersistence.findByPrimaryKey(id);

		validation(question);

		questions.setQuestion(question);
		questions.setAnswer(answer);
		questions.setValue(value);

		return questionsPersistence.update(questions);
	}

	public Questions deleteQuestionsById(long id) throws PortalException
	{
		return questionsPersistence.remove(id);
	}

	public void deleteAllQuestions()
	{
		questionsPersistence.removeAll();
	}

	public void validation(String question) throws PortalException
	{
		if (Validator.isNull(question))
		{
			throw new QuestionsQuestionException();
		}
	}
}