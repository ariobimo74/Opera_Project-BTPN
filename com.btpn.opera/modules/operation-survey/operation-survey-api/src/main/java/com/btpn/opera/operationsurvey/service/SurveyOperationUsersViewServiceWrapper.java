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
 * Provides a wrapper for {@link SurveyOperationUsersViewService}.
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationUsersViewService
 * @generated
 */
@ProviderType
public class SurveyOperationUsersViewServiceWrapper
	implements SurveyOperationUsersViewService,
			   ServiceWrapper<SurveyOperationUsersViewService> {

	public SurveyOperationUsersViewServiceWrapper(
		SurveyOperationUsersViewService surveyOperationUsersViewService) {

		_surveyOperationUsersViewService = surveyOperationUsersViewService;
	}

	@Override
	public java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperationUsersView>
			getAllSurveyOperationUsersView() {

		return _surveyOperationUsersViewService.
			getAllSurveyOperationUsersView();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _surveyOperationUsersViewService.getOSGiServiceIdentifier();
	}

	@Override
	public SurveyOperationUsersViewService getWrappedService() {
		return _surveyOperationUsersViewService;
	}

	@Override
	public void setWrappedService(
		SurveyOperationUsersViewService surveyOperationUsersViewService) {

		_surveyOperationUsersViewService = surveyOperationUsersViewService;
	}

	private SurveyOperationUsersViewService _surveyOperationUsersViewService;

}