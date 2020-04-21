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

import com.btpn.opera.operationsurvey.service.SurveyOperationServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the SOAP utility for the
 * <code>SurveyOperationServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.btpn.opera.operationsurvey.model.SurveyOperationSoap</code>. If the method in the
 * service utility returns a
 * <code>com.btpn.opera.operationsurvey.model.SurveyOperation</code>, that is translated to a
 * <code>com.btpn.opera.operationsurvey.model.SurveyOperationSoap</code>. Methods that SOAP
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
 * @see SurveyOperationServiceHttp
 * @generated
 */
@ProviderType
public class SurveyOperationServiceSoap {

	public static com.btpn.opera.operationsurvey.model.SurveyOperationSoap[]
			getAllSurveyOperation()
		throws RemoteException {

		try {
			java.util.List<com.btpn.opera.operationsurvey.model.SurveyOperation>
				returnValue =
					SurveyOperationServiceUtil.getAllSurveyOperation();

			return com.btpn.opera.operationsurvey.model.SurveyOperationSoap.
				toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.btpn.opera.operationsurvey.model.SurveyOperationSoap[]
			getAllSurveyOperationPaging(int startPage, int endPage)
		throws RemoteException {

		try {
			java.util.List<com.btpn.opera.operationsurvey.model.SurveyOperation>
				returnValue =
					SurveyOperationServiceUtil.getAllSurveyOperationPaging(
						startPage, endPage);

			return com.btpn.opera.operationsurvey.model.SurveyOperationSoap.
				toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.btpn.opera.operationsurvey.model.SurveyOperationSoap
			getSurveyOperationById(long id)
		throws RemoteException {

		try {
			com.btpn.opera.operationsurvey.model.SurveyOperation returnValue =
				SurveyOperationServiceUtil.getSurveyOperationById(id);

			return com.btpn.opera.operationsurvey.model.SurveyOperationSoap.
				toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.btpn.opera.operationsurvey.model.SurveyOperationSoap
			addSurveyOperation(
				long userId, String title, String description,
				long surveyObjectId, java.util.Date startdate,
				java.util.Date endDate,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.btpn.opera.operationsurvey.model.SurveyOperation returnValue =
				SurveyOperationServiceUtil.addSurveyOperation(
					userId, title, description, surveyObjectId, startdate,
					endDate, serviceContext);

			return com.btpn.opera.operationsurvey.model.SurveyOperationSoap.
				toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.btpn.opera.operationsurvey.model.SurveyOperationSoap
			editSurveyOperation(
				long userId, long id, String title, String description,
				long surveyObjectId, java.util.Date startDate,
				java.util.Date endDate,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.btpn.opera.operationsurvey.model.SurveyOperation returnValue =
				SurveyOperationServiceUtil.editSurveyOperation(
					userId, id, title, description, surveyObjectId, startDate,
					endDate, serviceContext);

			return com.btpn.opera.operationsurvey.model.SurveyOperationSoap.
				toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.btpn.opera.operationsurvey.model.SurveyOperationSoap
			deleteSurveyOperationById(long id)
		throws RemoteException {

		try {
			com.btpn.opera.operationsurvey.model.SurveyOperation returnValue =
				SurveyOperationServiceUtil.deleteSurveyOperationById(id);

			return com.btpn.opera.operationsurvey.model.SurveyOperationSoap.
				toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.btpn.opera.operationsurvey.model.SurveyOperationSoap[]
			getSurveyOperationByTitle(String title)
		throws RemoteException {

		try {
			java.util.List<com.btpn.opera.operationsurvey.model.SurveyOperation>
				returnValue =
					SurveyOperationServiceUtil.getSurveyOperationByTitle(title);

			return com.btpn.opera.operationsurvey.model.SurveyOperationSoap.
				toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.btpn.opera.operationsurvey.model.SurveyOperationSoap[]
			getSurveyOperationByTitlePaging(
				String title, int startPage, int endPage)
		throws RemoteException {

		try {
			java.util.List<com.btpn.opera.operationsurvey.model.SurveyOperation>
				returnValue =
					SurveyOperationServiceUtil.getSurveyOperationByTitlePaging(
						title, startPage, endPage);

			return com.btpn.opera.operationsurvey.model.SurveyOperationSoap.
				toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countAllSurveyOperation() throws RemoteException {
		try {
			int returnValue =
				SurveyOperationServiceUtil.countAllSurveyOperation();

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countSurveyOperationByTitle(String title)
		throws RemoteException {

		try {
			int returnValue =
				SurveyOperationServiceUtil.countSurveyOperationByTitle(title);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteAllSurveyOperation() throws RemoteException {
		try {
			SurveyOperationServiceUtil.deleteAllSurveyOperation();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteSurveyOperationAfterEndDate()
		throws RemoteException {

		try {
			SurveyOperationServiceUtil.deleteSurveyOperationAfterEndDate();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.btpn.opera.operationsurvey.model.SurveyOperationSoap[]
			getAllSurveyOperationMapping()
		throws RemoteException {

		try {
			java.util.List<com.btpn.opera.operationsurvey.model.SurveyOperation>
				returnValue =
					SurveyOperationServiceUtil.getAllSurveyOperationMapping();

			return com.btpn.opera.operationsurvey.model.SurveyOperationSoap.
				toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.btpn.opera.operationsurvey.model.SurveyOperationSoap[]
			getSurveyOperationBeforeEndDate()
		throws RemoteException {

		try {
			java.util.List<com.btpn.opera.operationsurvey.model.SurveyOperation>
				returnValue =
					SurveyOperationServiceUtil.
						getSurveyOperationBeforeEndDate();

			return com.btpn.opera.operationsurvey.model.SurveyOperationSoap.
				toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		SurveyOperationServiceSoap.class);

}