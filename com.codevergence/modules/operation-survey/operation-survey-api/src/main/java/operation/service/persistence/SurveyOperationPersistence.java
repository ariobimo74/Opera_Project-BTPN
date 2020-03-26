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

import operation.exception.NoSuchSurveyOperationException;

import operation.model.SurveyOperation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the survey operation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationUtil
 * @generated
 */
@ProviderType
public interface SurveyOperationPersistence
	extends BasePersistence<SurveyOperation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SurveyOperationUtil} to access the survey operation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the survey operations where title = &#63;.
	 *
	 * @param title the title
	 * @return the matching survey operations
	 */
	public java.util.List<SurveyOperation> findByTitle(String title);

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
	public java.util.List<SurveyOperation> findByTitle(
		String title, int start, int end);

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
	public java.util.List<SurveyOperation> findByTitle(
		String title, int start, int end,
		OrderByComparator<SurveyOperation> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<SurveyOperation> findByTitle(
		String title, int start, int end,
		OrderByComparator<SurveyOperation> orderByComparator);

	/**
	 * Returns the first survey operation in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey operation
	 * @throws NoSuchSurveyOperationException if a matching survey operation could not be found
	 */
	public SurveyOperation findByTitle_First(
			String title, OrderByComparator<SurveyOperation> orderByComparator)
		throws NoSuchSurveyOperationException;

	/**
	 * Returns the first survey operation in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey operation, or <code>null</code> if a matching survey operation could not be found
	 */
	public SurveyOperation fetchByTitle_First(
		String title, OrderByComparator<SurveyOperation> orderByComparator);

	/**
	 * Returns the last survey operation in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey operation
	 * @throws NoSuchSurveyOperationException if a matching survey operation could not be found
	 */
	public SurveyOperation findByTitle_Last(
			String title, OrderByComparator<SurveyOperation> orderByComparator)
		throws NoSuchSurveyOperationException;

	/**
	 * Returns the last survey operation in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey operation, or <code>null</code> if a matching survey operation could not be found
	 */
	public SurveyOperation fetchByTitle_Last(
		String title, OrderByComparator<SurveyOperation> orderByComparator);

	/**
	 * Returns the survey operations before and after the current survey operation in the ordered set where title = &#63;.
	 *
	 * @param id the primary key of the current survey operation
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next survey operation
	 * @throws NoSuchSurveyOperationException if a survey operation with the primary key could not be found
	 */
	public SurveyOperation[] findByTitle_PrevAndNext(
			long id, String title,
			OrderByComparator<SurveyOperation> orderByComparator)
		throws NoSuchSurveyOperationException;

	/**
	 * Removes all the survey operations where title = &#63; from the database.
	 *
	 * @param title the title
	 */
	public void removeByTitle(String title);

	/**
	 * Returns the number of survey operations where title = &#63;.
	 *
	 * @param title the title
	 * @return the number of matching survey operations
	 */
	public int countByTitle(String title);

	/**
	 * Caches the survey operation in the entity cache if it is enabled.
	 *
	 * @param surveyOperation the survey operation
	 */
	public void cacheResult(SurveyOperation surveyOperation);

	/**
	 * Caches the survey operations in the entity cache if it is enabled.
	 *
	 * @param surveyOperations the survey operations
	 */
	public void cacheResult(java.util.List<SurveyOperation> surveyOperations);

	/**
	 * Creates a new survey operation with the primary key. Does not add the survey operation to the database.
	 *
	 * @param id the primary key for the new survey operation
	 * @return the new survey operation
	 */
	public SurveyOperation create(long id);

	/**
	 * Removes the survey operation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the survey operation
	 * @return the survey operation that was removed
	 * @throws NoSuchSurveyOperationException if a survey operation with the primary key could not be found
	 */
	public SurveyOperation remove(long id)
		throws NoSuchSurveyOperationException;

	public SurveyOperation updateImpl(SurveyOperation surveyOperation);

	/**
	 * Returns the survey operation with the primary key or throws a <code>NoSuchSurveyOperationException</code> if it could not be found.
	 *
	 * @param id the primary key of the survey operation
	 * @return the survey operation
	 * @throws NoSuchSurveyOperationException if a survey operation with the primary key could not be found
	 */
	public SurveyOperation findByPrimaryKey(long id)
		throws NoSuchSurveyOperationException;

	/**
	 * Returns the survey operation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the survey operation
	 * @return the survey operation, or <code>null</code> if a survey operation with the primary key could not be found
	 */
	public SurveyOperation fetchByPrimaryKey(long id);

	/**
	 * Returns all the survey operations.
	 *
	 * @return the survey operations
	 */
	public java.util.List<SurveyOperation> findAll();

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
	public java.util.List<SurveyOperation> findAll(int start, int end);

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
	public java.util.List<SurveyOperation> findAll(
		int start, int end,
		OrderByComparator<SurveyOperation> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<SurveyOperation> findAll(
		int start, int end,
		OrderByComparator<SurveyOperation> orderByComparator);

	/**
	 * Removes all the survey operations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of survey operations.
	 *
	 * @return the number of survey operations
	 */
	public int countAll();

}