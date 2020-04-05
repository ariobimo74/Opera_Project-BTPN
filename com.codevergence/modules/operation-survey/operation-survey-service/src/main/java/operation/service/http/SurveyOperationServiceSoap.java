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

package operation.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

import operation.service.SurveyOperationServiceUtil;

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
 * <code>operation.model.SurveyOperationSoap</code>. If the method in the
 * service utility returns a
 * <code>operation.model.SurveyOperation</code>, that is translated to a
 * <code>operation.model.SurveyOperationSoap</code>. Methods that SOAP
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

	public static operation.model.SurveyOperationSoap[] getAllSurveyOperation()
		throws RemoteException {

		try {
			java.util.List<operation.model.SurveyOperation> returnValue =
				SurveyOperationServiceUtil.getAllSurveyOperation();

			return operation.model.SurveyOperationSoap.toSoapModels(
				returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static operation.model.SurveyOperationSoap getSurveyOperationById(
			long id)
		throws RemoteException {

		try {
			operation.model.SurveyOperation returnValue =
				SurveyOperationServiceUtil.getSurveyOperationById(id);

			return operation.model.SurveyOperationSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static operation.model.SurveyOperationSoap addSurveyOperation(
			String title, String description, String surveyObj,
			java.util.Date startDate, java.util.Date endDate,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			operation.model.SurveyOperation returnValue =
				SurveyOperationServiceUtil.addSurveyOperation(
					title, description, surveyObj, startDate, endDate,
					serviceContext);

			return operation.model.SurveyOperationSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static operation.model.SurveyOperationSoap editSurveyOperation(
			long id, String title, String description, String surveyObj,
			java.util.Date startDate, java.util.Date endDate,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			operation.model.SurveyOperation returnValue =
				SurveyOperationServiceUtil.editSurveyOperation(
					id, title, description, surveyObj, startDate, endDate,
					serviceContext);

			return operation.model.SurveyOperationSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static operation.model.SurveyOperationSoap deleteSurveyOperationById(
			long id)
		throws RemoteException {

		try {
			operation.model.SurveyOperation returnValue =
				SurveyOperationServiceUtil.deleteSurveyOperationById(id);

			return operation.model.SurveyOperationSoap.toSoapModel(returnValue);
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

	public static operation.model.SurveyOperationSoap[]
			getSurveyOperationByTitle(String title)
		throws RemoteException {

		try {
			java.util.List<operation.model.SurveyOperation> returnValue =
				SurveyOperationServiceUtil.getSurveyOperationByTitle(title);

			return operation.model.SurveyOperationSoap.toSoapModels(
				returnValue);
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

	public static operation.model.SurveyOperationSoap[]
			getSurveyOperationBeforeEndDate()
		throws RemoteException {

		try {
			java.util.List<operation.model.SurveyOperation> returnValue =
				SurveyOperationServiceUtil.getSurveyOperationBeforeEndDate();

			return operation.model.SurveyOperationSoap.toSoapModels(
				returnValue);
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

	private static Log _log = LogFactoryUtil.getLog(
		SurveyOperationServiceSoap.class);

}