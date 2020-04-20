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

package com.btpn.opera.operationsurvey.service.http;

import com.btpn.opera.operationsurvey.service.RespondenServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the SOAP utility for the
 * <code>RespondenServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.btpn.opera.operationsurvey.model.RespondenSoap</code>. If the method in the
 * service utility returns a
 * <code>com.btpn.opera.operationsurvey.model.Responden</code>, that is translated to a
 * <code>com.btpn.opera.operationsurvey.model.RespondenSoap</code>. Methods that SOAP
 * cannot safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RespondenServiceHttp
 * @generated
 */
@ProviderType
public class RespondenServiceSoap {

	public static com.btpn.opera.operationsurvey.model.RespondenSoap[]
			getAllResponden()
		throws RemoteException {

		try {
			java.util.List<com.btpn.opera.operationsurvey.model.Responden>
				returnValue = RespondenServiceUtil.getAllResponden();

			return com.btpn.opera.operationsurvey.model.RespondenSoap.
				toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.btpn.opera.operationsurvey.model.RespondenSoap
			getRespondenById(long id)
		throws RemoteException {

		try {
			com.btpn.opera.operationsurvey.model.Responden returnValue =
				RespondenServiceUtil.getRespondenById(id);

			return com.btpn.opera.operationsurvey.model.RespondenSoap.
				toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.btpn.opera.operationsurvey.model.RespondenSoap
			addRespondenByAdmin(
				String nik, String fullName, String lob, String division,
				long surveyOperationId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.btpn.opera.operationsurvey.model.Responden returnValue =
				RespondenServiceUtil.addRespondenByAdmin(
					nik, fullName, lob, division, surveyOperationId,
					serviceContext);

			return com.btpn.opera.operationsurvey.model.RespondenSoap.
				toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.btpn.opera.operationsurvey.model.RespondenSoap
			updateRespondenByUser(
				long id, double totalValue, String answerRecord, String notes,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.btpn.opera.operationsurvey.model.Responden returnValue =
				RespondenServiceUtil.updateRespondenByUser(
					id, totalValue, answerRecord, notes, serviceContext);

			return com.btpn.opera.operationsurvey.model.RespondenSoap.
				toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.btpn.opera.operationsurvey.model.RespondenSoap
			deleteRespondenById(long id)
		throws RemoteException {

		try {
			com.btpn.opera.operationsurvey.model.Responden returnValue =
				RespondenServiceUtil.deleteRespondenById(id);

			return com.btpn.opera.operationsurvey.model.RespondenSoap.
				toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.btpn.opera.operationsurvey.model.RespondenSoap[]
			getRespondenBySurveyOperationId(long surveyOperationId)
		throws RemoteException {

		try {
			java.util.List<com.btpn.opera.operationsurvey.model.Responden>
				returnValue =
					RespondenServiceUtil.getRespondenBySurveyOperationId(
						surveyOperationId);

			return com.btpn.opera.operationsurvey.model.RespondenSoap.
				toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteRespondenBySurveyOperationId(
			long surveyOperationId)
		throws RemoteException {

		try {
			RespondenServiceUtil.deleteRespondenBySurveyOperationId(
				surveyOperationId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(RespondenServiceSoap.class);

}