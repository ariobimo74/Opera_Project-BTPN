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
import responden.service.base.SurveyRespondenLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the survey responden local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>responden.service.SurveyRespondenLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyRespondenLocalServiceBaseImpl
 */
public class SurveyRespondenLocalServiceImpl
	extends SurveyRespondenLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>responden.service.SurveyRespondenLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>responden.service.SurveyRespondenLocalServiceUtil</code>.
	 */

	public List<SurveyResponden> getAllSurveyResponden()
	{
		return surveyRespondenPersistence.findAll();
	}

	public SurveyResponden getSurveyRespondenById(long id) throws PortalException
	{
		return surveyRespondenPersistence.findByPrimaryKey(id);
	}

	public SurveyResponden addSurveyRespondenByAdmin(String nik, long surveyId, ServiceContext serviceContext) throws PortalException
	{
		if (surveyId > 0)
		{
			long id =counterLocalService.increment();
			SurveyResponden surveyResponden = surveyRespondenPersistence.create(id);

			surveyResponden.setNik(nik);
			surveyResponden.setSurveyId(surveyId);
			surveyResponden.setAnswer1(0.0);
			surveyResponden.setAnswer2(0.0);
			surveyResponden.setAnswer3(0.0);
			surveyResponden.setAnswer4(0.0);
			surveyResponden.setAnswer5(0.0);
			surveyResponden.setAnswer6(0.0);
			surveyResponden.setAnswer7(0.0);
			surveyResponden.setAnswer8(0.0);
			surveyResponden.setAnswer9(0.0);
			surveyResponden.setAnswer10(0.0);

			surveyRespondenPersistence.update(surveyResponden);
			return surveyResponden;
		}
		else
		{
			return null;
		}
	}

	public SurveyResponden updateSurveyRespondenByUser(long id, Double answer1, Double answer2, Double answer3, Double answer4, Double answer5, Double answer6, Double answer7, Double answer8, Double answer9, Double answer10, String note, String status, ServiceContext serviceContext) throws PortalException
	{
		Date now = new Date();
		SurveyResponden surveyResponden = getSurveyResponden(id);

		surveyResponden.setAnswer1(answer1);
		surveyResponden.setAnswer2(answer2);
		surveyResponden.setAnswer3(answer3);
		surveyResponden.setAnswer4(answer4);
		surveyResponden.setAnswer5(answer5);
		surveyResponden.setAnswer6(answer6);
		surveyResponden.setAnswer7(answer7);
		surveyResponden.setAnswer8(answer8);
		surveyResponden.setAnswer9(answer9);
		surveyResponden.setAnswer10(answer10);
		surveyResponden.setNote(note);
		surveyResponden.setStatus(status);

		if (status.equals("Submitted") || status.equals("submitted"))
		{
			surveyResponden.setSubmittedDate(now);
		}

		surveyRespondenPersistence.update(surveyResponden);
		return surveyResponden;
	}

	public SurveyResponden deleteSurveyRespondenByIdByAdmin(long id) throws PortalException
	{
		return surveyRespondenPersistence.remove(id);
	}

	public List<SurveyResponden> getSurveyRespondenBySurveyId(long surveyId)
	{
		return surveyRespondenPersistence.findBySurveyId(surveyId);
	}
}