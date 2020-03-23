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

package responden.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import responden.model.SurveyResponden;
import responden.service.base.SurveyRespondenServiceBaseImpl;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the survey responden remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>responden.service.SurveyRespondenService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyRespondenServiceBaseImpl
 */
public class SurveyRespondenServiceImpl extends SurveyRespondenServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>responden.service.SurveyRespondenServiceUtil</code> to access the survey responden remote service.
	 */

	public List<SurveyResponden> getAllSurveyResponden()
	{
		return surveyRespondenLocalService.getAllSurveyResponden();
	}

	public SurveyResponden getSurveyRespondenById(long id) throws PortalException
	{
		return surveyRespondenLocalService.getSurveyRespondenById(id);
	}

	public SurveyResponden addSurveyRespondenByAdmin(String nik, long surveyId, ServiceContext serviceContext) throws PortalException
	{
		return surveyRespondenLocalService.addSurveyRespondenByAdmin(nik, surveyId, serviceContext);
	}

	public SurveyResponden updateSurveyRespondenByUser(long id, Double answer1, Double answer2, Double answer3, Double answer4, Double answer5, Double answer6, Double answer7, Double answer8, Double answer9, Double answer10, String note, String status, ServiceContext serviceContext) throws PortalException
	{
		return surveyRespondenLocalService.updateSurveyRespondenByUser(id, answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8, answer9, answer10, note, status, serviceContext);
	}

	public SurveyResponden deleteSurveyrespondenByIdByAdmin(long id) throws PortalException
	{
		return surveyRespondenLocalService.deleteSurveyRespondenByIdByAdmin(id);
	}

	public List<SurveyResponden> getSurveyRespondenBySurveyId(long surveyId)
	{
		return surveyRespondenLocalService.getSurveyRespondenBySurveyId(surveyId);
	}
}