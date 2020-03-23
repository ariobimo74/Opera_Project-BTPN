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

package operation.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link SurveyOperationService}.
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationService
 * @generated
 */
@ProviderType
public class SurveyOperationServiceWrapper
	implements SurveyOperationService, ServiceWrapper<SurveyOperationService> {

	public SurveyOperationServiceWrapper(
		SurveyOperationService surveyOperationService) {

		_surveyOperationService = surveyOperationService;
	}

	@Override
	public operation.model.SurveyOperation addSurveyOperation(
			String title, String description, long surveyObjId,
			java.util.Date startDate, java.util.Date endDate, String question1,
			String question2, String question3, String question4,
			String question5, String question6, String question7,
			String question8, String question9, String question10,
			String status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationService.addSurveyOperation(
			title, description, surveyObjId, startDate, endDate, question1,
			question2, question3, question4, question5, question6, question7,
			question8, question9, question10, status, serviceContext);
	}

	@Override
	public operation.model.SurveyOperation deleteSurveyOperationById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationService.deleteSurveyOperationById(id);
	}

	@Override
	public java.util.List<operation.model.SurveyOperation>
		getAllSurveyOperation() {

		return _surveyOperationService.getAllSurveyOperation();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _surveyOperationService.getOSGiServiceIdentifier();
	}

	@Override
	public operation.model.SurveyOperation getSurveOperationyById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationService.getSurveOperationyById(id);
	}

	@Override
	public java.util.List<operation.model.SurveyOperation>
		getSurveyOperationByTitle(String title) {

		return _surveyOperationService.getSurveyOperationByTitle(title);
	}

	@Override
	public operation.model.SurveyOperation updateSurveyOperation(
			long id, String title, String description, long surveyObjId,
			java.util.Date startDate, java.util.Date endDate, String question1,
			String question2, String question3, String question4,
			String question5, String question6, String question7,
			String question8, String question9, String question10,
			String status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationService.updateSurveyOperation(
			id, title, description, surveyObjId, startDate, endDate, question1,
			question2, question3, question4, question5, question6, question7,
			question8, question9, question10, status, serviceContext);
	}

	@Override
	public SurveyOperationService getWrappedService() {
		return _surveyOperationService;
	}

	@Override
	public void setWrappedService(
		SurveyOperationService surveyOperationService) {

		_surveyOperationService = surveyOperationService;
	}

	private SurveyOperationService _surveyOperationService;

}