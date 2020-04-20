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

package com.btpn.opera.operationsurvey.service;

import com.btpn.opera.operationsurvey.model.SurveyOperation;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the remote service interface for SurveyOperation. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface SurveyOperationService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SurveyOperationServiceUtil} to access the survey operation remote service. Add custom service methods to <code>com.btpn.opera.operationsurvey.service.impl.SurveyOperationServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public SurveyOperation addSurveyOperation(
			long userId, String title, String description, long surveyObjectId,
			Date startdate, Date endDate, ServiceContext serviceContext)
		throws PortalException;

	public void deleteAllSurveyOperation();

	public void deleteSurveyOperationAfterEndDate() throws PortalException;

	public SurveyOperation deleteSurveyOperationById(long id)
		throws PortalException;

	public SurveyOperation editSurveyOperation(
			long userId, long id, String title, String description,
			long surveyObjectId, Date startDate, Date endDate,
			ServiceContext serviceContext)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SurveyOperation> getAllSurveyOperation();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SurveyOperation> getAllSurveyOperationMapping();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SurveyOperation> getAllSurveyOperationPaging(
		int startPage, int endPage);

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SurveyOperation> getSurveyOperationBeforeEndDate();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public SurveyOperation getSurveyOperationById(long id)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SurveyOperation> getSurveyOperationByTitle(String title);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SurveyOperation> getSurveyOperationByTitlePaging(
		String title, int startPage, int endPage);

}