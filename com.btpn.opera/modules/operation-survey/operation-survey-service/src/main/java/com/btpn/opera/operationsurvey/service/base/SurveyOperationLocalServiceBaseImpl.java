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

package com.btpn.opera.operationsurvey.service.base;

import com.btpn.opera.operationsurvey.model.SurveyOperation;
import com.btpn.opera.operationsurvey.service.SurveyOperationLocalService;
import com.btpn.opera.operationsurvey.service.persistence.QuestionsFinder;
import com.btpn.opera.operationsurvey.service.persistence.QuestionsPersistence;
import com.btpn.opera.operationsurvey.service.persistence.RespondenPersistence;
import com.btpn.opera.operationsurvey.service.persistence.SurveyObjectPersistence;
import com.btpn.opera.operationsurvey.service.persistence.SurveyOperationFinder;
import com.btpn.opera.operationsurvey.service.persistence.SurveyOperationPersistence;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the survey operation local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.btpn.opera.operationsurvey.service.impl.SurveyOperationLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.btpn.opera.operationsurvey.service.impl.SurveyOperationLocalServiceImpl
 * @generated
 */
@ProviderType
public abstract class SurveyOperationLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements SurveyOperationLocalService, AopService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>SurveyOperationLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.btpn.opera.operationsurvey.service.SurveyOperationLocalServiceUtil</code>.
	 */

	/**
	 * Adds the survey operation to the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyOperation the survey operation
	 * @return the survey operation that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public SurveyOperation addSurveyOperation(SurveyOperation surveyOperation) {
		surveyOperation.setNew(true);

		return surveyOperationPersistence.update(surveyOperation);
	}

	/**
	 * Creates a new survey operation with the primary key. Does not add the survey operation to the database.
	 *
	 * @param id the primary key for the new survey operation
	 * @return the new survey operation
	 */
	@Override
	@Transactional(enabled = false)
	public SurveyOperation createSurveyOperation(long id) {
		return surveyOperationPersistence.create(id);
	}

	/**
	 * Deletes the survey operation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the survey operation
	 * @return the survey operation that was removed
	 * @throws PortalException if a survey operation with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public SurveyOperation deleteSurveyOperation(long id)
		throws PortalException {

		return surveyOperationPersistence.remove(id);
	}

	/**
	 * Deletes the survey operation from the database. Also notifies the appropriate model listeners.
	 *
	 * @param surveyOperation the survey operation
	 * @return the survey operation that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public SurveyOperation deleteSurveyOperation(
		SurveyOperation surveyOperation) {

		return surveyOperationPersistence.remove(surveyOperation);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			SurveyOperation.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return surveyOperationPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.btpn.opera.operationsurvey.model.impl.SurveyOperationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return surveyOperationPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.btpn.opera.operationsurvey.model.impl.SurveyOperationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return surveyOperationPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return surveyOperationPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection) {

		return surveyOperationPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public SurveyOperation fetchSurveyOperation(long id) {
		return surveyOperationPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the survey operation with the primary key.
	 *
	 * @param id the primary key of the survey operation
	 * @return the survey operation
	 * @throws PortalException if a survey operation with the primary key could not be found
	 */
	@Override
	public SurveyOperation getSurveyOperation(long id) throws PortalException {
		return surveyOperationPersistence.findByPrimaryKey(id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(surveyOperationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(SurveyOperation.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			surveyOperationLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(SurveyOperation.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(surveyOperationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(SurveyOperation.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return surveyOperationLocalService.deleteSurveyOperation(
			(SurveyOperation)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return surveyOperationPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the survey operations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.btpn.opera.operationsurvey.model.impl.SurveyOperationModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of survey operations
	 * @param end the upper bound of the range of survey operations (not inclusive)
	 * @return the range of survey operations
	 */
	@Override
	public List<SurveyOperation> getSurveyOperations(int start, int end) {
		return surveyOperationPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of survey operations.
	 *
	 * @return the number of survey operations
	 */
	@Override
	public int getSurveyOperationsCount() {
		return surveyOperationPersistence.countAll();
	}

	/**
	 * Updates the survey operation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param surveyOperation the survey operation
	 * @return the survey operation that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public SurveyOperation updateSurveyOperation(
		SurveyOperation surveyOperation) {

		return surveyOperationPersistence.update(surveyOperation);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			SurveyOperationLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		surveyOperationLocalService = (SurveyOperationLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return SurveyOperationLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return SurveyOperation.class;
	}

	protected String getModelClassName() {
		return SurveyOperation.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = surveyOperationPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@Reference
	protected QuestionsPersistence questionsPersistence;

	@Reference
	protected QuestionsFinder questionsFinder;

	@Reference
	protected RespondenPersistence respondenPersistence;

	@Reference
	protected SurveyObjectPersistence surveyObjectPersistence;

	protected SurveyOperationLocalService surveyOperationLocalService;

	@Reference
	protected SurveyOperationPersistence surveyOperationPersistence;

	@Reference
	protected SurveyOperationFinder surveyOperationFinder;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

}