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

import com.btpn.opera.operationsurvey.exception.NoSuchSurveyOperationViewException;
import com.btpn.opera.operationsurvey.model.SurveyOperationView;
import com.btpn.opera.operationsurvey.model.impl.SurveyOperationViewImpl;
import com.btpn.opera.operationsurvey.model.impl.SurveyOperationViewModelImpl;
import com.btpn.opera.operationsurvey.service.persistence.SurveyOperationViewPersistence;
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
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the survey operation view service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SurveyOperationViewPersistence.class)
@ProviderType
public class SurveyOperationViewPersistenceImpl
	extends BasePersistenceImpl<SurveyOperationView>
	implements SurveyOperationViewPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SurveyOperationViewUtil</code> to access the survey operation view persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SurveyOperationViewImpl.class.getName();

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
	 * Returns all the survey operation views where title = &#63;.
	 *
	 * @param title the title
	 * @return the matching survey operation views
	 */
	@Override
	public List<SurveyOperationView> findByTitle(String title) {
		return findByTitle(title, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<SurveyOperationView> findByTitle(
		String title, int start, int end) {

		return findByTitle(title, start, end, null);
	}

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
	@Override
	public List<SurveyOperationView> findByTitle(
		String title, int start, int end,
		OrderByComparator<SurveyOperationView> orderByComparator,
		boolean useFinderCache) {

		return findByTitle(title, start, end, orderByComparator);
	}

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
	@Override
	public List<SurveyOperationView> findByTitle(
		String title, int start, int end,
		OrderByComparator<SurveyOperationView> orderByComparator) {

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

		List<SurveyOperationView> list =
			(List<SurveyOperationView>)finderCache.getResult(
				finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SurveyOperationView surveyOperationView : list) {
				if (!title.equals(surveyOperationView.getTitle())) {
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

			query.append(_SQL_SELECT_SURVEYOPERATIONVIEW_WHERE);

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
				query.append(SurveyOperationViewModelImpl.ORDER_BY_JPQL);
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
					list = (List<SurveyOperationView>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<SurveyOperationView>)QueryUtil.list(
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
	 * Returns the first survey operation view in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey operation view
	 * @throws NoSuchSurveyOperationViewException if a matching survey operation view could not be found
	 */
	@Override
	public SurveyOperationView findByTitle_First(
			String title,
			OrderByComparator<SurveyOperationView> orderByComparator)
		throws NoSuchSurveyOperationViewException {

		SurveyOperationView surveyOperationView = fetchByTitle_First(
			title, orderByComparator);

		if (surveyOperationView != null) {
			return surveyOperationView;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("title=");
		msg.append(title);

		msg.append("}");

		throw new NoSuchSurveyOperationViewException(msg.toString());
	}

	/**
	 * Returns the first survey operation view in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey operation view, or <code>null</code> if a matching survey operation view could not be found
	 */
	@Override
	public SurveyOperationView fetchByTitle_First(
		String title,
		OrderByComparator<SurveyOperationView> orderByComparator) {

		List<SurveyOperationView> list = findByTitle(
			title, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last survey operation view in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey operation view
	 * @throws NoSuchSurveyOperationViewException if a matching survey operation view could not be found
	 */
	@Override
	public SurveyOperationView findByTitle_Last(
			String title,
			OrderByComparator<SurveyOperationView> orderByComparator)
		throws NoSuchSurveyOperationViewException {

		SurveyOperationView surveyOperationView = fetchByTitle_Last(
			title, orderByComparator);

		if (surveyOperationView != null) {
			return surveyOperationView;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("title=");
		msg.append(title);

		msg.append("}");

		throw new NoSuchSurveyOperationViewException(msg.toString());
	}

	/**
	 * Returns the last survey operation view in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey operation view, or <code>null</code> if a matching survey operation view could not be found
	 */
	@Override
	public SurveyOperationView fetchByTitle_Last(
		String title,
		OrderByComparator<SurveyOperationView> orderByComparator) {

		int count = countByTitle(title);

		if (count == 0) {
			return null;
		}

		List<SurveyOperationView> list = findByTitle(
			title, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the survey operation views before and after the current survey operation view in the ordered set where title = &#63;.
	 *
	 * @param id the primary key of the current survey operation view
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next survey operation view
	 * @throws NoSuchSurveyOperationViewException if a survey operation view with the primary key could not be found
	 */
	@Override
	public SurveyOperationView[] findByTitle_PrevAndNext(
			long id, String title,
			OrderByComparator<SurveyOperationView> orderByComparator)
		throws NoSuchSurveyOperationViewException {

		title = Objects.toString(title, "");

		SurveyOperationView surveyOperationView = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SurveyOperationView[] array = new SurveyOperationViewImpl[3];

			array[0] = getByTitle_PrevAndNext(
				session, surveyOperationView, title, orderByComparator, true);

			array[1] = surveyOperationView;

			array[2] = getByTitle_PrevAndNext(
				session, surveyOperationView, title, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SurveyOperationView getByTitle_PrevAndNext(
		Session session, SurveyOperationView surveyOperationView, String title,
		OrderByComparator<SurveyOperationView> orderByComparator,
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

		query.append(_SQL_SELECT_SURVEYOPERATIONVIEW_WHERE);

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
			query.append(SurveyOperationViewModelImpl.ORDER_BY_JPQL);
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
						surveyOperationView)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<SurveyOperationView> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the survey operation views where title = &#63; from the database.
	 *
	 * @param title the title
	 */
	@Override
	public void removeByTitle(String title) {
		for (SurveyOperationView surveyOperationView :
				findByTitle(
					title, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(surveyOperationView);
		}
	}

	/**
	 * Returns the number of survey operation views where title = &#63;.
	 *
	 * @param title the title
	 * @return the number of matching survey operation views
	 */
	@Override
	public int countByTitle(String title) {
		title = Objects.toString(title, "");

		FinderPath finderPath = _finderPathCountByTitle;

		Object[] finderArgs = new Object[] {title};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SURVEYOPERATIONVIEW_WHERE);

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
		"surveyOperationView.title = ?";

	private static final String _FINDER_COLUMN_TITLE_TITLE_3 =
		"(surveyOperationView.title IS NULL OR surveyOperationView.title = '')";

	public SurveyOperationViewPersistenceImpl() {
		setModelClass(SurveyOperationView.class);

		setModelImplClass(SurveyOperationViewImpl.class);
		setModelPKClass(long.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("surveyObject", "survey_object");
		dbColumnNames.put("startDate", "start_date");
		dbColumnNames.put("endDate", "end_date");

		setDBColumnNames(dbColumnNames);
	}

	/**
	 * Caches the survey operation view in the entity cache if it is enabled.
	 *
	 * @param surveyOperationView the survey operation view
	 */
	@Override
	public void cacheResult(SurveyOperationView surveyOperationView) {
		entityCache.putResult(
			entityCacheEnabled, SurveyOperationViewImpl.class,
			surveyOperationView.getPrimaryKey(), surveyOperationView);

		surveyOperationView.resetOriginalValues();
	}

	/**
	 * Caches the survey operation views in the entity cache if it is enabled.
	 *
	 * @param surveyOperationViews the survey operation views
	 */
	@Override
	public void cacheResult(List<SurveyOperationView> surveyOperationViews) {
		for (SurveyOperationView surveyOperationView : surveyOperationViews) {
			if (entityCache.getResult(
					entityCacheEnabled, SurveyOperationViewImpl.class,
					surveyOperationView.getPrimaryKey()) == null) {

				cacheResult(surveyOperationView);
			}
			else {
				surveyOperationView.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all survey operation views.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SurveyOperationViewImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the survey operation view.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SurveyOperationView surveyOperationView) {
		entityCache.removeResult(
			entityCacheEnabled, SurveyOperationViewImpl.class,
			surveyOperationView.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SurveyOperationView> surveyOperationViews) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SurveyOperationView surveyOperationView : surveyOperationViews) {
			entityCache.removeResult(
				entityCacheEnabled, SurveyOperationViewImpl.class,
				surveyOperationView.getPrimaryKey());
		}
	}

	/**
	 * Creates a new survey operation view with the primary key. Does not add the survey operation view to the database.
	 *
	 * @param id the primary key for the new survey operation view
	 * @return the new survey operation view
	 */
	@Override
	public SurveyOperationView create(long id) {
		SurveyOperationView surveyOperationView = new SurveyOperationViewImpl();

		surveyOperationView.setNew(true);
		surveyOperationView.setPrimaryKey(id);

		return surveyOperationView;
	}

	/**
	 * Removes the survey operation view with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the survey operation view
	 * @return the survey operation view that was removed
	 * @throws NoSuchSurveyOperationViewException if a survey operation view with the primary key could not be found
	 */
	@Override
	public SurveyOperationView remove(long id)
		throws NoSuchSurveyOperationViewException {

		return remove((Serializable)id);
	}

	/**
	 * Removes the survey operation view with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the survey operation view
	 * @return the survey operation view that was removed
	 * @throws NoSuchSurveyOperationViewException if a survey operation view with the primary key could not be found
	 */
	@Override
	public SurveyOperationView remove(Serializable primaryKey)
		throws NoSuchSurveyOperationViewException {

		Session session = null;

		try {
			session = openSession();

			SurveyOperationView surveyOperationView =
				(SurveyOperationView)session.get(
					SurveyOperationViewImpl.class, primaryKey);

			if (surveyOperationView == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSurveyOperationViewException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(surveyOperationView);
		}
		catch (NoSuchSurveyOperationViewException nsee) {
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
	protected SurveyOperationView removeImpl(
		SurveyOperationView surveyOperationView) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(surveyOperationView)) {
				surveyOperationView = (SurveyOperationView)session.get(
					SurveyOperationViewImpl.class,
					surveyOperationView.getPrimaryKeyObj());
			}

			if (surveyOperationView != null) {
				session.delete(surveyOperationView);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (surveyOperationView != null) {
			clearCache(surveyOperationView);
		}

		return surveyOperationView;
	}

	@Override
	public SurveyOperationView updateImpl(
		SurveyOperationView surveyOperationView) {

		boolean isNew = surveyOperationView.isNew();

		if (!(surveyOperationView instanceof SurveyOperationViewModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(surveyOperationView.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					surveyOperationView);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in surveyOperationView proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SurveyOperationView implementation " +
					surveyOperationView.getClass());
		}

		SurveyOperationViewModelImpl surveyOperationViewModelImpl =
			(SurveyOperationViewModelImpl)surveyOperationView;

		Session session = null;

		try {
			session = openSession();

			if (surveyOperationView.isNew()) {
				session.save(surveyOperationView);

				surveyOperationView.setNew(false);
			}
			else {
				surveyOperationView = (SurveyOperationView)session.merge(
					surveyOperationView);
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
				surveyOperationViewModelImpl.getTitle()
			};

			finderCache.removeResult(_finderPathCountByTitle, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByTitle, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((surveyOperationViewModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByTitle.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					surveyOperationViewModelImpl.getOriginalTitle()
				};

				finderCache.removeResult(_finderPathCountByTitle, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByTitle, args);

				args = new Object[] {surveyOperationViewModelImpl.getTitle()};

				finderCache.removeResult(_finderPathCountByTitle, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByTitle, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, SurveyOperationViewImpl.class,
			surveyOperationView.getPrimaryKey(), surveyOperationView, false);

		surveyOperationView.resetOriginalValues();

		return surveyOperationView;
	}

	/**
	 * Returns the survey operation view with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the survey operation view
	 * @return the survey operation view
	 * @throws NoSuchSurveyOperationViewException if a survey operation view with the primary key could not be found
	 */
	@Override
	public SurveyOperationView findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSurveyOperationViewException {

		SurveyOperationView surveyOperationView = fetchByPrimaryKey(primaryKey);

		if (surveyOperationView == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSurveyOperationViewException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return surveyOperationView;
	}

	/**
	 * Returns the survey operation view with the primary key or throws a <code>NoSuchSurveyOperationViewException</code> if it could not be found.
	 *
	 * @param id the primary key of the survey operation view
	 * @return the survey operation view
	 * @throws NoSuchSurveyOperationViewException if a survey operation view with the primary key could not be found
	 */
	@Override
	public SurveyOperationView findByPrimaryKey(long id)
		throws NoSuchSurveyOperationViewException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the survey operation view with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the survey operation view
	 * @return the survey operation view, or <code>null</code> if a survey operation view with the primary key could not be found
	 */
	@Override
	public SurveyOperationView fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the survey operation views.
	 *
	 * @return the survey operation views
	 */
	@Override
	public List<SurveyOperationView> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<SurveyOperationView> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<SurveyOperationView> findAll(
		int start, int end,
		OrderByComparator<SurveyOperationView> orderByComparator,
		boolean useFinderCache) {

		return findAll(start, end, orderByComparator);
	}

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
	@Override
	public List<SurveyOperationView> findAll(
		int start, int end,
		OrderByComparator<SurveyOperationView> orderByComparator) {

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

		List<SurveyOperationView> list =
			(List<SurveyOperationView>)finderCache.getResult(
				finderPath, finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SURVEYOPERATIONVIEW);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SURVEYOPERATIONVIEW;

				if (pagination) {
					sql = sql.concat(
						SurveyOperationViewModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SurveyOperationView>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<SurveyOperationView>)QueryUtil.list(
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
	 * Removes all the survey operation views from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SurveyOperationView surveyOperationView : findAll()) {
			remove(surveyOperationView);
		}
	}

	/**
	 * Returns the number of survey operation views.
	 *
	 * @return the number of survey operation views
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SURVEYOPERATIONVIEW);

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
		return _SQL_SELECT_SURVEYOPERATIONVIEW;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SurveyOperationViewModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the survey operation view persistence.
	 */
	@Activate
	public void activate() {
		SurveyOperationViewModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		SurveyOperationViewModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SurveyOperationViewImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SurveyOperationViewImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByTitle = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SurveyOperationViewImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTitle",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByTitle = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SurveyOperationViewImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTitle",
			new String[] {String.class.getName()},
			SurveyOperationViewModelImpl.TITLE_COLUMN_BITMASK);

		_finderPathCountByTitle = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTitle",
			new String[] {String.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(SurveyOperationViewImpl.class.getName());
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
				"value.object.column.bitmask.enabled.com.btpn.opera.operationsurvey.model.SurveyOperationView"),
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

	private static final String _SQL_SELECT_SURVEYOPERATIONVIEW =
		"SELECT surveyOperationView FROM SurveyOperationView surveyOperationView";

	private static final String _SQL_SELECT_SURVEYOPERATIONVIEW_WHERE =
		"SELECT surveyOperationView FROM SurveyOperationView surveyOperationView WHERE ";

	private static final String _SQL_COUNT_SURVEYOPERATIONVIEW =
		"SELECT COUNT(surveyOperationView) FROM SurveyOperationView surveyOperationView";

	private static final String _SQL_COUNT_SURVEYOPERATIONVIEW_WHERE =
		"SELECT COUNT(surveyOperationView) FROM SurveyOperationView surveyOperationView WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "surveyOperationView.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SurveyOperationView exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SurveyOperationView exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SurveyOperationViewPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"surveyObject", "startDate", "endDate"});

	static {
		try {
			Class.forName(OperationSurveyPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException cnfe) {
			throw new ExceptionInInitializerError(cnfe);
		}
	}

}