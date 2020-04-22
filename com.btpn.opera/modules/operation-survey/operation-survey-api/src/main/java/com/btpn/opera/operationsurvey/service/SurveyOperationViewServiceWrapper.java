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
 * Provides a wrapper for {@link SurveyOperationViewService}.
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationViewService
 * @generated
 */
@ProviderType
public class SurveyOperationViewServiceWrapper
	implements SurveyOperationViewService,
			   ServiceWrapper<SurveyOperationViewService> {

	public SurveyOperationViewServiceWrapper(
		SurveyOperationViewService surveyOperationViewService) {

		_surveyOperationViewService = surveyOperationViewService;
	}

	@Override
	public java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperationView>
			getAllSurveyOperationView() {

		return _surveyOperationViewService.getAllSurveyOperationView();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _surveyOperationViewService.getOSGiServiceIdentifier();
	}

	@Override
	public SurveyOperationViewService getWrappedService() {
		return _surveyOperationViewService;
	}

	@Override
	public void setWrappedService(
		SurveyOperationViewService surveyOperationViewService) {

		_surveyOperationViewService = surveyOperationViewService;
	}

	private SurveyOperationViewService _surveyOperationViewService;

}