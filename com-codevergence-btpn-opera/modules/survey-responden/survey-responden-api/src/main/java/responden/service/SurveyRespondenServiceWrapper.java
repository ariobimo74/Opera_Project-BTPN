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

package responden.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link SurveyRespondenService}.
 *
 * @author Brian Wing Shun Chan
 * @see SurveyRespondenService
 * @generated
 */
@ProviderType
public class SurveyRespondenServiceWrapper
	implements SurveyRespondenService, ServiceWrapper<SurveyRespondenService> {

	public SurveyRespondenServiceWrapper(
		SurveyRespondenService surveyRespondenService) {

		_surveyRespondenService = surveyRespondenService;
	}

	@Override
	public responden.model.SurveyResponden addSurveyRespondenByAdmin(
			String nik, long surveyId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyRespondenService.addSurveyRespondenByAdmin(
			nik, surveyId, serviceContext);
	}

	@Override
	public responden.model.SurveyResponden deleteSurveyrespondenByIdByAdmin(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyRespondenService.deleteSurveyrespondenByIdByAdmin(id);
	}

	@Override
	public java.util.List<responden.model.SurveyResponden>
		getAllSurveyResponden() {

		return _surveyRespondenService.getAllSurveyResponden();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _surveyRespondenService.getOSGiServiceIdentifier();
	}

	@Override
	public responden.model.SurveyResponden getSurveyRespondenById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyRespondenService.getSurveyRespondenById(id);
	}

	@Override
	public java.util.List<responden.model.SurveyResponden>
		getSurveyRespondenBySurveyId(long surveyId) {

		return _surveyRespondenService.getSurveyRespondenBySurveyId(surveyId);
	}

	@Override
	public responden.model.SurveyResponden updateSurveyRespondenByUser(
			long id, Double answer1, Double answer2, Double answer3,
			Double answer4, Double answer5, Double answer6, Double answer7,
			Double answer8, Double answer9, Double answer10, String note,
			String status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyRespondenService.updateSurveyRespondenByUser(
			id, answer1, answer2, answer3, answer4, answer5, answer6, answer7,
			answer8, answer9, answer10, note, status, serviceContext);
	}

	@Override
	public SurveyRespondenService getWrappedService() {
		return _surveyRespondenService;
	}

	@Override
	public void setWrappedService(
		SurveyRespondenService surveyRespondenService) {

		_surveyRespondenService = surveyRespondenService;
	}

	private SurveyRespondenService _surveyRespondenService;

}