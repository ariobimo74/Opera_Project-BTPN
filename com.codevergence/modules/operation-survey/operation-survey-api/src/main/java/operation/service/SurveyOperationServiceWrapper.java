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
		String title, String description, String surveyObj,
		java.util.Date startDate, java.util.Date endDate, String status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return _surveyOperationService.addSurveyOperation(
			title, description, surveyObj, startDate, endDate, status,
			serviceContext);
	}

	@Override
	public int countAllSurveyOperation() {
		return _surveyOperationService.countAllSurveyOperation();
	}

	@Override
	public int countSurveyOperationByTitle(String title) {
		return _surveyOperationService.countSurveyOperationByTitle(title);
	}

	@Override
	public void deleteAllSurveyOperation() {
		_surveyOperationService.deleteAllSurveyOperation();
	}

	@Override
	public operation.model.SurveyOperation deleteSurveyOperationById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationService.deleteSurveyOperationById(id);
	}

	@Override
	public operation.model.SurveyOperation editSurveyOperation(
			long id, String title, String description, String surveyObj,
			java.util.Date startDate, java.util.Date endDate, String status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationService.editSurveyOperation(
			id, title, description, surveyObj, startDate, endDate, status,
			serviceContext);
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
	public operation.model.SurveyOperation getSurveyOperationById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationService.getSurveyOperationById(id);
	}

	@Override
	public java.util.List<operation.model.SurveyOperation>
		getSurveyOperationByTitle(String title) {

		return _surveyOperationService.getSurveyOperationByTitle(title);
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