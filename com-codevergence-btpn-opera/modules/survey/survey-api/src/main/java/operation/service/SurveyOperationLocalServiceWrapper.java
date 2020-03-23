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
 * Provides a wrapper for {@link SurveyOperationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationLocalService
 * @generated
 */
@ProviderType
public class SurveyOperationLocalServiceWrapper
	implements SurveyOperationLocalService,
			   ServiceWrapper<SurveyOperationLocalService> {

	public SurveyOperationLocalServiceWrapper(
		SurveyOperationLocalService surveyOperationLocalService) {

		_surveyOperationLocalService = surveyOperationLocalService;
	}

	@Override
	public operation.model.SurveyOperation addSurveyOperation(
			String title, String description, long surveyObjId,
			java.util.Date startDate, java.util.Date endDate, String question1,
			String question2, String question3, String question4,
			String question5, String question6, String question7,
			String question8, String question9, String question10,
			String status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationLocalService.addSurveyOperation(
			title, description, surveyObjId, startDate, endDate, question1,
			question2, question3, question4, question5, question6, question7,
			question8, question9, question10, status, serviceContext);
	}

	/**
	 * Adds the survey operation to the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyOperation the survey operation
	 * @return the survey operation that was added
	 */
	@Override
	public operation.model.SurveyOperation addSurveyOperation(
		operation.model.SurveyOperation surveyOperation) {

		return _surveyOperationLocalService.addSurveyOperation(surveyOperation);
	}

	/**
	 * Creates a new survey operation with the primary key. Does not add the survey operation to the database.
	 *
	 * @param id the primary key for the new survey operation
	 * @return the new survey operation
	 */
	@Override
	public operation.model.SurveyOperation createSurveyOperation(long id) {
		return _surveyOperationLocalService.createSurveyOperation(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the survey operation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the survey operation
	 * @return the survey operation that was removed
	 * @throws PortalException if a survey operation with the primary key could not be found
	 */
	@Override
	public operation.model.SurveyOperation deleteSurveyOperation(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationLocalService.deleteSurveyOperation(id);
	}

	/**
	 * Deletes the survey operation from the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyOperation the survey operation
	 * @return the survey operation that was removed
	 */
	@Override
	public operation.model.SurveyOperation deleteSurveyOperation(
		operation.model.SurveyOperation surveyOperation) {

		return _surveyOperationLocalService.deleteSurveyOperation(
			surveyOperation);
	}

	@Override
	public operation.model.SurveyOperation deleteSurveyOperationById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationLocalService.deleteSurveyOperationById(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _surveyOperationLocalService.dynamicQuery();
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

		return _surveyOperationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>operation.model.impl.SurveyOperationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _surveyOperationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>operation.model.impl.SurveyOperationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _surveyOperationLocalService.dynamicQuery(
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

		return _surveyOperationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _surveyOperationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public operation.model.SurveyOperation fetchSurveyOperation(long id) {
		return _surveyOperationLocalService.fetchSurveyOperation(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _surveyOperationLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<operation.model.SurveyOperation>
		getAllSurveyOperation() {

		return _surveyOperationLocalService.getAllSurveyOperation();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _surveyOperationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _surveyOperationLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the survey operation with the primary key.
	 *
	 * @param id the primary key of the survey operation
	 * @return the survey operation
	 * @throws PortalException if a survey operation with the primary key could not be found
	 */
	@Override
	public operation.model.SurveyOperation getSurveyOperation(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationLocalService.getSurveyOperation(id);
	}

	@Override
	public operation.model.SurveyOperation getSurveyOperationById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationLocalService.getSurveyOperationById(id);
	}

	@Override
	public java.util.List<operation.model.SurveyOperation>
		getSurveyOperationByTitle(String title) {

		return _surveyOperationLocalService.getSurveyOperationByTitle(title);
	}

	/**
	 * Returns a range of all the survey operations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>operation.model.impl.SurveyOperationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of survey operations
	 * @param end the upper bound of the range of survey operations (not inclusive)
	 * @return the range of survey operations
	 */
	@Override
	public java.util.List<operation.model.SurveyOperation> getSurveyOperations(
		int start, int end) {

		return _surveyOperationLocalService.getSurveyOperations(start, end);
	}

	/**
	 * Returns the number of survey operations.
	 *
	 * @return the number of survey operations
	 */
	@Override
	public int getSurveyOperationsCount() {
		return _surveyOperationLocalService.getSurveyOperationsCount();
	}

	@Override
	public operation.model.SurveyOperation updateSurveyOperation(
			long id, String title, String description, long surveyObjId,
			java.util.Date startDate, java.util.Date endDate, String question1,
			String question2, String question3, String question4,
			String question5, String question6, String question7,
			String question8, String question9, String question10,
			String status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationLocalService.updateSurveyOperation(
			id, title, description, surveyObjId, startDate, endDate, question1,
			question2, question3, question4, question5, question6, question7,
			question8, question9, question10, status, serviceContext);
	}

	/**
	 * Updates the survey operation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param surveyOperation the survey operation
	 * @return the survey operation that was updated
	 */
	@Override
	public operation.model.SurveyOperation updateSurveyOperation(
		operation.model.SurveyOperation surveyOperation) {

		return _surveyOperationLocalService.updateSurveyOperation(
			surveyOperation);
	}

	@Override
	public SurveyOperationLocalService getWrappedService() {
		return _surveyOperationLocalService;
	}

	@Override
	public void setWrappedService(
		SurveyOperationLocalService surveyOperationLocalService) {

		_surveyOperationLocalService = surveyOperationLocalService;
	}

	private SurveyOperationLocalService _surveyOperationLocalService;

}