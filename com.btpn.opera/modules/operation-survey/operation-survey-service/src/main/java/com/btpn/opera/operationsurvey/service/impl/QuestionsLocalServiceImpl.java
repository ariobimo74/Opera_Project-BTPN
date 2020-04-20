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

import com.btpn.opera.operationsurvey.model.Questions;
import com.btpn.opera.operationsurvey.service.base.QuestionsLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * The implementation of the questions local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.btpn.opera.operationsurvey.service.QuestionsLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuestionsLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.btpn.opera.operationsurvey.model.Questions",
	service = AopService.class
)
public class QuestionsLocalServiceImpl extends QuestionsLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.btpn.opera.operationsurvey.service.QuestionsLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.btpn.opera.operationsurvey.service.QuestionsLocalServiceUtil</code>.
	 */

	public List<Questions> getAllQuestions()
	{
		return questionsPersistence.findAll();
	}

	public Questions getQuestionsById(long id) throws PortalException
	{
		return questionsPersistence.findByPrimaryKey(id);
	}

	public List<Questions> getQuestionsBySurveyOperationId(long surveyOperationId)
	{
		return questionsPersistence.findBySurveyOperationId(surveyOperationId);
	}

	public Questions addQuestions(String question, String answer, long surveyOperationId, ServiceContext serviceContext)
	{
		long id = counterLocalService.increment();
		Questions questions = questionsPersistence.create(id);

		questions.setQuestion(question);
		questions.setAnswer(answer);
		questions.setSurveyOperationId(surveyOperationId);

		return questionsPersistence.update(questions);
	}

	public Questions editQuestions(long id, String question, String answer, long surveyOperationId, ServiceContext serviceContext) throws PortalException
	{
		Questions questions = questionsPersistence.findByPrimaryKey(id);

		questions.setQuestion(question);
		questions.setAnswer(answer);
		questions.setSurveyOperationId(surveyOperationId);

		return questionsPersistence.update(questions);
	}

	public Questions deleteQuestionsById(long id) throws PortalException
	{
		return questionsPersistence.remove(id);
	}

	public void deleteAllQuestionsBySurveyOperationId(long surveyOperationId)
	{
		questionsPersistence.removeBySurveyOperationId(surveyOperationId);
	}

	public List<Questions> getQuestionsBySurveyOperationIdQuery(long surveyOperationId)
	{
		return questionsFinder.findQuestionsBySurveyOperationIdQuery(surveyOperationId);
	}
}