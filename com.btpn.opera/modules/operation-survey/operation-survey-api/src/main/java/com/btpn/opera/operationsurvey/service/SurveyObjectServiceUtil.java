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
 * Provides the remote service utility for SurveyObject. This utility wraps
 * <code>com.btpn.opera.operationsurvey.service.impl.SurveyObjectServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see SurveyObjectService
 * @generated
 */
@ProviderType
public class SurveyObjectServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.btpn.opera.operationsurvey.service.impl.SurveyObjectServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyObject>
			getAllSurveyObject() {

		return getService().getAllSurveyObject();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.btpn.opera.operationsurvey.model.SurveyObject
			getSurveyObjectById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getSurveyObjectById(id);
	}

	public static SurveyObjectService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SurveyObjectService, SurveyObjectService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(SurveyObjectService.class);

		ServiceTracker<SurveyObjectService, SurveyObjectService>
			serviceTracker =
				new ServiceTracker<SurveyObjectService, SurveyObjectService>(
					bundle.getBundleContext(), SurveyObjectService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}