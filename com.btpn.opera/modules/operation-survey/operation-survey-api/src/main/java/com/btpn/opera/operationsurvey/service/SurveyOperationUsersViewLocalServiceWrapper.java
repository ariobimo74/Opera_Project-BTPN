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
 * Provides a wrapper for {@link SurveyOperationUsersViewLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationUsersViewLocalService
 * @generated
 */
@ProviderType
public class SurveyOperationUsersViewLocalServiceWrapper
	implements SurveyOperationUsersViewLocalService,
			   ServiceWrapper<SurveyOperationUsersViewLocalService> {

	public SurveyOperationUsersViewLocalServiceWrapper(
		SurveyOperationUsersViewLocalService
			surveyOperationUsersViewLocalService) {

		_surveyOperationUsersViewLocalService =
			surveyOperationUsersViewLocalService;
	}

	/**
	 * Adds the survey operation users view to the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyOperationUsersView the survey operation users view
	 * @return the survey operation users view that was added
	 */
	@Override
	public com.btpn.opera.operationsurvey.model.SurveyOperationUsersView
		addSurveyOperationUsersView(
			com.btpn.opera.operationsurvey.model.SurveyOperationUsersView
				surveyOperationUsersView) {

		return _surveyOperationUsersViewLocalService.
			addSurveyOperationUsersView(surveyOperationUsersView);
	}

	/**
	 * Creates a new survey operation users view with the primary key. Does not add the survey operation users view to the database.
	 *
	 * @param id the primary key for the new survey operation users view
	 * @return the new survey operation users view
	 */
	@Override
	public com.btpn.opera.operationsurvey.model.SurveyOperationUsersView
		createSurveyOperationUsersView(long id) {

		return _surveyOperationUsersViewLocalService.
			createSurveyOperationUsersView(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationUsersViewLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the survey operation users view with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the survey operation users view
	 * @return the survey operation users view that was removed
	 * @throws PortalException if a survey operation users view with the primary key could not be found
	 */
	@Override
	public com.btpn.opera.operationsurvey.model.SurveyOperationUsersView
			deleteSurveyOperationUsersView(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationUsersViewLocalService.
			deleteSurveyOperationUsersView(id);
	}

	/**
	 * Deletes the survey operation users view from the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyOperationUsersView the survey operation users view
	 * @return the survey operation users view that was removed
	 */
	@Override
	public com.btpn.opera.operationsurvey.model.SurveyOperationUsersView
		deleteSurveyOperationUsersView(
			com.btpn.opera.operationsurvey.model.SurveyOperationUsersView
				surveyOperationUsersView) {

		return _surveyOperationUsersViewLocalService.
			deleteSurveyOperationUsersView(surveyOperationUsersView);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _surveyOperationUsersViewLocalService.dynamicQuery();
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

		return _surveyOperationUsersViewLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _surveyOperationUsersViewLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _surveyOperationUsersViewLocalService.dynamicQuery(
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

		return _surveyOperationUsersViewLocalService.dynamicQueryCount(
			dynamicQuery);
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

		return _surveyOperationUsersViewLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.btpn.opera.operationsurvey.model.SurveyOperationUsersView
		fetchSurveyOperationUsersView(long id) {

		return _surveyOperationUsersViewLocalService.
			fetchSurveyOperationUsersView(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _surveyOperationUsersViewLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperationUsersView>
			getAllSurveyOperationUsersView() {

		return _surveyOperationUsersViewLocalService.
			getAllSurveyOperationUsersView();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _surveyOperationUsersViewLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _surveyOperationUsersViewLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationUsersViewLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the survey operation users view with the primary key.
	 *
	 * @param id the primary key of the survey operation users view
	 * @return the survey operation users view
	 * @throws PortalException if a survey operation users view with the primary key could not be found
	 */
	@Override
	public com.btpn.opera.operationsurvey.model.SurveyOperationUsersView
			getSurveyOperationUsersView(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationUsersViewLocalService.
			getSurveyOperationUsersView(id);
	}

	@Override
	public java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperationUsersView>
			getSurveyOperationUsersViewByRespondenId(long respondenId) {

		return _surveyOperationUsersViewLocalService.
			getSurveyOperationUsersViewByRespondenId(respondenId);
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
	@Override
	public java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperationUsersView>
			getSurveyOperationUsersViews(int start, int end) {

		return _surveyOperationUsersViewLocalService.
			getSurveyOperationUsersViews(start, end);
	}

	/**
	 * Returns the number of survey operation users views.
	 *
	 * @return the number of survey operation users views
	 */
	@Override
	public int getSurveyOperationUsersViewsCount() {
		return _surveyOperationUsersViewLocalService.
			getSurveyOperationUsersViewsCount();
	}

	/**
	 * Updates the survey operation users view in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param surveyOperationUsersView the survey operation users view
	 * @return the survey operation users view that was updated
	 */
	@Override
	public com.btpn.opera.operationsurvey.model.SurveyOperationUsersView
		updateSurveyOperationUsersView(
			com.btpn.opera.operationsurvey.model.SurveyOperationUsersView
				surveyOperationUsersView) {

		return _surveyOperationUsersViewLocalService.
			updateSurveyOperationUsersView(surveyOperationUsersView);
	}

	@Override
	public SurveyOperationUsersViewLocalService getWrappedService() {
		return _surveyOperationUsersViewLocalService;
	}

	@Override
	public void setWrappedService(
		SurveyOperationUsersViewLocalService
			surveyOperationUsersViewLocalService) {

		_surveyOperationUsersViewLocalService =
			surveyOperationUsersViewLocalService;
	}

	private SurveyOperationUsersViewLocalService
		_surveyOperationUsersViewLocalService;

}