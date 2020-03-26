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
import operation.service.base.SurveyOperationLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the survey operation local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>operation.service.SurveyOperationLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=operation.model.SurveyOperation",
	service = AopService.class
)
public class SurveyOperationLocalServiceImpl
	extends SurveyOperationLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>operation.service.SurveyOperationLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>operation.service.SurveyOperationLocalServiceUtil</code>.
	 */

	public List<SurveyOperation> getAllSurveyOperation()
	{
		return surveyOperationPersistence.findAll();
	}

	public SurveyOperation getSurveyOperationById(long id) throws PortalException
	{
		return surveyOperationPersistence.findByPrimaryKey(id);
	}

	public SurveyOperation addSurveyOperation(String title, String description, String surveyObj, Date startDate, Date endDate, String status, ServiceContext serviceContext)
	{
		Date now = new Date();
		long id = counterLocalService.increment();
		SurveyOperation surveyOperation = surveyOperationPersistence.create(id);

		surveyOperation.setTitle(title);
		surveyOperation.setDescription(description);
		surveyOperation.setSurveyObj(surveyObj);
		surveyOperation.setStartDate(startDate);
		surveyOperation.setEndDate(endDate);
		surveyOperation.setStatus(status);

		if (status.equals("Submitted"))
		{
			surveyOperation.setSubmittedDate(now);
		}

		return surveyOperationPersistence.update(surveyOperation);
	}

	public SurveyOperation editSurveyOperation(long id, String title, String description, String surveyObj, Date startDate, Date endDate, String status, ServiceContext serviceContext) throws PortalException
	{
		Date now = new Date();
		SurveyOperation surveyOperation = surveyOperationPersistence.findByPrimaryKey(id);

		surveyOperation.setTitle(title);
		surveyOperation.setDescription(description);
		surveyOperation.setSurveyObj(surveyObj);
		surveyOperation.setStartDate(startDate);
		surveyOperation.setEndDate(endDate);
		surveyOperation.setStatus(status);

		if (status.equals("Submitted"))
		{
			surveyOperation.setSubmittedDate(now);
		}

		return surveyOperationPersistence.update(surveyOperation);
	}

	public SurveyOperation deleteSurveyOperationById(long id) throws PortalException
	{
		return surveyOperationPersistence.remove(id);
	}

	public void deleteAllSurveyOperation()
	{
		surveyOperationPersistence.removeAll();
	}

	public List<SurveyOperation> getSurveyOperationByTitle(String title)
	{
		return surveyOperationPersistence.findByTitle(title);
	}

	public int countAllSurveyOperation()
	{
		return surveyOperationPersistence.countAll();
	}

	public int countSurveyOperationByTitle(String title)
	{
		return surveyOperationPersistence.countByTitle(title);
	}
}