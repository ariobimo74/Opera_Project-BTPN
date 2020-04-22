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
 * Provides the local service utility for SurveyOperationView. This utility wraps
 * <code>com.btpn.opera.operationsurvey.service.impl.SurveyOperationViewLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationViewLocalService
 * @generated
 */
@ProviderType
public class SurveyOperationViewLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.btpn.opera.operationsurvey.service.impl.SurveyOperationViewLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the survey operation view to the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyOperationView the survey operation view
	 * @return the survey operation view that was added
	 */
	public static com.btpn.opera.operationsurvey.model.SurveyOperationView
		addSurveyOperationView(
			com.btpn.opera.operationsurvey.model.SurveyOperationView
				surveyOperationView) {

		return getService().addSurveyOperationView(surveyOperationView);
	}

	/**
	 * Creates a new survey operation view with the primary key. Does not add the survey operation view to the database.
	 *
	 * @param id the primary key for the new survey operation view
	 * @return the new survey operation view
	 */
	public static com.btpn.opera.operationsurvey.model.SurveyOperationView
		createSurveyOperationView(long id) {

		return getService().createSurveyOperationView(id);
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
	 * Deletes the survey operation view with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the survey operation view
	 * @return the survey operation view that was removed
	 * @throws PortalException if a survey operation view with the primary key could not be found
	 */
	public static com.btpn.opera.operationsurvey.model.SurveyOperationView
			deleteSurveyOperationView(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteSurveyOperationView(id);
	}

	/**
	 * Deletes the survey operation view from the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyOperationView the survey operation view
	 * @return the survey operation view that was removed
	 */
	public static com.btpn.opera.operationsurvey.model.SurveyOperationView
		deleteSurveyOperationView(
			com.btpn.opera.operationsurvey.model.SurveyOperationView
				surveyOperationView) {

		return getService().deleteSurveyOperationView(surveyOperationView);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.btpn.opera.operationsurvey.model.impl.SurveyOperationViewModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.btpn.opera.operationsurvey.model.impl.SurveyOperationViewModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.btpn.opera.operationsurvey.model.SurveyOperationView
		fetchSurveyOperationView(long id) {

		return getService().fetchSurveyOperationView(id);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperationView>
			getAllSurveyOperationView() {

		return getService().getAllSurveyOperationView();
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
	 * Returns the survey operation view with the primary key.
	 *
	 * @param id the primary key of the survey operation view
	 * @return the survey operation view
	 * @throws PortalException if a survey operation view with the primary key could not be found
	 */
	public static com.btpn.opera.operationsurvey.model.SurveyOperationView
			getSurveyOperationView(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getSurveyOperationView(id);
	}

	/**
	 * Returns a range of all the survey operation views.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.btpn.opera.operationsurvey.model.impl.SurveyOperationViewModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of survey operation views
	 * @param end the upper bound of the range of survey operation views (not inclusive)
	 * @return the range of survey operation views
	 */
	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperationView>
			getSurveyOperationViews(int start, int end) {

		return getService().getSurveyOperationViews(start, end);
	}

	/**
	 * Returns the number of survey operation views.
	 *
	 * @return the number of survey operation views
	 */
	public static int getSurveyOperationViewsCount() {
		return getService().getSurveyOperationViewsCount();
	}

	/**
	 * Updates the survey operation view in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param surveyOperationView the survey operation view
	 * @return the survey operation view that was updated
	 */
	public static com.btpn.opera.operationsurvey.model.SurveyOperationView
		updateSurveyOperationView(
			com.btpn.opera.operationsurvey.model.SurveyOperationView
				surveyOperationView) {

		return getService().updateSurveyOperationView(surveyOperationView);
	}

	public static SurveyOperationViewLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<SurveyOperationViewLocalService, SurveyOperationViewLocalService>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			SurveyOperationViewLocalService.class);

		ServiceTracker
			<SurveyOperationViewLocalService, SurveyOperationViewLocalService>
				serviceTracker =
					new ServiceTracker
						<SurveyOperationViewLocalService,
						 SurveyOperationViewLocalService>(
							 bundle.getBundleContext(),
							 SurveyOperationViewLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}