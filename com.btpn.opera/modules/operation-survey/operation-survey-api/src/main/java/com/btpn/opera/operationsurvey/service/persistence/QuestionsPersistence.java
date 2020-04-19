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

import com.btpn.opera.operationsurvey.exception.NoSuchQuestionsException;
import com.btpn.opera.operationsurvey.model.Questions;

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the questions service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuestionsUtil
 * @generated
 */
@ProviderType
public interface QuestionsPersistence extends BasePersistence<Questions> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QuestionsUtil} to access the questions persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the questionses where surveyOperationId = &#63;.
	 *
	 * @param surveyOperationId the survey operation ID
	 * @return the matching questionses
	 */
	public java.util.List<Questions> findBySurveyOperationId(
		long surveyOperationId);

	/**
	 * Returns a range of all the questionses where surveyOperationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>QuestionsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param surveyOperationId the survey operation ID
	 * @param start the lower bound of the range of questionses
	 * @param end the upper bound of the range of questionses (not inclusive)
	 * @return the range of matching questionses
	 */
	public java.util.List<Questions> findBySurveyOperationId(
		long surveyOperationId, int start, int end);

	/**
	 * Returns an ordered range of all the questionses where surveyOperationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>QuestionsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findBySurveyOperationId(long, int, int, OrderByComparator)}
	 * @param surveyOperationId the survey operation ID
	 * @param start the lower bound of the range of questionses
	 * @param end the upper bound of the range of questionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching questionses
	 */
	@Deprecated
	public java.util.List<Questions> findBySurveyOperationId(
		long surveyOperationId, int start, int end,
		OrderByComparator<Questions> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the questionses where surveyOperationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>QuestionsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param surveyOperationId the survey operation ID
	 * @param start the lower bound of the range of questionses
	 * @param end the upper bound of the range of questionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching questionses
	 */
	public java.util.List<Questions> findBySurveyOperationId(
		long surveyOperationId, int start, int end,
		OrderByComparator<Questions> orderByComparator);

	/**
	 * Returns the first questions in the ordered set where surveyOperationId = &#63;.
	 *
	 * @param surveyOperationId the survey operation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching questions
	 * @throws NoSuchQuestionsException if a matching questions could not be found
	 */
	public Questions findBySurveyOperationId_First(
			long surveyOperationId,
			OrderByComparator<Questions> orderByComparator)
		throws NoSuchQuestionsException;

	/**
	 * Returns the first questions in the ordered set where surveyOperationId = &#63;.
	 *
	 * @param surveyOperationId the survey operation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching questions, or <code>null</code> if a matching questions could not be found
	 */
	public Questions fetchBySurveyOperationId_First(
		long surveyOperationId, OrderByComparator<Questions> orderByComparator);

	/**
	 * Returns the last questions in the ordered set where surveyOperationId = &#63;.
	 *
	 * @param surveyOperationId the survey operation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching questions
	 * @throws NoSuchQuestionsException if a matching questions could not be found
	 */
	public Questions findBySurveyOperationId_Last(
			long surveyOperationId,
			OrderByComparator<Questions> orderByComparator)
		throws NoSuchQuestionsException;

	/**
	 * Returns the last questions in the ordered set where surveyOperationId = &#63;.
	 *
	 * @param surveyOperationId the survey operation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching questions, or <code>null</code> if a matching questions could not be found
	 */
	public Questions fetchBySurveyOperationId_Last(
		long surveyOperationId, OrderByComparator<Questions> orderByComparator);

	/**
	 * Returns the questionses before and after the current questions in the ordered set where surveyOperationId = &#63;.
	 *
	 * @param id the primary key of the current questions
	 * @param surveyOperationId the survey operation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next questions
	 * @throws NoSuchQuestionsException if a questions with the primary key could not be found
	 */
	public Questions[] findBySurveyOperationId_PrevAndNext(
			long id, long surveyOperationId,
			OrderByComparator<Questions> orderByComparator)
		throws NoSuchQuestionsException;

	/**
	 * Removes all the questionses where surveyOperationId = &#63; from the database.
	 *
	 * @param surveyOperationId the survey operation ID
	 */
	public void removeBySurveyOperationId(long surveyOperationId);

	/**
	 * Returns the number of questionses where surveyOperationId = &#63;.
	 *
	 * @param surveyOperationId the survey operation ID
	 * @return the number of matching questionses
	 */
	public int countBySurveyOperationId(long surveyOperationId);

	/**
	 * Caches the questions in the entity cache if it is enabled.
	 *
	 * @param questions the questions
	 */
	public void cacheResult(Questions questions);

	/**
	 * Caches the questionses in the entity cache if it is enabled.
	 *
	 * @param questionses the questionses
	 */
	public void cacheResult(java.util.List<Questions> questionses);

	/**
	 * Creates a new questions with the primary key. Does not add the questions to the database.
	 *
	 * @param id the primary key for the new questions
	 * @return the new questions
	 */
	public Questions create(long id);

	/**
	 * Removes the questions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the questions
	 * @return the questions that was removed
	 * @throws NoSuchQuestionsException if a questions with the primary key could not be found
	 */
	public Questions remove(long id) throws NoSuchQuestionsException;

	public Questions updateImpl(Questions questions);

	/**
	 * Returns the questions with the primary key or throws a <code>NoSuchQuestionsException</code> if it could not be found.
	 *
	 * @param id the primary key of the questions
	 * @return the questions
	 * @throws NoSuchQuestionsException if a questions with the primary key could not be found
	 */
	public Questions findByPrimaryKey(long id) throws NoSuchQuestionsException;

	/**
	 * Returns the questions with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the questions
	 * @return the questions, or <code>null</code> if a questions with the primary key could not be found
	 */
	public Questions fetchByPrimaryKey(long id);

	/**
	 * Returns all the questionses.
	 *
	 * @return the questionses
	 */
	public java.util.List<Questions> findAll();

	/**
	 * Returns a range of all the questionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>QuestionsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of questionses
	 * @param end the upper bound of the range of questionses (not inclusive)
	 * @return the range of questionses
	 */
	public java.util.List<Questions> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the questionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>QuestionsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of questionses
	 * @param end the upper bound of the range of questionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of questionses
	 */
	@Deprecated
	public java.util.List<Questions> findAll(
		int start, int end, OrderByComparator<Questions> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns an ordered range of all the questionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>QuestionsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of questionses
	 * @param end the upper bound of the range of questionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of questionses
	 */
	public java.util.List<Questions> findAll(
		int start, int end, OrderByComparator<Questions> orderByComparator);

	/**
	 * Removes all the questionses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of questionses.
	 *
	 * @return the number of questionses
	 */
	public int countAll();

}