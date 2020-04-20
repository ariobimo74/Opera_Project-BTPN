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

import com.btpn.opera.operationsurvey.model.Responden;
import com.btpn.opera.operationsurvey.service.base.RespondenServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * The implementation of the responden remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.btpn.opera.operationsurvey.service.RespondenService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RespondenServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=operationsurvey",
		"json.web.service.context.path=Responden"
	},
	service = AopService.class
)
public class RespondenServiceImpl extends RespondenServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.btpn.opera.operationsurvey.service.RespondenServiceUtil</code> to access the responden remote service.
	 */

	public List<Responden> getAllResponden()
	{
		return respondenLocalService.getAllResponden();
	}

	public Responden getRespondenById(long id) throws PortalException
	{
		return respondenLocalService.getRespondenById(id);
	}

	public Responden addRespondenByAdmin(String nik, String fullName, String lob, String division, long surveyOperationId, ServiceContext serviceContext)
	{
		return respondenLocalService.addRespondenByAdmin(nik, fullName, lob, division, surveyOperationId, serviceContext);
	}

	public Responden updateRespondenByUser(long id, double totalValue, String answerRecord, String notes, ServiceContext serviceContext) throws PortalException
	{
		return respondenLocalService.updateRespondenByUser(id, totalValue, answerRecord, notes, serviceContext);
	}

	public Responden deleteRespondenById(long id) throws PortalException
	{
		return respondenLocalService.deleteRespondenById(id);
	}

	public List<Responden> getRespondenBySurveyOperationId(long surveyOperationId)
	{
		return respondenLocalService.getRespondenBySurveyOperationId(surveyOperationId);
	}

	public void deleteRespondenBySurveyOperationId(long surveyOperationId) throws PortalException
	{
		respondenLocalService.deleteRespondenBySurveyOperationId(surveyOperationId);
	}
}