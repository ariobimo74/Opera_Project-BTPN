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

import com.btpn.opera.operationsurvey.model.Questions;

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
 * The persistence utility for the questions service. This utility wraps <code>com.btpn.opera.operationsurvey.service.persistence.impl.QuestionsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuestionsPersistence
 * @generated
 */
@ProviderType
public class QuestionsUtil {

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
	public static void clearCache(Questions questions) {
		getPersistence().clearCache(questions);
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
	public static Map<Serializable, Questions> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Questions> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Questions> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Questions> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Questions> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Questions update(Questions questions) {
		return getPersistence().update(questions);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Questions update(
		Questions questions, ServiceContext serviceContext) {

		return getPersistence().update(questions, serviceContext);
	}

	/**
	 * Returns all the questionses where surveyOperationId = &#63;.
	 *
	 * @param surveyOperationId the survey operation ID
	 * @return the matching questionses
	 */
	public static List<Questions> findBySurveyOperationId(
		long surveyOperationId) {

		return getPersistence().findBySurveyOperationId(surveyOperationId);
	}

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
	public static List<Questions> findBySurveyOperationId(
		long surveyOperationId, int start, int end) {

		return getPersistence().findBySurveyOperationId(
			surveyOperationId, start, end);
	}

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
	public static List<Questions> findBySurveyOperationId(
		long surveyOperationId, int start, int end,
		OrderByComparator<Questions> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBySurveyOperationId(
			surveyOperationId, start, end, orderByComparator, useFinderCache);
	}

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
	public static List<Questions> findBySurveyOperationId(
		long surveyOperationId, int start, int end,
		OrderByComparator<Questions> orderByComparator) {

		return getPersistence().findBySurveyOperationId(
			surveyOperationId, start, end, orderByComparator);
	}

	/**
	 * Returns the first questions in the ordered set where surveyOperationId = &#63;.
	 *
	 * @param surveyOperationId the survey operation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching questions
	 * @throws NoSuchQuestionsException if a matching questions could not be found
	 */
	public static Questions findBySurveyOperationId_First(
			long surveyOperationId,
			OrderByComparator<Questions> orderByComparator)
		throws com.btpn.opera.operationsurvey.exception.
			NoSuchQuestionsException {

		return getPersistence().findBySurveyOperationId_First(
			surveyOperationId, orderByComparator);
	}

	/**
	 * Returns the first questions in the ordered set where surveyOperationId = &#63;.
	 *
	 * @param surveyOperationId the survey operation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching questions, or <code>null</code> if a matching questions could not be found
	 */
	public static Questions fetchBySurveyOperationId_First(
		long surveyOperationId,
		OrderByComparator<Questions> orderByComparator) {

		return getPersistence().fetchBySurveyOperationId_First(
			surveyOperationId, orderByComparator);
	}

	/**
	 * Returns the last questions in the ordered set where surveyOperationId = &#63;.
	 *
	 * @param surveyOperationId the survey operation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching questions
	 * @throws NoSuchQuestionsException if a matching questions could not be found
	 */
	public static Questions findBySurveyOperationId_Last(
			long surveyOperationId,
			OrderByComparator<Questions> orderByComparator)
		throws com.btpn.opera.operationsurvey.exception.
			NoSuchQuestionsException {

		return getPersistence().findBySurveyOperationId_Last(
			surveyOperationId, orderByComparator);
	}

	/**
	 * Returns the last questions in the ordered set where surveyOperationId = &#63;.
	 *
	 * @param surveyOperationId the survey operation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching questions, or <code>null</code> if a matching questions could not be found
	 */
	public static Questions fetchBySurveyOperationId_Last(
		long surveyOperationId,
		OrderByComparator<Questions> orderByComparator) {

		return getPersistence().fetchBySurveyOperationId_Last(
			surveyOperationId, orderByComparator);
	}

	/**
	 * Returns the questionses before and after the current questions in the ordered set where surveyOperationId = &#63;.
	 *
	 * @param id the primary key of the current questions
	 * @param surveyOperationId the survey operation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next questions
	 * @throws NoSuchQuestionsException if a questions with the primary key could not be found
	 */
	public static Questions[] findBySurveyOperationId_PrevAndNext(
			long id, long surveyOperationId,
			OrderByComparator<Questions> orderByComparator)
		throws com.btpn.opera.operationsurvey.exception.
			NoSuchQuestionsException {

		return getPersistence().findBySurveyOperationId_PrevAndNext(
			id, surveyOperationId, orderByComparator);
	}

	/**
	 * Removes all the questionses where surveyOperationId = &#63; from the database.
	 *
	 * @param surveyOperationId the survey operation ID
	 */
	public static void removeBySurveyOperationId(long surveyOperationId) {
		getPersistence().removeBySurveyOperationId(surveyOperationId);
	}

	/**
	 * Returns the number of questionses where surveyOperationId = &#63;.
	 *
	 * @param surveyOperationId the survey operation ID
	 * @return the number of matching questionses
	 */
	public static int countBySurveyOperationId(long surveyOperationId) {
		return getPersistence().countBySurveyOperationId(surveyOperationId);
	}

	/**
	 * Caches the questions in the entity cache if it is enabled.
	 *
	 * @param questions the questions
	 */
	public static void cacheResult(Questions questions) {
		getPersistence().cacheResult(questions);
	}

	/**
	 * Caches the questionses in the entity cache if it is enabled.
	 *
	 * @param questionses the questionses
	 */
	public static void cacheResult(List<Questions> questionses) {
		getPersistence().cacheResult(questionses);
	}

	/**
	 * Creates a new questions with the primary key. Does not add the questions to the database.
	 *
	 * @param id the primary key for the new questions
	 * @return the new questions
	 */
	public static Questions create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the questions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the questions
	 * @return the questions that was removed
	 * @throws NoSuchQuestionsException if a questions with the primary key could not be found
	 */
	public static Questions remove(long id)
		throws com.btpn.opera.operationsurvey.exception.
			NoSuchQuestionsException {

		return getPersistence().remove(id);
	}

	public static Questions updateImpl(Questions questions) {
		return getPersistence().updateImpl(questions);
	}

	/**
	 * Returns the questions with the primary key or throws a <code>NoSuchQuestionsException</code> if it could not be found.
	 *
	 * @param id the primary key of the questions
	 * @return the questions
	 * @throws NoSuchQuestionsException if a questions with the primary key could not be found
	 */
	public static Questions findByPrimaryKey(long id)
		throws com.btpn.opera.operationsurvey.exception.
			NoSuchQuestionsException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the questions with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the questions
	 * @return the questions, or <code>null</code> if a questions with the primary key could not be found
	 */
	public static Questions fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the questionses.
	 *
	 * @return the questionses
	 */
	public static List<Questions> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<Questions> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<Questions> findAll(
		int start, int end, OrderByComparator<Questions> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

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
	public static List<Questions> findAll(
		int start, int end, OrderByComparator<Questions> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the questionses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of questionses.
	 *
	 * @return the number of questionses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static QuestionsPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<QuestionsPersistence, QuestionsPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(QuestionsPersistence.class);

		ServiceTracker<QuestionsPersistence, QuestionsPersistence>
			serviceTracker =
				new ServiceTracker<QuestionsPersistence, QuestionsPersistence>(
					bundle.getBundleContext(), QuestionsPersistence.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}