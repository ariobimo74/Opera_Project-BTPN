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
 * Provides the remote service utility for Answers. This utility wraps
 * <code>operation.service.impl.AnswersServiceImpl</code> and is an
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
	 * Never modify this class directly. Add custom service methods to <code>operation.service.impl.AnswersServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static operation.model.Answers addAnswers(
			String answer, long value,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addAnswers(answer, value, serviceContext);
	}

	public static void deleteAllAnswers() {
		getService().deleteAllAnswers();
	}

	public static operation.model.Answers deleteAnswersById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteAnswersById(id);
	}

	public static operation.model.Answers editAnswers(
			long id, String answer, double value,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().editAnswers(id, answer, value, serviceContext);
	}

	public static java.util.List<operation.model.Answers> getAllAnswers() {
		return getService().getAllAnswers();
	}

	public static operation.model.Answers getAnswersById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getAnswersById(id);
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