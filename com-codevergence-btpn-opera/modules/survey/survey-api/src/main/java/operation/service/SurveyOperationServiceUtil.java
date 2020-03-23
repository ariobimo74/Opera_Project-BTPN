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

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for SurveyOperation. This utility wraps
 * <code>operation.service.impl.SurveyOperationServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationService
 * @generated
 */
@ProviderType
public class SurveyOperationServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>operation.service.impl.SurveyOperationServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static operation.model.SurveyOperation addSurveyOperation(
			String title, String description, long surveyObjId,
			java.util.Date startDate, java.util.Date endDate, String question1,
			String question2, String question3, String question4,
			String question5, String question6, String question7,
			String question8, String question9, String question10,
			String status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addSurveyOperation(
			title, description, surveyObjId, startDate, endDate, question1,
			question2, question3, question4, question5, question6, question7,
			question8, question9, question10, status, serviceContext);
	}

	public static operation.model.SurveyOperation deleteSurveyOperationById(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteSurveyOperationById(id);
	}

	public static java.util.List<operation.model.SurveyOperation>
		getAllSurveyOperation() {

		return getService().getAllSurveyOperation();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static operation.model.SurveyOperation getSurveOperationyById(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getSurveOperationyById(id);
	}

	public static java.util.List<operation.model.SurveyOperation>
		getSurveyOperationByTitle(String title) {

		return getService().getSurveyOperationByTitle(title);
	}

	public static operation.model.SurveyOperation updateSurveyOperation(
			long id, String title, String description, long surveyObjId,
			java.util.Date startDate, java.util.Date endDate, String question1,
			String question2, String question3, String question4,
			String question5, String question6, String question7,
			String question8, String question9, String question10,
			String status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateSurveyOperation(
			id, title, description, surveyObjId, startDate, endDate, question1,
			question2, question3, question4, question5, question6, question7,
			question8, question9, question10, status, serviceContext);
	}

	public static SurveyOperationService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<SurveyOperationService, SurveyOperationService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(SurveyOperationService.class);

		ServiceTracker<SurveyOperationService, SurveyOperationService>
			serviceTracker =
				new ServiceTracker
					<SurveyOperationService, SurveyOperationService>(
						bundle.getBundleContext(), SurveyOperationService.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}