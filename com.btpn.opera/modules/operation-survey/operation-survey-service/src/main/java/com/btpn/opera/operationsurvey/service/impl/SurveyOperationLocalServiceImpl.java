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

import com.btpn.opera.operationsurvey.exception.EndDateException;
import com.btpn.opera.operationsurvey.exception.StartDateException;
import com.btpn.opera.operationsurvey.exception.SurveyObjectException;
import com.btpn.opera.operationsurvey.model.SurveyOperation;
import com.btpn.opera.operationsurvey.model.SurveyOperationView;
import com.btpn.opera.operationsurvey.service.base.SurveyOperationLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.Validator;
import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the survey operation local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.btpn.opera.operationsurvey.service.SurveyOperationLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.btpn.opera.operationsurvey.model.SurveyOperation",
	service = AopService.class
)
public class SurveyOperationLocalServiceImpl
	extends SurveyOperationLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.btpn.opera.operationsurvey.service.SurveyOperationLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.btpn.opera.operationsurvey.service.SurveyOperationLocalServiceUtil</code>.
	 */

	public List<SurveyOperation> getAllSurveyOperation()
	{
		return surveyOperationPersistence.findAll();
	}

	public List<SurveyOperation> getAllSurveyOperationPaging(int startPage, int endPage)
	{
		return surveyOperationPersistence.findAll(startPage, endPage);
	}

	public SurveyOperation getSurveyOperationById(long id) throws PortalException
	{
		return surveyOperationPersistence.findByPrimaryKey(id);
	}

	public SurveyOperation addSurveyOperation(long userId, String title, String description, long surveyObjectId, Date startDate, Date endDate, ServiceContext serviceContext) throws PortalException
	{
		Date now = new Date();
		User user = userLocalService.getUserById(userId);
		long id = counterLocalService.increment();
		SurveyOperation surveyOperation = surveyOperationPersistence.create(id);

		validation(surveyObjectId, startDate, endDate);

		surveyOperation.setTitle(title);
		surveyOperation.setDescription(description);
		surveyOperation.setSurveyObjectId(surveyObjectId);
		surveyOperation.setStartDate(startDate);
		surveyOperation.setEndDate(endDate);
		surveyOperation.setSubmittedDate(now);
		surveyOperation.setCreatedDate(now);
		surveyOperation.setCreatedBy(user.getUserId());

		return surveyOperationPersistence.update(surveyOperation);
	}

	public SurveyOperation editSurveyOperation(long userId, long id, String title, String description, long surveyObjectId, Date startDate, Date endDate, ServiceContext serviceContext) throws PortalException
	{
		Date now = new Date();
		User user = userLocalService.getUserById(userId);
		SurveyOperation surveyOperation = surveyOperationPersistence.findByPrimaryKey(id);

		validation(surveyObjectId, startDate, endDate);

		surveyOperation.setTitle(title);
		surveyOperation.setDescription(description);
		surveyOperation.setSurveyObjectId(surveyObjectId);
		surveyOperation.setStartDate(startDate);
		surveyOperation.setEndDate(endDate);
		surveyOperation.setSubmittedDate(now);
		surveyOperation.setModifiedDate(now);
		surveyOperation.setModifiedBy(user.getUserId());

		return surveyOperationPersistence.update(surveyOperation);

	}

	public SurveyOperation deleteSurveyOperationById(long id) throws PortalException
	{
		return surveyOperationPersistence.remove(id);
	}

	public List<SurveyOperation> getSurveyOperationByTitle(String title)
	{
		return surveyOperationPersistence.findByTitle(title);
	}

	public List<SurveyOperation> getSurveyOperationByTitlePaging(String title, int startPage, int endPage)
	{
		return surveyOperationPersistence.findByTitle(title, startPage, endPage);
	}

	public int countAllSurveyOperation()
	{
		return surveyOperationPersistence.countAll();
	}

	public int countSurveyOperationBytitle(String title)
	{
		return surveyOperationPersistence.countByTitle(title);
	}

	public void deleteAllSurveyOperation()
	{
		surveyOperationPersistence.removeAll();
	}

	public void deleteSurveyOperationAfterEndDate() throws PortalException
	{
		List<SurveyOperation> allSurveyOperation = getAllSurveyOperation();

		for (int i = 0; i < allSurveyOperation.size(); i++)
		{
			if (allSurveyOperation.get(i).getEndDate().before(new Date()))
			{
				surveyOperationPersistence.remove(allSurveyOperation.get(i).getId());
			}
		}
	}

	public void validation(long surveyObjectId, Date startDate, Date endDate) throws PortalException
	{
		if (Validator.isNull(surveyObjectId))
		{
			throw new SurveyObjectException();
		}
		if (Validator.isNull(startDate))
		{
			throw new StartDateException();
		}
		if (Validator.isNull(endDate))
		{
			throw new EndDateException();
		}
	}

	public List<SurveyOperationView> getAllSurveyOperationMapping()
	{
		return surveyOperationFinder.findAllSurveyOperationMapping();
	}

	public List<SurveyOperation> getSurveyOperationBeforeEndDate()
	{
		return surveyOperationFinder.findSurveyOperationBeforeEndDate();
	}

	public List<SurveyOperation> getSurveyOperationByTitleQuery(String title)
	{
		String theTitle = '%' + title + '%';

		return surveyOperationFinder.findSurveyOperationByTitleQuery(theTitle);
	}
}