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

package com.btpn.opera.operationsurvey.service.persistence.impl;

import com.btpn.opera.operationsurvey.exception.NoSuchAnswersException;
import com.btpn.opera.operationsurvey.model.Answers;
import com.btpn.opera.operationsurvey.model.impl.AnswersImpl;
import com.btpn.opera.operationsurvey.model.impl.AnswersModelImpl;
import com.btpn.opera.operationsurvey.service.persistence.AnswersPersistence;
import com.btpn.opera.operationsurvey.service.persistence.impl.constants.OperationSurveyPersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the answers service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AnswersPersistence.class)
@ProviderType
public class AnswersPersistenceImpl
	extends BasePersistenceImpl<Answers> implements AnswersPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AnswersUtil</code> to access the answers persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AnswersImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByQuestionsId;
	private FinderPath _finderPathWithoutPaginationFindByQuestionsId;
	private FinderPath _finderPathCountByQuestionsId;

	/**
	 * Returns all the answerses where questionsId = &#63;.
	 *
	 * @param questionsId the questions ID
	 * @return the matching answerses
	 */
	@Override
	public List<Answers> findByQuestionsId(long questionsId) {
		return findByQuestionsId(
			questionsId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Answers> findByQuestionsId(
		long questionsId, int start, int end) {

		return findByQuestionsId(questionsId, start, end, null);
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
	@Override
	public List<Answers> findByQuestionsId(
		long questionsId, int start, int end,
		OrderByComparator<Answers> orderByComparator, boolean useFinderCache) {

		return findByQuestionsId(questionsId, start, end, orderByComparator);
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
	@Override
	public List<Answers> findByQuestionsId(
		long questionsId, int start, int end,
		OrderByComparator<Answers> orderByComparator) {

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindByQuestionsId;
			finderArgs = new Object[] {questionsId};
		}
		else {
			finderPath = _finderPathWithPaginationFindByQuestionsId;
			finderArgs = new Object[] {
				questionsId, start, end, orderByComparator
			};
		}

		List<Answers> list = (List<Answers>)finderCache.getResult(
			finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Answers answers : list) {
				if ((questionsId != answers.getQuestionsId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_ANSWERS_WHERE);

			query.append(_FINDER_COLUMN_QUESTIONSID_QUESTIONSID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
				query.append(AnswersModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(questionsId);

				if (!pagination) {
					list = (List<Answers>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Answers>)QueryUtil.list(
						q, getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first answers in the ordered set where questionsId = &#63;.
	 *
	 * @param questionsId the questions ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching answers
	 * @throws NoSuchAnswersException if a matching answers could not be found
	 */
	@Override
	public Answers findByQuestionsId_First(
			long questionsId, OrderByComparator<Answers> orderByComparator)
		throws NoSuchAnswersException {

		Answers answers = fetchByQuestionsId_First(
			questionsId, orderByComparator);

		if (answers != null) {
			return answers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("questionsId=");
		msg.append(questionsId);

		msg.append("}");

		throw new NoSuchAnswersException(msg.toString());
	}

	/**
	 * Returns the first answers in the ordered set where questionsId = &#63;.
	 *
	 * @param questionsId the questions ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching answers, or <code>null</code> if a matching answers could not be found
	 */
	@Override
	public Answers fetchByQuestionsId_First(
		long questionsId, OrderByComparator<Answers> orderByComparator) {

		List<Answers> list = findByQuestionsId(
			questionsId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last answers in the ordered set where questionsId = &#63;.
	 *
	 * @param questionsId the questions ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching answers
	 * @throws NoSuchAnswersException if a matching answers could not be found
	 */
	@Override
	public Answers findByQuestionsId_Last(
			long questionsId, OrderByComparator<Answers> orderByComparator)
		throws NoSuchAnswersException {

		Answers answers = fetchByQuestionsId_Last(
			questionsId, orderByComparator);

		if (answers != null) {
			return answers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("questionsId=");
		msg.append(questionsId);

		msg.append("}");

		throw new NoSuchAnswersException(msg.toString());
	}

	/**
	 * Returns the last answers in the ordered set where questionsId = &#63;.
	 *
	 * @param questionsId the questions ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching answers, or <code>null</code> if a matching answers could not be found
	 */
	@Override
	public Answers fetchByQuestionsId_Last(
		long questionsId, OrderByComparator<Answers> orderByComparator) {

		int count = countByQuestionsId(questionsId);

		if (count == 0) {
			return null;
		}

		List<Answers> list = findByQuestionsId(
			questionsId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Answers[] findByQuestionsId_PrevAndNext(
			long id, long questionsId,
			OrderByComparator<Answers> orderByComparator)
		throws NoSuchAnswersException {

		Answers answers = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Answers[] array = new AnswersImpl[3];

			array[0] = getByQuestionsId_PrevAndNext(
				session, answers, questionsId, orderByComparator, true);

			array[1] = answers;

			array[2] = getByQuestionsId_PrevAndNext(
				session, answers, questionsId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Answers getByQuestionsId_PrevAndNext(
		Session session, Answers answers, long questionsId,
		OrderByComparator<Answers> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ANSWERS_WHERE);

		query.append(_FINDER_COLUMN_QUESTIONSID_QUESTIONSID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(AnswersModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(questionsId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(answers)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<Answers> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the answerses where questionsId = &#63; from the database.
	 *
	 * @param questionsId the questions ID
	 */
	@Override
	public void removeByQuestionsId(long questionsId) {
		for (Answers answers :
				findByQuestionsId(
					questionsId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(answers);
		}
	}

	/**
	 * Returns the number of answerses where questionsId = &#63;.
	 *
	 * @param questionsId the questions ID
	 * @return the number of matching answerses
	 */
	@Override
	public int countByQuestionsId(long questionsId) {
		FinderPath finderPath = _finderPathCountByQuestionsId;

		Object[] finderArgs = new Object[] {questionsId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ANSWERS_WHERE);

			query.append(_FINDER_COLUMN_QUESTIONSID_QUESTIONSID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(questionsId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_QUESTIONSID_QUESTIONSID_2 =
		"answers.questionsId = ?";

	public AnswersPersistenceImpl() {
		setModelClass(Answers.class);

		setModelImplClass(AnswersImpl.class);
		setModelPKClass(long.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("questionsId", "questions_id");

		setDBColumnNames(dbColumnNames);
	}

	/**
	 * Caches the answers in the entity cache if it is enabled.
	 *
	 * @param answers the answers
	 */
	@Override
	public void cacheResult(Answers answers) {
		entityCache.putResult(
			entityCacheEnabled, AnswersImpl.class, answers.getPrimaryKey(),
			answers);

		answers.resetOriginalValues();
	}

	/**
	 * Caches the answerses in the entity cache if it is enabled.
	 *
	 * @param answerses the answerses
	 */
	@Override
	public void cacheResult(List<Answers> answerses) {
		for (Answers answers : answerses) {
			if (entityCache.getResult(
					entityCacheEnabled, AnswersImpl.class,
					answers.getPrimaryKey()) == null) {

				cacheResult(answers);
			}
			else {
				answers.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all answerses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AnswersImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the answers.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Answers answers) {
		entityCache.removeResult(
			entityCacheEnabled, AnswersImpl.class, answers.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Answers> answerses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Answers answers : answerses) {
			entityCache.removeResult(
				entityCacheEnabled, AnswersImpl.class, answers.getPrimaryKey());
		}
	}

	/**
	 * Creates a new answers with the primary key. Does not add the answers to the database.
	 *
	 * @param id the primary key for the new answers
	 * @return the new answers
	 */
	@Override
	public Answers create(long id) {
		Answers answers = new AnswersImpl();

		answers.setNew(true);
		answers.setPrimaryKey(id);

		return answers;
	}

	/**
	 * Removes the answers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the answers
	 * @return the answers that was removed
	 * @throws NoSuchAnswersException if a answers with the primary key could not be found
	 */
	@Override
	public Answers remove(long id) throws NoSuchAnswersException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the answers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the answers
	 * @return the answers that was removed
	 * @throws NoSuchAnswersException if a answers with the primary key could not be found
	 */
	@Override
	public Answers remove(Serializable primaryKey)
		throws NoSuchAnswersException {

		Session session = null;

		try {
			session = openSession();

			Answers answers = (Answers)session.get(
				AnswersImpl.class, primaryKey);

			if (answers == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAnswersException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(answers);
		}
		catch (NoSuchAnswersException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Answers removeImpl(Answers answers) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(answers)) {
				answers = (Answers)session.get(
					AnswersImpl.class, answers.getPrimaryKeyObj());
			}

			if (answers != null) {
				session.delete(answers);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (answers != null) {
			clearCache(answers);
		}

		return answers;
	}

	@Override
	public Answers updateImpl(Answers answers) {
		boolean isNew = answers.isNew();

		if (!(answers instanceof AnswersModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(answers.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(answers);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in answers proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Answers implementation " +
					answers.getClass());
		}

		AnswersModelImpl answersModelImpl = (AnswersModelImpl)answers;

		Session session = null;

		try {
			session = openSession();

			if (answers.isNew()) {
				session.save(answers);

				answers.setNew(false);
			}
			else {
				answers = (Answers)session.merge(answers);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!_columnBitmaskEnabled) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {answersModelImpl.getQuestionsId()};

			finderCache.removeResult(_finderPathCountByQuestionsId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByQuestionsId, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((answersModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByQuestionsId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					answersModelImpl.getOriginalQuestionsId()
				};

				finderCache.removeResult(_finderPathCountByQuestionsId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByQuestionsId, args);

				args = new Object[] {answersModelImpl.getQuestionsId()};

				finderCache.removeResult(_finderPathCountByQuestionsId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByQuestionsId, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, AnswersImpl.class, answers.getPrimaryKey(),
			answers, false);

		answers.resetOriginalValues();

		return answers;
	}

	/**
	 * Returns the answers with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the answers
	 * @return the answers
	 * @throws NoSuchAnswersException if a answers with the primary key could not be found
	 */
	@Override
	public Answers findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAnswersException {

		Answers answers = fetchByPrimaryKey(primaryKey);

		if (answers == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAnswersException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return answers;
	}

	/**
	 * Returns the answers with the primary key or throws a <code>NoSuchAnswersException</code> if it could not be found.
	 *
	 * @param id the primary key of the answers
	 * @return the answers
	 * @throws NoSuchAnswersException if a answers with the primary key could not be found
	 */
	@Override
	public Answers findByPrimaryKey(long id) throws NoSuchAnswersException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the answers with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the answers
	 * @return the answers, or <code>null</code> if a answers with the primary key could not be found
	 */
	@Override
	public Answers fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the answerses.
	 *
	 * @return the answerses
	 */
	@Override
	public List<Answers> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Answers> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Answers> findAll(
		int start, int end, OrderByComparator<Answers> orderByComparator,
		boolean useFinderCache) {

		return findAll(start, end, orderByComparator);
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
	@Override
	public List<Answers> findAll(
		int start, int end, OrderByComparator<Answers> orderByComparator) {

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindAll;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Answers> list = (List<Answers>)finderCache.getResult(
			finderPath, finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ANSWERS);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ANSWERS;

				if (pagination) {
					sql = sql.concat(AnswersModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Answers>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Answers>)QueryUtil.list(
						q, getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the answerses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Answers answers : findAll()) {
			remove(answers);
		}
	}

	/**
	 * Returns the number of answerses.
	 *
	 * @return the number of answerses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ANSWERS);

				count = (Long)q.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ANSWERS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AnswersModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the answers persistence.
	 */
	@Activate
	public void activate() {
		AnswersModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		AnswersModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, AnswersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, AnswersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByQuestionsId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, AnswersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByQuestionsId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByQuestionsId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, AnswersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByQuestionsId",
			new String[] {Long.class.getName()},
			AnswersModelImpl.QUESTIONSID_COLUMN_BITMASK);

		_finderPathCountByQuestionsId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByQuestionsId",
			new String[] {Long.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(AnswersImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	@Reference(
		target = OperationSurveyPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.com.btpn.opera.operationsurvey.model.Answers"),
			true);
	}

	@Override
	@Reference(
		target = OperationSurveyPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OperationSurveyPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private boolean _columnBitmaskEnabled;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ANSWERS =
		"SELECT answers FROM Answers answers";

	private static final String _SQL_SELECT_ANSWERS_WHERE =
		"SELECT answers FROM Answers answers WHERE ";

	private static final String _SQL_COUNT_ANSWERS =
		"SELECT COUNT(answers) FROM Answers answers";

	private static final String _SQL_COUNT_ANSWERS_WHERE =
		"SELECT COUNT(answers) FROM Answers answers WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "answers.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Answers exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Answers exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AnswersPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"questionsId"});

	static {
		try {
			Class.forName(OperationSurveyPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException cnfe) {
			throw new ExceptionInInitializerError(cnfe);
		}
	}

}