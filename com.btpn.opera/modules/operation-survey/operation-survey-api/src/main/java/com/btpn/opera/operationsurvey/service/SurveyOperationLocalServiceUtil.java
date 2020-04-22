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
 * Provides the local service utility for SurveyOperation. This utility wraps
 * <code>com.btpn.opera.operationsurvey.service.impl.SurveyOperationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationLocalService
 * @generated
 */
@ProviderType
public class SurveyOperationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.btpn.opera.operationsurvey.service.impl.SurveyOperationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.btpn.opera.operationsurvey.model.SurveyOperation
			addSurveyOperation(
				long userId, String title, String description,
				long surveyObjectId, java.util.Date startDate,
				java.util.Date endDate,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addSurveyOperation(
			userId, title, description, surveyObjectId, startDate, endDate,
			serviceContext);
	}

	/**
	 * Adds the survey operation to the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyOperation the survey operation
	 * @return the survey operation that was added
	 */
	public static com.btpn.opera.operationsurvey.model.SurveyOperation
		addSurveyOperation(
			com.btpn.opera.operationsurvey.model.SurveyOperation
				surveyOperation) {

		return getService().addSurveyOperation(surveyOperation);
	}

	public static int countAllSurveyOperation() {
		return getService().countAllSurveyOperation();
	}

	public static int countSurveyOperationBytitle(String title) {
		return getService().countSurveyOperationBytitle(title);
	}

	/**
	 * Creates a new survey operation with the primary key. Does not add the survey operation to the database.
	 *
	 * @param id the primary key for the new survey operation
	 * @return the new survey operation
	 */
	public static com.btpn.opera.operationsurvey.model.SurveyOperation
		createSurveyOperation(long id) {

		return getService().createSurveyOperation(id);
	}

	public static void deleteAllSurveyOperation() {
		getService().deleteAllSurveyOperation();
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
	 * Deletes the survey operation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the survey operation
	 * @return the survey operation that was removed
	 * @throws PortalException if a survey operation with the primary key could not be found
	 */
	public static com.btpn.opera.operationsurvey.model.SurveyOperation
			deleteSurveyOperation(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteSurveyOperation(id);
	}

	/**
	 * Deletes the survey operation from the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyOperation the survey operation
	 * @return the survey operation that was removed
	 */
	public static com.btpn.opera.operationsurvey.model.SurveyOperation
		deleteSurveyOperation(
			com.btpn.opera.operationsurvey.model.SurveyOperation
				surveyOperation) {

		return getService().deleteSurveyOperation(surveyOperation);
	}

	public static void deleteSurveyOperationAfterEndDate()
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().deleteSurveyOperationAfterEndDate();
	}

	public static com.btpn.opera.operationsurvey.model.SurveyOperation
			deleteSurveyOperationById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteSurveyOperationById(id);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.btpn.opera.operationsurvey.model.impl.SurveyOperationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.btpn.opera.operationsurvey.model.impl.SurveyOperationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.btpn.opera.operationsurvey.model.SurveyOperation
			editSurveyOperation(
				long userId, long id, String title, String description,
				long surveyObjectId, java.util.Date startDate,
				java.util.Date endDate,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().editSurveyOperation(
			userId, id, title, description, surveyObjectId, startDate, endDate,
			serviceContext);
	}

	public static com.btpn.opera.operationsurvey.model.SurveyOperation
		fetchSurveyOperation(long id) {

		return getService().fetchSurveyOperation(id);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperation>
			getAllSurveyOperation() {

		return getService().getAllSurveyOperation();
	}

	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperation>
			getAllSurveyOperationMapping() {

		return getService().getAllSurveyOperationMapping();
	}

	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperation>
			getAllSurveyOperationPaging(int startPage, int endPage) {

		return getService().getAllSurveyOperationPaging(startPage, endPage);
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
	 * Returns the survey operation with the primary key.
	 *
	 * @param id the primary key of the survey operation
	 * @return the survey operation
	 * @throws PortalException if a survey operation with the primary key could not be found
	 */
	public static com.btpn.opera.operationsurvey.model.SurveyOperation
			getSurveyOperation(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getSurveyOperation(id);
	}

	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperation>
			getSurveyOperationBeforeEndDate() {

		return getService().getSurveyOperationBeforeEndDate();
	}

	public static com.btpn.opera.operationsurvey.model.SurveyOperation
			getSurveyOperationById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getSurveyOperationById(id);
	}

	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperation>
			getSurveyOperationByTitle(String title) {

		return getService().getSurveyOperationByTitle(title);
	}

	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperation>
			getSurveyOperationByTitlePaging(
				String title, int startPage, int endPage) {

		return getService().getSurveyOperationByTitlePaging(
			title, startPage, endPage);
	}

	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperation>
			getSurveyOperationByTitleQuery(String title) {

		return getService().getSurveyOperationByTitleQuery(title);
	}

	/**
	 * Returns a range of all the survey operations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.btpn.opera.operationsurvey.model.impl.SurveyOperationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of survey operations
	 * @param end the upper bound of the range of survey operations (not inclusive)
	 * @return the range of survey operations
	 */
	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperation>
			getSurveyOperations(int start, int end) {

		return getService().getSurveyOperations(start, end);
	}

	/**
	 * Returns the number of survey operations.
	 *
	 * @return the number of survey operations
	 */
	public static int getSurveyOperationsCount() {
		return getService().getSurveyOperationsCount();
	}

	/**
	 * Updates the survey operation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param surveyOperation the survey operation
	 * @return the survey operation that was updated
	 */
	public static com.btpn.opera.operationsurvey.model.SurveyOperation
		updateSurveyOperation(
			com.btpn.opera.operationsurvey.model.SurveyOperation
				surveyOperation) {

		return getService().updateSurveyOperation(surveyOperation);
	}

	public static void validation(
			long surveyObjectId, java.util.Date startDate,
			java.util.Date endDate)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().validation(surveyObjectId, startDate, endDate);
	}

	public static SurveyOperationLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<SurveyOperationLocalService, SurveyOperationLocalService>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			SurveyOperationLocalService.class);

		ServiceTracker<SurveyOperationLocalService, SurveyOperationLocalService>
			serviceTracker =
				new ServiceTracker
					<SurveyOperationLocalService, SurveyOperationLocalService>(
						bundle.getBundleContext(),
						SurveyOperationLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}