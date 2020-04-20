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

import com.btpn.opera.operationsurvey.exception.NoSuchRespondenException;
import com.btpn.opera.operationsurvey.model.Responden;
import com.btpn.opera.operationsurvey.model.impl.RespondenImpl;
import com.btpn.opera.operationsurvey.model.impl.RespondenModelImpl;
import com.btpn.opera.operationsurvey.service.persistence.RespondenPersistence;
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
 * The persistence implementation for the responden service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = RespondenPersistence.class)
@ProviderType
public class RespondenPersistenceImpl
	extends BasePersistenceImpl<Responden> implements RespondenPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>RespondenUtil</code> to access the responden persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		RespondenImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBySurveyOperationID;
	private FinderPath _finderPathWithoutPaginationFindBySurveyOperationID;
	private FinderPath _finderPathCountBySurveyOperationID;

	/**
	 * Returns all the respondens where surveyOperationId = &#63;.
	 *
	 * @param surveyOperationId the survey operation ID
	 * @return the matching respondens
	 */
	@Override
	public List<Responden> findBySurveyOperationID(long surveyOperationId) {
		return findBySurveyOperationID(
			surveyOperationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the respondens where surveyOperationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param surveyOperationId the survey operation ID
	 * @param start the lower bound of the range of respondens
	 * @param end the upper bound of the range of respondens (not inclusive)
	 * @return the range of matching respondens
	 */
	@Override
	public List<Responden> findBySurveyOperationID(
		long surveyOperationId, int start, int end) {

		return findBySurveyOperationID(surveyOperationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the respondens where surveyOperationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findBySurveyOperationID(long, int, int, OrderByComparator)}
	 * @param surveyOperationId the survey operation ID
	 * @param start the lower bound of the range of respondens
	 * @param end the upper bound of the range of respondens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching respondens
	 */
	@Deprecated
	@Override
	public List<Responden> findBySurveyOperationID(
		long surveyOperationId, int start, int end,
		OrderByComparator<Responden> orderByComparator,
		boolean useFinderCache) {

		return findBySurveyOperationID(
			surveyOperationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the respondens where surveyOperationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param surveyOperationId the survey operation ID
	 * @param start the lower bound of the range of respondens
	 * @param end the upper bound of the range of respondens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching respondens
	 */
	@Override
	public List<Responden> findBySurveyOperationID(
		long surveyOperationId, int start, int end,
		OrderByComparator<Responden> orderByComparator) {

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindBySurveyOperationID;
			finderArgs = new Object[] {surveyOperationId};
		}
		else {
			finderPath = _finderPathWithPaginationFindBySurveyOperationID;
			finderArgs = new Object[] {
				surveyOperationId, start, end, orderByComparator
			};
		}

		List<Responden> list = (List<Responden>)finderCache.getResult(
			finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Responden responden : list) {
				if ((surveyOperationId != responden.getSurveyOperationId())) {
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

			query.append(_SQL_SELECT_RESPONDEN_WHERE);

			query.append(_FINDER_COLUMN_SURVEYOPERATIONID_SURVEYOPERATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
				query.append(RespondenModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(surveyOperationId);

				if (!pagination) {
					list = (List<Responden>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Responden>)QueryUtil.list(
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
	 * Returns the first responden in the ordered set where surveyOperationId = &#63;.
	 *
	 * @param surveyOperationId the survey operation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching responden
	 * @throws NoSuchRespondenException if a matching responden could not be found
	 */
	@Override
	public Responden findBySurveyOperationID_First(
			long surveyOperationId,
			OrderByComparator<Responden> orderByComparator)
		throws NoSuchRespondenException {

		Responden responden = fetchBySurveyOperationID_First(
			surveyOperationId, orderByComparator);

		if (responden != null) {
			return responden;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("surveyOperationId=");
		msg.append(surveyOperationId);

		msg.append("}");

		throw new NoSuchRespondenException(msg.toString());
	}

	/**
	 * Returns the first responden in the ordered set where surveyOperationId = &#63;.
	 *
	 * @param surveyOperationId the survey operation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching responden, or <code>null</code> if a matching responden could not be found
	 */
	@Override
	public Responden fetchBySurveyOperationID_First(
		long surveyOperationId,
		OrderByComparator<Responden> orderByComparator) {

		List<Responden> list = findBySurveyOperationID(
			surveyOperationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last responden in the ordered set where surveyOperationId = &#63;.
	 *
	 * @param surveyOperationId the survey operation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching responden
	 * @throws NoSuchRespondenException if a matching responden could not be found
	 */
	@Override
	public Responden findBySurveyOperationID_Last(
			long surveyOperationId,
			OrderByComparator<Responden> orderByComparator)
		throws NoSuchRespondenException {

		Responden responden = fetchBySurveyOperationID_Last(
			surveyOperationId, orderByComparator);

		if (responden != null) {
			return responden;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("surveyOperationId=");
		msg.append(surveyOperationId);

		msg.append("}");

		throw new NoSuchRespondenException(msg.toString());
	}

	/**
	 * Returns the last responden in the ordered set where surveyOperationId = &#63;.
	 *
	 * @param surveyOperationId the survey operation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching responden, or <code>null</code> if a matching responden could not be found
	 */
	@Override
	public Responden fetchBySurveyOperationID_Last(
		long surveyOperationId,
		OrderByComparator<Responden> orderByComparator) {

		int count = countBySurveyOperationID(surveyOperationId);

		if (count == 0) {
			return null;
		}

		List<Responden> list = findBySurveyOperationID(
			surveyOperationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the respondens before and after the current responden in the ordered set where surveyOperationId = &#63;.
	 *
	 * @param id the primary key of the current responden
	 * @param surveyOperationId the survey operation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next responden
	 * @throws NoSuchRespondenException if a responden with the primary key could not be found
	 */
	@Override
	public Responden[] findBySurveyOperationID_PrevAndNext(
			long id, long surveyOperationId,
			OrderByComparator<Responden> orderByComparator)
		throws NoSuchRespondenException {

		Responden responden = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Responden[] array = new RespondenImpl[3];

			array[0] = getBySurveyOperationID_PrevAndNext(
				session, responden, surveyOperationId, orderByComparator, true);

			array[1] = responden;

			array[2] = getBySurveyOperationID_PrevAndNext(
				session, responden, surveyOperationId, orderByComparator,
				false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Responden getBySurveyOperationID_PrevAndNext(
		Session session, Responden responden, long surveyOperationId,
		OrderByComparator<Responden> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_RESPONDEN_WHERE);

		query.append(_FINDER_COLUMN_SURVEYOPERATIONID_SURVEYOPERATIONID_2);

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
			query.append(RespondenModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(surveyOperationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(responden)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<Responden> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the respondens where surveyOperationId = &#63; from the database.
	 *
	 * @param surveyOperationId the survey operation ID
	 */
	@Override
	public void removeBySurveyOperationID(long surveyOperationId) {
		for (Responden responden :
				findBySurveyOperationID(
					surveyOperationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(responden);
		}
	}

	/**
	 * Returns the number of respondens where surveyOperationId = &#63;.
	 *
	 * @param surveyOperationId the survey operation ID
	 * @return the number of matching respondens
	 */
	@Override
	public int countBySurveyOperationID(long surveyOperationId) {
		FinderPath finderPath = _finderPathCountBySurveyOperationID;

		Object[] finderArgs = new Object[] {surveyOperationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_RESPONDEN_WHERE);

			query.append(_FINDER_COLUMN_SURVEYOPERATIONID_SURVEYOPERATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(surveyOperationId);

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

	private static final String
		_FINDER_COLUMN_SURVEYOPERATIONID_SURVEYOPERATIONID_2 =
			"responden.surveyOperationId = ?";

	public RespondenPersistenceImpl() {
		setModelClass(Responden.class);

		setModelImplClass(RespondenImpl.class);
		setModelPKClass(long.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("fullName", "full_name");
		dbColumnNames.put("surveyOperationId", "survey_operation_id");
		dbColumnNames.put("totalValue", "total_value");
		dbColumnNames.put("answerRecord", "answer_record");
		dbColumnNames.put("submittedDate", "submitted_date");

		setDBColumnNames(dbColumnNames);
	}

	/**
	 * Caches the responden in the entity cache if it is enabled.
	 *
	 * @param responden the responden
	 */
	@Override
	public void cacheResult(Responden responden) {
		entityCache.putResult(
			entityCacheEnabled, RespondenImpl.class, responden.getPrimaryKey(),
			responden);

		responden.resetOriginalValues();
	}

	/**
	 * Caches the respondens in the entity cache if it is enabled.
	 *
	 * @param respondens the respondens
	 */
	@Override
	public void cacheResult(List<Responden> respondens) {
		for (Responden responden : respondens) {
			if (entityCache.getResult(
					entityCacheEnabled, RespondenImpl.class,
					responden.getPrimaryKey()) == null) {

				cacheResult(responden);
			}
			else {
				responden.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all respondens.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RespondenImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the responden.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Responden responden) {
		entityCache.removeResult(
			entityCacheEnabled, RespondenImpl.class, responden.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Responden> respondens) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Responden responden : respondens) {
			entityCache.removeResult(
				entityCacheEnabled, RespondenImpl.class,
				responden.getPrimaryKey());
		}
	}

	/**
	 * Creates a new responden with the primary key. Does not add the responden to the database.
	 *
	 * @param id the primary key for the new responden
	 * @return the new responden
	 */
	@Override
	public Responden create(long id) {
		Responden responden = new RespondenImpl();

		responden.setNew(true);
		responden.setPrimaryKey(id);

		return responden;
	}

	/**
	 * Removes the responden with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the responden
	 * @return the responden that was removed
	 * @throws NoSuchRespondenException if a responden with the primary key could not be found
	 */
	@Override
	public Responden remove(long id) throws NoSuchRespondenException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the responden with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the responden
	 * @return the responden that was removed
	 * @throws NoSuchRespondenException if a responden with the primary key could not be found
	 */
	@Override
	public Responden remove(Serializable primaryKey)
		throws NoSuchRespondenException {

		Session session = null;

		try {
			session = openSession();

			Responden responden = (Responden)session.get(
				RespondenImpl.class, primaryKey);

			if (responden == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRespondenException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(responden);
		}
		catch (NoSuchRespondenException nsee) {
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
	protected Responden removeImpl(Responden responden) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(responden)) {
				responden = (Responden)session.get(
					RespondenImpl.class, responden.getPrimaryKeyObj());
			}

			if (responden != null) {
				session.delete(responden);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (responden != null) {
			clearCache(responden);
		}

		return responden;
	}

	@Override
	public Responden updateImpl(Responden responden) {
		boolean isNew = responden.isNew();

		if (!(responden instanceof RespondenModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(responden.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(responden);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in responden proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Responden implementation " +
					responden.getClass());
		}

		RespondenModelImpl respondenModelImpl = (RespondenModelImpl)responden;

		Session session = null;

		try {
			session = openSession();

			if (responden.isNew()) {
				session.save(responden);

				responden.setNew(false);
			}
			else {
				responden = (Responden)session.merge(responden);
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
			Object[] args = new Object[] {
				respondenModelImpl.getSurveyOperationId()
			};

			finderCache.removeResult(_finderPathCountBySurveyOperationID, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindBySurveyOperationID, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((respondenModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindBySurveyOperationID.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					respondenModelImpl.getOriginalSurveyOperationId()
				};

				finderCache.removeResult(
					_finderPathCountBySurveyOperationID, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindBySurveyOperationID, args);

				args = new Object[] {respondenModelImpl.getSurveyOperationId()};

				finderCache.removeResult(
					_finderPathCountBySurveyOperationID, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindBySurveyOperationID, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, RespondenImpl.class, responden.getPrimaryKey(),
			responden, false);

		responden.resetOriginalValues();

		return responden;
	}

	/**
	 * Returns the responden with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the responden
	 * @return the responden
	 * @throws NoSuchRespondenException if a responden with the primary key could not be found
	 */
	@Override
	public Responden findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRespondenException {

		Responden responden = fetchByPrimaryKey(primaryKey);

		if (responden == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRespondenException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return responden;
	}

	/**
	 * Returns the responden with the primary key or throws a <code>NoSuchRespondenException</code> if it could not be found.
	 *
	 * @param id the primary key of the responden
	 * @return the responden
	 * @throws NoSuchRespondenException if a responden with the primary key could not be found
	 */
	@Override
	public Responden findByPrimaryKey(long id) throws NoSuchRespondenException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the responden with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the responden
	 * @return the responden, or <code>null</code> if a responden with the primary key could not be found
	 */
	@Override
	public Responden fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the respondens.
	 *
	 * @return the respondens
	 */
	@Override
	public List<Responden> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the respondens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of respondens
	 * @param end the upper bound of the range of respondens (not inclusive)
	 * @return the range of respondens
	 */
	@Override
	public List<Responden> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the respondens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of respondens
	 * @param end the upper bound of the range of respondens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of respondens
	 */
	@Deprecated
	@Override
	public List<Responden> findAll(
		int start, int end, OrderByComparator<Responden> orderByComparator,
		boolean useFinderCache) {

		return findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the respondens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RespondenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of respondens
	 * @param end the upper bound of the range of respondens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of respondens
	 */
	@Override
	public List<Responden> findAll(
		int start, int end, OrderByComparator<Responden> orderByComparator) {

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

		List<Responden> list = (List<Responden>)finderCache.getResult(
			finderPath, finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_RESPONDEN);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RESPONDEN;

				if (pagination) {
					sql = sql.concat(RespondenModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Responden>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Responden>)QueryUtil.list(
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
	 * Removes all the respondens from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Responden responden : findAll()) {
			remove(responden);
		}
	}

	/**
	 * Returns the number of respondens.
	 *
	 * @return the number of respondens
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_RESPONDEN);

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
		return _SQL_SELECT_RESPONDEN;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return RespondenModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the responden persistence.
	 */
	@Activate
	public void activate() {
		RespondenModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		RespondenModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, RespondenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, RespondenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindBySurveyOperationID = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, RespondenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySurveyOperationID",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindBySurveyOperationID = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, RespondenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySurveyOperationID", new String[] {Long.class.getName()},
			RespondenModelImpl.SURVEYOPERATIONID_COLUMN_BITMASK);

		_finderPathCountBySurveyOperationID = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySurveyOperationID", new String[] {Long.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(RespondenImpl.class.getName());
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
				"value.object.column.bitmask.enabled.com.btpn.opera.operationsurvey.model.Responden"),
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

	private static final String _SQL_SELECT_RESPONDEN =
		"SELECT responden FROM Responden responden";

	private static final String _SQL_SELECT_RESPONDEN_WHERE =
		"SELECT responden FROM Responden responden WHERE ";

	private static final String _SQL_COUNT_RESPONDEN =
		"SELECT COUNT(responden) FROM Responden responden";

	private static final String _SQL_COUNT_RESPONDEN_WHERE =
		"SELECT COUNT(responden) FROM Responden responden WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "responden.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Responden exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Responden exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		RespondenPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {
			"fullName", "surveyOperationId", "totalValue", "answerRecord",
			"submittedDate"
		});

	static {
		try {
			Class.forName(OperationSurveyPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException cnfe) {
			throw new ExceptionInInitializerError(cnfe);
		}
	}

}