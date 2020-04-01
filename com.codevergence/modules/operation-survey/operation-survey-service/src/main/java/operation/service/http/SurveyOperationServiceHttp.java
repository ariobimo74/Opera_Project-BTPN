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
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import operation.service.SurveyOperationServiceUtil;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the HTTP utility for the
 * <code>SurveyOperationServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationServiceSoap
 * @generated
 */
@ProviderType
public class SurveyOperationServiceHttp {

	public static java.util.List<operation.model.SurveyOperation>
		getAllSurveyOperation(HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				SurveyOperationServiceUtil.class, "getAllSurveyOperation",
				_getAllSurveyOperationParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.List<operation.model.SurveyOperation>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static operation.model.SurveyOperation getSurveyOperationById(
			HttpPrincipal httpPrincipal, long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				SurveyOperationServiceUtil.class, "getSurveyOperationById",
				_getSurveyOperationByIdParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey, id);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (operation.model.SurveyOperation)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static operation.model.SurveyOperation addSurveyOperation(
		HttpPrincipal httpPrincipal, String title, String description,
		String surveyObj, java.util.Date startDate, java.util.Date endDate,
		String status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		try {
			MethodKey methodKey = new MethodKey(
				SurveyOperationServiceUtil.class, "addSurveyOperation",
				_addSurveyOperationParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, title, description, surveyObj, startDate, endDate,
				status, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (operation.model.SurveyOperation)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static operation.model.SurveyOperation editSurveyOperation(
			HttpPrincipal httpPrincipal, long id, String title,
			String description, String surveyObj, java.util.Date startDate,
			java.util.Date endDate, String status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				SurveyOperationServiceUtil.class, "editSurveyOperation",
				_editSurveyOperationParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, id, title, description, surveyObj, startDate,
				endDate, status, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (operation.model.SurveyOperation)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static operation.model.SurveyOperation deleteSurveyOperationById(
			HttpPrincipal httpPrincipal, long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				SurveyOperationServiceUtil.class, "deleteSurveyOperationById",
				_deleteSurveyOperationByIdParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey, id);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (operation.model.SurveyOperation)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void deleteAllSurveyOperation(HttpPrincipal httpPrincipal) {
		try {
			MethodKey methodKey = new MethodKey(
				SurveyOperationServiceUtil.class, "deleteAllSurveyOperation",
				_deleteAllSurveyOperationParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<operation.model.SurveyOperation>
		getSurveyOperationByTitle(HttpPrincipal httpPrincipal, String title) {

		try {
			MethodKey methodKey = new MethodKey(
				SurveyOperationServiceUtil.class, "getSurveyOperationByTitle",
				_getSurveyOperationByTitleParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(methodKey, title);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.List<operation.model.SurveyOperation>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static int countAllSurveyOperation(HttpPrincipal httpPrincipal) {
		try {
			MethodKey methodKey = new MethodKey(
				SurveyOperationServiceUtil.class, "countAllSurveyOperation",
				_countAllSurveyOperationParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static int countSurveyOperationByTitle(
		HttpPrincipal httpPrincipal, String title) {

		try {
			MethodKey methodKey = new MethodKey(
				SurveyOperationServiceUtil.class, "countSurveyOperationByTitle",
				_countSurveyOperationByTitleParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(methodKey, title);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		SurveyOperationServiceHttp.class);

	private static final Class<?>[] _getAllSurveyOperationParameterTypes0 =
		new Class[] {};
	private static final Class<?>[] _getSurveyOperationByIdParameterTypes1 =
		new Class[] {long.class};
	private static final Class<?>[] _addSurveyOperationParameterTypes2 =
		new Class[] {
			String.class, String.class, String.class, java.util.Date.class,
			java.util.Date.class, String.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _editSurveyOperationParameterTypes3 =
		new Class[] {
			long.class, String.class, String.class, String.class,
			java.util.Date.class, java.util.Date.class, String.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteSurveyOperationByIdParameterTypes4 =
		new Class[] {long.class};
	private static final Class<?>[] _deleteAllSurveyOperationParameterTypes5 =
		new Class[] {};
	private static final Class<?>[] _getSurveyOperationByTitleParameterTypes6 =
		new Class[] {String.class};
	private static final Class<?>[] _countAllSurveyOperationParameterTypes7 =
		new Class[] {};
	private static final Class<?>[]
		_countSurveyOperationByTitleParameterTypes8 = new Class[] {
			String.class
		};

}