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
import com.btpn.opera.operationsurvey.service.base.RespondenLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the responden local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.btpn.opera.operationsurvey.service.RespondenLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RespondenLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.btpn.opera.operationsurvey.model.Responden",
	service = AopService.class
)
public class RespondenLocalServiceImpl extends RespondenLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.btpn.opera.operationsurvey.service.RespondenLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.btpn.opera.operationsurvey.service.RespondenLocalServiceUtil</code>.
	 */

	public List<Responden> getAllResponden()
	{
		return respondenPersistence.findAll();
	}

	public Responden getRespondenById(long id) throws PortalException
	{
		return respondenPersistence.findByPrimaryKey(id);
	}

	public Responden addRespondenByAdmin(String nik, String fullName, String lob, String division, long surveyOperationId, ServiceContext serviceContext)
	{
		long id = counterLocalService.increment();
		Responden responden = respondenPersistence.create(id);

		responden.setNik(nik);
		responden.setFullName(fullName);
		responden.setLob(lob);
		responden.setDivision(division);
		responden.setSurveyOperationId(surveyOperationId);

		return respondenPersistence.update(responden);
	}

	public Responden updateRespondenByUser(long id, double totalValue, String answerRecord, String notes, ServiceContext serviceContext) throws PortalException
	{
		Date now = new Date();
		Responden responden = respondenPersistence.findByPrimaryKey(id);

		responden.setTotalValue(totalValue);
		responden.setAnswerRecord(answerRecord);
		responden.setNotes(notes);
		responden.setSubmittedDate(now);

		return respondenPersistence.update(responden);
	}

	public Responden deleteRespondenById(long id) throws PortalException
	{
		return respondenPersistence.remove(id);
	}

	public List<Responden> getRespondenBySurveyOperationId(long surveyOperationId)
	{
		return respondenPersistence.findBySurveyOperationID(surveyOperationId);
	}

	public void deleteRespondenBySurveyOperationId(long surveyOperationId) throws PortalException
	{
		respondenPersistence.removeBySurveyOperationID(surveyOperationId);
	}
}