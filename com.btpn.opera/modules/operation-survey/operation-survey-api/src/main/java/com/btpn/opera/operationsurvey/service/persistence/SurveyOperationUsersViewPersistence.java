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

import com.btpn.opera.operationsurvey.exception.NoSuchSurveyOperationUsersViewException;
import com.btpn.opera.operationsurvey.model.SurveyOperationUsersView;

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the survey operation users view service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationUsersViewUtil
 * @generated
 */
@ProviderType
public interface SurveyOperationUsersViewPersistence
	extends BasePersistence<SurveyOperationUsersView> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SurveyOperationUsersViewUtil} to access the survey operation users view persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the survey operation users views where respondenNik = &#63;.
	 *
	 * @param respondenNik the responden nik
	 * @return the matching survey operation users views
	 */
	public java.util.List<SurveyOperationUsersView> findByRespondenNik(
		String respondenNik);

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
	public java.util.List<SurveyOperationUsersView> findByRespondenNik(
		String respondenNik, int start, int end);

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
	public java.util.List<SurveyOperationUsersView> findByRespondenNik(
		String respondenNik, int start, int end,
		OrderByComparator<SurveyOperationUsersView> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<SurveyOperationUsersView> findByRespondenNik(
		String respondenNik, int start, int end,
		OrderByComparator<SurveyOperationUsersView> orderByComparator);

	/**
	 * Returns the first survey operation users view in the ordered set where respondenNik = &#63;.
	 *
	 * @param respondenNik the responden nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey operation users view
	 * @throws NoSuchSurveyOperationUsersViewException if a matching survey operation users view could not be found
	 */
	public SurveyOperationUsersView findByRespondenNik_First(
			String respondenNik,
			OrderByComparator<SurveyOperationUsersView> orderByComparator)
		throws NoSuchSurveyOperationUsersViewException;

	/**
	 * Returns the first survey operation users view in the ordered set where respondenNik = &#63;.
	 *
	 * @param respondenNik the responden nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey operation users view, or <code>null</code> if a matching survey operation users view could not be found
	 */
	public SurveyOperationUsersView fetchByRespondenNik_First(
		String respondenNik,
		OrderByComparator<SurveyOperationUsersView> orderByComparator);

	/**
	 * Returns the last survey operation users view in the ordered set where respondenNik = &#63;.
	 *
	 * @param respondenNik the responden nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey operation users view
	 * @throws NoSuchSurveyOperationUsersViewException if a matching survey operation users view could not be found
	 */
	public SurveyOperationUsersView findByRespondenNik_Last(
			String respondenNik,
			OrderByComparator<SurveyOperationUsersView> orderByComparator)
		throws NoSuchSurveyOperationUsersViewException;

	/**
	 * Returns the last survey operation users view in the ordered set where respondenNik = &#63;.
	 *
	 * @param respondenNik the responden nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey operation users view, or <code>null</code> if a matching survey operation users view could not be found
	 */
	public SurveyOperationUsersView fetchByRespondenNik_Last(
		String respondenNik,
		OrderByComparator<SurveyOperationUsersView> orderByComparator);

	/**
	 * Returns the survey operation users views before and after the current survey operation users view in the ordered set where respondenNik = &#63;.
	 *
	 * @param id the primary key of the current survey operation users view
	 * @param respondenNik the responden nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next survey operation users view
	 * @throws NoSuchSurveyOperationUsersViewException if a survey operation users view with the primary key could not be found
	 */
	public SurveyOperationUsersView[] findByRespondenNik_PrevAndNext(
			long id, String respondenNik,
			OrderByComparator<SurveyOperationUsersView> orderByComparator)
		throws NoSuchSurveyOperationUsersViewException;

	/**
	 * Removes all the survey operation users views where respondenNik = &#63; from the database.
	 *
	 * @param respondenNik the responden nik
	 */
	public void removeByRespondenNik(String respondenNik);

	/**
	 * Returns the number of survey operation users views where respondenNik = &#63;.
	 *
	 * @param respondenNik the responden nik
	 * @return the number of matching survey operation users views
	 */
	public int countByRespondenNik(String respondenNik);

	/**
	 * Returns all the survey operation users views where respondenId = &#63;.
	 *
	 * @param respondenId the responden ID
	 * @return the matching survey operation users views
	 */
	public java.util.List<SurveyOperationUsersView> findByRespondenId(
		long respondenId);

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
	public java.util.List<SurveyOperationUsersView> findByRespondenId(
		long respondenId, int start, int end);

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
	public java.util.List<SurveyOperationUsersView> findByRespondenId(
		long respondenId, int start, int end,
		OrderByComparator<SurveyOperationUsersView> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<SurveyOperationUsersView> findByRespondenId(
		long respondenId, int start, int end,
		OrderByComparator<SurveyOperationUsersView> orderByComparator);

	/**
	 * Returns the first survey operation users view in the ordered set where respondenId = &#63;.
	 *
	 * @param respondenId the responden ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey operation users view
	 * @throws NoSuchSurveyOperationUsersViewException if a matching survey operation users view could not be found
	 */
	public SurveyOperationUsersView findByRespondenId_First(
			long respondenId,
			OrderByComparator<SurveyOperationUsersView> orderByComparator)
		throws NoSuchSurveyOperationUsersViewException;

	/**
	 * Returns the first survey operation users view in the ordered set where respondenId = &#63;.
	 *
	 * @param respondenId the responden ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey operation users view, or <code>null</code> if a matching survey operation users view could not be found
	 */
	public SurveyOperationUsersView fetchByRespondenId_First(
		long respondenId,
		OrderByComparator<SurveyOperationUsersView> orderByComparator);

	/**
	 * Returns the last survey operation users view in the ordered set where respondenId = &#63;.
	 *
	 * @param respondenId the responden ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey operation users view
	 * @throws NoSuchSurveyOperationUsersViewException if a matching survey operation users view could not be found
	 */
	public SurveyOperationUsersView findByRespondenId_Last(
			long respondenId,
			OrderByComparator<SurveyOperationUsersView> orderByComparator)
		throws NoSuchSurveyOperationUsersViewException;

	/**
	 * Returns the last survey operation users view in the ordered set where respondenId = &#63;.
	 *
	 * @param respondenId the responden ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey operation users view, or <code>null</code> if a matching survey operation users view could not be found
	 */
	public SurveyOperationUsersView fetchByRespondenId_Last(
		long respondenId,
		OrderByComparator<SurveyOperationUsersView> orderByComparator);

	/**
	 * Returns the survey operation users views before and after the current survey operation users view in the ordered set where respondenId = &#63;.
	 *
	 * @param id the primary key of the current survey operation users view
	 * @param respondenId the responden ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next survey operation users view
	 * @throws NoSuchSurveyOperationUsersViewException if a survey operation users view with the primary key could not be found
	 */
	public SurveyOperationUsersView[] findByRespondenId_PrevAndNext(
			long id, long respondenId,
			OrderByComparator<SurveyOperationUsersView> orderByComparator)
		throws NoSuchSurveyOperationUsersViewException;

	/**
	 * Removes all the survey operation users views where respondenId = &#63; from the database.
	 *
	 * @param respondenId the responden ID
	 */
	public void removeByRespondenId(long respondenId);

	/**
	 * Returns the number of survey operation users views where respondenId = &#63;.
	 *
	 * @param respondenId the responden ID
	 * @return the number of matching survey operation users views
	 */
	public int countByRespondenId(long respondenId);

	/**
	 * Caches the survey operation users view in the entity cache if it is enabled.
	 *
	 * @param surveyOperationUsersView the survey operation users view
	 */
	public void cacheResult(SurveyOperationUsersView surveyOperationUsersView);

	/**
	 * Caches the survey operation users views in the entity cache if it is enabled.
	 *
	 * @param surveyOperationUsersViews the survey operation users views
	 */
	public void cacheResult(
		java.util.List<SurveyOperationUsersView> surveyOperationUsersViews);

	/**
	 * Creates a new survey operation users view with the primary key. Does not add the survey operation users view to the database.
	 *
	 * @param id the primary key for the new survey operation users view
	 * @return the new survey operation users view
	 */
	public SurveyOperationUsersView create(long id);

	/**
	 * Removes the survey operation users view with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the survey operation users view
	 * @return the survey operation users view that was removed
	 * @throws NoSuchSurveyOperationUsersViewException if a survey operation users view with the primary key could not be found
	 */
	public SurveyOperationUsersView remove(long id)
		throws NoSuchSurveyOperationUsersViewException;

	public SurveyOperationUsersView updateImpl(
		SurveyOperationUsersView surveyOperationUsersView);

	/**
	 * Returns the survey operation users view with the primary key or throws a <code>NoSuchSurveyOperationUsersViewException</code> if it could not be found.
	 *
	 * @param id the primary key of the survey operation users view
	 * @return the survey operation users view
	 * @throws NoSuchSurveyOperationUsersViewException if a survey operation users view with the primary key could not be found
	 */
	public SurveyOperationUsersView findByPrimaryKey(long id)
		throws NoSuchSurveyOperationUsersViewException;

	/**
	 * Returns the survey operation users view with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the survey operation users view
	 * @return the survey operation users view, or <code>null</code> if a survey operation users view with the primary key could not be found
	 */
	public SurveyOperationUsersView fetchByPrimaryKey(long id);

	/**
	 * Returns all the survey operation users views.
	 *
	 * @return the survey operation users views
	 */
	public java.util.List<SurveyOperationUsersView> findAll();

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
	public java.util.List<SurveyOperationUsersView> findAll(int start, int end);

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
	public java.util.List<SurveyOperationUsersView> findAll(
		int start, int end,
		OrderByComparator<SurveyOperationUsersView> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<SurveyOperationUsersView> findAll(
		int start, int end,
		OrderByComparator<SurveyOperationUsersView> orderByComparator);

	/**
	 * Removes all the survey operation users views from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of survey operation users views.
	 *
	 * @return the number of survey operation users views
	 */
	public int countAll();

}