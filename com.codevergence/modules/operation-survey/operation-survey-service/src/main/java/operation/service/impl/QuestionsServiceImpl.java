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
import com.liferay.portal.kernel.service.ServiceContext;
import operation.model.Questions;
import operation.service.base.QuestionsServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * The implementation of the questions remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>operation.service.QuestionsService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuestionsServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=surveyoperation",
		"json.web.service.context.path=Questions"
	},
	service = AopService.class
)
public class QuestionsServiceImpl extends QuestionsServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>operation.service.QuestionsServiceUtil</code> to access the questions remote service.
	 */

	public List<Questions> getAllQuestions()
	{
		return questionsLocalService.getAllQuestions();
	}

	public Questions getQuestionsById(long id) throws PortalException
	{
		return questionsLocalService.getQuestionsById(id);
	}

	public Questions addQuestions(String question, String answer, double value, ServiceContext serviceContext)
	{
		return questionsLocalService.addQuestions(question, answer, value, serviceContext);
	}

	public Questions editQuestions(long id, String question, String answer, double value, ServiceContext serviceContext) throws PortalException
	{
		return questionsLocalService.editQuestions(id, question, answer, value, serviceContext);
	}

	public Questions deleteQuestionsById(long id) throws PortalException
	{
		return questionsLocalService.deleteQuestionsById(id);
	}

	public void deleteAllQuestions()
	{
		questionsLocalService.deleteAllQuestions();
	}

	public List<Questions> getQuestionsByQuestion(String question)
	{
		return questionsLocalService.getQuestionsByQuestion(question);
	}
}