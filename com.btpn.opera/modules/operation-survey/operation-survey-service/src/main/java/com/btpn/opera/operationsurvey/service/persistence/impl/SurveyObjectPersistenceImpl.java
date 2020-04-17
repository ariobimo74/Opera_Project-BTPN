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

import com.btpn.opera.operationsurvey.exception.NoSuchSurveyObjectException;
import com.btpn.opera.operationsurvey.model.SurveyObject;
import com.btpn.opera.operationsurvey.model.impl.SurveyObjectImpl;
import com.btpn.opera.operationsurvey.model.impl.SurveyObjectModelImpl;
import com.btpn.opera.operationsurvey.service.persistence.SurveyObjectPersistence;
import com.btpn.opera.operationsurvey.service.persistence.impl.constants.OperationSurveyPersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

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

		if (isNew) {
			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
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
		target = OperationSurveyPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.com.btpn.opera.operationsurvey.model.SurveyObject"),
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

	private static final String _SQL_SELECT_SURVEYOBJECT =
		"SELECT surveyObject FROM SurveyObject surveyObject";

	private static final String _SQL_COUNT_SURVEYOBJECT =
		"SELECT COUNT(surveyObject) FROM SurveyObject surveyObject";

	private static final String _ORDER_BY_ENTITY_ALIAS = "surveyObject.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SurveyObject exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		SurveyObjectPersistenceImpl.class);

	static {
		try {
			Class.forName(OperationSurveyPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException cnfe) {
			throw new ExceptionInInitializerError(cnfe);
		}
	}

}