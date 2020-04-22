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
 * Provides the remote service utility for Answers. This utility wraps
 * <code>com.btpn.opera.operationsurvey.service.impl.AnswersServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AnswersService
 * @generated
 */
@ProviderType
public class AnswersServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.btpn.opera.operationsurvey.service.impl.AnswersServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.btpn.opera.operationsurvey.model.Answers addAnswers(
			String answer, double value, long questionsId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addAnswers(
			answer, value, questionsId, serviceContext);
	}

	public static com.btpn.opera.operationsurvey.model.Answers
			deleteAnswersById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteAnswersById(id);
	}

	public static com.btpn.opera.operationsurvey.model.Answers editAnswers(
			long id, String answer, double value, long questionsId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().editAnswers(
			id, answer, value, questionsId, serviceContext);
	}

	public static java.util.List<com.btpn.opera.operationsurvey.model.Answers>
		getAllAnswers() {

		return getService().getAllAnswers();
	}

	public static com.btpn.opera.operationsurvey.model.Answers getAnswersById(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getAnswersById(id);
	}

	public static java.util.List<com.btpn.opera.operationsurvey.model.Answers>
		getAnswersByQuestionsId(long questionsId) {

		return getService().getAnswersByQuestionsId(questionsId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static AnswersService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AnswersService, AnswersService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(AnswersService.class);

		ServiceTracker<AnswersService, AnswersService> serviceTracker =
			new ServiceTracker<AnswersService, AnswersService>(
				bundle.getBundleContext(), AnswersService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}