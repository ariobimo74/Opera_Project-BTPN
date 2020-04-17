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

package com.btpn.opera.operationsurvey.service;

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
	public com.btpn.opera.operationsurvey.model.SurveyOperation
			addSurveyOperation(
				long userId, String title, String description,
				long surveyObjectId, java.util.Date startdate,
				java.util.Date endDate,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationService.addSurveyOperation(
			userId, title, description, surveyObjectId, startdate, endDate,
			serviceContext);
	}

	@Override
	public void deleteAllSurveyOperation() {
		_surveyOperationService.deleteAllSurveyOperation();
	}

	@Override
	public void deleteSurveyOperationAfterEndDate()
		throws com.liferay.portal.kernel.exception.PortalException {

		_surveyOperationService.deleteSurveyOperationAfterEndDate();
	}

	@Override
	public com.btpn.opera.operationsurvey.model.SurveyOperation
			deleteSurveyOperationById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationService.deleteSurveyOperationById(id);
	}

	@Override
	public com.btpn.opera.operationsurvey.model.SurveyOperation
			editSurveyOperation(
				long userId, long id, String title, String description,
				long surveyObjectId, java.util.Date startDate,
				java.util.Date endDate,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationService.editSurveyOperation(
			userId, id, title, description, surveyObjectId, startDate, endDate,
			serviceContext);
	}

	@Override
	public java.util.List<com.btpn.opera.operationsurvey.model.SurveyOperation>
		getAllSurveyOperation() {

		return _surveyOperationService.getAllSurveyOperation();
	}

	@Override
	public java.util.List<com.btpn.opera.operationsurvey.model.SurveyOperation>
		getAllSurveyOperationPaging(int startPage, int endPage) {

		return _surveyOperationService.getAllSurveyOperationPaging(
			startPage, endPage);
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
	public com.btpn.opera.operationsurvey.model.SurveyOperation
			getSurveyOperationById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyOperationService.getSurveyOperationById(id);
	}

	@Override
	public java.util.List<com.btpn.opera.operationsurvey.model.SurveyOperation>
		getSurveyOperationByTitle(String title) {

		return _surveyOperationService.getSurveyOperationByTitle(title);
	}

	@Override
	public java.util.List<com.btpn.opera.operationsurvey.model.SurveyOperation>
		getSurveyOperationByTitlePaging(
			String title, int startPage, int endPage) {

		return _surveyOperationService.getSurveyOperationByTitlePaging(
			title, startPage, endPage);
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