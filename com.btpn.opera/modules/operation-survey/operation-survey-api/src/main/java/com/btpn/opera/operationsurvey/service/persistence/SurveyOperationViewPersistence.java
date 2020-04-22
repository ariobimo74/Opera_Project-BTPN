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

import com.btpn.opera.operationsurvey.exception.NoSuchSurveyOperationViewException;
import com.btpn.opera.operationsurvey.model.SurveyOperationView;

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the survey operation view service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationViewUtil
 * @generated
 */
@ProviderType
public interface SurveyOperationViewPersistence
	extends BasePersistence<SurveyOperationView> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SurveyOperationViewUtil} to access the survey operation view persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the survey operation views where title = &#63;.
	 *
	 * @param title the title
	 * @return the matching survey operation views
	 */
	public java.util.List<SurveyOperationView> findByTitle(String title);

	/**
	 * Returns a range of all the survey operation views where title = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyOperationViewModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param title the title
	 * @param start the lower bound of the range of survey operation views
	 * @param end the upper bound of the range of survey operation views (not inclusive)
	 * @return the range of matching survey operation views
	 */
	public java.util.List<SurveyOperationView> findByTitle(
		String title, int start, int end);

	/**
	 * Returns an ordered range of all the survey operation views where title = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyOperationViewModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByTitle(String, int, int, OrderByComparator)}
	 * @param title the title
	 * @param start the lower bound of the range of survey operation views
	 * @param end the upper bound of the range of survey operation views (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching survey operation views
	 */
	@Deprecated
	public java.util.List<SurveyOperationView> findByTitle(
		String title, int start, int end,
		OrderByComparator<SurveyOperationView> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns an ordered range of all the survey operation views where title = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyOperationViewModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param title the title
	 * @param start the lower bound of the range of survey operation views
	 * @param end the upper bound of the range of survey operation views (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching survey operation views
	 */
	public java.util.List<SurveyOperationView> findByTitle(
		String title, int start, int end,
		OrderByComparator<SurveyOperationView> orderByComparator);

	/**
	 * Returns the first survey operation view in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey operation view
	 * @throws NoSuchSurveyOperationViewException if a matching survey operation view could not be found
	 */
	public SurveyOperationView findByTitle_First(
			String title,
			OrderByComparator<SurveyOperationView> orderByComparator)
		throws NoSuchSurveyOperationViewException;

	/**
	 * Returns the first survey operation view in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey operation view, or <code>null</code> if a matching survey operation view could not be found
	 */
	public SurveyOperationView fetchByTitle_First(
		String title, OrderByComparator<SurveyOperationView> orderByComparator);

	/**
	 * Returns the last survey operation view in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey operation view
	 * @throws NoSuchSurveyOperationViewException if a matching survey operation view could not be found
	 */
	public SurveyOperationView findByTitle_Last(
			String title,
			OrderByComparator<SurveyOperationView> orderByComparator)
		throws NoSuchSurveyOperationViewException;

	/**
	 * Returns the last survey operation view in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey operation view, or <code>null</code> if a matching survey operation view could not be found
	 */
	public SurveyOperationView fetchByTitle_Last(
		String title, OrderByComparator<SurveyOperationView> orderByComparator);

	/**
	 * Returns the survey operation views before and after the current survey operation view in the ordered set where title = &#63;.
	 *
	 * @param id the primary key of the current survey operation view
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next survey operation view
	 * @throws NoSuchSurveyOperationViewException if a survey operation view with the primary key could not be found
	 */
	public SurveyOperationView[] findByTitle_PrevAndNext(
			long id, String title,
			OrderByComparator<SurveyOperationView> orderByComparator)
		throws NoSuchSurveyOperationViewException;

	/**
	 * Removes all the survey operation views where title = &#63; from the database.
	 *
	 * @param title the title
	 */
	public void removeByTitle(String title);

	/**
	 * Returns the number of survey operation views where title = &#63;.
	 *
	 * @param title the title
	 * @return the number of matching survey operation views
	 */
	public int countByTitle(String title);

	/**
	 * Caches the survey operation view in the entity cache if it is enabled.
	 *
	 * @param surveyOperationView the survey operation view
	 */
	public void cacheResult(SurveyOperationView surveyOperationView);

	/**
	 * Caches the survey operation views in the entity cache if it is enabled.
	 *
	 * @param surveyOperationViews the survey operation views
	 */
	public void cacheResult(
		java.util.List<SurveyOperationView> surveyOperationViews);

	/**
	 * Creates a new survey operation view with the primary key. Does not add the survey operation view to the database.
	 *
	 * @param id the primary key for the new survey operation view
	 * @return the new survey operation view
	 */
	public SurveyOperationView create(long id);

	/**
	 * Removes the survey operation view with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the survey operation view
	 * @return the survey operation view that was removed
	 * @throws NoSuchSurveyOperationViewException if a survey operation view with the primary key could not be found
	 */
	public SurveyOperationView remove(long id)
		throws NoSuchSurveyOperationViewException;

	public SurveyOperationView updateImpl(
		SurveyOperationView surveyOperationView);

	/**
	 * Returns the survey operation view with the primary key or throws a <code>NoSuchSurveyOperationViewException</code> if it could not be found.
	 *
	 * @param id the primary key of the survey operation view
	 * @return the survey operation view
	 * @throws NoSuchSurveyOperationViewException if a survey operation view with the primary key could not be found
	 */
	public SurveyOperationView findByPrimaryKey(long id)
		throws NoSuchSurveyOperationViewException;

	/**
	 * Returns the survey operation view with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the survey operation view
	 * @return the survey operation view, or <code>null</code> if a survey operation view with the primary key could not be found
	 */
	public SurveyOperationView fetchByPrimaryKey(long id);

	/**
	 * Returns all the survey operation views.
	 *
	 * @return the survey operation views
	 */
	public java.util.List<SurveyOperationView> findAll();

	/**
	 * Returns a range of all the survey operation views.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyOperationViewModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of survey operation views
	 * @param end the upper bound of the range of survey operation views (not inclusive)
	 * @return the range of survey operation views
	 */
	public java.util.List<SurveyOperationView> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the survey operation views.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyOperationViewModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of survey operation views
	 * @param end the upper bound of the range of survey operation views (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of survey operation views
	 */
	@Deprecated
	public java.util.List<SurveyOperationView> findAll(
		int start, int end,
		OrderByComparator<SurveyOperationView> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns an ordered range of all the survey operation views.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyOperationViewModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of survey operation views
	 * @param end the upper bound of the range of survey operation views (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of survey operation views
	 */
	public java.util.List<SurveyOperationView> findAll(
		int start, int end,
		OrderByComparator<SurveyOperationView> orderByComparator);

	/**
	 * Removes all the survey operation views from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of survey operation views.
	 *
	 * @return the number of survey operation views
	 */
	public int countAll();

}