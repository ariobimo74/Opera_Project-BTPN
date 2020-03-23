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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import operation.model.SurveyOperation;
import operation.service.base.SurveyOperationLocalServiceBaseImpl;

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

	public SurveyOperation addSurveyOperation(String title, String description, long surveyObjId, Date startDate, Date endDate, String question1, String question2, String question3, String question4, String question5, String question6, String question7, String question8, String question9, String question10, String status, ServiceContext serviceContext) throws PortalException
	{
		Date now = new Date();

		if (title != null && surveyObjId > 0 && question1 != null && question2 != null && question3 != null && question4 != null && question5 != null && question6 != null && question7 != null && question8 != null && question9 != null && question10 != null)
		{
			long id = counterLocalService.increment();
			SurveyOperation surveyOperation = surveyOperationPersistence.create(id);

			surveyOperation.setTitle(title);
			surveyOperation.setDescription(description);
			surveyOperation.setSurveyObjId(surveyObjId);
			surveyOperation.setStartDate(startDate);
			surveyOperation.setEndDate(endDate);
			surveyOperation.setQuestion1(question1);
			surveyOperation.setQuestion2(question2);
			surveyOperation.setQuestion3(question3);
			surveyOperation.setQuestion4(question4);
			surveyOperation.setQuestion5(question5);
			surveyOperation.setQuestion6(question6);
			surveyOperation.setQuestion7(question7);
			surveyOperation.setQuestion8(question8);
			surveyOperation.setQuestion9(question9);
			surveyOperation.setQuestion10(question10);
			surveyOperation.setStatus(status);

			if (status.equals("Submitted"))
			{
				surveyOperation.setSubmittedDate(now);
			}

			surveyOperationPersistence.update(surveyOperation);
			return surveyOperation;
		}
		else
		{
			return null;
		}
	}

	public SurveyOperation updateSurveyOperation(long id, String title, String description, long surveyObjId, Date startDate, Date endDate, String question1, String question2, String question3, String question4, String question5, String question6, String question7, String question8, String question9, String question10, String status, ServiceContext serviceContext) throws PortalException
	{
		Date now = new Date();
		SurveyOperation surveyOperation = getSurveyOperation(id);

		if (title != null && surveyObjId > 0 && question1 != null && question2 != null && question3 != null && question4 != null && question5 != null && question6 != null && question7 != null && question8 != null && question9 != null && question10 != null)
		{
			surveyOperation.setTitle(title);
			surveyOperation.setDescription(description);
			surveyOperation.setSurveyObjId(surveyObjId);
			surveyOperation.setStartDate(startDate);
			surveyOperation.setEndDate(endDate);
			surveyOperation.setQuestion1(question1);
			surveyOperation.setQuestion2(question2);
			surveyOperation.setQuestion3(question3);
			surveyOperation.setQuestion4(question4);
			surveyOperation.setQuestion5(question5);
			surveyOperation.setQuestion6(question6);
			surveyOperation.setQuestion7(question7);
			surveyOperation.setQuestion8(question8);
			surveyOperation.setQuestion9(question9);
			surveyOperation.setQuestion10(question10);
			surveyOperation.setStatus(status);

			if (status.equals("Submitted"))
			{
				surveyOperation.setSubmittedDate(now);
			}

			surveyOperationPersistence.update(surveyOperation);
			return surveyOperation;
		}
		else
		{
			return null;
		}
	}

	public SurveyOperation deleteSurveyOperationById(long id) throws PortalException
	{
		return surveyOperationPersistence.remove(id);
	}

	public List<SurveyOperation> getSurveyOperationByTitle(String title)
	{
		return surveyOperationPersistence.findByTitle(title);
	}
}