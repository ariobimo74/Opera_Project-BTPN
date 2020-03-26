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

package operation.service.persistence.impl;

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

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.sql.DataSource;

import operation.exception.NoSuchQuestionsException;

import operation.model.Questions;
import operation.model.impl.QuestionsImpl;
import operation.model.impl.QuestionsModelImpl;

import operation.service.persistence.QuestionsPersistence;
import operation.service.persistence.impl.constants.SurveyOperationPersistenceConstants;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the questions service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = QuestionsPersistence.class)
@ProviderType
public class QuestionsPersistenceImpl
	extends BasePersistenceImpl<Questions> implements QuestionsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>QuestionsUtil</code> to access the questions persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		QuestionsImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByQuestion;
	private FinderPath _finderPathWithoutPaginationFindByQuestion;
	private FinderPath _finderPathCountByQuestion;

	/**
	 * Returns all the questionses where question = &#63;.
	 *
	 * @param question the question
	 * @return the matching questionses
	 */
	@Override
	public List<Questions> findByQuestion(String question) {
		return findByQuestion(
			question, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the questionses where question = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>QuestionsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param question the question
	 * @param start the lower bound of the range of questionses
	 * @param end the upper bound of the range of questionses (not inclusive)
	 * @return the range of matching questionses
	 */
	@Override
	public List<Questions> findByQuestion(String question, int start, int end) {
		return findByQuestion(question, start, end, null);
	}

	/**
	 * Returns an ordered range of all the questionses where question = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>QuestionsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByQuestion(String, int, int, OrderByComparator)}
	 * @param question the question
	 * @param start the lower bound of the range of questionses
	 * @param end the upper bound of the range of questionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching questionses
	 */
	@Deprecated
	@Override
	public List<Questions> findByQuestion(
		String question, int start, int end,
		OrderByComparator<Questions> orderByComparator,
		boolean useFinderCache) {

		return findByQuestion(question, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the questionses where question = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>QuestionsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param question the question
	 * @param start the lower bound of the range of questionses
	 * @param end the upper bound of the range of questionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching questionses
	 */
	@Override
	public List<Questions> findByQuestion(
		String question, int start, int end,
		OrderByComparator<Questions> orderByComparator) {

		question = Objects.toString(question, "");

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindByQuestion;
			finderArgs = new Object[] {question};
		}
		else {
			finderPath = _finderPathWithPaginationFindByQuestion;
			finderArgs = new Object[] {question, start, end, orderByComparator};
		}

		List<Questions> list = (List<Questions>)finderCache.getResult(
			finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Questions questions : list) {
				if (!question.equals(questions.getQuestion())) {
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

			query.append(_SQL_SELECT_QUESTIONS_WHERE);

			boolean bindQuestion = false;

			if (question.isEmpty()) {
				query.append(_FINDER_COLUMN_QUESTION_QUESTION_3);
			}
			else {
				bindQuestion = true;

				query.append(_FINDER_COLUMN_QUESTION_QUESTION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
				query.append(QuestionsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindQuestion) {
					qPos.add(question);
				}

				if (!pagination) {
					list = (List<Questions>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Questions>)QueryUtil.list(
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
	 * Returns the first questions in the ordered set where question = &#63;.
	 *
	 * @param question the question
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching questions
	 * @throws NoSuchQuestionsException if a matching questions could not be found
	 */
	@Override
	public Questions findByQuestion_First(
			String question, OrderByComparator<Questions> orderByComparator)
		throws NoSuchQuestionsException {

		Questions questions = fetchByQuestion_First(
			question, orderByComparator);

		if (questions != null) {
			return questions;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("question=");
		msg.append(question);

		msg.append("}");

		throw new NoSuchQuestionsException(msg.toString());
	}

	/**
	 * Returns the first questions in the ordered set where question = &#63;.
	 *
	 * @param question the question
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching questions, or <code>null</code> if a matching questions could not be found
	 */
	@Override
	public Questions fetchByQuestion_First(
		String question, OrderByComparator<Questions> orderByComparator) {

		List<Questions> list = findByQuestion(
			question, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last questions in the ordered set where question = &#63;.
	 *
	 * @param question the question
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching questions
	 * @throws NoSuchQuestionsException if a matching questions could not be found
	 */
	@Override
	public Questions findByQuestion_Last(
			String question, OrderByComparator<Questions> orderByComparator)
		throws NoSuchQuestionsException {

		Questions questions = fetchByQuestion_Last(question, orderByComparator);

		if (questions != null) {
			return questions;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("question=");
		msg.append(question);

		msg.append("}");

		throw new NoSuchQuestionsException(msg.toString());
	}

	/**
	 * Returns the last questions in the ordered set where question = &#63;.
	 *
	 * @param question the question
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching questions, or <code>null</code> if a matching questions could not be found
	 */
	@Override
	public Questions fetchByQuestion_Last(
		String question, OrderByComparator<Questions> orderByComparator) {

		int count = countByQuestion(question);

		if (count == 0) {
			return null;
		}

		List<Questions> list = findByQuestion(
			question, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the questionses before and after the current questions in the ordered set where question = &#63;.
	 *
	 * @param id the primary key of the current questions
	 * @param question the question
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next questions
	 * @throws NoSuchQuestionsException if a questions with the primary key could not be found
	 */
	@Override
	public Questions[] findByQuestion_PrevAndNext(
			long id, String question,
			OrderByComparator<Questions> orderByComparator)
		throws NoSuchQuestionsException {

		question = Objects.toString(question, "");

		Questions questions = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Questions[] array = new QuestionsImpl[3];

			array[0] = getByQuestion_PrevAndNext(
				session, questions, question, orderByComparator, true);

			array[1] = questions;

			array[2] = getByQuestion_PrevAndNext(
				session, questions, question, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Questions getByQuestion_PrevAndNext(
		Session session, Questions questions, String question,
		OrderByComparator<Questions> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_QUESTIONS_WHERE);

		boolean bindQuestion = false;

		if (question.isEmpty()) {
			query.append(_FINDER_COLUMN_QUESTION_QUESTION_3);
		}
		else {
			bindQuestion = true;

			query.append(_FINDER_COLUMN_QUESTION_QUESTION_2);
		}

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
			query.append(QuestionsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindQuestion) {
			qPos.add(question);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(questions)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<Questions> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the questionses where question = &#63; from the database.
	 *
	 * @param question the question
	 */
	@Override
	public void removeByQuestion(String question) {
		for (Questions questions :
				findByQuestion(
					question, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(questions);
		}
	}

	/**
	 * Returns the number of questionses where question = &#63;.
	 *
	 * @param question the question
	 * @return the number of matching questionses
	 */
	@Override
	public int countByQuestion(String question) {
		question = Objects.toString(question, "");

		FinderPath finderPath = _finderPathCountByQuestion;

		Object[] finderArgs = new Object[] {question};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_QUESTIONS_WHERE);

			boolean bindQuestion = false;

			if (question.isEmpty()) {
				query.append(_FINDER_COLUMN_QUESTION_QUESTION_3);
			}
			else {
				bindQuestion = true;

				query.append(_FINDER_COLUMN_QUESTION_QUESTION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindQuestion) {
					qPos.add(question);
				}

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

	private static final String _FINDER_COLUMN_QUESTION_QUESTION_2 =
		"questions.question = ?";

	private static final String _FINDER_COLUMN_QUESTION_QUESTION_3 =
		"(questions.question IS NULL OR questions.question = '')";

	public QuestionsPersistenceImpl() {
		setModelClass(Questions.class);

		setModelImplClass(QuestionsImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the questions in the entity cache if it is enabled.
	 *
	 * @param questions the questions
	 */
	@Override
	public void cacheResult(Questions questions) {
		entityCache.putResult(
			entityCacheEnabled, QuestionsImpl.class, questions.getPrimaryKey(),
			questions);

		questions.resetOriginalValues();
	}

	/**
	 * Caches the questionses in the entity cache if it is enabled.
	 *
	 * @param questionses the questionses
	 */
	@Override
	public void cacheResult(List<Questions> questionses) {
		for (Questions questions : questionses) {
			if (entityCache.getResult(
					entityCacheEnabled, QuestionsImpl.class,
					questions.getPrimaryKey()) == null) {

				cacheResult(questions);
			}
			else {
				questions.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all questionses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(QuestionsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the questions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Questions questions) {
		entityCache.removeResult(
			entityCacheEnabled, QuestionsImpl.class, questions.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Questions> questionses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Questions questions : questionses) {
			entityCache.removeResult(
				entityCacheEnabled, QuestionsImpl.class,
				questions.getPrimaryKey());
		}
	}

	/**
	 * Creates a new questions with the primary key. Does not add the questions to the database.
	 *
	 * @param id the primary key for the new questions
	 * @return the new questions
	 */
	@Override
	public Questions create(long id) {
		Questions questions = new QuestionsImpl();

		questions.setNew(true);
		questions.setPrimaryKey(id);

		return questions;
	}

	/**
	 * Removes the questions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the questions
	 * @return the questions that was removed
	 * @throws NoSuchQuestionsException if a questions with the primary key could not be found
	 */
	@Override
	public Questions remove(long id) throws NoSuchQuestionsException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the questions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the questions
	 * @return the questions that was removed
	 * @throws NoSuchQuestionsException if a questions with the primary key could not be found
	 */
	@Override
	public Questions remove(Serializable primaryKey)
		throws NoSuchQuestionsException {

		Session session = null;

		try {
			session = openSession();

			Questions questions = (Questions)session.get(
				QuestionsImpl.class, primaryKey);

			if (questions == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQuestionsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(questions);
		}
		catch (NoSuchQuestionsException nsee) {
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
	protected Questions removeImpl(Questions questions) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(questions)) {
				questions = (Questions)session.get(
					QuestionsImpl.class, questions.getPrimaryKeyObj());
			}

			if (questions != null) {
				session.delete(questions);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (questions != null) {
			clearCache(questions);
		}

		return questions;
	}

	@Override
	public Questions updateImpl(Questions questions) {
		boolean isNew = questions.isNew();

		if (!(questions instanceof QuestionsModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(questions.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(questions);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in questions proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Questions implementation " +
					questions.getClass());
		}

		QuestionsModelImpl questionsModelImpl = (QuestionsModelImpl)questions;

		Session session = null;

		try {
			session = openSession();

			if (questions.isNew()) {
				session.save(questions);

				questions.setNew(false);
			}
			else {
				questions = (Questions)session.merge(questions);
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
			Object[] args = new Object[] {questionsModelImpl.getQuestion()};

			finderCache.removeResult(_finderPathCountByQuestion, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByQuestion, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((questionsModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByQuestion.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					questionsModelImpl.getOriginalQuestion()
				};

				finderCache.removeResult(_finderPathCountByQuestion, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByQuestion, args);

				args = new Object[] {questionsModelImpl.getQuestion()};

				finderCache.removeResult(_finderPathCountByQuestion, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByQuestion, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, QuestionsImpl.class, questions.getPrimaryKey(),
			questions, false);

		questions.resetOriginalValues();

		return questions;
	}

	/**
	 * Returns the questions with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the questions
	 * @return the questions
	 * @throws NoSuchQuestionsException if a questions with the primary key could not be found
	 */
	@Override
	public Questions findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQuestionsException {

		Questions questions = fetchByPrimaryKey(primaryKey);

		if (questions == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQuestionsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return questions;
	}

	/**
	 * Returns the questions with the primary key or throws a <code>NoSuchQuestionsException</code> if it could not be found.
	 *
	 * @param id the primary key of the questions
	 * @return the questions
	 * @throws NoSuchQuestionsException if a questions with the primary key could not be found
	 */
	@Override
	public Questions findByPrimaryKey(long id) throws NoSuchQuestionsException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the questions with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the questions
	 * @return the questions, or <code>null</code> if a questions with the primary key could not be found
	 */
	@Override
	public Questions fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the questionses.
	 *
	 * @return the questionses
	 */
	@Override
	public List<Questions> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Questions> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Questions> findAll(
		int start, int end, OrderByComparator<Questions> orderByComparator,
		boolean useFinderCache) {

		return findAll(start, end, orderByComparator);
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
	@Override
	public List<Questions> findAll(
		int start, int end, OrderByComparator<Questions> orderByComparator) {

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

		List<Questions> list = (List<Questions>)finderCache.getResult(
			finderPath, finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_QUESTIONS);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QUESTIONS;

				if (pagination) {
					sql = sql.concat(QuestionsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Questions>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Questions>)QueryUtil.list(
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
	 * Removes all the questionses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Questions questions : findAll()) {
			remove(questions);
		}
	}

	/**
	 * Returns the number of questionses.
	 *
	 * @return the number of questionses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_QUESTIONS);

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
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_QUESTIONS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return QuestionsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the questions persistence.
	 */
	@Activate
	public void activate() {
		QuestionsModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		QuestionsModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QuestionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QuestionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByQuestion = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QuestionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByQuestion",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByQuestion = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, QuestionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByQuestion",
			new String[] {String.class.getName()},
			QuestionsModelImpl.QUESTION_COLUMN_BITMASK);

		_finderPathCountByQuestion = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByQuestion",
			new String[] {String.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(QuestionsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	@Reference(
		target = SurveyOperationPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.operation.model.Questions"),
			true);
	}

	@Override
	@Reference(
		target = SurveyOperationPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SurveyOperationPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
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

	private static final String _SQL_SELECT_QUESTIONS =
		"SELECT questions FROM Questions questions";

	private static final String _SQL_SELECT_QUESTIONS_WHERE =
		"SELECT questions FROM Questions questions WHERE ";

	private static final String _SQL_COUNT_QUESTIONS =
		"SELECT COUNT(questions) FROM Questions questions";

	private static final String _SQL_COUNT_QUESTIONS_WHERE =
		"SELECT COUNT(questions) FROM Questions questions WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "questions.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Questions exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Questions exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		QuestionsPersistenceImpl.class);

	static {
		try {
			Class.forName(SurveyOperationPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException cnfe) {
			throw new ExceptionInInitializerError(cnfe);
		}
	}

}