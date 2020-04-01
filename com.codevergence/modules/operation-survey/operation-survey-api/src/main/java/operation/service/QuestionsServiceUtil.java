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
 * Provides the remote service utility for Questions. This utility wraps
 * <code>operation.service.impl.QuestionsServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see QuestionsService
 * @generated
 */
@ProviderType
public class QuestionsServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>operation.service.impl.QuestionsServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static operation.model.Questions addQuestions(
			String question, String answer, double value,
			org.omg.IOP.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addQuestions(
			question, answer, value, serviceContext);
	}

	public static void deleteAllQuestions() {
		getService().deleteAllQuestions();
	}

	public static operation.model.Questions deleteQuestionsById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteQuestionsById(id);
	}

	public static operation.model.Questions editQuestions(
			long id, String question, String answer, double value,
			org.omg.IOP.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().editQuestions(
			id, question, answer, value, serviceContext);
	}

	public static java.util.List<operation.model.Questions> getAllQuestions() {
		return getService().getAllQuestions();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static QuestionsService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<QuestionsService, QuestionsService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(QuestionsService.class);

		ServiceTracker<QuestionsService, QuestionsService> serviceTracker =
			new ServiceTracker<QuestionsService, QuestionsService>(
				bundle.getBundleContext(), QuestionsService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}