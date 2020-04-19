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

package com.btpn.opera.operationsurvey.service.persistence;

import com.btpn.opera.operationsurvey.model.Responden;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the responden service. This utility wraps <code>com.btpn.opera.operationsurvey.service.persistence.impl.RespondenPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RespondenPersistence
 * @generated
 */
@ProviderType
public class RespondenUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Responden responden) {
		getPersistence().clearCache(responden);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Responden> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Responden> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Responden> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Responden> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Responden> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Responden update(Responden responden) {
		return getPersistence().update(responden);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Responden update(
		Responden responden, ServiceContext serviceContext) {

		return getPersistence().update(responden, serviceContext);
	}

	/**
	 * Returns the responden where surveyOperationId = &#63; or throws a <code>NoSuchRespondenException</code> if it could not be found.
	 *
	 * @param surveyOperationId the survey operation ID
	 * @return the matching responden
	 * @throws NoSuchRespondenException if a matching responden could not be found
	 */
	public static Responden findBysurveyOperationID(long surveyOperationId)
		throws com.btpn.opera.operationsurvey.exception.
			NoSuchRespondenException {

		return getPersistence().findBysurveyOperationID(surveyOperationId);
	}

	/**
	 * Returns the responden where surveyOperationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #fetchBysurveyOperationID(long)}
	 * @param surveyOperationId the survey operation ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching responden, or <code>null</code> if a matching responden could not be found
	 */
	@Deprecated
	public static Responden fetchBysurveyOperationID(
		long surveyOperationId, boolean useFinderCache) {

		return getPersistence().fetchBysurveyOperationID(
			surveyOperationId, useFinderCache);
	}

	/**
	 * Returns the responden where surveyOperationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param surveyOperationId the survey operation ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching responden, or <code>null</code> if a matching responden could not be found
	 */
	public static Responden fetchBysurveyOperationID(long surveyOperationId) {
		return getPersistence().fetchBysurveyOperationID(surveyOperationId);
	}

	/**
	 * Removes the responden where surveyOperationId = &#63; from the database.
	 *
	 * @param surveyOperationId the survey operation ID
	 * @return the responden that was removed
	 */
	public static Responden removeBysurveyOperationID(long surveyOperationId)
		throws com.btpn.opera.operationsurvey.exception.
			NoSuchRespondenException {

		return getPersistence().removeBysurveyOperationID(surveyOperationId);
	}

	/**
	 * Returns the number of respondens where surveyOperationId = &#63;.
	 *
	 * @param surveyOperationId the survey operation ID
	 * @return the number of matching respondens
	 */
	public static int countBysurveyOperationID(long surveyOperationId) {
		return getPersistence().countBysurveyOperationID(surveyOperationId);
	}

	/**
	 * Caches the responden in the entity cache if it is enabled.
	 *
	 * @param responden the responden
	 */
	public static void cacheResult(Responden responden) {
		getPersistence().cacheResult(responden);
	}

	/**
	 * Caches the respondens in the entity cache if it is enabled.
	 *
	 * @param respondens the respondens
	 */
	public static void cacheResult(List<Responden> respondens) {
		getPersistence().cacheResult(respondens);
	}

	/**
	 * Creates a new responden with the primary key. Does not add the responden to the database.
	 *
	 * @param id the primary key for the new responden
	 * @return the new responden
	 */
	public static Responden create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the responden with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the responden
	 * @return the responden that was removed
	 * @throws NoSuchRespondenException if a responden with the primary key could not be found
	 */
	public static Responden remove(long id)
		throws com.btpn.opera.operationsurvey.exception.
			NoSuchRespondenException {

		return getPersistence().remove(id);
	}

	public static Responden updateImpl(Responden responden) {
		return getPersistence().updateImpl(responden);
	}

	/**
	 * Returns the responden with the primary key or throws a <code>NoSuchRespondenException</code> if it could not be found.
	 *
	 * @param id the primary key of the responden
	 * @return the responden
	 * @throws NoSuchRespondenException if a responden with the primary key could not be found
	 */
	public static Responden findByPrimaryKey(long id)
		throws com.btpn.opera.operationsurvey.exception.
			NoSuchRespondenException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the responden with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the responden
	 * @return the responden, or <code>null</code> if a responden with the primary key could not be found
	 */
	public static Responden fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the respondens.
	 *
	 * @return the respondens
	 */
	public static List<Responden> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the respondens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of respondens
	 * @param end the upper bound of the range of respondens (not inclusive)
	 * @return the range of respondens
	 */
	public static List<Responden> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the respondens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of respondens
	 * @param end the upper bound of the range of respondens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of respondens
	 */
	@Deprecated
	public static List<Responden> findAll(
		int start, int end, OrderByComparator<Responden> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the respondens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of respondens
	 * @param end the upper bound of the range of respondens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of respondens
	 */
	public static List<Responden> findAll(
		int start, int end, OrderByComparator<Responden> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the respondens from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of respondens.
	 *
	 * @return the number of respondens
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RespondenPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RespondenPersistence, RespondenPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(RespondenPersistence.class);

		ServiceTracker<RespondenPersistence, RespondenPersistence>
			serviceTracker =
				new ServiceTracker<RespondenPersistence, RespondenPersistence>(
					bundle.getBundleContext(), RespondenPersistence.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}