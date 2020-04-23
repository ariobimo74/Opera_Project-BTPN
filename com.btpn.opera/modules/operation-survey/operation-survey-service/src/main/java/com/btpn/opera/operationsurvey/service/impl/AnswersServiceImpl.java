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

import com.btpn.opera.operationsurvey.model.Answers;
import com.btpn.opera.operationsurvey.service.base.AnswersServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * The implementation of the answers remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.btpn.opera.operationsurvey.service.AnswersService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AnswersServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=operationsurvey",
		"json.web.service.context.path=Answers"
	},
	service = AopService.class
)
public class AnswersServiceImpl extends AnswersServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.btpn.opera.operationsurvey.service.AnswersServiceUtil</code> to access the answers remote service.
	 */

	public List<Answers> getAllAnswers()
	{
		return answersLocalService.getAllAnswers();
	}

	public Answers getAnswersById(long id)
	{
		return answersLocalService.getAnswersById(id);
	}

	public Answers addAnswers(String answer, double value, long questionsId, ServiceContext serviceContext) throws PortalException
	{
		return answersLocalService.addAnswers(answer, value, questionsId, serviceContext);
	}

	public Answers editAnswers(long id, String answer, double value, long questionsId, ServiceContext serviceContext) throws PortalException
	{
		return answersLocalService.editAnswers(id,  answer, value, questionsId, serviceContext);
	}

	public Answers deleteAnswersById(long id) throws PortalException
	{
		return answersLocalService.deleteAnswersById(id);
	}

	public List<Answers> getAnswersByQuestionsId(long questionsId)
	{
		return answersLocalService.getAnswersByQuestionsId(questionsId);
	}
}