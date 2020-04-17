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
 * Provides a wrapper for {@link SurveyObjectService}.
 *
 * @author Brian Wing Shun Chan
 * @see SurveyObjectService
 * @generated
 */
@ProviderType
public class SurveyObjectServiceWrapper
	implements SurveyObjectService, ServiceWrapper<SurveyObjectService> {

	public SurveyObjectServiceWrapper(SurveyObjectService surveyObjectService) {
		_surveyObjectService = surveyObjectService;
	}

	@Override
	public java.util.List<com.btpn.opera.operationsurvey.model.SurveyObject>
		getAllSurveyObject() {

		return _surveyObjectService.getAllSurveyObject();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _surveyObjectService.getOSGiServiceIdentifier();
	}

	@Override
	public com.btpn.opera.operationsurvey.model.SurveyObject
			getSurveyObjectById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _surveyObjectService.getSurveyObjectById(id);
	}

	@Override
	public SurveyObjectService getWrappedService() {
		return _surveyObjectService;
	}

	@Override
	public void setWrappedService(SurveyObjectService surveyObjectService) {
		_surveyObjectService = surveyObjectService;
	}

	private SurveyObjectService _surveyObjectService;

}