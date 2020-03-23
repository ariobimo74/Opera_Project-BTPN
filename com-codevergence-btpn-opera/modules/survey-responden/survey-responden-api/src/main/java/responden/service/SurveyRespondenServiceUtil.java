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

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for SurveyResponden. This utility wraps
 * <code>responden.service.impl.SurveyRespondenServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see SurveyRespondenService
 * @generated
 */
@ProviderType
public class SurveyRespondenServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>responden.service.impl.SurveyRespondenServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static responden.model.SurveyResponden addSurveyRespondenByAdmin(
			String nik, long surveyId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addSurveyRespondenByAdmin(
			nik, surveyId, serviceContext);
	}

	public static responden.model.SurveyResponden
			deleteSurveyrespondenByIdByAdmin(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteSurveyrespondenByIdByAdmin(id);
	}

	public static java.util.List<responden.model.SurveyResponden>
		getAllSurveyResponden() {

		return getService().getAllSurveyResponden();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static responden.model.SurveyResponden getSurveyRespondenById(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getSurveyRespondenById(id);
	}

	public static java.util.List<responden.model.SurveyResponden>
		getSurveyRespondenBySurveyId(long surveyId) {

		return getService().getSurveyRespondenBySurveyId(surveyId);
	}

	public static responden.model.SurveyResponden updateSurveyRespondenByUser(
			long id, Double answer1, Double answer2, Double answer3,
			Double answer4, Double answer5, Double answer6, Double answer7,
			Double answer8, Double answer9, Double answer10, String note,
			String status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateSurveyRespondenByUser(
			id, answer1, answer2, answer3, answer4, answer5, answer6, answer7,
			answer8, answer9, answer10, note, status, serviceContext);
	}

	public static SurveyRespondenService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<SurveyRespondenService, SurveyRespondenService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(SurveyRespondenService.class);

		ServiceTracker<SurveyRespondenService, SurveyRespondenService>
			serviceTracker =
				new ServiceTracker
					<SurveyRespondenService, SurveyRespondenService>(
						bundle.getBundleContext(), SurveyRespondenService.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}