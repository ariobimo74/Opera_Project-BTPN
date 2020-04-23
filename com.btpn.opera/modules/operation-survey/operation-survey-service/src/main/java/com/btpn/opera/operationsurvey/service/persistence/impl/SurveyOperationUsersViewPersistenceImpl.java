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

import com.btpn.opera.operationsurvey.exception.NoSuchSurveyOperationUsersViewException;
import com.btpn.opera.operationsurvey.model.SurveyOperationUsersView;
import com.btpn.opera.operationsurvey.model.impl.SurveyOperationUsersViewImpl;
import com.btpn.opera.operationsurvey.model.impl.SurveyOperationUsersViewModelImpl;
import com.btpn.opera.operationsurvey.service.persistence.SurveyOperationUsersViewPersistence;
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
 * The persistence implementation for the survey operation users view service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SurveyOperationUsersViewPersistence.class)
@ProviderType
public class SurveyOperationUsersViewPersistenceImpl
	extends BasePersistenceImpl<SurveyOperationUsersView>
	implements SurveyOperationUsersViewPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SurveyOperationUsersViewUtil</code> to access the survey operation users view persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SurveyOperationUsersViewImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByRespondenNik;
	private FinderPath _finderPathWithoutPaginationFindByRespondenNik;
	private FinderPath _finderPathCountByRespondenNik;

	/**
	 * Returns all the survey operation users views where respondenNik = &#63;.
	 *
	 * @param respondenNik the responden nik
	 * @return the matching survey operation users views
	 */
	@Override
	public List<SurveyOperationUsersView> findByRespondenNik(
		String respondenNik) {

		return findByRespondenNik(
			respondenNik, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<SurveyOperationUsersView> findByRespondenNik(
		String respondenNik, int start, int end) {

		return findByRespondenNik(respondenNik, start, end, null);
	}

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
	@Override
	public List<SurveyOperationUsersView> findByRespondenNik(
		String respondenNik, int start, int end,
		OrderByComparator<SurveyOperationUsersView> orderByComparator,
		boolean useFinderCache) {

		return findByRespondenNik(respondenNik, start, end, orderByComparator);
	}

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
	@Override
	public List<SurveyOperationUsersView> findByRespondenNik(
		String respondenNik, int start, int end,
		OrderByComparator<SurveyOperationUsersView> orderByComparator) {

		respondenNik = Objects.toString(respondenNik, "");

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindByRespondenNik;
			finderArgs = new Object[] {respondenNik};
		}
		else {
			finderPath = _finderPathWithPaginationFindByRespondenNik;
			finderArgs = new Object[] {
				respondenNik, start, end, orderByComparator
			};
		}

		List<SurveyOperationUsersView> list =
			(List<SurveyOperationUsersView>)finderCache.getResult(
				finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SurveyOperationUsersView surveyOperationUsersView : list) {
				if (!respondenNik.equals(
						surveyOperationUsersView.getRespondenNik())) {

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

			query.append(_SQL_SELECT_SURVEYOPERATIONUSERSVIEW_WHERE);

			boolean bindRespondenNik = false;

			if (respondenNik.isEmpty()) {
				query.append(_FINDER_COLUMN_RESPONDENNIK_RESPONDENNIK_3);
			}
			else {
				bindRespondenNik = true;

				query.append(_FINDER_COLUMN_RESPONDENNIK_RESPONDENNIK_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
				query.append(SurveyOperationUsersViewModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRespondenNik) {
					qPos.add(respondenNik);
				}

				if (!pagination) {
					list = (List<SurveyOperationUsersView>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<SurveyOperationUsersView>)QueryUtil.list(
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
	 * Returns the first survey operation users view in the ordered set where respondenNik = &#63;.
	 *
	 * @param respondenNik the responden nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey operation users view
	 * @throws NoSuchSurveyOperationUsersViewException if a matching survey operation users view could not be found
	 */
	@Override
	public SurveyOperationUsersView findByRespondenNik_First(
			String respondenNik,
			OrderByComparator<SurveyOperationUsersView> orderByComparator)
		throws NoSuchSurveyOperationUsersViewException {

		SurveyOperationUsersView surveyOperationUsersView =
			fetchByRespondenNik_First(respondenNik, orderByComparator);

		if (surveyOperationUsersView != null) {
			return surveyOperationUsersView;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("respondenNik=");
		msg.append(respondenNik);

		msg.append("}");

		throw new NoSuchSurveyOperationUsersViewException(msg.toString());
	}

	/**
	 * Returns the first survey operation users view in the ordered set where respondenNik = &#63;.
	 *
	 * @param respondenNik the responden nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey operation users view, or <code>null</code> if a matching survey operation users view could not be found
	 */
	@Override
	public SurveyOperationUsersView fetchByRespondenNik_First(
		String respondenNik,
		OrderByComparator<SurveyOperationUsersView> orderByComparator) {

		List<SurveyOperationUsersView> list = findByRespondenNik(
			respondenNik, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last survey operation users view in the ordered set where respondenNik = &#63;.
	 *
	 * @param respondenNik the responden nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey operation users view
	 * @throws NoSuchSurveyOperationUsersViewException if a matching survey operation users view could not be found
	 */
	@Override
	public SurveyOperationUsersView findByRespondenNik_Last(
			String respondenNik,
			OrderByComparator<SurveyOperationUsersView> orderByComparator)
		throws NoSuchSurveyOperationUsersViewException {

		SurveyOperationUsersView surveyOperationUsersView =
			fetchByRespondenNik_Last(respondenNik, orderByComparator);

		if (surveyOperationUsersView != null) {
			return surveyOperationUsersView;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("respondenNik=");
		msg.append(respondenNik);

		msg.append("}");

		throw new NoSuchSurveyOperationUsersViewException(msg.toString());
	}

	/**
	 * Returns the last survey operation users view in the ordered set where respondenNik = &#63;.
	 *
	 * @param respondenNik the responden nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey operation users view, or <code>null</code> if a matching survey operation users view could not be found
	 */
	@Override
	public SurveyOperationUsersView fetchByRespondenNik_Last(
		String respondenNik,
		OrderByComparator<SurveyOperationUsersView> orderByComparator) {

		int count = countByRespondenNik(respondenNik);

		if (count == 0) {
			return null;
		}

		List<SurveyOperationUsersView> list = findByRespondenNik(
			respondenNik, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the survey operation users views before and after the current survey operation users view in the ordered set where respondenNik = &#63;.
	 *
	 * @param id the primary key of the current survey operation users view
	 * @param respondenNik the responden nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next survey operation users view
	 * @throws NoSuchSurveyOperationUsersViewException if a survey operation users view with the primary key could not be found
	 */
	@Override
	public SurveyOperationUsersView[] findByRespondenNik_PrevAndNext(
			long id, String respondenNik,
			OrderByComparator<SurveyOperationUsersView> orderByComparator)
		throws NoSuchSurveyOperationUsersViewException {

		respondenNik = Objects.toString(respondenNik, "");

		SurveyOperationUsersView surveyOperationUsersView = findByPrimaryKey(
			id);

		Session session = null;

		try {
			session = openSession();

			SurveyOperationUsersView[] array =
				new SurveyOperationUsersViewImpl[3];

			array[0] = getByRespondenNik_PrevAndNext(
				session, surveyOperationUsersView, respondenNik,
				orderByComparator, true);

			array[1] = surveyOperationUsersView;

			array[2] = getByRespondenNik_PrevAndNext(
				session, surveyOperationUsersView, respondenNik,
				orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SurveyOperationUsersView getByRespondenNik_PrevAndNext(
		Session session, SurveyOperationUsersView surveyOperationUsersView,
		String respondenNik,
		OrderByComparator<SurveyOperationUsersView> orderByComparator,
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

		query.append(_SQL_SELECT_SURVEYOPERATIONUSERSVIEW_WHERE);

		boolean bindRespondenNik = false;

		if (respondenNik.isEmpty()) {
			query.append(_FINDER_COLUMN_RESPONDENNIK_RESPONDENNIK_3);
		}
		else {
			bindRespondenNik = true;

			query.append(_FINDER_COLUMN_RESPONDENNIK_RESPONDENNIK_2);
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
			query.append(SurveyOperationUsersViewModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindRespondenNik) {
			qPos.add(respondenNik);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						surveyOperationUsersView)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<SurveyOperationUsersView> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the survey operation users views where respondenNik = &#63; from the database.
	 *
	 * @param respondenNik the responden nik
	 */
	@Override
	public void removeByRespondenNik(String respondenNik) {
		for (SurveyOperationUsersView surveyOperationUsersView :
				findByRespondenNik(
					respondenNik, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(surveyOperationUsersView);
		}
	}

	/**
	 * Returns the number of survey operation users views where respondenNik = &#63;.
	 *
	 * @param respondenNik the responden nik
	 * @return the number of matching survey operation users views
	 */
	@Override
	public int countByRespondenNik(String respondenNik) {
		respondenNik = Objects.toString(respondenNik, "");

		FinderPath finderPath = _finderPathCountByRespondenNik;

		Object[] finderArgs = new Object[] {respondenNik};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SURVEYOPERATIONUSERSVIEW_WHERE);

			boolean bindRespondenNik = false;

			if (respondenNik.isEmpty()) {
				query.append(_FINDER_COLUMN_RESPONDENNIK_RESPONDENNIK_3);
			}
			else {
				bindRespondenNik = true;

				query.append(_FINDER_COLUMN_RESPONDENNIK_RESPONDENNIK_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRespondenNik) {
					qPos.add(respondenNik);
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

	private static final String _FINDER_COLUMN_RESPONDENNIK_RESPONDENNIK_2 =
		"surveyOperationUsersView.respondenNik = ?";

	private static final String _FINDER_COLUMN_RESPONDENNIK_RESPONDENNIK_3 =
		"(surveyOperationUsersView.respondenNik IS NULL OR surveyOperationUsersView.respondenNik = '')";

	private FinderPath _finderPathWithPaginationFindByRespondenId;
	private FinderPath _finderPathWithoutPaginationFindByRespondenId;
	private FinderPath _finderPathCountByRespondenId;

	/**
	 * Returns all the survey operation users views where respondenId = &#63;.
	 *
	 * @param respondenId the responden ID
	 * @return the matching survey operation users views
	 */
	@Override
	public List<SurveyOperationUsersView> findByRespondenId(long respondenId) {
		return findByRespondenId(
			respondenId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<SurveyOperationUsersView> findByRespondenId(
		long respondenId, int start, int end) {

		return findByRespondenId(respondenId, start, end, null);
	}

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
	@Override
	public List<SurveyOperationUsersView> findByRespondenId(
		long respondenId, int start, int end,
		OrderByComparator<SurveyOperationUsersView> orderByComparator,
		boolean useFinderCache) {

		return findByRespondenId(respondenId, start, end, orderByComparator);
	}

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
	@Override
	public List<SurveyOperationUsersView> findByRespondenId(
		long respondenId, int start, int end,
		OrderByComparator<SurveyOperationUsersView> orderByComparator) {

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindByRespondenId;
			finderArgs = new Object[] {respondenId};
		}
		else {
			finderPath = _finderPathWithPaginationFindByRespondenId;
			finderArgs = new Object[] {
				respondenId, start, end, orderByComparator
			};
		}

		List<SurveyOperationUsersView> list =
			(List<SurveyOperationUsersView>)finderCache.getResult(
				finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SurveyOperationUsersView surveyOperationUsersView : list) {
				if ((respondenId !=
						surveyOperationUsersView.getRespondenId())) {

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

			query.append(_SQL_SELECT_SURVEYOPERATIONUSERSVIEW_WHERE);

			query.append(_FINDER_COLUMN_RESPONDENID_RESPONDENID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
				query.append(SurveyOperationUsersViewModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(respondenId);

				if (!pagination) {
					list = (List<SurveyOperationUsersView>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<SurveyOperationUsersView>)QueryUtil.list(
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
	 * Returns the first survey operation users view in the ordered set where respondenId = &#63;.
	 *
	 * @param respondenId the responden ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey operation users view
	 * @throws NoSuchSurveyOperationUsersViewException if a matching survey operation users view could not be found
	 */
	@Override
	public SurveyOperationUsersView findByRespondenId_First(
			long respondenId,
			OrderByComparator<SurveyOperationUsersView> orderByComparator)
		throws NoSuchSurveyOperationUsersViewException {

		SurveyOperationUsersView surveyOperationUsersView =
			fetchByRespondenId_First(respondenId, orderByComparator);

		if (surveyOperationUsersView != null) {
			return surveyOperationUsersView;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("respondenId=");
		msg.append(respondenId);

		msg.append("}");

		throw new NoSuchSurveyOperationUsersViewException(msg.toString());
	}

	/**
	 * Returns the first survey operation users view in the ordered set where respondenId = &#63;.
	 *
	 * @param respondenId the responden ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey operation users view, or <code>null</code> if a matching survey operation users view could not be found
	 */
	@Override
	public SurveyOperationUsersView fetchByRespondenId_First(
		long respondenId,
		OrderByComparator<SurveyOperationUsersView> orderByComparator) {

		List<SurveyOperationUsersView> list = findByRespondenId(
			respondenId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last survey operation users view in the ordered set where respondenId = &#63;.
	 *
	 * @param respondenId the responden ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey operation users view
	 * @throws NoSuchSurveyOperationUsersViewException if a matching survey operation users view could not be found
	 */
	@Override
	public SurveyOperationUsersView findByRespondenId_Last(
			long respondenId,
			OrderByComparator<SurveyOperationUsersView> orderByComparator)
		throws NoSuchSurveyOperationUsersViewException {

		SurveyOperationUsersView surveyOperationUsersView =
			fetchByRespondenId_Last(respondenId, orderByComparator);

		if (surveyOperationUsersView != null) {
			return surveyOperationUsersView;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("respondenId=");
		msg.append(respondenId);

		msg.append("}");

		throw new NoSuchSurveyOperationUsersViewException(msg.toString());
	}

	/**
	 * Returns the last survey operation users view in the ordered set where respondenId = &#63;.
	 *
	 * @param respondenId the responden ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey operation users view, or <code>null</code> if a matching survey operation users view could not be found
	 */
	@Override
	public SurveyOperationUsersView fetchByRespondenId_Last(
		long respondenId,
		OrderByComparator<SurveyOperationUsersView> orderByComparator) {

		int count = countByRespondenId(respondenId);

		if (count == 0) {
			return null;
		}

		List<SurveyOperationUsersView> list = findByRespondenId(
			respondenId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the survey operation users views before and after the current survey operation users view in the ordered set where respondenId = &#63;.
	 *
	 * @param id the primary key of the current survey operation users view
	 * @param respondenId the responden ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next survey operation users view
	 * @throws NoSuchSurveyOperationUsersViewException if a survey operation users view with the primary key could not be found
	 */
	@Override
	public SurveyOperationUsersView[] findByRespondenId_PrevAndNext(
			long id, long respondenId,
			OrderByComparator<SurveyOperationUsersView> orderByComparator)
		throws NoSuchSurveyOperationUsersViewException {

		SurveyOperationUsersView surveyOperationUsersView = findByPrimaryKey(
			id);

		Session session = null;

		try {
			session = openSession();

			SurveyOperationUsersView[] array =
				new SurveyOperationUsersViewImpl[3];

			array[0] = getByRespondenId_PrevAndNext(
				session, surveyOperationUsersView, respondenId,
				orderByComparator, true);

			array[1] = surveyOperationUsersView;

			array[2] = getByRespondenId_PrevAndNext(
				session, surveyOperationUsersView, respondenId,
				orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SurveyOperationUsersView getByRespondenId_PrevAndNext(
		Session session, SurveyOperationUsersView surveyOperationUsersView,
		long respondenId,
		OrderByComparator<SurveyOperationUsersView> orderByComparator,
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

		query.append(_SQL_SELECT_SURVEYOPERATIONUSERSVIEW_WHERE);

		query.append(_FINDER_COLUMN_RESPONDENID_RESPONDENID_2);

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
			query.append(SurveyOperationUsersViewModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(respondenId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						surveyOperationUsersView)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<SurveyOperationUsersView> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the survey operation users views where respondenId = &#63; from the database.
	 *
	 * @param respondenId the responden ID
	 */
	@Override
	public void removeByRespondenId(long respondenId) {
		for (SurveyOperationUsersView surveyOperationUsersView :
				findByRespondenId(
					respondenId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(surveyOperationUsersView);
		}
	}

	/**
	 * Returns the number of survey operation users views where respondenId = &#63;.
	 *
	 * @param respondenId the responden ID
	 * @return the number of matching survey operation users views
	 */
	@Override
	public int countByRespondenId(long respondenId) {
		FinderPath finderPath = _finderPathCountByRespondenId;

		Object[] finderArgs = new Object[] {respondenId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SURVEYOPERATIONUSERSVIEW_WHERE);

			query.append(_FINDER_COLUMN_RESPONDENID_RESPONDENID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(respondenId);

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

	private static final String _FINDER_COLUMN_RESPONDENID_RESPONDENID_2 =
		"surveyOperationUsersView.respondenId = ?";

	public SurveyOperationUsersViewPersistenceImpl() {
		setModelClass(SurveyOperationUsersView.class);

		setModelImplClass(SurveyOperationUsersViewImpl.class);
		setModelPKClass(long.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("surveyObject", "survey_object");
		dbColumnNames.put("startDate", "start_date");
		dbColumnNames.put("endDate", "end_date");
		dbColumnNames.put("respondenId", "responden_id");
		dbColumnNames.put("respondenNik", "responden_nik");
		dbColumnNames.put("submittedDate", "submitted_date");

		setDBColumnNames(dbColumnNames);
	}

	/**
	 * Caches the survey operation users view in the entity cache if it is enabled.
	 *
	 * @param surveyOperationUsersView the survey operation users view
	 */
	@Override
	public void cacheResult(SurveyOperationUsersView surveyOperationUsersView) {
		entityCache.putResult(
			entityCacheEnabled, SurveyOperationUsersViewImpl.class,
			surveyOperationUsersView.getPrimaryKey(), surveyOperationUsersView);

		surveyOperationUsersView.resetOriginalValues();
	}

	/**
	 * Caches the survey operation users views in the entity cache if it is enabled.
	 *
	 * @param surveyOperationUsersViews the survey operation users views
	 */
	@Override
	public void cacheResult(
		List<SurveyOperationUsersView> surveyOperationUsersViews) {

		for (SurveyOperationUsersView surveyOperationUsersView :
				surveyOperationUsersViews) {

			if (entityCache.getResult(
					entityCacheEnabled, SurveyOperationUsersViewImpl.class,
					surveyOperationUsersView.getPrimaryKey()) == null) {

				cacheResult(surveyOperationUsersView);
			}
			else {
				surveyOperationUsersView.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all survey operation users views.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SurveyOperationUsersViewImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the survey operation users view.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SurveyOperationUsersView surveyOperationUsersView) {
		entityCache.removeResult(
			entityCacheEnabled, SurveyOperationUsersViewImpl.class,
			surveyOperationUsersView.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<SurveyOperationUsersView> surveyOperationUsersViews) {

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SurveyOperationUsersView surveyOperationUsersView :
				surveyOperationUsersViews) {

			entityCache.removeResult(
				entityCacheEnabled, SurveyOperationUsersViewImpl.class,
				surveyOperationUsersView.getPrimaryKey());
		}
	}

	/**
	 * Creates a new survey operation users view with the primary key. Does not add the survey operation users view to the database.
	 *
	 * @param id the primary key for the new survey operation users view
	 * @return the new survey operation users view
	 */
	@Override
	public SurveyOperationUsersView create(long id) {
		SurveyOperationUsersView surveyOperationUsersView =
			new SurveyOperationUsersViewImpl();

		surveyOperationUsersView.setNew(true);
		surveyOperationUsersView.setPrimaryKey(id);

		return surveyOperationUsersView;
	}

	/**
	 * Removes the survey operation users view with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the survey operation users view
	 * @return the survey operation users view that was removed
	 * @throws NoSuchSurveyOperationUsersViewException if a survey operation users view with the primary key could not be found
	 */
	@Override
	public SurveyOperationUsersView remove(long id)
		throws NoSuchSurveyOperationUsersViewException {

		return remove((Serializable)id);
	}

	/**
	 * Removes the survey operation users view with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the survey operation users view
	 * @return the survey operation users view that was removed
	 * @throws NoSuchSurveyOperationUsersViewException if a survey operation users view with the primary key could not be found
	 */
	@Override
	public SurveyOperationUsersView remove(Serializable primaryKey)
		throws NoSuchSurveyOperationUsersViewException {

		Session session = null;

		try {
			session = openSession();

			SurveyOperationUsersView surveyOperationUsersView =
				(SurveyOperationUsersView)session.get(
					SurveyOperationUsersViewImpl.class, primaryKey);

			if (surveyOperationUsersView == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSurveyOperationUsersViewException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(surveyOperationUsersView);
		}
		catch (NoSuchSurveyOperationUsersViewException nsee) {
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
	protected SurveyOperationUsersView removeImpl(
		SurveyOperationUsersView surveyOperationUsersView) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(surveyOperationUsersView)) {
				surveyOperationUsersView =
					(SurveyOperationUsersView)session.get(
						SurveyOperationUsersViewImpl.class,
						surveyOperationUsersView.getPrimaryKeyObj());
			}

			if (surveyOperationUsersView != null) {
				session.delete(surveyOperationUsersView);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (surveyOperationUsersView != null) {
			clearCache(surveyOperationUsersView);
		}

		return surveyOperationUsersView;
	}

	@Override
	public SurveyOperationUsersView updateImpl(
		SurveyOperationUsersView surveyOperationUsersView) {

		boolean isNew = surveyOperationUsersView.isNew();

		if (!(surveyOperationUsersView instanceof
				SurveyOperationUsersViewModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(surveyOperationUsersView.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					surveyOperationUsersView);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in surveyOperationUsersView proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SurveyOperationUsersView implementation " +
					surveyOperationUsersView.getClass());
		}

		SurveyOperationUsersViewModelImpl surveyOperationUsersViewModelImpl =
			(SurveyOperationUsersViewModelImpl)surveyOperationUsersView;

		Session session = null;

		try {
			session = openSession();

			if (surveyOperationUsersView.isNew()) {
				session.save(surveyOperationUsersView);

				surveyOperationUsersView.setNew(false);
			}
			else {
				surveyOperationUsersView =
					(SurveyOperationUsersView)session.merge(
						surveyOperationUsersView);
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
				surveyOperationUsersViewModelImpl.getRespondenNik()
			};

			finderCache.removeResult(_finderPathCountByRespondenNik, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByRespondenNik, args);

			args = new Object[] {
				surveyOperationUsersViewModelImpl.getRespondenId()
			};

			finderCache.removeResult(_finderPathCountByRespondenId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByRespondenId, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((surveyOperationUsersViewModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByRespondenNik.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					surveyOperationUsersViewModelImpl.getOriginalRespondenNik()
				};

				finderCache.removeResult(_finderPathCountByRespondenNik, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByRespondenNik, args);

				args = new Object[] {
					surveyOperationUsersViewModelImpl.getRespondenNik()
				};

				finderCache.removeResult(_finderPathCountByRespondenNik, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByRespondenNik, args);
			}

			if ((surveyOperationUsersViewModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByRespondenId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					surveyOperationUsersViewModelImpl.getOriginalRespondenId()
				};

				finderCache.removeResult(_finderPathCountByRespondenId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByRespondenId, args);

				args = new Object[] {
					surveyOperationUsersViewModelImpl.getRespondenId()
				};

				finderCache.removeResult(_finderPathCountByRespondenId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByRespondenId, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, SurveyOperationUsersViewImpl.class,
			surveyOperationUsersView.getPrimaryKey(), surveyOperationUsersView,
			false);

		surveyOperationUsersView.resetOriginalValues();

		return surveyOperationUsersView;
	}

	/**
	 * Returns the survey operation users view with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the survey operation users view
	 * @return the survey operation users view
	 * @throws NoSuchSurveyOperationUsersViewException if a survey operation users view with the primary key could not be found
	 */
	@Override
	public SurveyOperationUsersView findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSurveyOperationUsersViewException {

		SurveyOperationUsersView surveyOperationUsersView = fetchByPrimaryKey(
			primaryKey);

		if (surveyOperationUsersView == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSurveyOperationUsersViewException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return surveyOperationUsersView;
	}

	/**
	 * Returns the survey operation users view with the primary key or throws a <code>NoSuchSurveyOperationUsersViewException</code> if it could not be found.
	 *
	 * @param id the primary key of the survey operation users view
	 * @return the survey operation users view
	 * @throws NoSuchSurveyOperationUsersViewException if a survey operation users view with the primary key could not be found
	 */
	@Override
	public SurveyOperationUsersView findByPrimaryKey(long id)
		throws NoSuchSurveyOperationUsersViewException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the survey operation users view with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the survey operation users view
	 * @return the survey operation users view, or <code>null</code> if a survey operation users view with the primary key could not be found
	 */
	@Override
	public SurveyOperationUsersView fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the survey operation users views.
	 *
	 * @return the survey operation users views
	 */
	@Override
	public List<SurveyOperationUsersView> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<SurveyOperationUsersView> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<SurveyOperationUsersView> findAll(
		int start, int end,
		OrderByComparator<SurveyOperationUsersView> orderByComparator,
		boolean useFinderCache) {

		return findAll(start, end, orderByComparator);
	}

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
	@Override
	public List<SurveyOperationUsersView> findAll(
		int start, int end,
		OrderByComparator<SurveyOperationUsersView> orderByComparator) {

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

		List<SurveyOperationUsersView> list =
			(List<SurveyOperationUsersView>)finderCache.getResult(
				finderPath, finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SURVEYOPERATIONUSERSVIEW);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SURVEYOPERATIONUSERSVIEW;

				if (pagination) {
					sql = sql.concat(
						SurveyOperationUsersViewModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SurveyOperationUsersView>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<SurveyOperationUsersView>)QueryUtil.list(
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
	 * Removes all the survey operation users views from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SurveyOperationUsersView surveyOperationUsersView : findAll()) {
			remove(surveyOperationUsersView);
		}
	}

	/**
	 * Returns the number of survey operation users views.
	 *
	 * @return the number of survey operation users views
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(
					_SQL_COUNT_SURVEYOPERATIONUSERSVIEW);

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
		return _SQL_SELECT_SURVEYOPERATIONUSERSVIEW;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SurveyOperationUsersViewModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the survey operation users view persistence.
	 */
	@Activate
	public void activate() {
		SurveyOperationUsersViewModelImpl.setEntityCacheEnabled(
			entityCacheEnabled);
		SurveyOperationUsersViewModelImpl.setFinderCacheEnabled(
			finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SurveyOperationUsersViewImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SurveyOperationUsersViewImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByRespondenNik = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SurveyOperationUsersViewImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRespondenNik",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByRespondenNik = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SurveyOperationUsersViewImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRespondenNik",
			new String[] {String.class.getName()},
			SurveyOperationUsersViewModelImpl.RESPONDENNIK_COLUMN_BITMASK);

		_finderPathCountByRespondenNik = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRespondenNik",
			new String[] {String.class.getName()});

		_finderPathWithPaginationFindByRespondenId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SurveyOperationUsersViewImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRespondenId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByRespondenId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled,
			SurveyOperationUsersViewImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRespondenId",
			new String[] {Long.class.getName()},
			SurveyOperationUsersViewModelImpl.RESPONDENID_COLUMN_BITMASK);

		_finderPathCountByRespondenId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRespondenId",
			new String[] {Long.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(SurveyOperationUsersViewImpl.class.getName());
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
				"value.object.column.bitmask.enabled.com.btpn.opera.operationsurvey.model.SurveyOperationUsersView"),
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

	private static final String _SQL_SELECT_SURVEYOPERATIONUSERSVIEW =
		"SELECT surveyOperationUsersView FROM SurveyOperationUsersView surveyOperationUsersView";

	private static final String _SQL_SELECT_SURVEYOPERATIONUSERSVIEW_WHERE =
		"SELECT surveyOperationUsersView FROM SurveyOperationUsersView surveyOperationUsersView WHERE ";

	private static final String _SQL_COUNT_SURVEYOPERATIONUSERSVIEW =
		"SELECT COUNT(surveyOperationUsersView) FROM SurveyOperationUsersView surveyOperationUsersView";

	private static final String _SQL_COUNT_SURVEYOPERATIONUSERSVIEW_WHERE =
		"SELECT COUNT(surveyOperationUsersView) FROM SurveyOperationUsersView surveyOperationUsersView WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"surveyOperationUsersView.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SurveyOperationUsersView exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SurveyOperationUsersView exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SurveyOperationUsersViewPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {
			"surveyObject", "startDate", "endDate", "respondenId",
			"respondenNik", "submittedDate"
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