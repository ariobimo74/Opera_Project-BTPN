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

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Questions. This utility wraps
 * <code>operation.service.impl.QuestionsLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see QuestionsLocalService
 * @generated
 */
@ProviderType
public class QuestionsLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>operation.service.impl.QuestionsLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the questions to the database. Also notifies the appropriate model listeners.
	 *
	 * @param questions the questions
	 * @return the questions that was added
	 */
	public static operation.model.Questions addQuestions(
		operation.model.Questions questions) {

		return getService().addQuestions(questions);
	}

	public static operation.model.Questions addQuestions(
		String question, String answer, double value,
		org.omg.IOP.ServiceContext serviceContext) {

		return getService().addQuestions(
			question, answer, value, serviceContext);
	}

	/**
	 * Creates a new questions with the primary key. Does not add the questions to the database.
	 *
	 * @param id the primary key for the new questions
	 * @return the new questions
	 */
	public static operation.model.Questions createQuestions(long id) {
		return getService().createQuestions(id);
	}

	public static void deleteAllQuestions() {
		getService().deleteAllQuestions();
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

	/**
	 * Deletes the questions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the questions
	 * @return the questions that was removed
	 * @throws PortalException if a questions with the primary key could not be found
	 */
	public static operation.model.Questions deleteQuestions(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteQuestions(id);
	}

	/**
	 * Deletes the questions from the database. Also notifies the appropriate model listeners.
	 *
	 * @param questions the questions
	 * @return the questions that was removed
	 */
	public static operation.model.Questions deleteQuestions(
		operation.model.Questions questions) {

		return getService().deleteQuestions(questions);
	}

	public static operation.model.Questions deleteQuestionsById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteQuestionsById(id);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>operation.model.impl.QuestionsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>operation.model.impl.QuestionsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static operation.model.Questions editQuestions(
			long id, String question, String answer, double value,
			org.omg.IOP.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().editQuestions(
			id, question, answer, value, serviceContext);
	}

	public static operation.model.Questions fetchQuestions(long id) {
		return getService().fetchQuestions(id);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static java.util.List<operation.model.Questions> getAllQuestions() {
		return getService().getAllQuestions();
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
	 * Returns the questions with the primary key.
	 *
	 * @param id the primary key of the questions
	 * @return the questions
	 * @throws PortalException if a questions with the primary key could not be found
	 */
	public static operation.model.Questions getQuestions(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getQuestions(id);
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
	public static java.util.List<operation.model.Questions> getQuestionses(
		int start, int end) {

		return getService().getQuestionses(start, end);
	}

	/**
	 * Returns the number of questionses.
	 *
	 * @return the number of questionses
	 */
	public static int getQuestionsesCount() {
		return getService().getQuestionsesCount();
	}

	/**
	 * Updates the questions in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param questions the questions
	 * @return the questions that was updated
	 */
	public static operation.model.Questions updateQuestions(
		operation.model.Questions questions) {

		return getService().updateQuestions(questions);
	}

	public static QuestionsLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<QuestionsLocalService, QuestionsLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(QuestionsLocalService.class);

		ServiceTracker<QuestionsLocalService, QuestionsLocalService>
			serviceTracker =
				new ServiceTracker
					<QuestionsLocalService, QuestionsLocalService>(
						bundle.getBundleContext(), QuestionsLocalService.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}