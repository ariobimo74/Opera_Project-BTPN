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
 * Provides a wrapper for {@link SurveyObjectLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SurveyObjectLocalService
 * @generated
 */
@ProviderType
public class SurveyObjectLocalServiceWrapper
	implements SurveyObjectLocalService,
			   ServiceWrapper<SurveyObjectLocalService> {

	public SurveyObjectLocalServiceWrapper(
		SurveyObjectLocalService surveyObjectLocalService) {

		_surveyObjectLocalService = surveyObjectLocalService;
	}

	/**
	 * Adds the survey object to the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyObject the survey object
	 * @return the survey object that was added
	 */
	@Override
	public operation.model.SurveyObject addSurveyObject(
		operation.model.SurveyObject surveyObject) {

		return _surveyObjectLocalService.addSurveyObject(surveyObject);
	}

	/**
	 * Creates a new survey object with the primary key. Does not add the survey object to the database.
	 *
	 * @param id the primary key for the new survey object
	 * @return the new survey object
	 */
	@Override
	public operation.model.SurveyObject createSurveyObject(long id) {
		return _surveyObjectLocalService.createSurveyObject(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyObjectLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the survey object with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the survey object
	 * @return the survey object that was removed
	 * @throws PortalException if a survey object with the primary key could not be found
	 */
	@Override
	public operation.model.SurveyObject deleteSurveyObject(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyObjectLocalService.deleteSurveyObject(id);
	}

	/**
	 * Deletes the survey object from the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyObject the survey object
	 * @return the survey object that was removed
	 */
	@Override
	public operation.model.SurveyObject deleteSurveyObject(
		operation.model.SurveyObject surveyObject) {

		return _surveyObjectLocalService.deleteSurveyObject(surveyObject);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _surveyObjectLocalService.dynamicQuery();
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

		return _surveyObjectLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>operation.model.impl.SurveyObjectModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _surveyObjectLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>operation.model.impl.SurveyObjectModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _surveyObjectLocalService.dynamicQuery(
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

		return _surveyObjectLocalService.dynamicQueryCount(dynamicQuery);
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

		return _surveyObjectLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public operation.model.SurveyObject fetchSurveyObject(long id) {
		return _surveyObjectLocalService.fetchSurveyObject(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _surveyObjectLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<operation.model.SurveyObject> getAllSurveyObjext() {
		return _surveyObjectLocalService.getAllSurveyObjext();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _surveyObjectLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _surveyObjectLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyObjectLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the survey object with the primary key.
	 *
	 * @param id the primary key of the survey object
	 * @return the survey object
	 * @throws PortalException if a survey object with the primary key could not be found
	 */
	@Override
	public operation.model.SurveyObject getSurveyObject(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyObjectLocalService.getSurveyObject(id);
	}

	/**
	 * Returns a range of all the survey objects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>operation.model.impl.SurveyObjectModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of survey objects
	 * @param end the upper bound of the range of survey objects (not inclusive)
	 * @return the range of survey objects
	 */
	@Override
	public java.util.List<operation.model.SurveyObject> getSurveyObjects(
		int start, int end) {

		return _surveyObjectLocalService.getSurveyObjects(start, end);
	}

	/**
	 * Returns the number of survey objects.
	 *
	 * @return the number of survey objects
	 */
	@Override
	public int getSurveyObjectsCount() {
		return _surveyObjectLocalService.getSurveyObjectsCount();
	}

	/**
	 * Updates the survey object in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param surveyObject the survey object
	 * @return the survey object that was updated
	 */
	@Override
	public operation.model.SurveyObject updateSurveyObject(
		operation.model.SurveyObject surveyObject) {

		return _surveyObjectLocalService.updateSurveyObject(surveyObject);
	}

	@Override
	public SurveyObjectLocalService getWrappedService() {
		return _surveyObjectLocalService;
	}

	@Override
	public void setWrappedService(
		SurveyObjectLocalService surveyObjectLocalService) {

		_surveyObjectLocalService = surveyObjectLocalService;
	}

	private SurveyObjectLocalService _surveyObjectLocalService;

}