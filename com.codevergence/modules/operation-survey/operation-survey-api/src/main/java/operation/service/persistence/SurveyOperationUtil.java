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

package operation.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import operation.model.SurveyOperation;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the survey operation service. This utility wraps <code>operation.service.persistence.impl.SurveyOperationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationPersistence
 * @generated
 */
@ProviderType
public class SurveyOperationUtil {

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
	public static void clearCache(SurveyOperation surveyOperation) {
		getPersistence().clearCache(surveyOperation);
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
	public static Map<Serializable, SurveyOperation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SurveyOperation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SurveyOperation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SurveyOperation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SurveyOperation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SurveyOperation update(SurveyOperation surveyOperation) {
		return getPersistence().update(surveyOperation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SurveyOperation update(
		SurveyOperation surveyOperation, ServiceContext serviceContext) {

		return getPersistence().update(surveyOperation, serviceContext);
	}

	/**
	 * Returns all the survey operations where title = &#63;.
	 *
	 * @param title the title
	 * @return the matching survey operations
	 */
	public static List<SurveyOperation> findByTitle(String title) {
		return getPersistence().findByTitle(title);
	}

	/**
	 * Returns a range of all the survey operations where title = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyOperationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param title the title
	 * @param start the lower bound of the range of survey operations
	 * @param end the upper bound of the range of survey operations (not inclusive)
	 * @return the range of matching survey operations
	 */
	public static List<SurveyOperation> findByTitle(
		String title, int start, int end) {

		return getPersistence().findByTitle(title, start, end);
	}

	/**
	 * Returns an ordered range of all the survey operations where title = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyOperationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByTitle(String, int, int, OrderByComparator)}
	 * @param title the title
	 * @param start the lower bound of the range of survey operations
	 * @param end the upper bound of the range of survey operations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching survey operations
	 */
	@Deprecated
	public static List<SurveyOperation> findByTitle(
		String title, int start, int end,
		OrderByComparator<SurveyOperation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByTitle(
			title, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the survey operations where title = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyOperationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param title the title
	 * @param start the lower bound of the range of survey operations
	 * @param end the upper bound of the range of survey operations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching survey operations
	 */
	public static List<SurveyOperation> findByTitle(
		String title, int start, int end,
		OrderByComparator<SurveyOperation> orderByComparator) {

		return getPersistence().findByTitle(
			title, start, end, orderByComparator);
	}

	/**
	 * Returns the first survey operation in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey operation
	 * @throws NoSuchSurveyOperationException if a matching survey operation could not be found
	 */
	public static SurveyOperation findByTitle_First(
			String title, OrderByComparator<SurveyOperation> orderByComparator)
		throws operation.exception.NoSuchSurveyOperationException {

		return getPersistence().findByTitle_First(title, orderByComparator);
	}

	/**
	 * Returns the first survey operation in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey operation, or <code>null</code> if a matching survey operation could not be found
	 */
	public static SurveyOperation fetchByTitle_First(
		String title, OrderByComparator<SurveyOperation> orderByComparator) {

		return getPersistence().fetchByTitle_First(title, orderByComparator);
	}

	/**
	 * Returns the last survey operation in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey operation
	 * @throws NoSuchSurveyOperationException if a matching survey operation could not be found
	 */
	public static SurveyOperation findByTitle_Last(
			String title, OrderByComparator<SurveyOperation> orderByComparator)
		throws operation.exception.NoSuchSurveyOperationException {

		return getPersistence().findByTitle_Last(title, orderByComparator);
	}

	/**
	 * Returns the last survey operation in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey operation, or <code>null</code> if a matching survey operation could not be found
	 */
	public static SurveyOperation fetchByTitle_Last(
		String title, OrderByComparator<SurveyOperation> orderByComparator) {

		return getPersistence().fetchByTitle_Last(title, orderByComparator);
	}

	/**
	 * Returns the survey operations before and after the current survey operation in the ordered set where title = &#63;.
	 *
	 * @param id the primary key of the current survey operation
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next survey operation
	 * @throws NoSuchSurveyOperationException if a survey operation with the primary key could not be found
	 */
	public static SurveyOperation[] findByTitle_PrevAndNext(
			long id, String title,
			OrderByComparator<SurveyOperation> orderByComparator)
		throws operation.exception.NoSuchSurveyOperationException {

		return getPersistence().findByTitle_PrevAndNext(
			id, title, orderByComparator);
	}

	/**
	 * Removes all the survey operations where title = &#63; from the database.
	 *
	 * @param title the title
	 */
	public static void removeByTitle(String title) {
		getPersistence().removeByTitle(title);
	}

	/**
	 * Returns the number of survey operations where title = &#63;.
	 *
	 * @param title the title
	 * @return the number of matching survey operations
	 */
	public static int countByTitle(String title) {
		return getPersistence().countByTitle(title);
	}

	/**
	 * Returns all the survey operations where endDate = &#63;.
	 *
	 * @param endDate the end date
	 * @return the matching survey operations
	 */
	public static List<SurveyOperation> findByEndDate(Date endDate) {
		return getPersistence().findByEndDate(endDate);
	}

	/**
	 * Returns a range of all the survey operations where endDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyOperationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param endDate the end date
	 * @param start the lower bound of the range of survey operations
	 * @param end the upper bound of the range of survey operations (not inclusive)
	 * @return the range of matching survey operations
	 */
	public static List<SurveyOperation> findByEndDate(
		Date endDate, int start, int end) {

		return getPersistence().findByEndDate(endDate, start, end);
	}

	/**
	 * Returns an ordered range of all the survey operations where endDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyOperationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByEndDate(Date, int, int, OrderByComparator)}
	 * @param endDate the end date
	 * @param start the lower bound of the range of survey operations
	 * @param end the upper bound of the range of survey operations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching survey operations
	 */
	@Deprecated
	public static List<SurveyOperation> findByEndDate(
		Date endDate, int start, int end,
		OrderByComparator<SurveyOperation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByEndDate(
			endDate, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the survey operations where endDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyOperationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param endDate the end date
	 * @param start the lower bound of the range of survey operations
	 * @param end the upper bound of the range of survey operations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching survey operations
	 */
	public static List<SurveyOperation> findByEndDate(
		Date endDate, int start, int end,
		OrderByComparator<SurveyOperation> orderByComparator) {

		return getPersistence().findByEndDate(
			endDate, start, end, orderByComparator);
	}

	/**
	 * Returns the first survey operation in the ordered set where endDate = &#63;.
	 *
	 * @param endDate the end date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey operation
	 * @throws NoSuchSurveyOperationException if a matching survey operation could not be found
	 */
	public static SurveyOperation findByEndDate_First(
			Date endDate, OrderByComparator<SurveyOperation> orderByComparator)
		throws operation.exception.NoSuchSurveyOperationException {

		return getPersistence().findByEndDate_First(endDate, orderByComparator);
	}

	/**
	 * Returns the first survey operation in the ordered set where endDate = &#63;.
	 *
	 * @param endDate the end date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey operation, or <code>null</code> if a matching survey operation could not be found
	 */
	public static SurveyOperation fetchByEndDate_First(
		Date endDate, OrderByComparator<SurveyOperation> orderByComparator) {

		return getPersistence().fetchByEndDate_First(
			endDate, orderByComparator);
	}

	/**
	 * Returns the last survey operation in the ordered set where endDate = &#63;.
	 *
	 * @param endDate the end date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey operation
	 * @throws NoSuchSurveyOperationException if a matching survey operation could not be found
	 */
	public static SurveyOperation findByEndDate_Last(
			Date endDate, OrderByComparator<SurveyOperation> orderByComparator)
		throws operation.exception.NoSuchSurveyOperationException {

		return getPersistence().findByEndDate_Last(endDate, orderByComparator);
	}

	/**
	 * Returns the last survey operation in the ordered set where endDate = &#63;.
	 *
	 * @param endDate the end date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey operation, or <code>null</code> if a matching survey operation could not be found
	 */
	public static SurveyOperation fetchByEndDate_Last(
		Date endDate, OrderByComparator<SurveyOperation> orderByComparator) {

		return getPersistence().fetchByEndDate_Last(endDate, orderByComparator);
	}

	/**
	 * Returns the survey operations before and after the current survey operation in the ordered set where endDate = &#63;.
	 *
	 * @param id the primary key of the current survey operation
	 * @param endDate the end date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next survey operation
	 * @throws NoSuchSurveyOperationException if a survey operation with the primary key could not be found
	 */
	public static SurveyOperation[] findByEndDate_PrevAndNext(
			long id, Date endDate,
			OrderByComparator<SurveyOperation> orderByComparator)
		throws operation.exception.NoSuchSurveyOperationException {

		return getPersistence().findByEndDate_PrevAndNext(
			id, endDate, orderByComparator);
	}

	/**
	 * Removes all the survey operations where endDate = &#63; from the database.
	 *
	 * @param endDate the end date
	 */
	public static void removeByEndDate(Date endDate) {
		getPersistence().removeByEndDate(endDate);
	}

	/**
	 * Returns the number of survey operations where endDate = &#63;.
	 *
	 * @param endDate the end date
	 * @return the number of matching survey operations
	 */
	public static int countByEndDate(Date endDate) {
		return getPersistence().countByEndDate(endDate);
	}

	/**
	 * Caches the survey operation in the entity cache if it is enabled.
	 *
	 * @param surveyOperation the survey operation
	 */
	public static void cacheResult(SurveyOperation surveyOperation) {
		getPersistence().cacheResult(surveyOperation);
	}

	/**
	 * Caches the survey operations in the entity cache if it is enabled.
	 *
	 * @param surveyOperations the survey operations
	 */
	public static void cacheResult(List<SurveyOperation> surveyOperations) {
		getPersistence().cacheResult(surveyOperations);
	}

	/**
	 * Creates a new survey operation with the primary key. Does not add the survey operation to the database.
	 *
	 * @param id the primary key for the new survey operation
	 * @return the new survey operation
	 */
	public static SurveyOperation create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the survey operation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the survey operation
	 * @return the survey operation that was removed
	 * @throws NoSuchSurveyOperationException if a survey operation with the primary key could not be found
	 */
	public static SurveyOperation remove(long id)
		throws operation.exception.NoSuchSurveyOperationException {

		return getPersistence().remove(id);
	}

	public static SurveyOperation updateImpl(SurveyOperation surveyOperation) {
		return getPersistence().updateImpl(surveyOperation);
	}

	/**
	 * Returns the survey operation with the primary key or throws a <code>NoSuchSurveyOperationException</code> if it could not be found.
	 *
	 * @param id the primary key of the survey operation
	 * @return the survey operation
	 * @throws NoSuchSurveyOperationException if a survey operation with the primary key could not be found
	 */
	public static SurveyOperation findByPrimaryKey(long id)
		throws operation.exception.NoSuchSurveyOperationException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the survey operation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the survey operation
	 * @return the survey operation, or <code>null</code> if a survey operation with the primary key could not be found
	 */
	public static SurveyOperation fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the survey operations.
	 *
	 * @return the survey operations
	 */
	public static List<SurveyOperation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the survey operations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyOperationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of survey operations
	 * @param end the upper bound of the range of survey operations (not inclusive)
	 * @return the range of survey operations
	 */
	public static List<SurveyOperation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the survey operations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyOperationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of survey operations
	 * @param end the upper bound of the range of survey operations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of survey operations
	 */
	@Deprecated
	public static List<SurveyOperation> findAll(
		int start, int end,
		OrderByComparator<SurveyOperation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the survey operations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyOperationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of survey operations
	 * @param end the upper bound of the range of survey operations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of survey operations
	 */
	public static List<SurveyOperation> findAll(
		int start, int end,
		OrderByComparator<SurveyOperation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the survey operations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of survey operations.
	 *
	 * @return the number of survey operations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SurveyOperationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<SurveyOperationPersistence, SurveyOperationPersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			SurveyOperationPersistence.class);

		ServiceTracker<SurveyOperationPersistence, SurveyOperationPersistence>
			serviceTracker =
				new ServiceTracker
					<SurveyOperationPersistence, SurveyOperationPersistence>(
						bundle.getBundleContext(),
						SurveyOperationPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}