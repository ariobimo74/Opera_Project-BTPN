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

import com.btpn.opera.operationsurvey.service.AnswersServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the SOAP utility for the
 * <code>AnswersServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.btpn.opera.operationsurvey.model.AnswersSoap</code>. If the method in the
 * service utility returns a
 * <code>com.btpn.opera.operationsurvey.model.Answers</code>, that is translated to a
 * <code>com.btpn.opera.operationsurvey.model.AnswersSoap</code>. Methods that SOAP
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
 * @see AnswersServiceHttp
 * @generated
 */
@ProviderType
public class AnswersServiceSoap {

	public static com.btpn.opera.operationsurvey.model.AnswersSoap[]
			getAllAnswers()
		throws RemoteException {

		try {
			java.util.List<com.btpn.opera.operationsurvey.model.Answers>
				returnValue = AnswersServiceUtil.getAllAnswers();

			return com.btpn.opera.operationsurvey.model.AnswersSoap.
				toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.btpn.opera.operationsurvey.model.AnswersSoap
			getAnswersById(long id)
		throws RemoteException {

		try {
			com.btpn.opera.operationsurvey.model.Answers returnValue =
				AnswersServiceUtil.getAnswersById(id);

			return com.btpn.opera.operationsurvey.model.AnswersSoap.toSoapModel(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.btpn.opera.operationsurvey.model.AnswersSoap addAnswers(
			String answer, double value, long questionsId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.btpn.opera.operationsurvey.model.Answers returnValue =
				AnswersServiceUtil.addAnswers(
					answer, value, questionsId, serviceContext);

			return com.btpn.opera.operationsurvey.model.AnswersSoap.toSoapModel(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.btpn.opera.operationsurvey.model.AnswersSoap editAnswers(
			long id, String answer, double value, long questionsId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.btpn.opera.operationsurvey.model.Answers returnValue =
				AnswersServiceUtil.editAnswers(
					id, answer, value, questionsId, serviceContext);

			return com.btpn.opera.operationsurvey.model.AnswersSoap.toSoapModel(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.btpn.opera.operationsurvey.model.AnswersSoap
			deleteAnswersById(long id)
		throws RemoteException {

		try {
			com.btpn.opera.operationsurvey.model.Answers returnValue =
				AnswersServiceUtil.deleteAnswersById(id);

			return com.btpn.opera.operationsurvey.model.AnswersSoap.toSoapModel(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.btpn.opera.operationsurvey.model.AnswersSoap[]
			getAnswersByQuestionsId(long questionsId)
		throws RemoteException {

		try {
			java.util.List<com.btpn.opera.operationsurvey.model.Answers>
				returnValue = AnswersServiceUtil.getAnswersByQuestionsId(
					questionsId);

			return com.btpn.opera.operationsurvey.model.AnswersSoap.
				toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(AnswersServiceSoap.class);

}