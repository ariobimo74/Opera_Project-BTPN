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

import operation.exception.NoSuchSurveyObjectException;

import operation.model.SurveyObject;
import operation.model.impl.SurveyObjectImpl;
import operation.model.impl.SurveyObjectModelImpl;

import operation.service.persistence.SurveyObjectPersistence;
import operation.service.persistence.impl.constants.SurveyOperationPersistenceConstants;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the survey object service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SurveyObjectPersistence.class)
@ProviderType
public class SurveyObjectPersistenceImpl
	extends BasePersistenceImpl<SurveyObject>
	implements SurveyObjectPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SurveyObjectUtil</code> to access the survey object persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SurveyObjectImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByObjectName;
	private FinderPath _finderPathWithoutPaginationFindByObjectName;
	private FinderPath _finderPathCountByObjectName;

	/**
	 * Returns all the survey objects where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching survey objects
	 */
	@Override
	public List<SurveyObject> findByObjectName(String name) {
		return findByObjectName(
			name, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the survey objects where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyObjectModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of survey objects
	 * @param end the upper bound of the range of survey objects (not inclusive)
	 * @return the range of matching survey objects
	 */
	@Override
	public List<SurveyObject> findByObjectName(
		String name, int start, int end) {

		return findByObjectName(name, start, end, null);
	}

	/**
	 * Returns an ordered range of all the survey objects where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyObjectModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByObjectName(String, int, int, OrderByComparator)}
	 * @param name the name
	 * @param start the lower bound of the range of survey objects
	 * @param end the upper bound of the range of survey objects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching survey objects
	 */
	@Deprecated
	@Override
	public List<SurveyObject> findByObjectName(
		String name, int start, int end,
		OrderByComparator<SurveyObject> orderByComparator,
		boolean useFinderCache) {

		return findByObjectName(name, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the survey objects where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyObjectModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of survey objects
	 * @param end the upper bound of the range of survey objects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching survey objects
	 */
	@Override
	public List<SurveyObject> findByObjectName(
		String name, int start, int end,
		OrderByComparator<SurveyObject> orderByComparator) {

		name = Objects.toString(name, "");

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindByObjectName;
			finderArgs = new Object[] {name};
		}
		else {
			finderPath = _finderPathWithPaginationFindByObjectName;
			finderArgs = new Object[] {name, start, end, orderByComparator};
		}

		List<SurveyObject> list = (List<SurveyObject>)finderCache.getResult(
			finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SurveyObject surveyObject : list) {
				if (!name.equals(surveyObject.getName())) {
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

			query.append(_SQL_SELECT_SURVEYOBJECT_WHERE);

			boolean bindName = false;

			if (name.isEmpty()) {
				query.append(_FINDER_COLUMN_OBJECTNAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_OBJECTNAME_NAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
				query.append(SurveyObjectModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindName) {
					qPos.add(name);
				}

				if (!pagination) {
					list = (List<SurveyObject>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<SurveyObject>)QueryUtil.list(
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
	 * Returns the first survey object in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey object
	 * @throws NoSuchSurveyObjectException if a matching survey object could not be found
	 */
	@Override
	public SurveyObject findByObjectName_First(
			String name, OrderByComparator<SurveyObject> orderByComparator)
		throws NoSuchSurveyObjectException {

		SurveyObject surveyObject = fetchByObjectName_First(
			name, orderByComparator);

		if (surveyObject != null) {
			return surveyObject;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append("}");

		throw new NoSuchSurveyObjectException(msg.toString());
	}

	/**
	 * Returns the first survey object in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching survey object, or <code>null</code> if a matching survey object could not be found
	 */
	@Override
	public SurveyObject fetchByObjectName_First(
		String name, OrderByComparator<SurveyObject> orderByComparator) {

		List<SurveyObject> list = findByObjectName(
			name, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last survey object in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey object
	 * @throws NoSuchSurveyObjectException if a matching survey object could not be found
	 */
	@Override
	public SurveyObject findByObjectName_Last(
			String name, OrderByComparator<SurveyObject> orderByComparator)
		throws NoSuchSurveyObjectException {

		SurveyObject surveyObject = fetchByObjectName_Last(
			name, orderByComparator);

		if (surveyObject != null) {
			return surveyObject;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append("}");

		throw new NoSuchSurveyObjectException(msg.toString());
	}

	/**
	 * Returns the last survey object in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching survey object, or <code>null</code> if a matching survey object could not be found
	 */
	@Override
	public SurveyObject fetchByObjectName_Last(
		String name, OrderByComparator<SurveyObject> orderByComparator) {

		int count = countByObjectName(name);

		if (count == 0) {
			return null;
		}

		List<SurveyObject> list = findByObjectName(
			name, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the survey objects before and after the current survey object in the ordered set where name = &#63;.
	 *
	 * @param id the primary key of the current survey object
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next survey object
	 * @throws NoSuchSurveyObjectException if a survey object with the primary key could not be found
	 */
	@Override
	public SurveyObject[] findByObjectName_PrevAndNext(
			long id, String name,
			OrderByComparator<SurveyObject> orderByComparator)
		throws NoSuchSurveyObjectException {

		name = Objects.toString(name, "");

		SurveyObject surveyObject = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			SurveyObject[] array = new SurveyObjectImpl[3];

			array[0] = getByObjectName_PrevAndNext(
				session, surveyObject, name, orderByComparator, true);

			array[1] = surveyObject;

			array[2] = getByObjectName_PrevAndNext(
				session, surveyObject, name, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SurveyObject getByObjectName_PrevAndNext(
		Session session, SurveyObject surveyObject, String name,
		OrderByComparator<SurveyObject> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SURVEYOBJECT_WHERE);

		boolean bindName = false;

		if (name.isEmpty()) {
			query.append(_FINDER_COLUMN_OBJECTNAME_NAME_3);
		}
		else {
			bindName = true;

			query.append(_FINDER_COLUMN_OBJECTNAME_NAME_2);
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
			query.append(SurveyObjectModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindName) {
			qPos.add(name);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(surveyObject)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<SurveyObject> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the survey objects where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	@Override
	public void removeByObjectName(String name) {
		for (SurveyObject surveyObject :
				findByObjectName(
					name, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(surveyObject);
		}
	}

	/**
	 * Returns the number of survey objects where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching survey objects
	 */
	@Override
	public int countByObjectName(String name) {
		name = Objects.toString(name, "");

		FinderPath finderPath = _finderPathCountByObjectName;

		Object[] finderArgs = new Object[] {name};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SURVEYOBJECT_WHERE);

			boolean bindName = false;

			if (name.isEmpty()) {
				query.append(_FINDER_COLUMN_OBJECTNAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_OBJECTNAME_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindName) {
					qPos.add(name);
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

	private static final String _FINDER_COLUMN_OBJECTNAME_NAME_2 =
		"surveyObject.name = ?";

	private static final String _FINDER_COLUMN_OBJECTNAME_NAME_3 =
		"(surveyObject.name IS NULL OR surveyObject.name = '')";

	public SurveyObjectPersistenceImpl() {
		setModelClass(SurveyObject.class);

		setModelImplClass(SurveyObjectImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the survey object in the entity cache if it is enabled.
	 *
	 * @param surveyObject the survey object
	 */
	@Override
	public void cacheResult(SurveyObject surveyObject) {
		entityCache.putResult(
			entityCacheEnabled, SurveyObjectImpl.class,
			surveyObject.getPrimaryKey(), surveyObject);

		surveyObject.resetOriginalValues();
	}

	/**
	 * Caches the survey objects in the entity cache if it is enabled.
	 *
	 * @param surveyObjects the survey objects
	 */
	@Override
	public void cacheResult(List<SurveyObject> surveyObjects) {
		for (SurveyObject surveyObject : surveyObjects) {
			if (entityCache.getResult(
					entityCacheEnabled, SurveyObjectImpl.class,
					surveyObject.getPrimaryKey()) == null) {

				cacheResult(surveyObject);
			}
			else {
				surveyObject.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all survey objects.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SurveyObjectImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the survey object.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SurveyObject surveyObject) {
		entityCache.removeResult(
			entityCacheEnabled, SurveyObjectImpl.class,
			surveyObject.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SurveyObject> surveyObjects) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SurveyObject surveyObject : surveyObjects) {
			entityCache.removeResult(
				entityCacheEnabled, SurveyObjectImpl.class,
				surveyObject.getPrimaryKey());
		}
	}

	/**
	 * Creates a new survey object with the primary key. Does not add the survey object to the database.
	 *
	 * @param id the primary key for the new survey object
	 * @return the new survey object
	 */
	@Override
	public SurveyObject create(long id) {
		SurveyObject surveyObject = new SurveyObjectImpl();

		surveyObject.setNew(true);
		surveyObject.setPrimaryKey(id);

		return surveyObject;
	}

	/**
	 * Removes the survey object with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the survey object
	 * @return the survey object that was removed
	 * @throws NoSuchSurveyObjectException if a survey object with the primary key could not be found
	 */
	@Override
	public SurveyObject remove(long id) throws NoSuchSurveyObjectException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the survey object with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the survey object
	 * @return the survey object that was removed
	 * @throws NoSuchSurveyObjectException if a survey object with the primary key could not be found
	 */
	@Override
	public SurveyObject remove(Serializable primaryKey)
		throws NoSuchSurveyObjectException {

		Session session = null;

		try {
			session = openSession();

			SurveyObject surveyObject = (SurveyObject)session.get(
				SurveyObjectImpl.class, primaryKey);

			if (surveyObject == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSurveyObjectException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(surveyObject);
		}
		catch (NoSuchSurveyObjectException nsee) {
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
	protected SurveyObject removeImpl(SurveyObject surveyObject) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(surveyObject)) {
				surveyObject = (SurveyObject)session.get(
					SurveyObjectImpl.class, surveyObject.getPrimaryKeyObj());
			}

			if (surveyObject != null) {
				session.delete(surveyObject);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (surveyObject != null) {
			clearCache(surveyObject);
		}

		return surveyObject;
	}

	@Override
	public SurveyObject updateImpl(SurveyObject surveyObject) {
		boolean isNew = surveyObject.isNew();

		if (!(surveyObject instanceof SurveyObjectModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(surveyObject.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					surveyObject);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in surveyObject proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SurveyObject implementation " +
					surveyObject.getClass());
		}

		SurveyObjectModelImpl surveyObjectModelImpl =
			(SurveyObjectModelImpl)surveyObject;

		Session session = null;

		try {
			session = openSession();

			if (surveyObject.isNew()) {
				session.save(surveyObject);

				surveyObject.setNew(false);
			}
			else {
				surveyObject = (SurveyObject)session.merge(surveyObject);
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
			Object[] args = new Object[] {surveyObjectModelImpl.getName()};

			finderCache.removeResult(_finderPathCountByObjectName, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByObjectName, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((surveyObjectModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByObjectName.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					surveyObjectModelImpl.getOriginalName()
				};

				finderCache.removeResult(_finderPathCountByObjectName, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByObjectName, args);

				args = new Object[] {surveyObjectModelImpl.getName()};

				finderCache.removeResult(_finderPathCountByObjectName, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByObjectName, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, SurveyObjectImpl.class,
			surveyObject.getPrimaryKey(), surveyObject, false);

		surveyObject.resetOriginalValues();

		return surveyObject;
	}

	/**
	 * Returns the survey object with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the survey object
	 * @return the survey object
	 * @throws NoSuchSurveyObjectException if a survey object with the primary key could not be found
	 */
	@Override
	public SurveyObject findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSurveyObjectException {

		SurveyObject surveyObject = fetchByPrimaryKey(primaryKey);

		if (surveyObject == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSurveyObjectException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return surveyObject;
	}

	/**
	 * Returns the survey object with the primary key or throws a <code>NoSuchSurveyObjectException</code> if it could not be found.
	 *
	 * @param id the primary key of the survey object
	 * @return the survey object
	 * @throws NoSuchSurveyObjectException if a survey object with the primary key could not be found
	 */
	@Override
	public SurveyObject findByPrimaryKey(long id)
		throws NoSuchSurveyObjectException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the survey object with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the survey object
	 * @return the survey object, or <code>null</code> if a survey object with the primary key could not be found
	 */
	@Override
	public SurveyObject fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the survey objects.
	 *
	 * @return the survey objects
	 */
	@Override
	public List<SurveyObject> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the survey objects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyObjectModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of survey objects
	 * @param end the upper bound of the range of survey objects (not inclusive)
	 * @return the range of survey objects
	 */
	@Override
	public List<SurveyObject> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the survey objects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyObjectModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of survey objects
	 * @param end the upper bound of the range of survey objects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of survey objects
	 */
	@Deprecated
	@Override
	public List<SurveyObject> findAll(
		int start, int end, OrderByComparator<SurveyObject> orderByComparator,
		boolean useFinderCache) {

		return findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the survey objects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SurveyObjectModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of survey objects
	 * @param end the upper bound of the range of survey objects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of survey objects
	 */
	@Override
	public List<SurveyObject> findAll(
		int start, int end, OrderByComparator<SurveyObject> orderByComparator) {

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

		List<SurveyObject> list = (List<SurveyObject>)finderCache.getResult(
			finderPath, finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SURVEYOBJECT);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SURVEYOBJECT;

				if (pagination) {
					sql = sql.concat(SurveyObjectModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SurveyObject>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<SurveyObject>)QueryUtil.list(
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
	 * Removes all the survey objects from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SurveyObject surveyObject : findAll()) {
			remove(surveyObject);
		}
	}

	/**
	 * Returns the number of survey objects.
	 *
	 * @return the number of survey objects
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SURVEYOBJECT);

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
		return _SQL_SELECT_SURVEYOBJECT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SurveyObjectModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the survey object persistence.
	 */
	@Activate
	public void activate() {
		SurveyObjectModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		SurveyObjectModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SurveyObjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SurveyObjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByObjectName = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SurveyObjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByObjectName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByObjectName = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, SurveyObjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByObjectName",
			new String[] {String.class.getName()},
			SurveyObjectModelImpl.NAME_COLUMN_BITMASK);

		_finderPathCountByObjectName = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByObjectName",
			new String[] {String.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(SurveyObjectImpl.class.getName());
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
				"value.object.column.bitmask.enabled.operation.model.SurveyObject"),
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

	private static final String _SQL_SELECT_SURVEYOBJECT =
		"SELECT surveyObject FROM SurveyObject surveyObject";

	private static final String _SQL_SELECT_SURVEYOBJECT_WHERE =
		"SELECT surveyObject FROM SurveyObject surveyObject WHERE ";

	private static final String _SQL_COUNT_SURVEYOBJECT =
		"SELECT COUNT(surveyObject) FROM SurveyObject surveyObject";

	private static final String _SQL_COUNT_SURVEYOBJECT_WHERE =
		"SELECT COUNT(surveyObject) FROM SurveyObject surveyObject WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "surveyObject.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SurveyObject exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SurveyObject exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SurveyObjectPersistenceImpl.class);

	static {
		try {
			Class.forName(SurveyOperationPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException cnfe) {
			throw new ExceptionInInitializerError(cnfe);
		}
	}

}