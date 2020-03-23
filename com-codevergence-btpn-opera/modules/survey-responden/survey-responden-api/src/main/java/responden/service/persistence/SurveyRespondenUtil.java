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

package responden.service.persistence;

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

import responden.model.SurveyResponden;

/**
 * The persistence utility for the survey responden service. This utility wraps <code>responden.service.persistence.impl.SurveyRespondenPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyRespondenPersistence
 * @generated
 */
@ProviderType
public class SurveyRespondenUtil {

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
	public static void clearCache(SurveyResponden surveyResponden) {
		getPersistence().clearCache(surveyResponden);
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
	public static Map<Serializable, SurveyResponden> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SurveyResponden> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SurveyResponden> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SurveyResponden> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SurveyResponden> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SurveyResponden update(SurveyResponden surveyResponden) {
		return getPersistence().update(surveyResponden);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SurveyResponden update(
		SurveyResponden surveyResponden, ServiceContext serviceContext) {

		return getPersistence().update(surveyResponden, serviceContext);
	}

	/**
	 * Returns all the survey respondens where nik = &#63;.
	 *
	 * @param nik the nik
	 * @return the matching survey respondens
	 */
	public static List<SurveyResponden> findByNIK(String nik) {
		return getPersistence().findByNIK(nik);
	}

	/**
	 * Returns a range of all the survey respondens where nik = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyRespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nik the nik
	 * @param start the lower bound of the range of survey respondens
	 * @param end the upper bound of the range of survey respondens (not inclusive)
	 * @return the range of matching survey respondens
	 */
	public static List<SurveyResponden> findByNIK(
		String nik, int start, int end) {

		return getPersistence().findByNIK(nik, start, end);
	}

	/**
	 * Returns an ordered range of all the survey respondens where nik = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyRespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByNIK(String, int, int, OrderByComparator)}
	 * @param nik the nik
	 * @param start the lower bound of the range of survey respondens
	 * @param end the upper bound of the range of survey respondens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching survey respondens
	 */
	@Deprecated
	public static List<SurveyResponden> findByNIK(
		String nik, int start, int end,
		OrderByComparator<SurveyResponden> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByNIK(
			nik, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the survey respondens where nik = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyRespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nik the nik
	 * @param start the lower bound of the range of survey respondens
	 * @param end the upper bound of the range of survey respondens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching survey respondens
	 */
	public static List<SurveyResponden> findByNIK(
		String nik, int start, int end,
		OrderByComparator<SurveyResponden> orderByComparator) {

		return getPersistence().findByNIK(nik, start, end, orderByComparator);
	}

	/**
	 * Returns the first survey responden in the ordered set where nik = &#63;.
	 *
	 * @param nik the nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey responden
	 * @throws NoSuchSurveyRespondenException if a matching survey responden could not be found
	 */
	public static SurveyResponden findByNIK_First(
			String nik, OrderByComparator<SurveyResponden> orderByComparator)
		throws responden.exception.NoSuchSurveyRespondenException {

		return getPersistence().findByNIK_First(nik, orderByComparator);
	}

	/**
	 * Returns the first survey responden in the ordered set where nik = &#63;.
	 *
	 * @param nik the nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey responden, or <code>null</code> if a matching survey responden could not be found
	 */
	public static SurveyResponden fetchByNIK_First(
		String nik, OrderByComparator<SurveyResponden> orderByComparator) {

		return getPersistence().fetchByNIK_First(nik, orderByComparator);
	}

	/**
	 * Returns the last survey responden in the ordered set where nik = &#63;.
	 *
	 * @param nik the nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey responden
	 * @throws NoSuchSurveyRespondenException if a matching survey responden could not be found
	 */
	public static SurveyResponden findByNIK_Last(
			String nik, OrderByComparator<SurveyResponden> orderByComparator)
		throws responden.exception.NoSuchSurveyRespondenException {

		return getPersistence().findByNIK_Last(nik, orderByComparator);
	}

	/**
	 * Returns the last survey responden in the ordered set where nik = &#63;.
	 *
	 * @param nik the nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey responden, or <code>null</code> if a matching survey responden could not be found
	 */
	public static SurveyResponden fetchByNIK_Last(
		String nik, OrderByComparator<SurveyResponden> orderByComparator) {

		return getPersistence().fetchByNIK_Last(nik, orderByComparator);
	}

	/**
	 * Returns the survey respondens before and after the current survey responden in the ordered set where nik = &#63;.
	 *
	 * @param id the primary key of the current survey responden
	 * @param nik the nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next survey responden
	 * @throws NoSuchSurveyRespondenException if a survey responden with the primary key could not be found
	 */
	public static SurveyResponden[] findByNIK_PrevAndNext(
			long id, String nik,
			OrderByComparator<SurveyResponden> orderByComparator)
		throws responden.exception.NoSuchSurveyRespondenException {

		return getPersistence().findByNIK_PrevAndNext(
			id, nik, orderByComparator);
	}

	/**
	 * Removes all the survey respondens where nik = &#63; from the database.
	 *
	 * @param nik the nik
	 */
	public static void removeByNIK(String nik) {
		getPersistence().removeByNIK(nik);
	}

	/**
	 * Returns the number of survey respondens where nik = &#63;.
	 *
	 * @param nik the nik
	 * @return the number of matching survey respondens
	 */
	public static int countByNIK(String nik) {
		return getPersistence().countByNIK(nik);
	}

	/**
	 * Returns all the survey respondens where surveyId = &#63;.
	 *
	 * @param surveyId the survey ID
	 * @return the matching survey respondens
	 */
	public static List<SurveyResponden> findBySurveyId(long surveyId) {
		return getPersistence().findBySurveyId(surveyId);
	}

	/**
	 * Returns a range of all the survey respondens where surveyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyRespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param surveyId the survey ID
	 * @param start the lower bound of the range of survey respondens
	 * @param end the upper bound of the range of survey respondens (not inclusive)
	 * @return the range of matching survey respondens
	 */
	public static List<SurveyResponden> findBySurveyId(
		long surveyId, int start, int end) {

		return getPersistence().findBySurveyId(surveyId, start, end);
	}

	/**
	 * Returns an ordered range of all the survey respondens where surveyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyRespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findBySurveyId(long, int, int, OrderByComparator)}
	 * @param surveyId the survey ID
	 * @param start the lower bound of the range of survey respondens
	 * @param end the upper bound of the range of survey respondens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching survey respondens
	 */
	@Deprecated
	public static List<SurveyResponden> findBySurveyId(
		long surveyId, int start, int end,
		OrderByComparator<SurveyResponden> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBySurveyId(
			surveyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the survey respondens where surveyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyRespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param surveyId the survey ID
	 * @param start the lower bound of the range of survey respondens
	 * @param end the upper bound of the range of survey respondens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching survey respondens
	 */
	public static List<SurveyResponden> findBySurveyId(
		long surveyId, int start, int end,
		OrderByComparator<SurveyResponden> orderByComparator) {

		return getPersistence().findBySurveyId(
			surveyId, start, end, orderByComparator);
	}

	/**
	 * Returns the first survey responden in the ordered set where surveyId = &#63;.
	 *
	 * @param surveyId the survey ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey responden
	 * @throws NoSuchSurveyRespondenException if a matching survey responden could not be found
	 */
	public static SurveyResponden findBySurveyId_First(
			long surveyId, OrderByComparator<SurveyResponden> orderByComparator)
		throws responden.exception.NoSuchSurveyRespondenException {

		return getPersistence().findBySurveyId_First(
			surveyId, orderByComparator);
	}

	/**
	 * Returns the first survey responden in the ordered set where surveyId = &#63;.
	 *
	 * @param surveyId the survey ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey responden, or <code>null</code> if a matching survey responden could not be found
	 */
	public static SurveyResponden fetchBySurveyId_First(
		long surveyId, OrderByComparator<SurveyResponden> orderByComparator) {

		return getPersistence().fetchBySurveyId_First(
			surveyId, orderByComparator);
	}

	/**
	 * Returns the last survey responden in the ordered set where surveyId = &#63;.
	 *
	 * @param surveyId the survey ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey responden
	 * @throws NoSuchSurveyRespondenException if a matching survey responden could not be found
	 */
	public static SurveyResponden findBySurveyId_Last(
			long surveyId, OrderByComparator<SurveyResponden> orderByComparator)
		throws responden.exception.NoSuchSurveyRespondenException {

		return getPersistence().findBySurveyId_Last(
			surveyId, orderByComparator);
	}

	/**
	 * Returns the last survey responden in the ordered set where surveyId = &#63;.
	 *
	 * @param surveyId the survey ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey responden, or <code>null</code> if a matching survey responden could not be found
	 */
	public static SurveyResponden fetchBySurveyId_Last(
		long surveyId, OrderByComparator<SurveyResponden> orderByComparator) {

		return getPersistence().fetchBySurveyId_Last(
			surveyId, orderByComparator);
	}

	/**
	 * Returns the survey respondens before and after the current survey responden in the ordered set where surveyId = &#63;.
	 *
	 * @param id the primary key of the current survey responden
	 * @param surveyId the survey ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next survey responden
	 * @throws NoSuchSurveyRespondenException if a survey responden with the primary key could not be found
	 */
	public static SurveyResponden[] findBySurveyId_PrevAndNext(
			long id, long surveyId,
			OrderByComparator<SurveyResponden> orderByComparator)
		throws responden.exception.NoSuchSurveyRespondenException {

		return getPersistence().findBySurveyId_PrevAndNext(
			id, surveyId, orderByComparator);
	}

	/**
	 * Removes all the survey respondens where surveyId = &#63; from the database.
	 *
	 * @param surveyId the survey ID
	 */
	public static void removeBySurveyId(long surveyId) {
		getPersistence().removeBySurveyId(surveyId);
	}

	/**
	 * Returns the number of survey respondens where surveyId = &#63;.
	 *
	 * @param surveyId the survey ID
	 * @return the number of matching survey respondens
	 */
	public static int countBySurveyId(long surveyId) {
		return getPersistence().countBySurveyId(surveyId);
	}

	/**
	 * Caches the survey responden in the entity cache if it is enabled.
	 *
	 * @param surveyResponden the survey responden
	 */
	public static void cacheResult(SurveyResponden surveyResponden) {
		getPersistence().cacheResult(surveyResponden);
	}

	/**
	 * Caches the survey respondens in the entity cache if it is enabled.
	 *
	 * @param surveyRespondens the survey respondens
	 */
	public static void cacheResult(List<SurveyResponden> surveyRespondens) {
		getPersistence().cacheResult(surveyRespondens);
	}

	/**
	 * Creates a new survey responden with the primary key. Does not add the survey responden to the database.
	 *
	 * @param id the primary key for the new survey responden
	 * @return the new survey responden
	 */
	public static SurveyResponden create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the survey responden with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the survey responden
	 * @return the survey responden that was removed
	 * @throws NoSuchSurveyRespondenException if a survey responden with the primary key could not be found
	 */
	public static SurveyResponden remove(long id)
		throws responden.exception.NoSuchSurveyRespondenException {

		return getPersistence().remove(id);
	}

	public static SurveyResponden updateImpl(SurveyResponden surveyResponden) {
		return getPersistence().updateImpl(surveyResponden);
	}

	/**
	 * Returns the survey responden with the primary key or throws a <code>NoSuchSurveyRespondenException</code> if it could not be found.
	 *
	 * @param id the primary key of the survey responden
	 * @return the survey responden
	 * @throws NoSuchSurveyRespondenException if a survey responden with the primary key could not be found
	 */
	public static SurveyResponden findByPrimaryKey(long id)
		throws responden.exception.NoSuchSurveyRespondenException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the survey responden with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the survey responden
	 * @return the survey responden, or <code>null</code> if a survey responden with the primary key could not be found
	 */
	public static SurveyResponden fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the survey respondens.
	 *
	 * @return the survey respondens
	 */
	public static List<SurveyResponden> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the survey respondens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyRespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of survey respondens
	 * @param end the upper bound of the range of survey respondens (not inclusive)
	 * @return the range of survey respondens
	 */
	public static List<SurveyResponden> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the survey respondens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyRespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of survey respondens
	 * @param end the upper bound of the range of survey respondens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of survey respondens
	 */
	@Deprecated
	public static List<SurveyResponden> findAll(
		int start, int end,
		OrderByComparator<SurveyResponden> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the survey respondens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyRespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of survey respondens
	 * @param end the upper bound of the range of survey respondens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of survey respondens
	 */
	public static List<SurveyResponden> findAll(
		int start, int end,
		OrderByComparator<SurveyResponden> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the survey respondens from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of survey respondens.
	 *
	 * @return the number of survey respondens
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SurveyRespondenPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<SurveyRespondenPersistence, SurveyRespondenPersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			SurveyRespondenPersistence.class);

		ServiceTracker<SurveyRespondenPersistence, SurveyRespondenPersistence>
			serviceTracker =
				new ServiceTracker
					<SurveyRespondenPersistence, SurveyRespondenPersistence>(
						bundle.getBundleContext(),
						SurveyRespondenPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}