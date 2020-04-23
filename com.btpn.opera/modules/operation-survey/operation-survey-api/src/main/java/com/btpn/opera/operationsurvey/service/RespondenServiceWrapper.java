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
 * Provides a wrapper for {@link RespondenService}.
 *
 * @author Brian Wing Shun Chan
 * @see RespondenService
 * @generated
 */
@ProviderType
public class RespondenServiceWrapper
	implements RespondenService, ServiceWrapper<RespondenService> {

	public RespondenServiceWrapper(RespondenService respondenService) {
		_respondenService = respondenService;
	}

	@Override
	public com.btpn.opera.operationsurvey.model.Responden addRespondenByAdmin(
		String nik, String fullName, String lob, String division,
		long surveyOperationId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return _respondenService.addRespondenByAdmin(
			nik, fullName, lob, division, surveyOperationId, serviceContext);
	}

	@Override
	public com.btpn.opera.operationsurvey.model.Responden deleteRespondenById(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _respondenService.deleteRespondenById(id);
	}

	@Override
	public void deleteRespondenBySurveyOperationId(long surveyOperationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		_respondenService.deleteRespondenBySurveyOperationId(surveyOperationId);
	}

	@Override
	public com.btpn.opera.operationsurvey.model.Responden editRespondenByAdmin(
			long id, String nik, String fullName, String lob, String division,
			long surveyOperationId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _respondenService.editRespondenByAdmin(
			id, nik, fullName, lob, division, surveyOperationId,
			serviceContext);
	}

	@Override
	public java.util.List<com.btpn.opera.operationsurvey.model.Responden>
		getAllResponden() {

		return _respondenService.getAllResponden();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _respondenService.getOSGiServiceIdentifier();
	}

	@Override
	public com.btpn.opera.operationsurvey.model.Responden getRespondenById(
		long id) {

		return _respondenService.getRespondenById(id);
	}

	@Override
	public java.util.List<com.btpn.opera.operationsurvey.model.Responden>
		getRespondenBySurveyOperationId(long surveyOperationId) {

		return _respondenService.getRespondenBySurveyOperationId(
			surveyOperationId);
	}

	@Override
	public com.btpn.opera.operationsurvey.model.Responden updateRespondenByUser(
			long id, double totalValue, String answerRecord, String notes,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _respondenService.updateRespondenByUser(
			id, totalValue, answerRecord, notes, serviceContext);
	}

	@Override
	public RespondenService getWrappedService() {
		return _respondenService;
	}

	@Override
	public void setWrappedService(RespondenService respondenService) {
		_respondenService = respondenService;
	}

	private RespondenService _respondenService;

}