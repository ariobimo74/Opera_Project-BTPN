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
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import operation.exception.NoSuchSurveyOperationException;

import operation.model.SurveyOperation;
import operation.model.impl.SurveyOperationImpl;
import operation.model.impl.SurveyOperationModelImpl;

import operation.service.persistence.SurveyOperationPersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence implementation for the survey operation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class SurveyOperationPersistenceImpl
	extends BasePersistenceImpl<SurveyOperation>
	implements SurveyOperationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SurveyOperationUtil</code> to access the survey operation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SurveyOperationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByTitle;
	private FinderPath _finderPathWithoutPaginationFindByTitle;
	private FinderPath _finderPathCountByTitle;

	/**
	 * Returns all the survey operations where title = &#63;.
	 *
	 * @param title the title
	 * @return the matching survey operations
	 */
	@Override
	public List<SurveyOperation> findByTitle(String title) {
		return findByTitle(title, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<SurveyOperation> findByTitle(String title, int start, int end) {
		return findByTitle(title, start, end, null);
	}

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
	@Override
	public List<SurveyOperation> findByTitle(
		String title, int start, int end,
		OrderByComparator<SurveyOperation> orderByComparator,
		boolean useFinderCache) {

		return findByTitle(title, start, end, orderByComparator);
	}

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
	@Override
	public List<SurveyOperation> findByTitle(
		String title, int start, int end,
		OrderByComparator<SurveyOperation> orderByComparator) {

		title = Objects.toString(title, "");

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindByTitle;
			finderArgs = new Object[] {title};
		}
		else {
			finderPath = _finderPathWithPaginationFindByTitle;
			finderArgs = new Object[] {title, start, end, orderByComparator};
		}

		List<SurveyOperation> list =
			(List<SurveyOperation>)finderCache.getResult(
				finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SurveyOperation surveyOperation : list) {
				if (!title.equals(surveyOperation.getTitle())) {
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

			query.append(_SQL_SELECT_SURVEYOPERATION_WHERE);

			boolean bindTitle = false;

			if (title.isEmpty()) {
				query.append(_FINDER_COLUMN_TITLE_TITLE_3);
			}
			else {
				bindTitle = true;

				query.append(_FINDER_COLUMN_TITLE_TITLE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
				query.append(SurveyOperationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTitle) {
					qPos.add(title);
				}

				if (!pagination) {
					list = (List<SurveyOperation>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<SurveyOperation>)QueryUtil.list(
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
	 * Returns the first survey operation in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey operation
	 * @throws NoSuchSurveyOperationException if a matching survey operation could not be found
	 */
	@Override
	public SurveyOperation findByTitle_First(
			String title, OrderByComparator<SurveyOperation> orderByComparator)
		throws NoSuchSurveyOperationException {

		SurveyOperation surveyOperation = fetchByTitle_First(
			title, orderByComparator);

		if (surveyOperation != null) {
			return surveyOperation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("title=");
		msg.append(title);

		msg.append("}");

		throw new NoSuchSurveyOperationException(msg.toString());
	}

	/**
	 * Returns the first survey operation in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey operation, or <code>null</code> if a matching survey operation could not be found
	 */
	@Override
	public SurveyOperation fetchByTitle_First(
		String title, OrderByComparator<SurveyOperation> orderByComparator) {

		List<SurveyOperation> list = findByTitle(
			title, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last survey operation in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey operation
	 * @throws NoSuchSurveyOperationException if a matching survey operation could not be found
	 */
	@Override
	public SurveyOperation findByTitle_Last(
			String title, OrderByComparator<SurveyOperation> orderByComparator)
		throws NoSuchSurveyOperationException {

		SurveyOperation surveyOperation = fetchByTitle_Last(
			title, orderByComparator);

		if (surveyOperation != null) {
			return surveyOperation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("title=");
		msg.append(title);

		msg.append("}");

		throw new NoSuchSurveyOperationException(msg.toString());
	}

	/**
	 * Returns the last survey operation in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey operation, or <code>null</code> if a matching survey operation could not be found
	 */
	@Override
	public SurveyOperation fetchByTitle_Last(
		String title, OrderByComparator<SurveyOperation> orderByComparator) {

		int count = countByTitle(title);

		if (count == 0) {
			return null;
		}

		List<SurveyOperation> list = findByTitle(
			title, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the survey operations before and after the current survey operation in the ordered set where title = &#63;.
	 *
	 * @param id the primary key of the current survey operation
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next survey operation
	 * @throws NoSuchSurveyOperationException if a survey operation with the primary key could not be found
	 */
	@Override
	public SurveyOperation[] findByTitle_PrevAndNext(
			long id, String title,
			OrderByComparator<SurveyOperation> orderByComparator)
		throws NoSuchSurveyOperationException {

		title = Objects.toString(title, "");

		SurveyOperation surveyOperation = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SurveyOperation[] array = new SurveyOperationImpl[3];

			array[0] = getByTitle_PrevAndNext(
				session, surveyOperation, title, orderByComparator, true);

			array[1] = surveyOperation;

			array[2] = getByTitle_PrevAndNext(
				session, surveyOperation, title, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SurveyOperation getByTitle_PrevAndNext(
		Session session, SurveyOperation surveyOperation, String title,
		OrderByComparator<SurveyOperation> orderByComparator,
		boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SURVEYOPERATION_WHERE);

		boolean bindTitle = false;

		if (title.isEmpty()) {
			query.append(_FINDER_COLUMN_TITLE_TITLE_3);
		}
		else {
			bindTitle = true;

			query.append(_FINDER_COLUMN_TITLE_TITLE_2);
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
			query.append(SurveyOperationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTitle) {
			qPos.add(title);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						surveyOperation)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<SurveyOperation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the survey operations where title = &#63; from the database.
	 *
	 * @param title the title
	 */
	@Override
	public void removeByTitle(String title) {
		for (SurveyOperation surveyOperation :
				findByTitle(
					title, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(surveyOperation);
		}
	}

	/**
	 * Returns the number of survey operations where title = &#63;.
	 *
	 * @param title the title
	 * @return the number of matching survey operations
	 */
	@Override
	public int countByTitle(String title) {
		title = Objects.toString(title, "");

		FinderPath finderPath = _finderPathCountByTitle;

		Object[] finderArgs = new Object[] {title};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SURVEYOPERATION_WHERE);

			boolean bindTitle = false;

			if (title.isEmpty()) {
				query.append(_FINDER_COLUMN_TITLE_TITLE_3);
			}
			else {
				bindTitle = true;

				query.append(_FINDER_COLUMN_TITLE_TITLE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTitle) {
					qPos.add(title);
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

	private static final String _FINDER_COLUMN_TITLE_TITLE_2 =
		"surveyOperation.title = ?";

	private static final String _FINDER_COLUMN_TITLE_TITLE_3 =
		"(surveyOperation.title IS NULL OR surveyOperation.title = '')";

	public SurveyOperationPersistenceImpl() {
		setModelClass(SurveyOperation.class);

		setModelImplClass(SurveyOperationImpl.class);
		setModelPKClass(long.class);
		setEntityCacheEnabled(SurveyOperationModelImpl.ENTITY_CACHE_ENABLED);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("surveyObjId", "survey_obj_id");
		dbColumnNames.put("startDate", "start_date");
		dbColumnNames.put("endDate", "end_date");
		dbColumnNames.put("submittedDate", "submitted_date");

		setDBColumnNames(dbColumnNames);
	}

	/**
	 * Caches the survey operation in the entity cache if it is enabled.
	 *
	 * @param surveyOperation the survey operation
	 */
	@Override
	public void cacheResult(SurveyOperation surveyOperation) {
		entityCache.putResult(
			SurveyOperationModelImpl.ENTITY_CACHE_ENABLED,
			SurveyOperationImpl.class, surveyOperation.getPrimaryKey(),
			surveyOperation);

		surveyOperation.resetOriginalValues();
	}

	/**
	 * Caches the survey operations in the entity cache if it is enabled.
	 *
	 * @param surveyOperations the survey operations
	 */
	@Override
	public void cacheResult(List<SurveyOperation> surveyOperations) {
		for (SurveyOperation surveyOperation : surveyOperations) {
			if (entityCache.getResult(
					SurveyOperationModelImpl.ENTITY_CACHE_ENABLED,
					SurveyOperationImpl.class,
					surveyOperation.getPrimaryKey()) == null) {

				cacheResult(surveyOperation);
			}
			else {
				surveyOperation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all survey operations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SurveyOperationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the survey operation.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SurveyOperation surveyOperation) {
		entityCache.removeResult(
			SurveyOperationModelImpl.ENTITY_CACHE_ENABLED,
			SurveyOperationImpl.class, surveyOperation.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SurveyOperation> surveyOperations) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SurveyOperation surveyOperation : surveyOperations) {
			entityCache.removeResult(
				SurveyOperationModelImpl.ENTITY_CACHE_ENABLED,
				SurveyOperationImpl.class, surveyOperation.getPrimaryKey());
		}
	}

	/**
	 * Creates a new survey operation with the primary key. Does not add the survey operation to the database.
	 *
	 * @param id the primary key for the new survey operation
	 * @return the new survey operation
	 */
	@Override
	public SurveyOperation create(long id) {
		SurveyOperation surveyOperation = new SurveyOperationImpl();

		surveyOperation.setNew(true);
		surveyOperation.setPrimaryKey(id);

		return surveyOperation;
	}

	/**
	 * Removes the survey operation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the survey operation
	 * @return the survey operation that was removed
	 * @throws NoSuchSurveyOperationException if a survey operation with the primary key could not be found
	 */
	@Override
	public SurveyOperation remove(long id)
		throws NoSuchSurveyOperationException {

		return remove((Serializable)id);
	}

	/**
	 * Removes the survey operation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the survey operation
	 * @return the survey operation that was removed
	 * @throws NoSuchSurveyOperationException if a survey operation with the primary key could not be found
	 */
	@Override
	public SurveyOperation remove(Serializable primaryKey)
		throws NoSuchSurveyOperationException {

		Session session = null;

		try {
			session = openSession();

			SurveyOperation surveyOperation = (SurveyOperation)session.get(
				SurveyOperationImpl.class, primaryKey);

			if (surveyOperation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSurveyOperationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(surveyOperation);
		}
		catch (NoSuchSurveyOperationException nsee) {
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
	protected SurveyOperation removeImpl(SurveyOperation surveyOperation) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(surveyOperation)) {
				surveyOperation = (SurveyOperation)session.get(
					SurveyOperationImpl.class,
					surveyOperation.getPrimaryKeyObj());
			}

			if (surveyOperation != null) {
				session.delete(surveyOperation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (surveyOperation != null) {
			clearCache(surveyOperation);
		}

		return surveyOperation;
	}

	@Override
	public SurveyOperation updateImpl(SurveyOperation surveyOperation) {
		boolean isNew = surveyOperation.isNew();

		if (!(surveyOperation instanceof SurveyOperationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(surveyOperation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					surveyOperation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in surveyOperation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SurveyOperation implementation " +
					surveyOperation.getClass());
		}

		SurveyOperationModelImpl surveyOperationModelImpl =
			(SurveyOperationModelImpl)surveyOperation;

		Session session = null;

		try {
			session = openSession();

			if (surveyOperation.isNew()) {
				session.save(surveyOperation);

				surveyOperation.setNew(false);
			}
			else {
				surveyOperation = (SurveyOperation)session.merge(
					surveyOperation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!SurveyOperationModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {surveyOperationModelImpl.getTitle()};

			finderCache.removeResult(_finderPathCountByTitle, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByTitle, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((surveyOperationModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByTitle.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					surveyOperationModelImpl.getOriginalTitle()
				};

				finderCache.removeResult(_finderPathCountByTitle, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByTitle, args);

				args = new Object[] {surveyOperationModelImpl.getTitle()};

				finderCache.removeResult(_finderPathCountByTitle, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByTitle, args);
			}
		}

		entityCache.putResult(
			SurveyOperationModelImpl.ENTITY_CACHE_ENABLED,
			SurveyOperationImpl.class, surveyOperation.getPrimaryKey(),
			surveyOperation, false);

		surveyOperation.resetOriginalValues();

		return surveyOperation;
	}

	/**
	 * Returns the survey operation with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the survey operation
	 * @return the survey operation
	 * @throws NoSuchSurveyOperationException if a survey operation with the primary key could not be found
	 */
	@Override
	public SurveyOperation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSurveyOperationException {

		SurveyOperation surveyOperation = fetchByPrimaryKey(primaryKey);

		if (surveyOperation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSurveyOperationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return surveyOperation;
	}

	/**
	 * Returns the survey operation with the primary key or throws a <code>NoSuchSurveyOperationException</code> if it could not be found.
	 *
	 * @param id the primary key of the survey operation
	 * @return the survey operation
	 * @throws NoSuchSurveyOperationException if a survey operation with the primary key could not be found
	 */
	@Override
	public SurveyOperation findByPrimaryKey(long id)
		throws NoSuchSurveyOperationException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the survey operation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the survey operation
	 * @return the survey operation, or <code>null</code> if a survey operation with the primary key could not be found
	 */
	@Override
	public SurveyOperation fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the survey operations.
	 *
	 * @return the survey operations
	 */
	@Override
	public List<SurveyOperation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<SurveyOperation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<SurveyOperation> findAll(
		int start, int end,
		OrderByComparator<SurveyOperation> orderByComparator,
		boolean useFinderCache) {

		return findAll(start, end, orderByComparator);
	}

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
	@Override
	public List<SurveyOperation> findAll(
		int start, int end,
		OrderByComparator<SurveyOperation> orderByComparator) {

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

		List<SurveyOperation> list =
			(List<SurveyOperation>)finderCache.getResult(
				finderPath, finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SURVEYOPERATION);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SURVEYOPERATION;

				if (pagination) {
					sql = sql.concat(SurveyOperationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SurveyOperation>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<SurveyOperation>)QueryUtil.list(
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
	 * Removes all the survey operations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SurveyOperation surveyOperation : findAll()) {
			remove(surveyOperation);
		}
	}

	/**
	 * Returns the number of survey operations.
	 *
	 * @return the number of survey operations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SURVEYOPERATION);

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
		return _SQL_SELECT_SURVEYOPERATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SurveyOperationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the survey operation persistence.
	 */
	public void afterPropertiesSet() {
		_finderPathWithPaginationFindAll = new FinderPath(
			SurveyOperationModelImpl.ENTITY_CACHE_ENABLED,
			SurveyOperationModelImpl.FINDER_CACHE_ENABLED,
			SurveyOperationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			SurveyOperationModelImpl.ENTITY_CACHE_ENABLED,
			SurveyOperationModelImpl.FINDER_CACHE_ENABLED,
			SurveyOperationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			SurveyOperationModelImpl.ENTITY_CACHE_ENABLED,
			SurveyOperationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByTitle = new FinderPath(
			SurveyOperationModelImpl.ENTITY_CACHE_ENABLED,
			SurveyOperationModelImpl.FINDER_CACHE_ENABLED,
			SurveyOperationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByTitle",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByTitle = new FinderPath(
			SurveyOperationModelImpl.ENTITY_CACHE_ENABLED,
			SurveyOperationModelImpl.FINDER_CACHE_ENABLED,
			SurveyOperationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTitle",
			new String[] {String.class.getName()},
			SurveyOperationModelImpl.TITLE_COLUMN_BITMASK);

		_finderPathCountByTitle = new FinderPath(
			SurveyOperationModelImpl.ENTITY_CACHE_ENABLED,
			SurveyOperationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTitle",
			new String[] {String.class.getName()});
	}

	public void destroy() {
		entityCache.removeCache(SurveyOperationImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SURVEYOPERATION =
		"SELECT surveyOperation FROM SurveyOperation surveyOperation";

	private static final String _SQL_SELECT_SURVEYOPERATION_WHERE =
		"SELECT surveyOperation FROM SurveyOperation surveyOperation WHERE ";

	private static final String _SQL_COUNT_SURVEYOPERATION =
		"SELECT COUNT(surveyOperation) FROM SurveyOperation surveyOperation";

	private static final String _SQL_COUNT_SURVEYOPERATION_WHERE =
		"SELECT COUNT(surveyOperation) FROM SurveyOperation surveyOperation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "surveyOperation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SurveyOperation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SurveyOperation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SurveyOperationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"surveyObjId", "startDate", "endDate", "submittedDate"});

}