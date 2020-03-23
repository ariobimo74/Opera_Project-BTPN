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
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import org.osgi.annotation.versioning.ProviderType;

import responden.service.SurveyRespondenServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>SurveyRespondenServiceUtil</code> service
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
 * @see SurveyRespondenServiceSoap
 * @generated
 */
@ProviderType
public class SurveyRespondenServiceHttp {

	public static java.util.List<responden.model.SurveyResponden>
		getAllSurveyResponden(HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				SurveyRespondenServiceUtil.class, "getAllSurveyResponden",
				_getAllSurveyRespondenParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.List<responden.model.SurveyResponden>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static responden.model.SurveyResponden getSurveyRespondenById(
			HttpPrincipal httpPrincipal, long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				SurveyRespondenServiceUtil.class, "getSurveyRespondenById",
				_getSurveyRespondenByIdParameterTypes1);

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

			return (responden.model.SurveyResponden)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static responden.model.SurveyResponden addSurveyRespondenByAdmin(
			HttpPrincipal httpPrincipal, String nik, long surveyId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				SurveyRespondenServiceUtil.class, "addSurveyRespondenByAdmin",
				_addSurveyRespondenByAdminParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, nik, surveyId, serviceContext);

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

			return (responden.model.SurveyResponden)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static responden.model.SurveyResponden updateSurveyRespondenByUser(
			HttpPrincipal httpPrincipal, long id, Double answer1,
			Double answer2, Double answer3, Double answer4, Double answer5,
			Double answer6, Double answer7, Double answer8, Double answer9,
			Double answer10, String note, String status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				SurveyRespondenServiceUtil.class, "updateSurveyRespondenByUser",
				_updateSurveyRespondenByUserParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, id, answer1, answer2, answer3, answer4, answer5,
				answer6, answer7, answer8, answer9, answer10, note, status,
				serviceContext);

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

			return (responden.model.SurveyResponden)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static responden.model.SurveyResponden
			deleteSurveyrespondenByIdByAdmin(
				HttpPrincipal httpPrincipal, long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				SurveyRespondenServiceUtil.class,
				"deleteSurveyrespondenByIdByAdmin",
				_deleteSurveyrespondenByIdByAdminParameterTypes4);

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

			return (responden.model.SurveyResponden)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<responden.model.SurveyResponden>
		getSurveyRespondenBySurveyId(
			HttpPrincipal httpPrincipal, long surveyId) {

		try {
			MethodKey methodKey = new MethodKey(
				SurveyRespondenServiceUtil.class,
				"getSurveyRespondenBySurveyId",
				_getSurveyRespondenBySurveyIdParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, surveyId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.List<responden.model.SurveyResponden>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		SurveyRespondenServiceHttp.class);

	private static final Class<?>[] _getAllSurveyRespondenParameterTypes0 =
		new Class[] {};
	private static final Class<?>[] _getSurveyRespondenByIdParameterTypes1 =
		new Class[] {long.class};
	private static final Class<?>[] _addSurveyRespondenByAdminParameterTypes2 =
		new Class[] {
			String.class, long.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[]
		_updateSurveyRespondenByUserParameterTypes3 = new Class[] {
			long.class, Double.class, Double.class, Double.class, Double.class,
			Double.class, Double.class, Double.class, Double.class,
			Double.class, Double.class, String.class, String.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[]
		_deleteSurveyrespondenByIdByAdminParameterTypes4 = new Class[] {
			long.class
		};
	private static final Class<?>[]
		_getSurveyRespondenBySurveyIdParameterTypes5 = new Class[] {long.class};

}