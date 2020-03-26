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

package operation.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link QuestionsService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuestionsService
 * @generated
 */
@ProviderType
public class QuestionsServiceWrapper
	implements QuestionsService, ServiceWrapper<QuestionsService> {

	public QuestionsServiceWrapper(QuestionsService questionsService) {
		_questionsService = questionsService;
	}

	@Override
	public operation.model.Questions addQuestions(
		String question, String answer, double value,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return _questionsService.addQuestions(
			question, answer, value, serviceContext);
	}

	@Override
	public void deleteAllQuestions() {
		_questionsService.deleteAllQuestions();
	}

	@Override
	public operation.model.Questions deleteQuestionsById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _questionsService.deleteQuestionsById(id);
	}

	@Override
	public operation.model.Questions editQuestions(
			long id, String question, String answer, double value,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _questionsService.editQuestions(
			id, question, answer, value, serviceContext);
	}

	@Override
	public java.util.List<operation.model.Questions> getAllQuestions() {
		return _questionsService.getAllQuestions();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _questionsService.getOSGiServiceIdentifier();
	}

	@Override
	public operation.model.Questions getQuestionsById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _questionsService.getQuestionsById(id);
	}

	@Override
	public java.util.List<operation.model.Questions> getQuestionsByQuestion(
		String question) {

		return _questionsService.getQuestionsByQuestion(question);
	}

	@Override
	public QuestionsService getWrappedService() {
		return _questionsService;
	}

	@Override
	public void setWrappedService(QuestionsService questionsService) {
		_questionsService = questionsService;
	}

	private QuestionsService _questionsService;

}