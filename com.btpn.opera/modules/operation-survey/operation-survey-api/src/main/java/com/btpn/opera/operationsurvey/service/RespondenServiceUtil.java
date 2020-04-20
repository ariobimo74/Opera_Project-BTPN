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

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for Responden. This utility wraps
 * <code>com.btpn.opera.operationsurvey.service.impl.RespondenServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see RespondenService
 * @generated
 */
@ProviderType
public class RespondenServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.btpn.opera.operationsurvey.service.impl.RespondenServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.btpn.opera.operationsurvey.model.Responden
		addRespondenByAdmin(
			String nik, String fullName, String lob, String division,
			long surveyOperationId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return getService().addRespondenByAdmin(
			nik, fullName, lob, division, surveyOperationId, serviceContext);
	}

	public static com.btpn.opera.operationsurvey.model.Responden
			deleteRespondenById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteRespondenById(id);
	}

	public static void deleteRespondenBySurveyOperationId(
			long surveyOperationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().deleteRespondenBySurveyOperationId(surveyOperationId);
	}

	public static java.util.List<com.btpn.opera.operationsurvey.model.Responden>
		getAllResponden() {

		return getService().getAllResponden();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.btpn.opera.operationsurvey.model.Responden
			getRespondenById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getRespondenById(id);
	}

	public static java.util.List<com.btpn.opera.operationsurvey.model.Responden>
		getRespondenBySurveyOperationId(long surveyOperationId) {

		return getService().getRespondenBySurveyOperationId(surveyOperationId);
	}

	public static com.btpn.opera.operationsurvey.model.Responden
			updateRespondenByUser(
				long id, double totalValue, String answerRecord, String notes,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateRespondenByUser(
			id, totalValue, answerRecord, notes, serviceContext);
	}

	public static RespondenService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RespondenService, RespondenService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(RespondenService.class);

		ServiceTracker<RespondenService, RespondenService> serviceTracker =
			new ServiceTracker<RespondenService, RespondenService>(
				bundle.getBundleContext(), RespondenService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}