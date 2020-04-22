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
 * Provides the remote service utility for SurveyOperation. This utility wraps
 * <code>com.btpn.opera.operationsurvey.service.impl.SurveyOperationServiceImpl</code> and is an
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
	 * Never modify this class directly. Add custom service methods to <code>com.btpn.opera.operationsurvey.service.impl.SurveyOperationServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.btpn.opera.operationsurvey.model.SurveyOperation
			addSurveyOperation(
				long userId, String title, String description,
				long surveyObjectId, java.util.Date startdate,
				java.util.Date endDate,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addSurveyOperation(
			userId, title, description, surveyObjectId, startdate, endDate,
			serviceContext);
	}

	public static int countAllSurveyOperation() {
		return getService().countAllSurveyOperation();
	}

	public static int countSurveyOperationByTitle(String title) {
		return getService().countSurveyOperationByTitle(title);
	}

	public static void deleteAllSurveyOperation() {
		getService().deleteAllSurveyOperation();
	}

	public static void deleteSurveyOperationAfterEndDate()
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().deleteSurveyOperationAfterEndDate();
	}

	public static com.btpn.opera.operationsurvey.model.SurveyOperation
			deleteSurveyOperationById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteSurveyOperationById(id);
	}

	public static com.btpn.opera.operationsurvey.model.SurveyOperation
			editSurveyOperation(
				long userId, long id, String title, String description,
				long surveyObjectId, java.util.Date startDate,
				java.util.Date endDate,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().editSurveyOperation(
			userId, id, title, description, surveyObjectId, startDate, endDate,
			serviceContext);
	}

	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperation>
			getAllSurveyOperation() {

		return getService().getAllSurveyOperation();
	}

	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperationView>
			getAllSurveyOperationMapping() {

		return getService().getAllSurveyOperationMapping();
	}

	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperation>
			getAllSurveyOperationPaging(int startPage, int endPage) {

		return getService().getAllSurveyOperationPaging(startPage, endPage);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperation>
			getSurveyOperationBeforeEndDate() {

		return getService().getSurveyOperationBeforeEndDate();
	}

	public static com.btpn.opera.operationsurvey.model.SurveyOperation
			getSurveyOperationById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getSurveyOperationById(id);
	}

	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperation>
			getSurveyOperationByTitle(String title) {

		return getService().getSurveyOperationByTitle(title);
	}

	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperation>
			getSurveyOperationByTitlePaging(
				String title, int startPage, int endPage) {

		return getService().getSurveyOperationByTitlePaging(
			title, startPage, endPage);
	}

	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperation>
			getSurveyOperationByTitleQuery(String title) {

		return getService().getSurveyOperationByTitleQuery(title);
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