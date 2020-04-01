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

package operation.service.impl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import operation.model.SurveyOperation;
import operation.service.base.SurveyOperationServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the survey operation remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>operation.service.SurveyOperationService</code> interface.
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
		"json.web.service.context.name=surveyoperation",
		"json.web.service.context.path=SurveyOperation"
	},
	service = AopService.class
)
public class SurveyOperationServiceImpl extends SurveyOperationServiceBaseImpl
{
	public List<SurveyOperation> getAllSurveyOperation()
	{
		return surveyOperationLocalService.getAllSurveyOperation();
	}

	public SurveyOperation getSurveyOperationById(long id) throws PortalException
	{
		return surveyOperationLocalService.getSurveyOperationById(id);
	}

	public SurveyOperation addSurveyOperation(String title, String description, String surveyObj, Date startDate, Date endDate, String status, ServiceContext serviceContext)
	{
		return surveyOperationLocalService.addSurveyOperation(title, description, surveyObj, startDate, endDate, status, serviceContext);
	}

	public SurveyOperation editSurveyOperation(long id, String title, String description, String surveyObj, Date startDate, Date endDate, String status, ServiceContext serviceContext) throws PortalException
	{
		return surveyOperationLocalService.editSurveyOperation(id, title, description, surveyObj, startDate, endDate, status, serviceContext);
	}

	public SurveyOperation deleteSurveyOperationById(long id) throws PortalException
	{
		return surveyOperationLocalService.deleteSurveyOperationById(id);
	}

	public void deleteAllSurveyOperation()
	{
		surveyOperationLocalService.deleteAllSurveyOperation();
	}

	public List<SurveyOperation> getSurveyOperationByTitle(String title)
	{
		return surveyOperationLocalService.getSurveyOperationByTitle(title);
	}

	public int countAllSurveyOperation()
	{
		return surveyOperationLocalService.countAllSurveyOperation();
	}

	public int countSurveyOperationByTitle(String title)
	{
		return surveyOperationLocalService.countSurveyOperationByTitle(title);
	}
}