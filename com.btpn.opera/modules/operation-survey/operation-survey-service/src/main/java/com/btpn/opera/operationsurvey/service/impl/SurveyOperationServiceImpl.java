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

package com.btpn.opera.operationsurvey.service.impl;

import com.btpn.opera.operationsurvey.model.SurveyOperation;
import com.btpn.opera.operationsurvey.service.base.SurveyOperationServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the survey operation remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.btpn.opera.operationsurvey.service.SurveyOperationService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=operationsurvey",
		"json.web.service.context.path=SurveyOperation"
	},
	service = AopService.class
)
public class SurveyOperationServiceImpl extends SurveyOperationServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.btpn.opera.operationsurvey.service.SurveyOperationServiceUtil</code> to access the survey operation remote service.
	 */

	public List<SurveyOperation> getAllSurveyOperation()
	{
		return surveyOperationLocalService.getAllSurveyOperation();
	}

	public List<SurveyOperation> getAllSurveyOperationPaging(int startPage, int endPage)
	{
		return surveyOperationLocalService.getAllSurveyOperationPaging(startPage, endPage);
	}

	public SurveyOperation getSurveyOperationById(long id) throws PortalException
	{
		return surveyOperationLocalService.getSurveyOperationById(id);
	}

	public SurveyOperation addSurveyOperation(long userId, String title, String description, long surveyObjectId, Date startdate, Date endDate, ServiceContext serviceContext) throws PortalException
	{
		return surveyOperationLocalService.addSurveyOperation(userId, title, description, surveyObjectId, startdate, endDate, serviceContext);
	}

	public SurveyOperation editSurveyOperation(long userId, long id, String title, String description, long surveyObjectId, Date startDate, Date endDate, ServiceContext serviceContext) throws PortalException
	{
		return surveyOperationLocalService.editSurveyOperation(userId, id, title, description, surveyObjectId, startDate, endDate, serviceContext);
	}

	public SurveyOperation deleteSurveyOperationById(long id) throws PortalException
	{
		return surveyOperationLocalService.deleteSurveyOperationById(id);
	}

	public List<SurveyOperation> getSurveyOperationByTitle(String title)
	{
		return surveyOperationLocalService.getSurveyOperationByTitle(title);
	}

	public List<SurveyOperation> getSurveyOperationByTitlePaging(String title, int startPage, int endPage)
	{
		return surveyOperationLocalService.getSurveyOperationByTitlePaging(title, startPage, endPage);

	}

	public void deleteAllSurveyOperation()
	{
		surveyOperationLocalService.deleteAllSurveyOperation();
	}

	public void deleteSurveyOperationAfterEndDate() throws PortalException
	{
		surveyOperationLocalService.deleteSurveyOperationAfterEndDate();
	}

	public List<SurveyOperation> getAllSurveyOperationMapping()
	{
		return surveyOperationLocalService.getAllSurveyOperationMapping();
	}

	public List<SurveyOperation> getSurveyOperationBeforeEndDate()
	{
		return surveyOperationLocalService.getSurveyOperationBeforeEndDate();
	}
}