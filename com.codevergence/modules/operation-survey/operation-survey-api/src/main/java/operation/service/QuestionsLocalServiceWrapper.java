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
 * Provides a wrapper for {@link QuestionsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuestionsLocalService
 * @generated
 */
@ProviderType
public class QuestionsLocalServiceWrapper
	implements QuestionsLocalService, ServiceWrapper<QuestionsLocalService> {

	public QuestionsLocalServiceWrapper(
		QuestionsLocalService questionsLocalService) {

		_questionsLocalService = questionsLocalService;
	}

	/**
	 * Adds the questions to the database. Also notifies the appropriate model listeners.
	 *
	 * @param questions the questions
	 * @return the questions that was added
	 */
	@Override
	public operation.model.Questions addQuestions(
		operation.model.Questions questions) {

		return _questionsLocalService.addQuestions(questions);
	}

	@Override
	public operation.model.Questions addQuestions(
			String question, org.omg.IOP.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _questionsLocalService.addQuestions(question, serviceContext);
	}

	/**
	 * Creates a new questions with the primary key. Does not add the questions to the database.
	 *
	 * @param id the primary key for the new questions
	 * @return the new questions
	 */
	@Override
	public operation.model.Questions createQuestions(long id) {
		return _questionsLocalService.createQuestions(id);
	}

	@Override
	public void deleteAllQuestions() {
		_questionsLocalService.deleteAllQuestions();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _questionsLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the questions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the questions
	 * @return the questions that was removed
	 * @throws PortalException if a questions with the primary key could not be found
	 */
	@Override
	public operation.model.Questions deleteQuestions(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _questionsLocalService.deleteQuestions(id);
	}

	/**
	 * Deletes the questions from the database. Also notifies the appropriate model listeners.
	 *
	 * @param questions the questions
	 * @return the questions that was removed
	 */
	@Override
	public operation.model.Questions deleteQuestions(
		operation.model.Questions questions) {

		return _questionsLocalService.deleteQuestions(questions);
	}

	@Override
	public operation.model.Questions deleteQuestionsById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _questionsLocalService.deleteQuestionsById(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _questionsLocalService.dynamicQuery();
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

		return _questionsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>operation.model.impl.QuestionsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _questionsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>operation.model.impl.QuestionsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _questionsLocalService.dynamicQuery(
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

		return _questionsLocalService.dynamicQueryCount(dynamicQuery);
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

		return _questionsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public operation.model.Questions editQuestions(
			long id, String question, org.omg.IOP.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _questionsLocalService.editQuestions(
			id, question, serviceContext);
	}

	@Override
	public operation.model.Questions fetchQuestions(long id) {
		return _questionsLocalService.fetchQuestions(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _questionsLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<operation.model.Questions> getAllQuestions() {
		return _questionsLocalService.getAllQuestions();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _questionsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _questionsLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _questionsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the questions with the primary key.
	 *
	 * @param id the primary key of the questions
	 * @return the questions
	 * @throws PortalException if a questions with the primary key could not be found
	 */
	@Override
	public operation.model.Questions getQuestions(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _questionsLocalService.getQuestions(id);
	}

	/**
	 * Returns a range of all the questionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>operation.model.impl.QuestionsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of questionses
	 * @param end the upper bound of the range of questionses (not inclusive)
	 * @return the range of questionses
	 */
	@Override
	public java.util.List<operation.model.Questions> getQuestionses(
		int start, int end) {

		return _questionsLocalService.getQuestionses(start, end);
	}

	/**
	 * Returns the number of questionses.
	 *
	 * @return the number of questionses
	 */
	@Override
	public int getQuestionsesCount() {
		return _questionsLocalService.getQuestionsesCount();
	}

	/**
	 * Updates the questions in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param questions the questions
	 * @return the questions that was updated
	 */
	@Override
	public operation.model.Questions updateQuestions(
		operation.model.Questions questions) {

		return _questionsLocalService.updateQuestions(questions);
	}

	@Override
	public void validation(String question)
		throws com.liferay.portal.kernel.exception.PortalException {

		_questionsLocalService.validation(question);
	}

	@Override
	public QuestionsLocalService getWrappedService() {
		return _questionsLocalService;
	}

	@Override
	public void setWrappedService(QuestionsLocalService questionsLocalService) {
		_questionsLocalService = questionsLocalService;
	}

	private QuestionsLocalService _questionsLocalService;

}