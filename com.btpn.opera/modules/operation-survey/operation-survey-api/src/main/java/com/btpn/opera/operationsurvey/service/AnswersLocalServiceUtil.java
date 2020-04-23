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

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Answers. This utility wraps
 * <code>com.btpn.opera.operationsurvey.service.impl.AnswersLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AnswersLocalService
 * @generated
 */
@ProviderType
public class AnswersLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.btpn.opera.operationsurvey.service.impl.AnswersLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the answers to the database. Also notifies the appropriate model listeners.
	 *
	 * @param answers the answers
	 * @return the answers that was added
	 */
	public static com.btpn.opera.operationsurvey.model.Answers addAnswers(
		com.btpn.opera.operationsurvey.model.Answers answers) {

		return getService().addAnswers(answers);
	}

	public static com.btpn.opera.operationsurvey.model.Answers addAnswers(
			String answer, double value, long questionsId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addAnswers(
			answer, value, questionsId, serviceContext);
	}

	/**
	 * Creates a new answers with the primary key. Does not add the answers to the database.
	 *
	 * @param id the primary key for the new answers
	 * @return the new answers
	 */
	public static com.btpn.opera.operationsurvey.model.Answers createAnswers(
		long id) {

		return getService().createAnswers(id);
	}

	/**
	 * Deletes the answers from the database. Also notifies the appropriate model listeners.
	 *
	 * @param answers the answers
	 * @return the answers that was removed
	 */
	public static com.btpn.opera.operationsurvey.model.Answers deleteAnswers(
		com.btpn.opera.operationsurvey.model.Answers answers) {

		return getService().deleteAnswers(answers);
	}

	/**
	 * Deletes the answers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the answers
	 * @return the answers that was removed
	 * @throws PortalException if a answers with the primary key could not be found
	 */
	public static com.btpn.opera.operationsurvey.model.Answers deleteAnswers(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteAnswers(id);
	}

	public static com.btpn.opera.operationsurvey.model.Answers
			deleteAnswersById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteAnswersById(id);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.btpn.opera.operationsurvey.model.Answers editAnswers(
			long id, String answer, double value, long questionsId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().editAnswers(
			id, answer, value, questionsId, serviceContext);
	}

	public static com.btpn.opera.operationsurvey.model.Answers fetchAnswers(
		long id) {

		return getService().fetchAnswers(id);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static java.util.List<com.btpn.opera.operationsurvey.model.Answers>
		getAllAnswers() {

		return getService().getAllAnswers();
	}

	/**
	 * Returns the answers with the primary key.
	 *
	 * @param id the primary key of the answers
	 * @return the answers
	 * @throws PortalException if a answers with the primary key could not be found
	 */
	public static com.btpn.opera.operationsurvey.model.Answers getAnswers(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getAnswers(id);
	}

	public static com.btpn.opera.operationsurvey.model.Answers getAnswersById(
		long id) {

		return getService().getAnswersById(id);
	}

	public static java.util.List<com.btpn.opera.operationsurvey.model.Answers>
		getAnswersByQuestionsId(long questionsId) {

		return getService().getAnswersByQuestionsId(questionsId);
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
	public static java.util.List<com.btpn.opera.operationsurvey.model.Answers>
		getAnswerses(int start, int end) {

		return getService().getAnswerses(start, end);
	}

	/**
	 * Returns the number of answerses.
	 *
	 * @return the number of answerses
	 */
	public static int getAnswersesCount() {
		return getService().getAnswersesCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the answers in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param answers the answers
	 * @return the answers that was updated
	 */
	public static com.btpn.opera.operationsurvey.model.Answers updateAnswers(
		com.btpn.opera.operationsurvey.model.Answers answers) {

		return getService().updateAnswers(answers);
	}

	public static void validation(double value)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().validation(value);
	}

	public static AnswersLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AnswersLocalService, AnswersLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(AnswersLocalService.class);

		ServiceTracker<AnswersLocalService, AnswersLocalService>
			serviceTracker =
				new ServiceTracker<AnswersLocalService, AnswersLocalService>(
					bundle.getBundleContext(), AnswersLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}