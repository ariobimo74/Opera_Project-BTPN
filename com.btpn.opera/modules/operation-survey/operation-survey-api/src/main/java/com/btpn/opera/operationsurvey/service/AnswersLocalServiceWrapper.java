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

package com.btpn.opera.operationsurvey.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link AnswersLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AnswersLocalService
 * @generated
 */
@ProviderType
public class AnswersLocalServiceWrapper
	implements AnswersLocalService, ServiceWrapper<AnswersLocalService> {

	public AnswersLocalServiceWrapper(AnswersLocalService answersLocalService) {
		_answersLocalService = answersLocalService;
	}

	/**
	 * Adds the answers to the database. Also notifies the appropriate model listeners.
	 *
	 * @param answers the answers
	 * @return the answers that was added
	 */
	@Override
	public com.btpn.opera.operationsurvey.model.Answers addAnswers(
		com.btpn.opera.operationsurvey.model.Answers answers) {

		return _answersLocalService.addAnswers(answers);
	}

	@Override
	public com.btpn.opera.operationsurvey.model.Answers addAnswers(
			String answer, double value, long questionsId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _answersLocalService.addAnswers(
			answer, value, questionsId, serviceContext);
	}

	/**
	 * Creates a new answers with the primary key. Does not add the answers to the database.
	 *
	 * @param id the primary key for the new answers
	 * @return the new answers
	 */
	@Override
	public com.btpn.opera.operationsurvey.model.Answers createAnswers(long id) {
		return _answersLocalService.createAnswers(id);
	}

	/**
	 * Deletes the answers from the database. Also notifies the appropriate model listeners.
	 *
	 * @param answers the answers
	 * @return the answers that was removed
	 */
	@Override
	public com.btpn.opera.operationsurvey.model.Answers deleteAnswers(
		com.btpn.opera.operationsurvey.model.Answers answers) {

		return _answersLocalService.deleteAnswers(answers);
	}

	/**
	 * Deletes the answers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the answers
	 * @return the answers that was removed
	 * @throws PortalException if a answers with the primary key could not be found
	 */
	@Override
	public com.btpn.opera.operationsurvey.model.Answers deleteAnswers(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _answersLocalService.deleteAnswers(id);
	}

	@Override
	public com.btpn.opera.operationsurvey.model.Answers deleteAnswersById(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _answersLocalService.deleteAnswersById(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _answersLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _answersLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _answersLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.btpn.opera.operationsurvey.model.impl.AnswersModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _answersLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.btpn.opera.operationsurvey.model.impl.AnswersModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _answersLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _answersLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _answersLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.btpn.opera.operationsurvey.model.Answers editAnswers(
			long id, String answer, double value, long questionsId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _answersLocalService.editAnswers(
			id, answer, value, questionsId, serviceContext);
	}

	@Override
	public com.btpn.opera.operationsurvey.model.Answers fetchAnswers(long id) {
		return _answersLocalService.fetchAnswers(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _answersLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.btpn.opera.operationsurvey.model.Answers>
		getAllAnswers() {

		return _answersLocalService.getAllAnswers();
	}

	/**
	 * Returns the answers with the primary key.
	 *
	 * @param id the primary key of the answers
	 * @return the answers
	 * @throws PortalException if a answers with the primary key could not be found
	 */
	@Override
	public com.btpn.opera.operationsurvey.model.Answers getAnswers(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _answersLocalService.getAnswers(id);
	}

	@Override
	public com.btpn.opera.operationsurvey.model.Answers getAnswersById(
		long id) {

		return _answersLocalService.getAnswersById(id);
	}

	@Override
	public java.util.List<com.btpn.opera.operationsurvey.model.Answers>
		getAnswersByQuestionsId(long questionsId) {

		return _answersLocalService.getAnswersByQuestionsId(questionsId);
	}

	/**
	 * Returns a range of all the answerses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.btpn.opera.operationsurvey.model.impl.AnswersModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of answerses
	 * @param end the upper bound of the range of answerses (not inclusive)
	 * @return the range of answerses
	 */
	@Override
	public java.util.List<com.btpn.opera.operationsurvey.model.Answers>
		getAnswerses(int start, int end) {

		return _answersLocalService.getAnswerses(start, end);
	}

	/**
	 * Returns the number of answerses.
	 *
	 * @return the number of answerses
	 */
	@Override
	public int getAnswersesCount() {
		return _answersLocalService.getAnswersesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _answersLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _answersLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _answersLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the answers in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param answers the answers
	 * @return the answers that was updated
	 */
	@Override
	public com.btpn.opera.operationsurvey.model.Answers updateAnswers(
		com.btpn.opera.operationsurvey.model.Answers answers) {

		return _answersLocalService.updateAnswers(answers);
	}

	@Override
	public void validation(double value)
		throws com.liferay.portal.kernel.exception.PortalException {

		_answersLocalService.validation(value);
	}

	@Override
	public AnswersLocalService getWrappedService() {
		return _answersLocalService;
	}

	@Override
	public void setWrappedService(AnswersLocalService answersLocalService) {
		_answersLocalService = answersLocalService;
	}

	private AnswersLocalService _answersLocalService;

}