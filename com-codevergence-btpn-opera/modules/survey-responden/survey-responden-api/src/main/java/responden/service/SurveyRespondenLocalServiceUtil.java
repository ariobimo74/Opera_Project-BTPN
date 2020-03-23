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

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for SurveyResponden. This utility wraps
 * <code>responden.service.impl.SurveyRespondenLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SurveyRespondenLocalService
 * @generated
 */
@ProviderType
public class SurveyRespondenLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>responden.service.impl.SurveyRespondenLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the survey responden to the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyResponden the survey responden
	 * @return the survey responden that was added
	 */
	public static responden.model.SurveyResponden addSurveyResponden(
		responden.model.SurveyResponden surveyResponden) {

		return getService().addSurveyResponden(surveyResponden);
	}

	public static responden.model.SurveyResponden addSurveyRespondenByAdmin(
			String nik, long surveyId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addSurveyRespondenByAdmin(
			nik, surveyId, serviceContext);
	}

	/**
	 * Creates a new survey responden with the primary key. Does not add the survey responden to the database.
	 *
	 * @param id the primary key for the new survey responden
	 * @return the new survey responden
	 */
	public static responden.model.SurveyResponden createSurveyResponden(
		long id) {

		return getService().createSurveyResponden(id);
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
	 * Deletes the survey responden with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the survey responden
	 * @return the survey responden that was removed
	 * @throws PortalException if a survey responden with the primary key could not be found
	 */
	public static responden.model.SurveyResponden deleteSurveyResponden(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteSurveyResponden(id);
	}

	/**
	 * Deletes the survey responden from the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyResponden the survey responden
	 * @return the survey responden that was removed
	 */
	public static responden.model.SurveyResponden deleteSurveyResponden(
		responden.model.SurveyResponden surveyResponden) {

		return getService().deleteSurveyResponden(surveyResponden);
	}

	public static responden.model.SurveyResponden
			deleteSurveyRespondenByIdByAdmin(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteSurveyRespondenByIdByAdmin(id);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>responden.model.impl.SurveyRespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>responden.model.impl.SurveyRespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static responden.model.SurveyResponden fetchSurveyResponden(
		long id) {

		return getService().fetchSurveyResponden(id);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static java.util.List<responden.model.SurveyResponden>
		getAllSurveyResponden() {

		return getService().getAllSurveyResponden();
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
	 * Returns the survey responden with the primary key.
	 *
	 * @param id the primary key of the survey responden
	 * @return the survey responden
	 * @throws PortalException if a survey responden with the primary key could not be found
	 */
	public static responden.model.SurveyResponden getSurveyResponden(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getSurveyResponden(id);
	}

	public static responden.model.SurveyResponden getSurveyRespondenById(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getSurveyRespondenById(id);
	}

	public static java.util.List<responden.model.SurveyResponden>
		getSurveyRespondenBySurveyId(long surveyId) {

		return getService().getSurveyRespondenBySurveyId(surveyId);
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
	public static java.util.List<responden.model.SurveyResponden>
		getSurveyRespondens(int start, int end) {

		return getService().getSurveyRespondens(start, end);
	}

	/**
	 * Returns the number of survey respondens.
	 *
	 * @return the number of survey respondens
	 */
	public static int getSurveyRespondensCount() {
		return getService().getSurveyRespondensCount();
	}

	/**
	 * Updates the survey responden in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param surveyResponden the survey responden
	 * @return the survey responden that was updated
	 */
	public static responden.model.SurveyResponden updateSurveyResponden(
		responden.model.SurveyResponden surveyResponden) {

		return getService().updateSurveyResponden(surveyResponden);
	}

	public static responden.model.SurveyResponden updateSurveyRespondenByUser(
			long id, Double answer1, Double answer2, Double answer3,
			Double answer4, Double answer5, Double answer6, Double answer7,
			Double answer8, Double answer9, Double answer10, String note,
			String status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateSurveyRespondenByUser(
			id, answer1, answer2, answer3, answer4, answer5, answer6, answer7,
			answer8, answer9, answer10, note, status, serviceContext);
	}

	public static SurveyRespondenLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<SurveyRespondenLocalService, SurveyRespondenLocalService>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			SurveyRespondenLocalService.class);

		ServiceTracker<SurveyRespondenLocalService, SurveyRespondenLocalService>
			serviceTracker =
				new ServiceTracker
					<SurveyRespondenLocalService, SurveyRespondenLocalService>(
						bundle.getBundleContext(),
						SurveyRespondenLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}