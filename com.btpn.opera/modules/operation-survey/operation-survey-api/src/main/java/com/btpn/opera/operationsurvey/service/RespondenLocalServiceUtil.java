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
 * Provides the local service utility for Responden. This utility wraps
 * <code>com.btpn.opera.operationsurvey.service.impl.RespondenLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see RespondenLocalService
 * @generated
 */
@ProviderType
public class RespondenLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.btpn.opera.operationsurvey.service.impl.RespondenLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the responden to the database. Also notifies the appropriate model listeners.
	 *
	 * @param responden the responden
	 * @return the responden that was added
	 */
	public static com.btpn.opera.operationsurvey.model.Responden addResponden(
		com.btpn.opera.operationsurvey.model.Responden responden) {

		return getService().addResponden(responden);
	}

	public static com.btpn.opera.operationsurvey.model.Responden
		addRespondenByAdmin(
			String nik, String fullName, String lob, String division,
			long surveyOperationId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return getService().addRespondenByAdmin(
			nik, fullName, lob, division, surveyOperationId, serviceContext);
	}

	/**
	 * Creates a new responden with the primary key. Does not add the responden to the database.
	 *
	 * @param id the primary key for the new responden
	 * @return the new responden
	 */
	public static com.btpn.opera.operationsurvey.model.Responden
		createResponden(long id) {

		return getService().createResponden(id);
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
	 * Deletes the responden with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the responden
	 * @return the responden that was removed
	 * @throws PortalException if a responden with the primary key could not be found
	 */
	public static com.btpn.opera.operationsurvey.model.Responden
			deleteResponden(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteResponden(id);
	}

	/**
	 * Deletes the responden from the database. Also notifies the appropriate model listeners.
	 *
	 * @param responden the responden
	 * @return the responden that was removed
	 */
	public static com.btpn.opera.operationsurvey.model.Responden
		deleteResponden(
			com.btpn.opera.operationsurvey.model.Responden responden) {

		return getService().deleteResponden(responden);
	}

	public static com.btpn.opera.operationsurvey.model.Responden
			deleteRespondenById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteRespondenById(id);
	}

	public static void deleteRespondenBySurveyOperationId(
			long surveyOperationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().deleteRespondenBySurveyOperationId(surveyOperationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.btpn.opera.operationsurvey.model.impl.RespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.btpn.opera.operationsurvey.model.impl.RespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.btpn.opera.operationsurvey.model.Responden fetchResponden(
		long id) {

		return getService().fetchResponden(id);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static java.util.List<com.btpn.opera.operationsurvey.model.Responden>
		getAllResponden() {

		return getService().getAllResponden();
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
	 * Returns the responden with the primary key.
	 *
	 * @param id the primary key of the responden
	 * @return the responden
	 * @throws PortalException if a responden with the primary key could not be found
	 */
	public static com.btpn.opera.operationsurvey.model.Responden getResponden(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getResponden(id);
	}

	public static com.btpn.opera.operationsurvey.model.Responden
			getRespondenById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getRespondenById(id);
	}

	public static java.util.List<com.btpn.opera.operationsurvey.model.Responden>
		getRespondenBySurveyOperationId(long surveyOperationId) {

		return getService().getRespondenBySurveyOperationId(surveyOperationId);
	}

	/**
	 * Returns a range of all the respondens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.btpn.opera.operationsurvey.model.impl.RespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of respondens
	 * @param end the upper bound of the range of respondens (not inclusive)
	 * @return the range of respondens
	 */
	public static java.util.List<com.btpn.opera.operationsurvey.model.Responden>
		getRespondens(int start, int end) {

		return getService().getRespondens(start, end);
	}

	/**
	 * Returns the number of respondens.
	 *
	 * @return the number of respondens
	 */
	public static int getRespondensCount() {
		return getService().getRespondensCount();
	}

	/**
	 * Updates the responden in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param responden the responden
	 * @return the responden that was updated
	 */
	public static com.btpn.opera.operationsurvey.model.Responden
		updateResponden(
			com.btpn.opera.operationsurvey.model.Responden responden) {

		return getService().updateResponden(responden);
	}

	public static com.btpn.opera.operationsurvey.model.Responden
			updateRespondenByUser(
				long id, double totalValue, String answerRecord, String notes,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateRespondenByUser(
			id, totalValue, answerRecord, notes, serviceContext);
	}

	public static RespondenLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RespondenLocalService, RespondenLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(RespondenLocalService.class);

		ServiceTracker<RespondenLocalService, RespondenLocalService>
			serviceTracker =
				new ServiceTracker
					<RespondenLocalService, RespondenLocalService>(
						bundle.getBundleContext(), RespondenLocalService.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}