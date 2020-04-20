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
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the HTTP utility for the
 * <code>RespondenServiceUtil</code> service
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
 * @see RespondenServiceSoap
 * @generated
 */
@ProviderType
public class RespondenServiceHttp {

	public static java.util.List<com.btpn.opera.operationsurvey.model.Responden>
		getAllResponden(HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				RespondenServiceUtil.class, "getAllResponden",
				_getAllRespondenParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.List
				<com.btpn.opera.operationsurvey.model.Responden>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.btpn.opera.operationsurvey.model.Responden
			getRespondenById(HttpPrincipal httpPrincipal, long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				RespondenServiceUtil.class, "getRespondenById",
				_getRespondenByIdParameterTypes1);

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

			return (com.btpn.opera.operationsurvey.model.Responden)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.btpn.opera.operationsurvey.model.Responden
		addRespondenByAdmin(
			HttpPrincipal httpPrincipal, String nik, String fullName,
			String lob, String division, long surveyOperationId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		try {
			MethodKey methodKey = new MethodKey(
				RespondenServiceUtil.class, "addRespondenByAdmin",
				_addRespondenByAdminParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, nik, fullName, lob, division, surveyOperationId,
				serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (com.btpn.opera.operationsurvey.model.Responden)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.btpn.opera.operationsurvey.model.Responden
			updateRespondenByUser(
				HttpPrincipal httpPrincipal, long id, double totalValue,
				String answerRecord, String notes,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				RespondenServiceUtil.class, "updateRespondenByUser",
				_updateRespondenByUserParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, id, totalValue, answerRecord, notes, serviceContext);

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

			return (com.btpn.opera.operationsurvey.model.Responden)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.btpn.opera.operationsurvey.model.Responden
			deleteRespondenById(HttpPrincipal httpPrincipal, long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				RespondenServiceUtil.class, "deleteRespondenById",
				_deleteRespondenByIdParameterTypes4);

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

			return (com.btpn.opera.operationsurvey.model.Responden)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.btpn.opera.operationsurvey.model.Responden>
		getRespondenBySurveyOperationId(
			HttpPrincipal httpPrincipal, long surveyOperationId) {

		try {
			MethodKey methodKey = new MethodKey(
				RespondenServiceUtil.class, "getRespondenBySurveyOperationId",
				_getRespondenBySurveyOperationIdParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, surveyOperationId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.List
				<com.btpn.opera.operationsurvey.model.Responden>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void deleteRespondenBySurveyOperationId(
			HttpPrincipal httpPrincipal, long surveyOperationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				RespondenServiceUtil.class,
				"deleteRespondenBySurveyOperationId",
				_deleteRespondenBySurveyOperationIdParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, surveyOperationId);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
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
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(RespondenServiceHttp.class);

	private static final Class<?>[] _getAllRespondenParameterTypes0 =
		new Class[] {};
	private static final Class<?>[] _getRespondenByIdParameterTypes1 =
		new Class[] {long.class};
	private static final Class<?>[] _addRespondenByAdminParameterTypes2 =
		new Class[] {
			String.class, String.class, String.class, String.class, long.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _updateRespondenByUserParameterTypes3 =
		new Class[] {
			long.class, double.class, String.class, String.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteRespondenByIdParameterTypes4 =
		new Class[] {long.class};
	private static final Class<?>[]
		_getRespondenBySurveyOperationIdParameterTypes5 = new Class[] {
			long.class
		};
	private static final Class<?>[]
		_deleteRespondenBySurveyOperationIdParameterTypes6 = new Class[] {
			long.class
		};

}