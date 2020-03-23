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

package responden.service.persistence.impl;

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

import org.osgi.annotation.versioning.ProviderType;

import responden.exception.NoSuchSurveyRespondenException;

import responden.model.SurveyResponden;
import responden.model.impl.SurveyRespondenImpl;
import responden.model.impl.SurveyRespondenModelImpl;

import responden.service.persistence.SurveyRespondenPersistence;

/**
 * The persistence implementation for the survey responden service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class SurveyRespondenPersistenceImpl
	extends BasePersistenceImpl<SurveyResponden>
	implements SurveyRespondenPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SurveyRespondenUtil</code> to access the survey responden persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SurveyRespondenImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByNIK;
	private FinderPath _finderPathWithoutPaginationFindByNIK;
	private FinderPath _finderPathCountByNIK;

	/**
	 * Returns all the survey respondens where nik = &#63;.
	 *
	 * @param nik the nik
	 * @return the matching survey respondens
	 */
	@Override
	public List<SurveyResponden> findByNIK(String nik) {
		return findByNIK(nik, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<SurveyResponden> findByNIK(String nik, int start, int end) {
		return findByNIK(nik, start, end, null);
	}

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
	@Override
	public List<SurveyResponden> findByNIK(
		String nik, int start, int end,
		OrderByComparator<SurveyResponden> orderByComparator,
		boolean useFinderCache) {

		return findByNIK(nik, start, end, orderByComparator);
	}

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
	@Override
	public List<SurveyResponden> findByNIK(
		String nik, int start, int end,
		OrderByComparator<SurveyResponden> orderByComparator) {

		nik = Objects.toString(nik, "");

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindByNIK;
			finderArgs = new Object[] {nik};
		}
		else {
			finderPath = _finderPathWithPaginationFindByNIK;
			finderArgs = new Object[] {nik, start, end, orderByComparator};
		}

		List<SurveyResponden> list =
			(List<SurveyResponden>)finderCache.getResult(
				finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SurveyResponden surveyResponden : list) {
				if (!nik.equals(surveyResponden.getNik())) {
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

			query.append(_SQL_SELECT_SURVEYRESPONDEN_WHERE);

			boolean bindNik = false;

			if (nik.isEmpty()) {
				query.append(_FINDER_COLUMN_NIK_NIK_3);
			}
			else {
				bindNik = true;

				query.append(_FINDER_COLUMN_NIK_NIK_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
				query.append(SurveyRespondenModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindNik) {
					qPos.add(nik);
				}

				if (!pagination) {
					list = (List<SurveyResponden>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<SurveyResponden>)QueryUtil.list(
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
	 * Returns the first survey responden in the ordered set where nik = &#63;.
	 *
	 * @param nik the nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey responden
	 * @throws NoSuchSurveyRespondenException if a matching survey responden could not be found
	 */
	@Override
	public SurveyResponden findByNIK_First(
			String nik, OrderByComparator<SurveyResponden> orderByComparator)
		throws NoSuchSurveyRespondenException {

		SurveyResponden surveyResponden = fetchByNIK_First(
			nik, orderByComparator);

		if (surveyResponden != null) {
			return surveyResponden;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nik=");
		msg.append(nik);

		msg.append("}");

		throw new NoSuchSurveyRespondenException(msg.toString());
	}

	/**
	 * Returns the first survey responden in the ordered set where nik = &#63;.
	 *
	 * @param nik the nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey responden, or <code>null</code> if a matching survey responden could not be found
	 */
	@Override
	public SurveyResponden fetchByNIK_First(
		String nik, OrderByComparator<SurveyResponden> orderByComparator) {

		List<SurveyResponden> list = findByNIK(nik, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last survey responden in the ordered set where nik = &#63;.
	 *
	 * @param nik the nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey responden
	 * @throws NoSuchSurveyRespondenException if a matching survey responden could not be found
	 */
	@Override
	public SurveyResponden findByNIK_Last(
			String nik, OrderByComparator<SurveyResponden> orderByComparator)
		throws NoSuchSurveyRespondenException {

		SurveyResponden surveyResponden = fetchByNIK_Last(
			nik, orderByComparator);

		if (surveyResponden != null) {
			return surveyResponden;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nik=");
		msg.append(nik);

		msg.append("}");

		throw new NoSuchSurveyRespondenException(msg.toString());
	}

	/**
	 * Returns the last survey responden in the ordered set where nik = &#63;.
	 *
	 * @param nik the nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey responden, or <code>null</code> if a matching survey responden could not be found
	 */
	@Override
	public SurveyResponden fetchByNIK_Last(
		String nik, OrderByComparator<SurveyResponden> orderByComparator) {

		int count = countByNIK(nik);

		if (count == 0) {
			return null;
		}

		List<SurveyResponden> list = findByNIK(
			nik, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the survey respondens before and after the current survey responden in the ordered set where nik = &#63;.
	 *
	 * @param id the primary key of the current survey responden
	 * @param nik the nik
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next survey responden
	 * @throws NoSuchSurveyRespondenException if a survey responden with the primary key could not be found
	 */
	@Override
	public SurveyResponden[] findByNIK_PrevAndNext(
			long id, String nik,
			OrderByComparator<SurveyResponden> orderByComparator)
		throws NoSuchSurveyRespondenException {

		nik = Objects.toString(nik, "");

		SurveyResponden surveyResponden = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SurveyResponden[] array = new SurveyRespondenImpl[3];

			array[0] = getByNIK_PrevAndNext(
				session, surveyResponden, nik, orderByComparator, true);

			array[1] = surveyResponden;

			array[2] = getByNIK_PrevAndNext(
				session, surveyResponden, nik, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SurveyResponden getByNIK_PrevAndNext(
		Session session, SurveyResponden surveyResponden, String nik,
		OrderByComparator<SurveyResponden> orderByComparator,
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

		query.append(_SQL_SELECT_SURVEYRESPONDEN_WHERE);

		boolean bindNik = false;

		if (nik.isEmpty()) {
			query.append(_FINDER_COLUMN_NIK_NIK_3);
		}
		else {
			bindNik = true;

			query.append(_FINDER_COLUMN_NIK_NIK_2);
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
			query.append(SurveyRespondenModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindNik) {
			qPos.add(nik);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						surveyResponden)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<SurveyResponden> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the survey respondens where nik = &#63; from the database.
	 *
	 * @param nik the nik
	 */
	@Override
	public void removeByNIK(String nik) {
		for (SurveyResponden surveyResponden :
				findByNIK(nik, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(surveyResponden);
		}
	}

	/**
	 * Returns the number of survey respondens where nik = &#63;.
	 *
	 * @param nik the nik
	 * @return the number of matching survey respondens
	 */
	@Override
	public int countByNIK(String nik) {
		nik = Objects.toString(nik, "");

		FinderPath finderPath = _finderPathCountByNIK;

		Object[] finderArgs = new Object[] {nik};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SURVEYRESPONDEN_WHERE);

			boolean bindNik = false;

			if (nik.isEmpty()) {
				query.append(_FINDER_COLUMN_NIK_NIK_3);
			}
			else {
				bindNik = true;

				query.append(_FINDER_COLUMN_NIK_NIK_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindNik) {
					qPos.add(nik);
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

	private static final String _FINDER_COLUMN_NIK_NIK_2 =
		"surveyResponden.nik = ?";

	private static final String _FINDER_COLUMN_NIK_NIK_3 =
		"(surveyResponden.nik IS NULL OR surveyResponden.nik = '')";

	private FinderPath _finderPathWithPaginationFindBySurveyId;
	private FinderPath _finderPathWithoutPaginationFindBySurveyId;
	private FinderPath _finderPathCountBySurveyId;

	/**
	 * Returns all the survey respondens where surveyId = &#63;.
	 *
	 * @param surveyId the survey ID
	 * @return the matching survey respondens
	 */
	@Override
	public List<SurveyResponden> findBySurveyId(long surveyId) {
		return findBySurveyId(
			surveyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<SurveyResponden> findBySurveyId(
		long surveyId, int start, int end) {

		return findBySurveyId(surveyId, start, end, null);
	}

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
	@Override
	public List<SurveyResponden> findBySurveyId(
		long surveyId, int start, int end,
		OrderByComparator<SurveyResponden> orderByComparator,
		boolean useFinderCache) {

		return findBySurveyId(surveyId, start, end, orderByComparator);
	}

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
	@Override
	public List<SurveyResponden> findBySurveyId(
		long surveyId, int start, int end,
		OrderByComparator<SurveyResponden> orderByComparator) {

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindBySurveyId;
			finderArgs = new Object[] {surveyId};
		}
		else {
			finderPath = _finderPathWithPaginationFindBySurveyId;
			finderArgs = new Object[] {surveyId, start, end, orderByComparator};
		}

		List<SurveyResponden> list =
			(List<SurveyResponden>)finderCache.getResult(
				finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SurveyResponden surveyResponden : list) {
				if ((surveyId != surveyResponden.getSurveyId())) {
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

			query.append(_SQL_SELECT_SURVEYRESPONDEN_WHERE);

			query.append(_FINDER_COLUMN_SURVEYID_SURVEYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
				query.append(SurveyRespondenModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(surveyId);

				if (!pagination) {
					list = (List<SurveyResponden>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<SurveyResponden>)QueryUtil.list(
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
	 * Returns the first survey responden in the ordered set where surveyId = &#63;.
	 *
	 * @param surveyId the survey ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey responden
	 * @throws NoSuchSurveyRespondenException if a matching survey responden could not be found
	 */
	@Override
	public SurveyResponden findBySurveyId_First(
			long surveyId, OrderByComparator<SurveyResponden> orderByComparator)
		throws NoSuchSurveyRespondenException {

		SurveyResponden surveyResponden = fetchBySurveyId_First(
			surveyId, orderByComparator);

		if (surveyResponden != null) {
			return surveyResponden;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("surveyId=");
		msg.append(surveyId);

		msg.append("}");

		throw new NoSuchSurveyRespondenException(msg.toString());
	}

	/**
	 * Returns the first survey responden in the ordered set where surveyId = &#63;.
	 *
	 * @param surveyId the survey ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey responden, or <code>null</code> if a matching survey responden could not be found
	 */
	@Override
	public SurveyResponden fetchBySurveyId_First(
		long surveyId, OrderByComparator<SurveyResponden> orderByComparator) {

		List<SurveyResponden> list = findBySurveyId(
			surveyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last survey responden in the ordered set where surveyId = &#63;.
	 *
	 * @param surveyId the survey ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey responden
	 * @throws NoSuchSurveyRespondenException if a matching survey responden could not be found
	 */
	@Override
	public SurveyResponden findBySurveyId_Last(
			long surveyId, OrderByComparator<SurveyResponden> orderByComparator)
		throws NoSuchSurveyRespondenException {

		SurveyResponden surveyResponden = fetchBySurveyId_Last(
			surveyId, orderByComparator);

		if (surveyResponden != null) {
			return surveyResponden;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("surveyId=");
		msg.append(surveyId);

		msg.append("}");

		throw new NoSuchSurveyRespondenException(msg.toString());
	}

	/**
	 * Returns the last survey responden in the ordered set where surveyId = &#63;.
	 *
	 * @param surveyId the survey ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey responden, or <code>null</code> if a matching survey responden could not be found
	 */
	@Override
	public SurveyResponden fetchBySurveyId_Last(
		long surveyId, OrderByComparator<SurveyResponden> orderByComparator) {

		int count = countBySurveyId(surveyId);

		if (count == 0) {
			return null;
		}

		List<SurveyResponden> list = findBySurveyId(
			surveyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the survey respondens before and after the current survey responden in the ordered set where surveyId = &#63;.
	 *
	 * @param id the primary key of the current survey responden
	 * @param surveyId the survey ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next survey responden
	 * @throws NoSuchSurveyRespondenException if a survey responden with the primary key could not be found
	 */
	@Override
	public SurveyResponden[] findBySurveyId_PrevAndNext(
			long id, long surveyId,
			OrderByComparator<SurveyResponden> orderByComparator)
		throws NoSuchSurveyRespondenException {

		SurveyResponden surveyResponden = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SurveyResponden[] array = new SurveyRespondenImpl[3];

			array[0] = getBySurveyId_PrevAndNext(
				session, surveyResponden, surveyId, orderByComparator, true);

			array[1] = surveyResponden;

			array[2] = getBySurveyId_PrevAndNext(
				session, surveyResponden, surveyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SurveyResponden getBySurveyId_PrevAndNext(
		Session session, SurveyResponden surveyResponden, long surveyId,
		OrderByComparator<SurveyResponden> orderByComparator,
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

		query.append(_SQL_SELECT_SURVEYRESPONDEN_WHERE);

		query.append(_FINDER_COLUMN_SURVEYID_SURVEYID_2);

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
			query.append(SurveyRespondenModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(surveyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						surveyResponden)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<SurveyResponden> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the survey respondens where surveyId = &#63; from the database.
	 *
	 * @param surveyId the survey ID
	 */
	@Override
	public void removeBySurveyId(long surveyId) {
		for (SurveyResponden surveyResponden :
				findBySurveyId(
					surveyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(surveyResponden);
		}
	}

	/**
	 * Returns the number of survey respondens where surveyId = &#63;.
	 *
	 * @param surveyId the survey ID
	 * @return the number of matching survey respondens
	 */
	@Override
	public int countBySurveyId(long surveyId) {
		FinderPath finderPath = _finderPathCountBySurveyId;

		Object[] finderArgs = new Object[] {surveyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SURVEYRESPONDEN_WHERE);

			query.append(_FINDER_COLUMN_SURVEYID_SURVEYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(surveyId);

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

	private static final String _FINDER_COLUMN_SURVEYID_SURVEYID_2 =
		"surveyResponden.surveyId = ?";

	public SurveyRespondenPersistenceImpl() {
		setModelClass(SurveyResponden.class);

		setModelImplClass(SurveyRespondenImpl.class);
		setModelPKClass(long.class);
		setEntityCacheEnabled(SurveyRespondenModelImpl.ENTITY_CACHE_ENABLED);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("surveyId", "survey_id");
		dbColumnNames.put("submittedDate", "submitted_date");

		setDBColumnNames(dbColumnNames);
	}

	/**
	 * Caches the survey responden in the entity cache if it is enabled.
	 *
	 * @param surveyResponden the survey responden
	 */
	@Override
	public void cacheResult(SurveyResponden surveyResponden) {
		entityCache.putResult(
			SurveyRespondenModelImpl.ENTITY_CACHE_ENABLED,
			SurveyRespondenImpl.class, surveyResponden.getPrimaryKey(),
			surveyResponden);

		surveyResponden.resetOriginalValues();
	}

	/**
	 * Caches the survey respondens in the entity cache if it is enabled.
	 *
	 * @param surveyRespondens the survey respondens
	 */
	@Override
	public void cacheResult(List<SurveyResponden> surveyRespondens) {
		for (SurveyResponden surveyResponden : surveyRespondens) {
			if (entityCache.getResult(
					SurveyRespondenModelImpl.ENTITY_CACHE_ENABLED,
					SurveyRespondenImpl.class,
					surveyResponden.getPrimaryKey()) == null) {

				cacheResult(surveyResponden);
			}
			else {
				surveyResponden.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all survey respondens.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SurveyRespondenImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the survey responden.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SurveyResponden surveyResponden) {
		entityCache.removeResult(
			SurveyRespondenModelImpl.ENTITY_CACHE_ENABLED,
			SurveyRespondenImpl.class, surveyResponden.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SurveyResponden> surveyRespondens) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SurveyResponden surveyResponden : surveyRespondens) {
			entityCache.removeResult(
				SurveyRespondenModelImpl.ENTITY_CACHE_ENABLED,
				SurveyRespondenImpl.class, surveyResponden.getPrimaryKey());
		}
	}

	/**
	 * Creates a new survey responden with the primary key. Does not add the survey responden to the database.
	 *
	 * @param id the primary key for the new survey responden
	 * @return the new survey responden
	 */
	@Override
	public SurveyResponden create(long id) {
		SurveyResponden surveyResponden = new SurveyRespondenImpl();

		surveyResponden.setNew(true);
		surveyResponden.setPrimaryKey(id);

		return surveyResponden;
	}

	/**
	 * Removes the survey responden with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the survey responden
	 * @return the survey responden that was removed
	 * @throws NoSuchSurveyRespondenException if a survey responden with the primary key could not be found
	 */
	@Override
	public SurveyResponden remove(long id)
		throws NoSuchSurveyRespondenException {

		return remove((Serializable)id);
	}

	/**
	 * Removes the survey responden with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the survey responden
	 * @return the survey responden that was removed
	 * @throws NoSuchSurveyRespondenException if a survey responden with the primary key could not be found
	 */
	@Override
	public SurveyResponden remove(Serializable primaryKey)
		throws NoSuchSurveyRespondenException {

		Session session = null;

		try {
			session = openSession();

			SurveyResponden surveyResponden = (SurveyResponden)session.get(
				SurveyRespondenImpl.class, primaryKey);

			if (surveyResponden == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSurveyRespondenException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(surveyResponden);
		}
		catch (NoSuchSurveyRespondenException nsee) {
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
	protected SurveyResponden removeImpl(SurveyResponden surveyResponden) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(surveyResponden)) {
				surveyResponden = (SurveyResponden)session.get(
					SurveyRespondenImpl.class,
					surveyResponden.getPrimaryKeyObj());
			}

			if (surveyResponden != null) {
				session.delete(surveyResponden);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (surveyResponden != null) {
			clearCache(surveyResponden);
		}

		return surveyResponden;
	}

	@Override
	public SurveyResponden updateImpl(SurveyResponden surveyResponden) {
		boolean isNew = surveyResponden.isNew();

		if (!(surveyResponden instanceof SurveyRespondenModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(surveyResponden.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					surveyResponden);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in surveyResponden proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SurveyResponden implementation " +
					surveyResponden.getClass());
		}

		SurveyRespondenModelImpl surveyRespondenModelImpl =
			(SurveyRespondenModelImpl)surveyResponden;

		Session session = null;

		try {
			session = openSession();

			if (surveyResponden.isNew()) {
				session.save(surveyResponden);

				surveyResponden.setNew(false);
			}
			else {
				surveyResponden = (SurveyResponden)session.merge(
					surveyResponden);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!SurveyRespondenModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {surveyRespondenModelImpl.getNik()};

			finderCache.removeResult(_finderPathCountByNIK, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByNIK, args);

			args = new Object[] {surveyRespondenModelImpl.getSurveyId()};

			finderCache.removeResult(_finderPathCountBySurveyId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindBySurveyId, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((surveyRespondenModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByNIK.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					surveyRespondenModelImpl.getOriginalNik()
				};

				finderCache.removeResult(_finderPathCountByNIK, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByNIK, args);

				args = new Object[] {surveyRespondenModelImpl.getNik()};

				finderCache.removeResult(_finderPathCountByNIK, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByNIK, args);
			}

			if ((surveyRespondenModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindBySurveyId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					surveyRespondenModelImpl.getOriginalSurveyId()
				};

				finderCache.removeResult(_finderPathCountBySurveyId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindBySurveyId, args);

				args = new Object[] {surveyRespondenModelImpl.getSurveyId()};

				finderCache.removeResult(_finderPathCountBySurveyId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindBySurveyId, args);
			}
		}

		entityCache.putResult(
			SurveyRespondenModelImpl.ENTITY_CACHE_ENABLED,
			SurveyRespondenImpl.class, surveyResponden.getPrimaryKey(),
			surveyResponden, false);

		surveyResponden.resetOriginalValues();

		return surveyResponden;
	}

	/**
	 * Returns the survey responden with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the survey responden
	 * @return the survey responden
	 * @throws NoSuchSurveyRespondenException if a survey responden with the primary key could not be found
	 */
	@Override
	public SurveyResponden findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSurveyRespondenException {

		SurveyResponden surveyResponden = fetchByPrimaryKey(primaryKey);

		if (surveyResponden == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSurveyRespondenException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return surveyResponden;
	}

	/**
	 * Returns the survey responden with the primary key or throws a <code>NoSuchSurveyRespondenException</code> if it could not be found.
	 *
	 * @param id the primary key of the survey responden
	 * @return the survey responden
	 * @throws NoSuchSurveyRespondenException if a survey responden with the primary key could not be found
	 */
	@Override
	public SurveyResponden findByPrimaryKey(long id)
		throws NoSuchSurveyRespondenException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the survey responden with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the survey responden
	 * @return the survey responden, or <code>null</code> if a survey responden with the primary key could not be found
	 */
	@Override
	public SurveyResponden fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the survey respondens.
	 *
	 * @return the survey respondens
	 */
	@Override
	public List<SurveyResponden> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<SurveyResponden> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<SurveyResponden> findAll(
		int start, int end,
		OrderByComparator<SurveyResponden> orderByComparator,
		boolean useFinderCache) {

		return findAll(start, end, orderByComparator);
	}

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
	@Override
	public List<SurveyResponden> findAll(
		int start, int end,
		OrderByComparator<SurveyResponden> orderByComparator) {

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

		List<SurveyResponden> list =
			(List<SurveyResponden>)finderCache.getResult(
				finderPath, finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SURVEYRESPONDEN);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SURVEYRESPONDEN;

				if (pagination) {
					sql = sql.concat(SurveyRespondenModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SurveyResponden>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<SurveyResponden>)QueryUtil.list(
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
	 * Removes all the survey respondens from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SurveyResponden surveyResponden : findAll()) {
			remove(surveyResponden);
		}
	}

	/**
	 * Returns the number of survey respondens.
	 *
	 * @return the number of survey respondens
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SURVEYRESPONDEN);

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
		return _SQL_SELECT_SURVEYRESPONDEN;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SurveyRespondenModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the survey responden persistence.
	 */
	public void afterPropertiesSet() {
		_finderPathWithPaginationFindAll = new FinderPath(
			SurveyRespondenModelImpl.ENTITY_CACHE_ENABLED,
			SurveyRespondenModelImpl.FINDER_CACHE_ENABLED,
			SurveyRespondenImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			SurveyRespondenModelImpl.ENTITY_CACHE_ENABLED,
			SurveyRespondenModelImpl.FINDER_CACHE_ENABLED,
			SurveyRespondenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			SurveyRespondenModelImpl.ENTITY_CACHE_ENABLED,
			SurveyRespondenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByNIK = new FinderPath(
			SurveyRespondenModelImpl.ENTITY_CACHE_ENABLED,
			SurveyRespondenModelImpl.FINDER_CACHE_ENABLED,
			SurveyRespondenImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByNIK",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByNIK = new FinderPath(
			SurveyRespondenModelImpl.ENTITY_CACHE_ENABLED,
			SurveyRespondenModelImpl.FINDER_CACHE_ENABLED,
			SurveyRespondenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNIK",
			new String[] {String.class.getName()},
			SurveyRespondenModelImpl.NIK_COLUMN_BITMASK);

		_finderPathCountByNIK = new FinderPath(
			SurveyRespondenModelImpl.ENTITY_CACHE_ENABLED,
			SurveyRespondenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNIK",
			new String[] {String.class.getName()});

		_finderPathWithPaginationFindBySurveyId = new FinderPath(
			SurveyRespondenModelImpl.ENTITY_CACHE_ENABLED,
			SurveyRespondenModelImpl.FINDER_CACHE_ENABLED,
			SurveyRespondenImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySurveyId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindBySurveyId = new FinderPath(
			SurveyRespondenModelImpl.ENTITY_CACHE_ENABLED,
			SurveyRespondenModelImpl.FINDER_CACHE_ENABLED,
			SurveyRespondenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySurveyId",
			new String[] {Long.class.getName()},
			SurveyRespondenModelImpl.SURVEYID_COLUMN_BITMASK);

		_finderPathCountBySurveyId = new FinderPath(
			SurveyRespondenModelImpl.ENTITY_CACHE_ENABLED,
			SurveyRespondenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySurveyId",
			new String[] {Long.class.getName()});
	}

	public void destroy() {
		entityCache.removeCache(SurveyRespondenImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SURVEYRESPONDEN =
		"SELECT surveyResponden FROM SurveyResponden surveyResponden";

	private static final String _SQL_SELECT_SURVEYRESPONDEN_WHERE =
		"SELECT surveyResponden FROM SurveyResponden surveyResponden WHERE ";

	private static final String _SQL_COUNT_SURVEYRESPONDEN =
		"SELECT COUNT(surveyResponden) FROM SurveyResponden surveyResponden";

	private static final String _SQL_COUNT_SURVEYRESPONDEN_WHERE =
		"SELECT COUNT(surveyResponden) FROM SurveyResponden surveyResponden WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "surveyResponden.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SurveyResponden exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SurveyResponden exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SurveyRespondenPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"surveyId", "submittedDate"});

}