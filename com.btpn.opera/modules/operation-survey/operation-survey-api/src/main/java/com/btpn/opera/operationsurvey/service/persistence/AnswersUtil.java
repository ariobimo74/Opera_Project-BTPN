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

import com.btpn.opera.operationsurvey.model.Answers;

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
 * The persistence utility for the answers service. This utility wraps <code>com.btpn.opera.operationsurvey.service.persistence.impl.AnswersPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AnswersPersistence
 * @generated
 */
@ProviderType
public class AnswersUtil {

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
	public static void clearCache(Answers answers) {
		getPersistence().clearCache(answers);
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
	public static Map<Serializable, Answers> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Answers> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Answers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Answers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Answers> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Answers update(Answers answers) {
		return getPersistence().update(answers);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Answers update(
		Answers answers, ServiceContext serviceContext) {

		return getPersistence().update(answers, serviceContext);
	}

	/**
	 * Returns all the answerses where questionsId = &#63;.
	 *
	 * @param questionsId the questions ID
	 * @return the matching answerses
	 */
	public static List<Answers> findByQuestionsId(long questionsId) {
		return getPersistence().findByQuestionsId(questionsId);
	}

	/**
	 * Returns a range of all the answerses where questionsId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>AnswersModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param questionsId the questions ID
	 * @param start the lower bound of the range of answerses
	 * @param end the upper bound of the range of answerses (not inclusive)
	 * @return the range of matching answerses
	 */
	public static List<Answers> findByQuestionsId(
		long questionsId, int start, int end) {

		return getPersistence().findByQuestionsId(questionsId, start, end);
	}

	/**
	 * Returns an ordered range of all the answerses where questionsId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>AnswersModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByQuestionsId(long, int, int, OrderByComparator)}
	 * @param questionsId the questions ID
	 * @param start the lower bound of the range of answerses
	 * @param end the upper bound of the range of answerses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching answerses
	 */
	@Deprecated
	public static List<Answers> findByQuestionsId(
		long questionsId, int start, int end,
		OrderByComparator<Answers> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByQuestionsId(
			questionsId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the answerses where questionsId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>AnswersModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param questionsId the questions ID
	 * @param start the lower bound of the range of answerses
	 * @param end the upper bound of the range of answerses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching answerses
	 */
	public static List<Answers> findByQuestionsId(
		long questionsId, int start, int end,
		OrderByComparator<Answers> orderByComparator) {

		return getPersistence().findByQuestionsId(
			questionsId, start, end, orderByComparator);
	}

	/**
	 * Returns the first answers in the ordered set where questionsId = &#63;.
	 *
	 * @param questionsId the questions ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching answers
	 * @throws NoSuchAnswersException if a matching answers could not be found
	 */
	public static Answers findByQuestionsId_First(
			long questionsId, OrderByComparator<Answers> orderByComparator)
		throws com.btpn.opera.operationsurvey.exception.NoSuchAnswersException {

		return getPersistence().findByQuestionsId_First(
			questionsId, orderByComparator);
	}

	/**
	 * Returns the first answers in the ordered set where questionsId = &#63;.
	 *
	 * @param questionsId the questions ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching answers, or <code>null</code> if a matching answers could not be found
	 */
	public static Answers fetchByQuestionsId_First(
		long questionsId, OrderByComparator<Answers> orderByComparator) {

		return getPersistence().fetchByQuestionsId_First(
			questionsId, orderByComparator);
	}

	/**
	 * Returns the last answers in the ordered set where questionsId = &#63;.
	 *
	 * @param questionsId the questions ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching answers
	 * @throws NoSuchAnswersException if a matching answers could not be found
	 */
	public static Answers findByQuestionsId_Last(
			long questionsId, OrderByComparator<Answers> orderByComparator)
		throws com.btpn.opera.operationsurvey.exception.NoSuchAnswersException {

		return getPersistence().findByQuestionsId_Last(
			questionsId, orderByComparator);
	}

	/**
	 * Returns the last answers in the ordered set where questionsId = &#63;.
	 *
	 * @param questionsId the questions ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching answers, or <code>null</code> if a matching answers could not be found
	 */
	public static Answers fetchByQuestionsId_Last(
		long questionsId, OrderByComparator<Answers> orderByComparator) {

		return getPersistence().fetchByQuestionsId_Last(
			questionsId, orderByComparator);
	}

	/**
	 * Returns the answerses before and after the current answers in the ordered set where questionsId = &#63;.
	 *
	 * @param id the primary key of the current answers
	 * @param questionsId the questions ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next answers
	 * @throws NoSuchAnswersException if a answers with the primary key could not be found
	 */
	public static Answers[] findByQuestionsId_PrevAndNext(
			long id, long questionsId,
			OrderByComparator<Answers> orderByComparator)
		throws com.btpn.opera.operationsurvey.exception.NoSuchAnswersException {

		return getPersistence().findByQuestionsId_PrevAndNext(
			id, questionsId, orderByComparator);
	}

	/**
	 * Removes all the answerses where questionsId = &#63; from the database.
	 *
	 * @param questionsId the questions ID
	 */
	public static void removeByQuestionsId(long questionsId) {
		getPersistence().removeByQuestionsId(questionsId);
	}

	/**
	 * Returns the number of answerses where questionsId = &#63;.
	 *
	 * @param questionsId the questions ID
	 * @return the number of matching answerses
	 */
	public static int countByQuestionsId(long questionsId) {
		return getPersistence().countByQuestionsId(questionsId);
	}

	/**
	 * Caches the answers in the entity cache if it is enabled.
	 *
	 * @param answers the answers
	 */
	public static void cacheResult(Answers answers) {
		getPersistence().cacheResult(answers);
	}

	/**
	 * Caches the answerses in the entity cache if it is enabled.
	 *
	 * @param answerses the answerses
	 */
	public static void cacheResult(List<Answers> answerses) {
		getPersistence().cacheResult(answerses);
	}

	/**
	 * Creates a new answers with the primary key. Does not add the answers to the database.
	 *
	 * @param id the primary key for the new answers
	 * @return the new answers
	 */
	public static Answers create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the answers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the answers
	 * @return the answers that was removed
	 * @throws NoSuchAnswersException if a answers with the primary key could not be found
	 */
	public static Answers remove(long id)
		throws com.btpn.opera.operationsurvey.exception.NoSuchAnswersException {

		return getPersistence().remove(id);
	}

	public static Answers updateImpl(Answers answers) {
		return getPersistence().updateImpl(answers);
	}

	/**
	 * Returns the answers with the primary key or throws a <code>NoSuchAnswersException</code> if it could not be found.
	 *
	 * @param id the primary key of the answers
	 * @return the answers
	 * @throws NoSuchAnswersException if a answers with the primary key could not be found
	 */
	public static Answers findByPrimaryKey(long id)
		throws com.btpn.opera.operationsurvey.exception.NoSuchAnswersException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the answers with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the answers
	 * @return the answers, or <code>null</code> if a answers with the primary key could not be found
	 */
	public static Answers fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the answerses.
	 *
	 * @return the answerses
	 */
	public static List<Answers> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the answerses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>AnswersModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of answerses
	 * @param end the upper bound of the range of answerses (not inclusive)
	 * @return the range of answerses
	 */
	public static List<Answers> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the answerses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>AnswersModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of answerses
	 * @param end the upper bound of the range of answerses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of answerses
	 */
	@Deprecated
	public static List<Answers> findAll(
		int start, int end, OrderByComparator<Answers> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns an ordered range of all the answerses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>AnswersModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of answerses
	 * @param end the upper bound of the range of answerses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of answerses
	 */
	public static List<Answers> findAll(
		int start, int end, OrderByComparator<Answers> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the answerses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of answerses.
	 *
	 * @return the number of answerses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AnswersPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AnswersPersistence, AnswersPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(AnswersPersistence.class);

		ServiceTracker<AnswersPersistence, AnswersPersistence> serviceTracker =
			new ServiceTracker<AnswersPersistence, AnswersPersistence>(
				bundle.getBundleContext(), AnswersPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}