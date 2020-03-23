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

package responden.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link SurveyRespondenLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SurveyRespondenLocalService
 * @generated
 */
@ProviderType
public class SurveyRespondenLocalServiceWrapper
	implements SurveyRespondenLocalService,
			   ServiceWrapper<SurveyRespondenLocalService> {

	public SurveyRespondenLocalServiceWrapper(
		SurveyRespondenLocalService surveyRespondenLocalService) {

		_surveyRespondenLocalService = surveyRespondenLocalService;
	}

	/**
	 * Adds the survey responden to the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyResponden the survey responden
	 * @return the survey responden that was added
	 */
	@Override
	public responden.model.SurveyResponden addSurveyResponden(
		responden.model.SurveyResponden surveyResponden) {

		return _surveyRespondenLocalService.addSurveyResponden(surveyResponden);
	}

	@Override
	public responden.model.SurveyResponden addSurveyRespondenByAdmin(
			String nik, long surveyId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyRespondenLocalService.addSurveyRespondenByAdmin(
			nik, surveyId, serviceContext);
	}

	/**
	 * Creates a new survey responden with the primary key. Does not add the survey responden to the database.
	 *
	 * @param id the primary key for the new survey responden
	 * @return the new survey responden
	 */
	@Override
	public responden.model.SurveyResponden createSurveyResponden(long id) {
		return _surveyRespondenLocalService.createSurveyResponden(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyRespondenLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the survey responden with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the survey responden
	 * @return the survey responden that was removed
	 * @throws PortalException if a survey responden with the primary key could not be found
	 */
	@Override
	public responden.model.SurveyResponden deleteSurveyResponden(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyRespondenLocalService.deleteSurveyResponden(id);
	}

	/**
	 * Deletes the survey responden from the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyResponden the survey responden
	 * @return the survey responden that was removed
	 */
	@Override
	public responden.model.SurveyResponden deleteSurveyResponden(
		responden.model.SurveyResponden surveyResponden) {

		return _surveyRespondenLocalService.deleteSurveyResponden(
			surveyResponden);
	}

	@Override
	public responden.model.SurveyResponden deleteSurveyRespondenByIdByAdmin(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyRespondenLocalService.deleteSurveyRespondenByIdByAdmin(
			id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _surveyRespondenLocalService.dynamicQuery();
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

		return _surveyRespondenLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>responden.model.impl.SurveyRespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _surveyRespondenLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>responden.model.impl.SurveyRespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _surveyRespondenLocalService.dynamicQuery(
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

		return _surveyRespondenLocalService.dynamicQueryCount(dynamicQuery);
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

		return _surveyRespondenLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public responden.model.SurveyResponden fetchSurveyResponden(long id) {
		return _surveyRespondenLocalService.fetchSurveyResponden(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _surveyRespondenLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<responden.model.SurveyResponden>
		getAllSurveyResponden() {

		return _surveyRespondenLocalService.getAllSurveyResponden();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _surveyRespondenLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _surveyRespondenLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyRespondenLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the survey responden with the primary key.
	 *
	 * @param id the primary key of the survey responden
	 * @return the survey responden
	 * @throws PortalException if a survey responden with the primary key could not be found
	 */
	@Override
	public responden.model.SurveyResponden getSurveyResponden(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyRespondenLocalService.getSurveyResponden(id);
	}

	@Override
	public responden.model.SurveyResponden getSurveyRespondenById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyRespondenLocalService.getSurveyRespondenById(id);
	}

	@Override
	public java.util.List<responden.model.SurveyResponden>
		getSurveyRespondenBySurveyId(long surveyId) {

		return _surveyRespondenLocalService.getSurveyRespondenBySurveyId(
			surveyId);
	}

	/**
	 * Returns a range of all the survey respondens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>responden.model.impl.SurveyRespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of survey respondens
	 * @param end the upper bound of the range of survey respondens (not inclusive)
	 * @return the range of survey respondens
	 */
	@Override
	public java.util.List<responden.model.SurveyResponden> getSurveyRespondens(
		int start, int end) {

		return _surveyRespondenLocalService.getSurveyRespondens(start, end);
	}

	/**
	 * Returns the number of survey respondens.
	 *
	 * @return the number of survey respondens
	 */
	@Override
	public int getSurveyRespondensCount() {
		return _surveyRespondenLocalService.getSurveyRespondensCount();
	}

	/**
	 * Updates the survey responden in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param surveyResponden the survey responden
	 * @return the survey responden that was updated
	 */
	@Override
	public responden.model.SurveyResponden updateSurveyResponden(
		responden.model.SurveyResponden surveyResponden) {

		return _surveyRespondenLocalService.updateSurveyResponden(
			surveyResponden);
	}

	@Override
	public responden.model.SurveyResponden updateSurveyRespondenByUser(
			long id, Double answer1, Double answer2, Double answer3,
			Double answer4, Double answer5, Double answer6, Double answer7,
			Double answer8, Double answer9, Double answer10, String note,
			String status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyRespondenLocalService.updateSurveyRespondenByUser(
			id, answer1, answer2, answer3, answer4, answer5, answer6, answer7,
			answer8, answer9, answer10, note, status, serviceContext);
	}

	@Override
	public SurveyRespondenLocalService getWrappedService() {
		return _surveyRespondenLocalService;
	}

	@Override
	public void setWrappedService(
		SurveyRespondenLocalService surveyRespondenLocalService) {

		_surveyRespondenLocalService = surveyRespondenLocalService;
	}

	private SurveyRespondenLocalService _surveyRespondenLocalService;

}