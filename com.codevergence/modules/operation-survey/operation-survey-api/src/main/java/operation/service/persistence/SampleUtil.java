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

import operation.model.Sample;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the sample service. This utility wraps <code>operation.service.persistence.impl.SamplePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SamplePersistence
 * @generated
 */
@ProviderType
public class SampleUtil {

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
	public static void clearCache(Sample sample) {
		getPersistence().clearCache(sample);
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
	public static Map<Serializable, Sample> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Sample> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Sample> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Sample> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Sample> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Sample update(Sample sample) {
		return getPersistence().update(sample);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Sample update(Sample sample, ServiceContext serviceContext) {
		return getPersistence().update(sample, serviceContext);
	}

	/**
	 * Returns all the samples where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @return the matching samples
	 */
	public static List<Sample> findByField2(boolean field2) {
		return getPersistence().findByField2(field2);
	}

	/**
	 * Returns a range of all the samples where field2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SampleModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param field2 the field2
	 * @param start the lower bound of the range of samples
	 * @param end the upper bound of the range of samples (not inclusive)
	 * @return the range of matching samples
	 */
	public static List<Sample> findByField2(
		boolean field2, int start, int end) {

		return getPersistence().findByField2(field2, start, end);
	}

	/**
	 * Returns an ordered range of all the samples where field2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SampleModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByField2(boolean, int, int, OrderByComparator)}
	 * @param field2 the field2
	 * @param start the lower bound of the range of samples
	 * @param end the upper bound of the range of samples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching samples
	 */
	@Deprecated
	public static List<Sample> findByField2(
		boolean field2, int start, int end,
		OrderByComparator<Sample> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByField2(
			field2, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the samples where field2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SampleModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param field2 the field2
	 * @param start the lower bound of the range of samples
	 * @param end the upper bound of the range of samples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching samples
	 */
	public static List<Sample> findByField2(
		boolean field2, int start, int end,
		OrderByComparator<Sample> orderByComparator) {

		return getPersistence().findByField2(
			field2, start, end, orderByComparator);
	}

	/**
	 * Returns the first sample in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sample
	 * @throws NoSuchSampleException if a matching sample could not be found
	 */
	public static Sample findByField2_First(
			boolean field2, OrderByComparator<Sample> orderByComparator)
		throws operation.exception.NoSuchSampleException {

		return getPersistence().findByField2_First(field2, orderByComparator);
	}

	/**
	 * Returns the first sample in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sample, or <code>null</code> if a matching sample could not be found
	 */
	public static Sample fetchByField2_First(
		boolean field2, OrderByComparator<Sample> orderByComparator) {

		return getPersistence().fetchByField2_First(field2, orderByComparator);
	}

	/**
	 * Returns the last sample in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sample
	 * @throws NoSuchSampleException if a matching sample could not be found
	 */
	public static Sample findByField2_Last(
			boolean field2, OrderByComparator<Sample> orderByComparator)
		throws operation.exception.NoSuchSampleException {

		return getPersistence().findByField2_Last(field2, orderByComparator);
	}

	/**
	 * Returns the last sample in the ordered set where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sample, or <code>null</code> if a matching sample could not be found
	 */
	public static Sample fetchByField2_Last(
		boolean field2, OrderByComparator<Sample> orderByComparator) {

		return getPersistence().fetchByField2_Last(field2, orderByComparator);
	}

	/**
	 * Returns the samples before and after the current sample in the ordered set where field2 = &#63;.
	 *
	 * @param sampleId the primary key of the current sample
	 * @param field2 the field2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sample
	 * @throws NoSuchSampleException if a sample with the primary key could not be found
	 */
	public static Sample[] findByField2_PrevAndNext(
			long sampleId, boolean field2,
			OrderByComparator<Sample> orderByComparator)
		throws operation.exception.NoSuchSampleException {

		return getPersistence().findByField2_PrevAndNext(
			sampleId, field2, orderByComparator);
	}

	/**
	 * Removes all the samples where field2 = &#63; from the database.
	 *
	 * @param field2 the field2
	 */
	public static void removeByField2(boolean field2) {
		getPersistence().removeByField2(field2);
	}

	/**
	 * Returns the number of samples where field2 = &#63;.
	 *
	 * @param field2 the field2
	 * @return the number of matching samples
	 */
	public static int countByField2(boolean field2) {
		return getPersistence().countByField2(field2);
	}

	/**
	 * Caches the sample in the entity cache if it is enabled.
	 *
	 * @param sample the sample
	 */
	public static void cacheResult(Sample sample) {
		getPersistence().cacheResult(sample);
	}

	/**
	 * Caches the samples in the entity cache if it is enabled.
	 *
	 * @param samples the samples
	 */
	public static void cacheResult(List<Sample> samples) {
		getPersistence().cacheResult(samples);
	}

	/**
	 * Creates a new sample with the primary key. Does not add the sample to the database.
	 *
	 * @param sampleId the primary key for the new sample
	 * @return the new sample
	 */
	public static Sample create(long sampleId) {
		return getPersistence().create(sampleId);
	}

	/**
	 * Removes the sample with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sampleId the primary key of the sample
	 * @return the sample that was removed
	 * @throws NoSuchSampleException if a sample with the primary key could not be found
	 */
	public static Sample remove(long sampleId)
		throws operation.exception.NoSuchSampleException {

		return getPersistence().remove(sampleId);
	}

	public static Sample updateImpl(Sample sample) {
		return getPersistence().updateImpl(sample);
	}

	/**
	 * Returns the sample with the primary key or throws a <code>NoSuchSampleException</code> if it could not be found.
	 *
	 * @param sampleId the primary key of the sample
	 * @return the sample
	 * @throws NoSuchSampleException if a sample with the primary key could not be found
	 */
	public static Sample findByPrimaryKey(long sampleId)
		throws operation.exception.NoSuchSampleException {

		return getPersistence().findByPrimaryKey(sampleId);
	}

	/**
	 * Returns the sample with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sampleId the primary key of the sample
	 * @return the sample, or <code>null</code> if a sample with the primary key could not be found
	 */
	public static Sample fetchByPrimaryKey(long sampleId) {
		return getPersistence().fetchByPrimaryKey(sampleId);
	}

	/**
	 * Returns all the samples.
	 *
	 * @return the samples
	 */
	public static List<Sample> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the samples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SampleModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of samples
	 * @param end the upper bound of the range of samples (not inclusive)
	 * @return the range of samples
	 */
	public static List<Sample> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the samples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SampleModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of samples
	 * @param end the upper bound of the range of samples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of samples
	 */
	@Deprecated
	public static List<Sample> findAll(
		int start, int end, OrderByComparator<Sample> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the samples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SampleModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of samples
	 * @param end the upper bound of the range of samples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of samples
	 */
	public static List<Sample> findAll(
		int start, int end, OrderByComparator<Sample> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the samples from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of samples.
	 *
	 * @return the number of samples
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SamplePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SamplePersistence, SamplePersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(SamplePersistence.class);

		ServiceTracker<SamplePersistence, SamplePersistence> serviceTracker =
			new ServiceTracker<SamplePersistence, SamplePersistence>(
				bundle.getBundleContext(), SamplePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}