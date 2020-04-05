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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.util.OrderByComparator;

import operation.exception.NoSuchSurveyObjectException;

import operation.model.SurveyObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the survey object service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyObjectUtil
 * @generated
 */
@ProviderType
public interface SurveyObjectPersistence extends BasePersistence<SurveyObject> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SurveyObjectUtil} to access the survey object persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the survey objects where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching survey objects
	 */
	public java.util.List<SurveyObject> findByObjectName(String name);

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
	public java.util.List<SurveyObject> findByObjectName(
		String name, int start, int end);

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
	public java.util.List<SurveyObject> findByObjectName(
		String name, int start, int end,
		OrderByComparator<SurveyObject> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<SurveyObject> findByObjectName(
		String name, int start, int end,
		OrderByComparator<SurveyObject> orderByComparator);

	/**
	 * Returns the first survey object in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey object
	 * @throws NoSuchSurveyObjectException if a matching survey object could not be found
	 */
	public SurveyObject findByObjectName_First(
			String name, OrderByComparator<SurveyObject> orderByComparator)
		throws NoSuchSurveyObjectException;

	/**
	 * Returns the first survey object in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey object, or <code>null</code> if a matching survey object could not be found
	 */
	public SurveyObject fetchByObjectName_First(
		String name, OrderByComparator<SurveyObject> orderByComparator);

	/**
	 * Returns the last survey object in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey object
	 * @throws NoSuchSurveyObjectException if a matching survey object could not be found
	 */
	public SurveyObject findByObjectName_Last(
			String name, OrderByComparator<SurveyObject> orderByComparator)
		throws NoSuchSurveyObjectException;

	/**
	 * Returns the last survey object in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey object, or <code>null</code> if a matching survey object could not be found
	 */
	public SurveyObject fetchByObjectName_Last(
		String name, OrderByComparator<SurveyObject> orderByComparator);

	/**
	 * Returns the survey objects before and after the current survey object in the ordered set where name = &#63;.
	 *
	 * @param id the primary key of the current survey object
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next survey object
	 * @throws NoSuchSurveyObjectException if a survey object with the primary key could not be found
	 */
	public SurveyObject[] findByObjectName_PrevAndNext(
			long id, String name,
			OrderByComparator<SurveyObject> orderByComparator)
		throws NoSuchSurveyObjectException;

	/**
	 * Removes all the survey objects where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public void removeByObjectName(String name);

	/**
	 * Returns the number of survey objects where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching survey objects
	 */
	public int countByObjectName(String name);

	/**
	 * Caches the survey object in the entity cache if it is enabled.
	 *
	 * @param surveyObject the survey object
	 */
	public void cacheResult(SurveyObject surveyObject);

	/**
	 * Caches the survey objects in the entity cache if it is enabled.
	 *
	 * @param surveyObjects the survey objects
	 */
	public void cacheResult(java.util.List<SurveyObject> surveyObjects);

	/**
	 * Creates a new survey object with the primary key. Does not add the survey object to the database.
	 *
	 * @param id the primary key for the new survey object
	 * @return the new survey object
	 */
	public SurveyObject create(long id);

	/**
	 * Removes the survey object with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the survey object
	 * @return the survey object that was removed
	 * @throws NoSuchSurveyObjectException if a survey object with the primary key could not be found
	 */
	public SurveyObject remove(long id) throws NoSuchSurveyObjectException;

	public SurveyObject updateImpl(SurveyObject surveyObject);

	/**
	 * Returns the survey object with the primary key or throws a <code>NoSuchSurveyObjectException</code> if it could not be found.
	 *
	 * @param id the primary key of the survey object
	 * @return the survey object
	 * @throws NoSuchSurveyObjectException if a survey object with the primary key could not be found
	 */
	public SurveyObject findByPrimaryKey(long id)
		throws NoSuchSurveyObjectException;

	/**
	 * Returns the survey object with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the survey object
	 * @return the survey object, or <code>null</code> if a survey object with the primary key could not be found
	 */
	public SurveyObject fetchByPrimaryKey(long id);

	/**
	 * Returns all the survey objects.
	 *
	 * @return the survey objects
	 */
	public java.util.List<SurveyObject> findAll();

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
	public java.util.List<SurveyObject> findAll(int start, int end);

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
	public java.util.List<SurveyObject> findAll(
		int start, int end, OrderByComparator<SurveyObject> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<SurveyObject> findAll(
		int start, int end, OrderByComparator<SurveyObject> orderByComparator);

	/**
	 * Removes all the survey objects from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of survey objects.
	 *
	 * @return the number of survey objects
	 */
	public int countAll();

}