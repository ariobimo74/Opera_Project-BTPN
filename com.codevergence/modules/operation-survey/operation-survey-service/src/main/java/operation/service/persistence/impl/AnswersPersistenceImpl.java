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

import operation.exception.NoSuchAnswersException;

import operation.model.Answers;
import operation.model.impl.AnswersImpl;
import operation.model.impl.AnswersModelImpl;

import operation.service.persistence.AnswersPersistence;
import operation.service.persistence.impl.constants.SurveyOperationPersistenceConstants;

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

	public AnswersPersistenceImpl() {
		setModelClass(Answers.class);

		setModelImplClass(AnswersImpl.class);
		setModelPKClass(long.class);
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

		if (isNew) {
			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
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
		target = SurveyOperationPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.operation.model.Answers"),
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

	private static final String _SQL_SELECT_ANSWERS =
		"SELECT answers FROM Answers answers";

	private static final String _SQL_COUNT_ANSWERS =
		"SELECT COUNT(answers) FROM Answers answers";

	private static final String _ORDER_BY_ENTITY_ALIAS = "answers.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Answers exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		AnswersPersistenceImpl.class);

	static {
		try {
			Class.forName(SurveyOperationPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException cnfe) {
			throw new ExceptionInInitializerError(cnfe);
		}
	}

}