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

package responden.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

import org.osgi.annotation.versioning.ProviderType;

import responden.service.SurveyRespondenServiceUtil;

/**
 * Provides the SOAP utility for the
 * <code>SurveyRespondenServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>responden.model.SurveyRespondenSoap</code>. If the method in the
 * service utility returns a
 * <code>responden.model.SurveyResponden</code>, that is translated to a
 * <code>responden.model.SurveyRespondenSoap</code>. Methods that SOAP
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
 * @see SurveyRespondenServiceHttp
 * @generated
 */
@ProviderType
public class SurveyRespondenServiceSoap {

	public static responden.model.SurveyRespondenSoap[] getAllSurveyResponden()
		throws RemoteException {

		try {
			java.util.List<responden.model.SurveyResponden> returnValue =
				SurveyRespondenServiceUtil.getAllSurveyResponden();

			return responden.model.SurveyRespondenSoap.toSoapModels(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static responden.model.SurveyRespondenSoap getSurveyRespondenById(
			long id)
		throws RemoteException {

		try {
			responden.model.SurveyResponden returnValue =
				SurveyRespondenServiceUtil.getSurveyRespondenById(id);

			return responden.model.SurveyRespondenSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static responden.model.SurveyRespondenSoap addSurveyRespondenByAdmin(
			String nik, long surveyId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			responden.model.SurveyResponden returnValue =
				SurveyRespondenServiceUtil.addSurveyRespondenByAdmin(
					nik, surveyId, serviceContext);

			return responden.model.SurveyRespondenSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static responden.model.SurveyRespondenSoap
			updateSurveyRespondenByUser(
				long id, Double answer1, Double answer2, Double answer3,
				Double answer4, Double answer5, Double answer6, Double answer7,
				Double answer8, Double answer9, Double answer10, String note,
				String status,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			responden.model.SurveyResponden returnValue =
				SurveyRespondenServiceUtil.updateSurveyRespondenByUser(
					id, answer1, answer2, answer3, answer4, answer5, answer6,
					answer7, answer8, answer9, answer10, note, status,
					serviceContext);

			return responden.model.SurveyRespondenSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static responden.model.SurveyRespondenSoap
			deleteSurveyrespondenByIdByAdmin(long id)
		throws RemoteException {

		try {
			responden.model.SurveyResponden returnValue =
				SurveyRespondenServiceUtil.deleteSurveyrespondenByIdByAdmin(id);

			return responden.model.SurveyRespondenSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static responden.model.SurveyRespondenSoap[]
			getSurveyRespondenBySurveyId(long surveyId)
		throws RemoteException {

		try {
			java.util.List<responden.model.SurveyResponden> returnValue =
				SurveyRespondenServiceUtil.getSurveyRespondenBySurveyId(
					surveyId);

			return responden.model.SurveyRespondenSoap.toSoapModels(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		SurveyRespondenServiceSoap.class);

}