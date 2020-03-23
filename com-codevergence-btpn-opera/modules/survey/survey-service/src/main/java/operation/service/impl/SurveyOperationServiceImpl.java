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
import operation.service.base.SurveyOperationServiceBaseImpl;

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
public class SurveyOperationServiceImpl extends SurveyOperationServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>operation.service.SurveyOperationServiceUtil</code> to access the survey operation remote service.
	 */

	public List<SurveyOperation> getAllSurveyOperation()
	{
		return surveyOperationLocalService.getAllSurveyOperation();
	}

	public SurveyOperation getSurveyOperationById(long id) throws PortalException
	{
		return surveyOperationLocalService.getSurveyOperationById(id);
	}

	public SurveyOperation addSurveyOperation(String title, String description, long surveyObjId, Date startDate, Date endDate, String question1, String question2, String question3, String question4, String question5, String question6, String question7, String question8, String question9, String question10, String status, ServiceContext serviceContext) throws PortalException
	{
		return surveyOperationLocalService.addSurveyOperation(title, description, surveyObjId, startDate, endDate, question1, question2, question3, question4, question5, question6, question7, question8, question9, question10, status, serviceContext);
	}

	public SurveyOperation updateSurveyOperation(long id, String title, String description, long surveyObjId, Date startDate, Date endDate, String question1, String question2, String question3, String question4, String question5, String question6, String question7, String question8, String question9, String question10, String status, ServiceContext serviceContext) throws PortalException
	{
		return surveyOperationLocalService.updateSurveyOperation(id, title, description, surveyObjId, startDate, endDate, question1, question2, question3, question4, question5, question6, question7, question8, question9, question10, status, serviceContext);
	}

	public SurveyOperation deleteSurveyOperationById(long id) throws PortalException
	{
		return surveyOperationLocalService.deleteSurveyOperationById(id);
	}

	public List<SurveyOperation> getSurveyOperationByTitle(String title)
	{
		return surveyOperationLocalService.getSurveyOperationByTitle(title);
	}
}