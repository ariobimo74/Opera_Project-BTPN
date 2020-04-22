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
 * Provides a wrapper for {@link SurveyOperationViewLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationViewLocalService
 * @generated
 */
@ProviderType
public class SurveyOperationViewLocalServiceWrapper
	implements SurveyOperationViewLocalService,
			   ServiceWrapper<SurveyOperationViewLocalService> {

	public SurveyOperationViewLocalServiceWrapper(
		SurveyOperationViewLocalService surveyOperationViewLocalService) {

		_surveyOperationViewLocalService = surveyOperationViewLocalService;
	}

	/**
	 * Adds the survey operation view to the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyOperationView the survey operation view
	 * @return the survey operation view that was added
	 */
	@Override
	public com.btpn.opera.operationsurvey.model.SurveyOperationView
		addSurveyOperationView(
			com.btpn.opera.operationsurvey.model.SurveyOperationView
				surveyOperationView) {

		return _surveyOperationViewLocalService.addSurveyOperationView(
			surveyOperationView);
	}

	/**
	 * Creates a new survey operation view with the primary key. Does not add the survey operation view to the database.
	 *
	 * @param id the primary key for the new survey operation view
	 * @return the new survey operation view
	 */
	@Override
	public com.btpn.opera.operationsurvey.model.SurveyOperationView
		createSurveyOperationView(long id) {

		return _surveyOperationViewLocalService.createSurveyOperationView(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationViewLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the survey operation view with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the survey operation view
	 * @return the survey operation view that was removed
	 * @throws PortalException if a survey operation view with the primary key could not be found
	 */
	@Override
	public com.btpn.opera.operationsurvey.model.SurveyOperationView
			deleteSurveyOperationView(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationViewLocalService.deleteSurveyOperationView(id);
	}

	/**
	 * Deletes the survey operation view from the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyOperationView the survey operation view
	 * @return the survey operation view that was removed
	 */
	@Override
	public com.btpn.opera.operationsurvey.model.SurveyOperationView
		deleteSurveyOperationView(
			com.btpn.opera.operationsurvey.model.SurveyOperationView
				surveyOperationView) {

		return _surveyOperationViewLocalService.deleteSurveyOperationView(
			surveyOperationView);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _surveyOperationViewLocalService.dynamicQuery();
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

		return _surveyOperationViewLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _surveyOperationViewLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _surveyOperationViewLocalService.dynamicQuery(
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

		return _surveyOperationViewLocalService.dynamicQueryCount(dynamicQuery);
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

		return _surveyOperationViewLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.btpn.opera.operationsurvey.model.SurveyOperationView
		fetchSurveyOperationView(long id) {

		return _surveyOperationViewLocalService.fetchSurveyOperationView(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _surveyOperationViewLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperationView>
			getAllSurveyOperationView() {

		return _surveyOperationViewLocalService.getAllSurveyOperationView();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _surveyOperationViewLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _surveyOperationViewLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationViewLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the survey operation view with the primary key.
	 *
	 * @param id the primary key of the survey operation view
	 * @return the survey operation view
	 * @throws PortalException if a survey operation view with the primary key could not be found
	 */
	@Override
	public com.btpn.opera.operationsurvey.model.SurveyOperationView
			getSurveyOperationView(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationViewLocalService.getSurveyOperationView(id);
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
	@Override
	public java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperationView>
			getSurveyOperationViews(int start, int end) {

		return _surveyOperationViewLocalService.getSurveyOperationViews(
			start, end);
	}

	/**
	 * Returns the number of survey operation views.
	 *
	 * @return the number of survey operation views
	 */
	@Override
	public int getSurveyOperationViewsCount() {
		return _surveyOperationViewLocalService.getSurveyOperationViewsCount();
	}

	/**
	 * Updates the survey operation view in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param surveyOperationView the survey operation view
	 * @return the survey operation view that was updated
	 */
	@Override
	public com.btpn.opera.operationsurvey.model.SurveyOperationView
		updateSurveyOperationView(
			com.btpn.opera.operationsurvey.model.SurveyOperationView
				surveyOperationView) {

		return _surveyOperationViewLocalService.updateSurveyOperationView(
			surveyOperationView);
	}

	@Override
	public SurveyOperationViewLocalService getWrappedService() {
		return _surveyOperationViewLocalService;
	}

	@Override
	public void setWrappedService(
		SurveyOperationViewLocalService surveyOperationViewLocalService) {

		_surveyOperationViewLocalService = surveyOperationViewLocalService;
	}

	private SurveyOperationViewLocalService _surveyOperationViewLocalService;

}