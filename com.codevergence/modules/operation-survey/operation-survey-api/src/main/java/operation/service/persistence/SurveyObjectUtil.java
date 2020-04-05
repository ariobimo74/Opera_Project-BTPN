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

import java.util.List;
import java.util.Map;
import java.util.Set;

import operation.model.SurveyObject;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the survey object service. This utility wraps <code>operation.service.persistence.impl.SurveyObjectPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyObjectPersistence
 * @generated
 */
@ProviderType
public class SurveyObjectUtil {

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
	public static void clearCache(SurveyObject surveyObject) {
		getPersistence().clearCache(surveyObject);
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
	public static Map<Serializable, SurveyObject> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SurveyObject> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SurveyObject> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SurveyObject> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SurveyObject> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SurveyObject update(SurveyObject surveyObject) {
		return getPersistence().update(surveyObject);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SurveyObject update(
		SurveyObject surveyObject, ServiceContext serviceContext) {

		return getPersistence().update(surveyObject, serviceContext);
	}

	/**
	 * Returns all the survey objects where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching survey objects
	 */
	public static List<SurveyObject> findByObjectName(String name) {
		return getPersistence().findByObjectName(name);
	}

	/**
	 * Returns a range of all the survey objects where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyObjectModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of survey objects
	 * @param end the upper bound of the range of survey objects (not inclusive)
	 * @return the range of matching survey objects
	 */
	public static List<SurveyObject> findByObjectName(
		String name, int start, int end) {

		return getPersistence().findByObjectName(name, start, end);
	}

	/**
	 * Returns an ordered range of all the survey objects where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyObjectModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByObjectName(String, int, int, OrderByComparator)}
	 * @param name the name
	 * @param start the lower bound of the range of survey objects
	 * @param end the upper bound of the range of survey objects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching survey objects
	 */
	@Deprecated
	public static List<SurveyObject> findByObjectName(
		String name, int start, int end,
		OrderByComparator<SurveyObject> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByObjectName(
			name, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the survey objects where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyObjectModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of survey objects
	 * @param end the upper bound of the range of survey objects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching survey objects
	 */
	public static List<SurveyObject> findByObjectName(
		String name, int start, int end,
		OrderByComparator<SurveyObject> orderByComparator) {

		return getPersistence().findByObjectName(
			name, start, end, orderByComparator);
	}

	/**
	 * Returns the first survey object in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey object
	 * @throws NoSuchSurveyObjectException if a matching survey object could not be found
	 */
	public static SurveyObject findByObjectName_First(
			String name, OrderByComparator<SurveyObject> orderByComparator)
		throws operation.exception.NoSuchSurveyObjectException {

		return getPersistence().findByObjectName_First(name, orderByComparator);
	}

	/**
	 * Returns the first survey object in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey object, or <code>null</code> if a matching survey object could not be found
	 */
	public static SurveyObject fetchByObjectName_First(
		String name, OrderByComparator<SurveyObject> orderByComparator) {

		return getPersistence().fetchByObjectName_First(
			name, orderByComparator);
	}

	/**
	 * Returns the last survey object in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey object
	 * @throws NoSuchSurveyObjectException if a matching survey object could not be found
	 */
	public static SurveyObject findByObjectName_Last(
			String name, OrderByComparator<SurveyObject> orderByComparator)
		throws operation.exception.NoSuchSurveyObjectException {

		return getPersistence().findByObjectName_Last(name, orderByComparator);
	}

	/**
	 * Returns the last survey object in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey object, or <code>null</code> if a matching survey object could not be found
	 */
	public static SurveyObject fetchByObjectName_Last(
		String name, OrderByComparator<SurveyObject> orderByComparator) {

		return getPersistence().fetchByObjectName_Last(name, orderByComparator);
	}

	/**
	 * Returns the survey objects before and after the current survey object in the ordered set where name = &#63;.
	 *
	 * @param id the primary key of the current survey object
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next survey object
	 * @throws NoSuchSurveyObjectException if a survey object with the primary key could not be found
	 */
	public static SurveyObject[] findByObjectName_PrevAndNext(
			long id, String name,
			OrderByComparator<SurveyObject> orderByComparator)
		throws operation.exception.NoSuchSurveyObjectException {

		return getPersistence().findByObjectName_PrevAndNext(
			id, name, orderByComparator);
	}

	/**
	 * Removes all the survey objects where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public static void removeByObjectName(String name) {
		getPersistence().removeByObjectName(name);
	}

	/**
	 * Returns the number of survey objects where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching survey objects
	 */
	public static int countByObjectName(String name) {
		return getPersistence().countByObjectName(name);
	}

	/**
	 * Caches the survey object in the entity cache if it is enabled.
	 *
	 * @param surveyObject the survey object
	 */
	public static void cacheResult(SurveyObject surveyObject) {
		getPersistence().cacheResult(surveyObject);
	}

	/**
	 * Caches the survey objects in the entity cache if it is enabled.
	 *
	 * @param surveyObjects the survey objects
	 */
	public static void cacheResult(List<SurveyObject> surveyObjects) {
		getPersistence().cacheResult(surveyObjects);
	}

	/**
	 * Creates a new survey object with the primary key. Does not add the survey object to the database.
	 *
	 * @param id the primary key for the new survey object
	 * @return the new survey object
	 */
	public static SurveyObject create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the survey object with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the survey object
	 * @return the survey object that was removed
	 * @throws NoSuchSurveyObjectException if a survey object with the primary key could not be found
	 */
	public static SurveyObject remove(long id)
		throws operation.exception.NoSuchSurveyObjectException {

		return getPersistence().remove(id);
	}

	public static SurveyObject updateImpl(SurveyObject surveyObject) {
		return getPersistence().updateImpl(surveyObject);
	}

	/**
	 * Returns the survey object with the primary key or throws a <code>NoSuchSurveyObjectException</code> if it could not be found.
	 *
	 * @param id the primary key of the survey object
	 * @return the survey object
	 * @throws NoSuchSurveyObjectException if a survey object with the primary key could not be found
	 */
	public static SurveyObject findByPrimaryKey(long id)
		throws operation.exception.NoSuchSurveyObjectException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the survey object with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the survey object
	 * @return the survey object, or <code>null</code> if a survey object with the primary key could not be found
	 */
	public static SurveyObject fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the survey objects.
	 *
	 * @return the survey objects
	 */
	public static List<SurveyObject> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the survey objects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyObjectModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of survey objects
	 * @param end the upper bound of the range of survey objects (not inclusive)
	 * @return the range of survey objects
	 */
	public static List<SurveyObject> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the survey objects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyObjectModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of survey objects
	 * @param end the upper bound of the range of survey objects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of survey objects
	 */
	@Deprecated
	public static List<SurveyObject> findAll(
		int start, int end, OrderByComparator<SurveyObject> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the survey objects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyObjectModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of survey objects
	 * @param end the upper bound of the range of survey objects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of survey objects
	 */
	public static List<SurveyObject> findAll(
		int start, int end, OrderByComparator<SurveyObject> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the survey objects from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of survey objects.
	 *
	 * @return the number of survey objects
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SurveyObjectPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<SurveyObjectPersistence, SurveyObjectPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(SurveyObjectPersistence.class);

		ServiceTracker<SurveyObjectPersistence, SurveyObjectPersistence>
			serviceTracker =
				new ServiceTracker
					<SurveyObjectPersistence, SurveyObjectPersistence>(
						bundle.getBundleContext(),
						SurveyObjectPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}