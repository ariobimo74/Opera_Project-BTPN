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
 * Provides the local service utility for SurveyOperationUsersView. This utility wraps
 * <code>com.btpn.opera.operationsurvey.service.impl.SurveyOperationUsersViewLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationUsersViewLocalService
 * @generated
 */
@ProviderType
public class SurveyOperationUsersViewLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.btpn.opera.operationsurvey.service.impl.SurveyOperationUsersViewLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the survey operation users view to the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyOperationUsersView the survey operation users view
	 * @return the survey operation users view that was added
	 */
	public static com.btpn.opera.operationsurvey.model.SurveyOperationUsersView
		addSurveyOperationUsersView(
			com.btpn.opera.operationsurvey.model.SurveyOperationUsersView
				surveyOperationUsersView) {

		return getService().addSurveyOperationUsersView(
			surveyOperationUsersView);
	}

	/**
	 * Creates a new survey operation users view with the primary key. Does not add the survey operation users view to the database.
	 *
	 * @param id the primary key for the new survey operation users view
	 * @return the new survey operation users view
	 */
	public static com.btpn.opera.operationsurvey.model.SurveyOperationUsersView
		createSurveyOperationUsersView(long id) {

		return getService().createSurveyOperationUsersView(id);
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
	 * Deletes the survey operation users view with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the survey operation users view
	 * @return the survey operation users view that was removed
	 * @throws PortalException if a survey operation users view with the primary key could not be found
	 */
	public static com.btpn.opera.operationsurvey.model.SurveyOperationUsersView
			deleteSurveyOperationUsersView(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteSurveyOperationUsersView(id);
	}

	/**
	 * Deletes the survey operation users view from the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyOperationUsersView the survey operation users view
	 * @return the survey operation users view that was removed
	 */
	public static com.btpn.opera.operationsurvey.model.SurveyOperationUsersView
		deleteSurveyOperationUsersView(
			com.btpn.opera.operationsurvey.model.SurveyOperationUsersView
				surveyOperationUsersView) {

		return getService().deleteSurveyOperationUsersView(
			surveyOperationUsersView);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.btpn.opera.operationsurvey.model.impl.SurveyOperationUsersViewModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.btpn.opera.operationsurvey.model.impl.SurveyOperationUsersViewModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.btpn.opera.operationsurvey.model.SurveyOperationUsersView
		fetchSurveyOperationUsersView(long id) {

		return getService().fetchSurveyOperationUsersView(id);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperationUsersView>
			getAllSurveyOperationUsersView() {

		return getService().getAllSurveyOperationUsersView();
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
	 * Returns the survey operation users view with the primary key.
	 *
	 * @param id the primary key of the survey operation users view
	 * @return the survey operation users view
	 * @throws PortalException if a survey operation users view with the primary key could not be found
	 */
	public static com.btpn.opera.operationsurvey.model.SurveyOperationUsersView
			getSurveyOperationUsersView(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getSurveyOperationUsersView(id);
	}

	/**
	 * Returns a range of all the survey operation users views.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.btpn.opera.operationsurvey.model.impl.SurveyOperationUsersViewModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of survey operation users views
	 * @param end the upper bound of the range of survey operation users views (not inclusive)
	 * @return the range of survey operation users views
	 */
	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperationUsersView>
			getSurveyOperationUsersViews(int start, int end) {

		return getService().getSurveyOperationUsersViews(start, end);
	}

	/**
	 * Returns the number of survey operation users views.
	 *
	 * @return the number of survey operation users views
	 */
	public static int getSurveyOperationUsersViewsCount() {
		return getService().getSurveyOperationUsersViewsCount();
	}

	/**
	 * Updates the survey operation users view in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param surveyOperationUsersView the survey operation users view
	 * @return the survey operation users view that was updated
	 */
	public static com.btpn.opera.operationsurvey.model.SurveyOperationUsersView
		updateSurveyOperationUsersView(
			com.btpn.opera.operationsurvey.model.SurveyOperationUsersView
				surveyOperationUsersView) {

		return getService().updateSurveyOperationUsersView(
			surveyOperationUsersView);
	}

	public static SurveyOperationUsersViewLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<SurveyOperationUsersViewLocalService,
		 SurveyOperationUsersViewLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			SurveyOperationUsersViewLocalService.class);

		ServiceTracker
			<SurveyOperationUsersViewLocalService,
			 SurveyOperationUsersViewLocalService> serviceTracker =
				new ServiceTracker
					<SurveyOperationUsersViewLocalService,
					 SurveyOperationUsersViewLocalService>(
						 bundle.getBundleContext(),
						 SurveyOperationUsersViewLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}