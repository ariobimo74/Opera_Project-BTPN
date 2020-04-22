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

import com.btpn.opera.operationsurvey.model.SurveyOperationUsersView;

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
 * The persistence utility for the survey operation users view service. This utility wraps <code>com.btpn.opera.operationsurvey.service.persistence.impl.SurveyOperationUsersViewPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationUsersViewPersistence
 * @generated
 */
@ProviderType
public class SurveyOperationUsersViewUtil {

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
	public static void clearCache(
		SurveyOperationUsersView surveyOperationUsersView) {

		getPersistence().clearCache(surveyOperationUsersView);
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
	public static Map<Serializable, SurveyOperationUsersView>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SurveyOperationUsersView> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SurveyOperationUsersView> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SurveyOperationUsersView> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SurveyOperationUsersView> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SurveyOperationUsersView update(
		SurveyOperationUsersView surveyOperationUsersView) {

		return getPersistence().update(surveyOperationUsersView);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SurveyOperationUsersView update(
		SurveyOperationUsersView surveyOperationUsersView,
		ServiceContext serviceContext) {

		return getPersistence().update(
			surveyOperationUsersView, serviceContext);
	}

	/**
	 * Returns all the survey operation users views where respondenNik = &#63;.
	 *
	 * @param respondenNik the responden nik
	 * @return the matching survey operation users views
	 */
	public static List<SurveyOperationUsersView> findByRespondenNik(
		String respondenNik) {

		return getPersistence().findByRespondenNik(respondenNik);
	}

	/**
	 * Returns a range of all the survey operation users views where respondenNik = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyOperationUsersViewModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param respondenNik the responden nik
	 * @param start the lower bound of the range of survey operation users views
	 * @param end the upper bound of the range of survey operation users views (not inclusive)
	 * @return the range of matching survey operation users views
	 */
	public static List<SurveyOperationUsersView> findByRespondenNik(
		String respondenNik, int start, int end) {

		return getPersistence().findByRespondenNik(respondenNik, start, end);
	}

	/**
	 * Returns an ordered range of all the survey operation users views where respondenNik = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyOperationUsersViewModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByRespondenNik(String, int, int, OrderByComparator)}
	 * @param respondenNik the responden nik
	 * @param start the lower bound of the range of survey operation users views
	 * @param end the upper bound of the range of survey operation users views (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching survey operation users views
	 */
	@Deprecated
	public static List<SurveyOperationUsersView> findByRespondenNik(
		String respondenNik, int start, int end,
		OrderByComparator<SurveyOperationUsersView> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByRespondenNik(
			respondenNik, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the survey operation users views where respondenNik = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyOperationUsersViewModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param respondenNik the responden nik
	 * @param start the lower bound of the range of survey operation users views
	 * @param end the upper bound of the range of survey operation users views (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching survey operation users views
	 */
	public static List<SurveyOperationUsersView> findByRespondenNik(
		String respondenNik, int start, int end,
		OrderByComparator<SurveyOperationUsersView> orderByComparator) {

		return getPersistence().findByRespondenNik(
			respondenNik, start, end, orderByComparator);
	}

	/**
	 * Returns the first survey operation users view in the ordered set where respondenNik = &#63;.
	 *
	 * @param respondenNik the responden nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey operation users view
	 * @throws NoSuchSurveyOperationUsersViewException if a matching survey operation users view could not be found
	 */
	public static SurveyOperationUsersView findByRespondenNik_First(
			String respondenNik,
			OrderByComparator<SurveyOperationUsersView> orderByComparator)
		throws com.btpn.opera.operationsurvey.exception.
			NoSuchSurveyOperationUsersViewException {

		return getPersistence().findByRespondenNik_First(
			respondenNik, orderByComparator);
	}

	/**
	 * Returns the first survey operation users view in the ordered set where respondenNik = &#63;.
	 *
	 * @param respondenNik the responden nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey operation users view, or <code>null</code> if a matching survey operation users view could not be found
	 */
	public static SurveyOperationUsersView fetchByRespondenNik_First(
		String respondenNik,
		OrderByComparator<SurveyOperationUsersView> orderByComparator) {

		return getPersistence().fetchByRespondenNik_First(
			respondenNik, orderByComparator);
	}

	/**
	 * Returns the last survey operation users view in the ordered set where respondenNik = &#63;.
	 *
	 * @param respondenNik the responden nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey operation users view
	 * @throws NoSuchSurveyOperationUsersViewException if a matching survey operation users view could not be found
	 */
	public static SurveyOperationUsersView findByRespondenNik_Last(
			String respondenNik,
			OrderByComparator<SurveyOperationUsersView> orderByComparator)
		throws com.btpn.opera.operationsurvey.exception.
			NoSuchSurveyOperationUsersViewException {

		return getPersistence().findByRespondenNik_Last(
			respondenNik, orderByComparator);
	}

	/**
	 * Returns the last survey operation users view in the ordered set where respondenNik = &#63;.
	 *
	 * @param respondenNik the responden nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey operation users view, or <code>null</code> if a matching survey operation users view could not be found
	 */
	public static SurveyOperationUsersView fetchByRespondenNik_Last(
		String respondenNik,
		OrderByComparator<SurveyOperationUsersView> orderByComparator) {

		return getPersistence().fetchByRespondenNik_Last(
			respondenNik, orderByComparator);
	}

	/**
	 * Returns the survey operation users views before and after the current survey operation users view in the ordered set where respondenNik = &#63;.
	 *
	 * @param id the primary key of the current survey operation users view
	 * @param respondenNik the responden nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next survey operation users view
	 * @throws NoSuchSurveyOperationUsersViewException if a survey operation users view with the primary key could not be found
	 */
	public static SurveyOperationUsersView[] findByRespondenNik_PrevAndNext(
			long id, String respondenNik,
			OrderByComparator<SurveyOperationUsersView> orderByComparator)
		throws com.btpn.opera.operationsurvey.exception.
			NoSuchSurveyOperationUsersViewException {

		return getPersistence().findByRespondenNik_PrevAndNext(
			id, respondenNik, orderByComparator);
	}

	/**
	 * Removes all the survey operation users views where respondenNik = &#63; from the database.
	 *
	 * @param respondenNik the responden nik
	 */
	public static void removeByRespondenNik(String respondenNik) {
		getPersistence().removeByRespondenNik(respondenNik);
	}

	/**
	 * Returns the number of survey operation users views where respondenNik = &#63;.
	 *
	 * @param respondenNik the responden nik
	 * @return the number of matching survey operation users views
	 */
	public static int countByRespondenNik(String respondenNik) {
		return getPersistence().countByRespondenNik(respondenNik);
	}

	/**
	 * Returns all the survey operation users views where respondenId = &#63;.
	 *
	 * @param respondenId the responden ID
	 * @return the matching survey operation users views
	 */
	public static List<SurveyOperationUsersView> findByRespondenId(
		long respondenId) {

		return getPersistence().findByRespondenId(respondenId);
	}

	/**
	 * Returns a range of all the survey operation users views where respondenId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyOperationUsersViewModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param respondenId the responden ID
	 * @param start the lower bound of the range of survey operation users views
	 * @param end the upper bound of the range of survey operation users views (not inclusive)
	 * @return the range of matching survey operation users views
	 */
	public static List<SurveyOperationUsersView> findByRespondenId(
		long respondenId, int start, int end) {

		return getPersistence().findByRespondenId(respondenId, start, end);
	}

	/**
	 * Returns an ordered range of all the survey operation users views where respondenId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyOperationUsersViewModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByRespondenId(long, int, int, OrderByComparator)}
	 * @param respondenId the responden ID
	 * @param start the lower bound of the range of survey operation users views
	 * @param end the upper bound of the range of survey operation users views (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching survey operation users views
	 */
	@Deprecated
	public static List<SurveyOperationUsersView> findByRespondenId(
		long respondenId, int start, int end,
		OrderByComparator<SurveyOperationUsersView> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByRespondenId(
			respondenId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the survey operation users views where respondenId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyOperationUsersViewModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param respondenId the responden ID
	 * @param start the lower bound of the range of survey operation users views
	 * @param end the upper bound of the range of survey operation users views (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching survey operation users views
	 */
	public static List<SurveyOperationUsersView> findByRespondenId(
		long respondenId, int start, int end,
		OrderByComparator<SurveyOperationUsersView> orderByComparator) {

		return getPersistence().findByRespondenId(
			respondenId, start, end, orderByComparator);
	}

	/**
	 * Returns the first survey operation users view in the ordered set where respondenId = &#63;.
	 *
	 * @param respondenId the responden ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey operation users view
	 * @throws NoSuchSurveyOperationUsersViewException if a matching survey operation users view could not be found
	 */
	public static SurveyOperationUsersView findByRespondenId_First(
			long respondenId,
			OrderByComparator<SurveyOperationUsersView> orderByComparator)
		throws com.btpn.opera.operationsurvey.exception.
			NoSuchSurveyOperationUsersViewException {

		return getPersistence().findByRespondenId_First(
			respondenId, orderByComparator);
	}

	/**
	 * Returns the first survey operation users view in the ordered set where respondenId = &#63;.
	 *
	 * @param respondenId the responden ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey operation users view, or <code>null</code> if a matching survey operation users view could not be found
	 */
	public static SurveyOperationUsersView fetchByRespondenId_First(
		long respondenId,
		OrderByComparator<SurveyOperationUsersView> orderByComparator) {

		return getPersistence().fetchByRespondenId_First(
			respondenId, orderByComparator);
	}

	/**
	 * Returns the last survey operation users view in the ordered set where respondenId = &#63;.
	 *
	 * @param respondenId the responden ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey operation users view
	 * @throws NoSuchSurveyOperationUsersViewException if a matching survey operation users view could not be found
	 */
	public static SurveyOperationUsersView findByRespondenId_Last(
			long respondenId,
			OrderByComparator<SurveyOperationUsersView> orderByComparator)
		throws com.btpn.opera.operationsurvey.exception.
			NoSuchSurveyOperationUsersViewException {

		return getPersistence().findByRespondenId_Last(
			respondenId, orderByComparator);
	}

	/**
	 * Returns the last survey operation users view in the ordered set where respondenId = &#63;.
	 *
	 * @param respondenId the responden ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey operation users view, or <code>null</code> if a matching survey operation users view could not be found
	 */
	public static SurveyOperationUsersView fetchByRespondenId_Last(
		long respondenId,
		OrderByComparator<SurveyOperationUsersView> orderByComparator) {

		return getPersistence().fetchByRespondenId_Last(
			respondenId, orderByComparator);
	}

	/**
	 * Returns the survey operation users views before and after the current survey operation users view in the ordered set where respondenId = &#63;.
	 *
	 * @param id the primary key of the current survey operation users view
	 * @param respondenId the responden ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next survey operation users view
	 * @throws NoSuchSurveyOperationUsersViewException if a survey operation users view with the primary key could not be found
	 */
	public static SurveyOperationUsersView[] findByRespondenId_PrevAndNext(
			long id, long respondenId,
			OrderByComparator<SurveyOperationUsersView> orderByComparator)
		throws com.btpn.opera.operationsurvey.exception.
			NoSuchSurveyOperationUsersViewException {

		return getPersistence().findByRespondenId_PrevAndNext(
			id, respondenId, orderByComparator);
	}

	/**
	 * Removes all the survey operation users views where respondenId = &#63; from the database.
	 *
	 * @param respondenId the responden ID
	 */
	public static void removeByRespondenId(long respondenId) {
		getPersistence().removeByRespondenId(respondenId);
	}

	/**
	 * Returns the number of survey operation users views where respondenId = &#63;.
	 *
	 * @param respondenId the responden ID
	 * @return the number of matching survey operation users views
	 */
	public static int countByRespondenId(long respondenId) {
		return getPersistence().countByRespondenId(respondenId);
	}

	/**
	 * Caches the survey operation users view in the entity cache if it is enabled.
	 *
	 * @param surveyOperationUsersView the survey operation users view
	 */
	public static void cacheResult(
		SurveyOperationUsersView surveyOperationUsersView) {

		getPersistence().cacheResult(surveyOperationUsersView);
	}

	/**
	 * Caches the survey operation users views in the entity cache if it is enabled.
	 *
	 * @param surveyOperationUsersViews the survey operation users views
	 */
	public static void cacheResult(
		List<SurveyOperationUsersView> surveyOperationUsersViews) {

		getPersistence().cacheResult(surveyOperationUsersViews);
	}

	/**
	 * Creates a new survey operation users view with the primary key. Does not add the survey operation users view to the database.
	 *
	 * @param id the primary key for the new survey operation users view
	 * @return the new survey operation users view
	 */
	public static SurveyOperationUsersView create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the survey operation users view with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the survey operation users view
	 * @return the survey operation users view that was removed
	 * @throws NoSuchSurveyOperationUsersViewException if a survey operation users view with the primary key could not be found
	 */
	public static SurveyOperationUsersView remove(long id)
		throws com.btpn.opera.operationsurvey.exception.
			NoSuchSurveyOperationUsersViewException {

		return getPersistence().remove(id);
	}

	public static SurveyOperationUsersView updateImpl(
		SurveyOperationUsersView surveyOperationUsersView) {

		return getPersistence().updateImpl(surveyOperationUsersView);
	}

	/**
	 * Returns the survey operation users view with the primary key or throws a <code>NoSuchSurveyOperationUsersViewException</code> if it could not be found.
	 *
	 * @param id the primary key of the survey operation users view
	 * @return the survey operation users view
	 * @throws NoSuchSurveyOperationUsersViewException if a survey operation users view with the primary key could not be found
	 */
	public static SurveyOperationUsersView findByPrimaryKey(long id)
		throws com.btpn.opera.operationsurvey.exception.
			NoSuchSurveyOperationUsersViewException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the survey operation users view with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the survey operation users view
	 * @return the survey operation users view, or <code>null</code> if a survey operation users view with the primary key could not be found
	 */
	public static SurveyOperationUsersView fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the survey operation users views.
	 *
	 * @return the survey operation users views
	 */
	public static List<SurveyOperationUsersView> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the survey operation users views.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyOperationUsersViewModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of survey operation users views
	 * @param end the upper bound of the range of survey operation users views (not inclusive)
	 * @return the range of survey operation users views
	 */
	public static List<SurveyOperationUsersView> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the survey operation users views.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyOperationUsersViewModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of survey operation users views
	 * @param end the upper bound of the range of survey operation users views (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of survey operation users views
	 */
	@Deprecated
	public static List<SurveyOperationUsersView> findAll(
		int start, int end,
		OrderByComparator<SurveyOperationUsersView> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the survey operation users views.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyOperationUsersViewModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of survey operation users views
	 * @param end the upper bound of the range of survey operation users views (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of survey operation users views
	 */
	public static List<SurveyOperationUsersView> findAll(
		int start, int end,
		OrderByComparator<SurveyOperationUsersView> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the survey operation users views from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of survey operation users views.
	 *
	 * @return the number of survey operation users views
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SurveyOperationUsersViewPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<SurveyOperationUsersViewPersistence,
		 SurveyOperationUsersViewPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			SurveyOperationUsersViewPersistence.class);

		ServiceTracker
			<SurveyOperationUsersViewPersistence,
			 SurveyOperationUsersViewPersistence> serviceTracker =
				new ServiceTracker
					<SurveyOperationUsersViewPersistence,
					 SurveyOperationUsersViewPersistence>(
						 bundle.getBundleContext(),
						 SurveyOperationUsersViewPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}