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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.annotation.versioning.ProviderType;

import responden.exception.NoSuchSurveyRespondenException;

import responden.model.SurveyResponden;

/**
 * The persistence interface for the survey responden service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyRespondenUtil
 * @generated
 */
@ProviderType
public interface SurveyRespondenPersistence
	extends BasePersistence<SurveyResponden> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SurveyRespondenUtil} to access the survey responden persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the survey respondens where nik = &#63;.
	 *
	 * @param nik the nik
	 * @return the matching survey respondens
	 */
	public java.util.List<SurveyResponden> findByNIK(String nik);

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
	public java.util.List<SurveyResponden> findByNIK(
		String nik, int start, int end);

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
	public java.util.List<SurveyResponden> findByNIK(
		String nik, int start, int end,
		OrderByComparator<SurveyResponden> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<SurveyResponden> findByNIK(
		String nik, int start, int end,
		OrderByComparator<SurveyResponden> orderByComparator);

	/**
	 * Returns the first survey responden in the ordered set where nik = &#63;.
	 *
	 * @param nik the nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey responden
	 * @throws NoSuchSurveyRespondenException if a matching survey responden could not be found
	 */
	public SurveyResponden findByNIK_First(
			String nik, OrderByComparator<SurveyResponden> orderByComparator)
		throws NoSuchSurveyRespondenException;

	/**
	 * Returns the first survey responden in the ordered set where nik = &#63;.
	 *
	 * @param nik the nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey responden, or <code>null</code> if a matching survey responden could not be found
	 */
	public SurveyResponden fetchByNIK_First(
		String nik, OrderByComparator<SurveyResponden> orderByComparator);

	/**
	 * Returns the last survey responden in the ordered set where nik = &#63;.
	 *
	 * @param nik the nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey responden
	 * @throws NoSuchSurveyRespondenException if a matching survey responden could not be found
	 */
	public SurveyResponden findByNIK_Last(
			String nik, OrderByComparator<SurveyResponden> orderByComparator)
		throws NoSuchSurveyRespondenException;

	/**
	 * Returns the last survey responden in the ordered set where nik = &#63;.
	 *
	 * @param nik the nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey responden, or <code>null</code> if a matching survey responden could not be found
	 */
	public SurveyResponden fetchByNIK_Last(
		String nik, OrderByComparator<SurveyResponden> orderByComparator);

	/**
	 * Returns the survey respondens before and after the current survey responden in the ordered set where nik = &#63;.
	 *
	 * @param id the primary key of the current survey responden
	 * @param nik the nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next survey responden
	 * @throws NoSuchSurveyRespondenException if a survey responden with the primary key could not be found
	 */
	public SurveyResponden[] findByNIK_PrevAndNext(
			long id, String nik,
			OrderByComparator<SurveyResponden> orderByComparator)
		throws NoSuchSurveyRespondenException;

	/**
	 * Removes all the survey respondens where nik = &#63; from the database.
	 *
	 * @param nik the nik
	 */
	public void removeByNIK(String nik);

	/**
	 * Returns the number of survey respondens where nik = &#63;.
	 *
	 * @param nik the nik
	 * @return the number of matching survey respondens
	 */
	public int countByNIK(String nik);

	/**
	 * Returns all the survey respondens where surveyId = &#63;.
	 *
	 * @param surveyId the survey ID
	 * @return the matching survey respondens
	 */
	public java.util.List<SurveyResponden> findBySurveyId(long surveyId);

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
	public java.util.List<SurveyResponden> findBySurveyId(
		long surveyId, int start, int end);

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
	public java.util.List<SurveyResponden> findBySurveyId(
		long surveyId, int start, int end,
		OrderByComparator<SurveyResponden> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<SurveyResponden> findBySurveyId(
		long surveyId, int start, int end,
		OrderByComparator<SurveyResponden> orderByComparator);

	/**
	 * Returns the first survey responden in the ordered set where surveyId = &#63;.
	 *
	 * @param surveyId the survey ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey responden
	 * @throws NoSuchSurveyRespondenException if a matching survey responden could not be found
	 */
	public SurveyResponden findBySurveyId_First(
			long surveyId, OrderByComparator<SurveyResponden> orderByComparator)
		throws NoSuchSurveyRespondenException;

	/**
	 * Returns the first survey responden in the ordered set where surveyId = &#63;.
	 *
	 * @param surveyId the survey ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey responden, or <code>null</code> if a matching survey responden could not be found
	 */
	public SurveyResponden fetchBySurveyId_First(
		long surveyId, OrderByComparator<SurveyResponden> orderByComparator);

	/**
	 * Returns the last survey responden in the ordered set where surveyId = &#63;.
	 *
	 * @param surveyId the survey ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey responden
	 * @throws NoSuchSurveyRespondenException if a matching survey responden could not be found
	 */
	public SurveyResponden findBySurveyId_Last(
			long surveyId, OrderByComparator<SurveyResponden> orderByComparator)
		throws NoSuchSurveyRespondenException;

	/**
	 * Returns the last survey responden in the ordered set where surveyId = &#63;.
	 *
	 * @param surveyId the survey ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey responden, or <code>null</code> if a matching survey responden could not be found
	 */
	public SurveyResponden fetchBySurveyId_Last(
		long surveyId, OrderByComparator<SurveyResponden> orderByComparator);

	/**
	 * Returns the survey respondens before and after the current survey responden in the ordered set where surveyId = &#63;.
	 *
	 * @param id the primary key of the current survey responden
	 * @param surveyId the survey ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next survey responden
	 * @throws NoSuchSurveyRespondenException if a survey responden with the primary key could not be found
	 */
	public SurveyResponden[] findBySurveyId_PrevAndNext(
			long id, long surveyId,
			OrderByComparator<SurveyResponden> orderByComparator)
		throws NoSuchSurveyRespondenException;

	/**
	 * Removes all the survey respondens where surveyId = &#63; from the database.
	 *
	 * @param surveyId the survey ID
	 */
	public void removeBySurveyId(long surveyId);

	/**
	 * Returns the number of survey respondens where surveyId = &#63;.
	 *
	 * @param surveyId the survey ID
	 * @return the number of matching survey respondens
	 */
	public int countBySurveyId(long surveyId);

	/**
	 * Caches the survey responden in the entity cache if it is enabled.
	 *
	 * @param surveyResponden the survey responden
	 */
	public void cacheResult(SurveyResponden surveyResponden);

	/**
	 * Caches the survey respondens in the entity cache if it is enabled.
	 *
	 * @param surveyRespondens the survey respondens
	 */
	public void cacheResult(java.util.List<SurveyResponden> surveyRespondens);

	/**
	 * Creates a new survey responden with the primary key. Does not add the survey responden to the database.
	 *
	 * @param id the primary key for the new survey responden
	 * @return the new survey responden
	 */
	public SurveyResponden create(long id);

	/**
	 * Removes the survey responden with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the survey responden
	 * @return the survey responden that was removed
	 * @throws NoSuchSurveyRespondenException if a survey responden with the primary key could not be found
	 */
	public SurveyResponden remove(long id)
		throws NoSuchSurveyRespondenException;

	public SurveyResponden updateImpl(SurveyResponden surveyResponden);

	/**
	 * Returns the survey responden with the primary key or throws a <code>NoSuchSurveyRespondenException</code> if it could not be found.
	 *
	 * @param id the primary key of the survey responden
	 * @return the survey responden
	 * @throws NoSuchSurveyRespondenException if a survey responden with the primary key could not be found
	 */
	public SurveyResponden findByPrimaryKey(long id)
		throws NoSuchSurveyRespondenException;

	/**
	 * Returns the survey responden with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the survey responden
	 * @return the survey responden, or <code>null</code> if a survey responden with the primary key could not be found
	 */
	public SurveyResponden fetchByPrimaryKey(long id);

	/**
	 * Returns all the survey respondens.
	 *
	 * @return the survey respondens
	 */
	public java.util.List<SurveyResponden> findAll();

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
	public java.util.List<SurveyResponden> findAll(int start, int end);

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
	public java.util.List<SurveyResponden> findAll(
		int start, int end,
		OrderByComparator<SurveyResponden> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<SurveyResponden> findAll(
		int start, int end,
		OrderByComparator<SurveyResponden> orderByComparator);

	/**
	 * Removes all the survey respondens from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of survey respondens.
	 *
	 * @return the number of survey respondens
	 */
	public int countAll();

}