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
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the HTTP utility for the
 * <code>AnswersServiceUtil</code> service
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
 * @see AnswersServiceSoap
 * @generated
 */
@ProviderType
public class AnswersServiceHttp {

	public static java.util.List<com.btpn.opera.operationsurvey.model.Answers>
		getAllAnswers(HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				AnswersServiceUtil.class, "getAllAnswers",
				_getAllAnswersParameterTypes0);

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
				<com.btpn.opera.operationsurvey.model.Answers>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.btpn.opera.operationsurvey.model.Answers getAnswersById(
			HttpPrincipal httpPrincipal, long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				AnswersServiceUtil.class, "getAnswersById",
				_getAnswersByIdParameterTypes1);

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

			return (com.btpn.opera.operationsurvey.model.Answers)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.btpn.opera.operationsurvey.model.Answers addAnswers(
			HttpPrincipal httpPrincipal, String answer, double value,
			long questionsId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				AnswersServiceUtil.class, "addAnswers",
				_addAnswersParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, answer, value, questionsId, serviceContext);

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

			return (com.btpn.opera.operationsurvey.model.Answers)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.btpn.opera.operationsurvey.model.Answers editAnswers(
			HttpPrincipal httpPrincipal, long id, String answer, double value,
			long questionsId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				AnswersServiceUtil.class, "editAnswers",
				_editAnswersParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, id, answer, value, questionsId, serviceContext);

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

			return (com.btpn.opera.operationsurvey.model.Answers)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.btpn.opera.operationsurvey.model.Answers
			deleteAnswersById(HttpPrincipal httpPrincipal, long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				AnswersServiceUtil.class, "deleteAnswersById",
				_deleteAnswersByIdParameterTypes4);

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

			return (com.btpn.opera.operationsurvey.model.Answers)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.btpn.opera.operationsurvey.model.Answers>
		getAnswersByQuestionsId(HttpPrincipal httpPrincipal, long questionsId) {

		try {
			MethodKey methodKey = new MethodKey(
				AnswersServiceUtil.class, "getAnswersByQuestionsId",
				_getAnswersByQuestionsIdParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, questionsId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.List
				<com.btpn.opera.operationsurvey.model.Answers>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(AnswersServiceHttp.class);

	private static final Class<?>[] _getAllAnswersParameterTypes0 =
		new Class[] {};
	private static final Class<?>[] _getAnswersByIdParameterTypes1 =
		new Class[] {long.class};
	private static final Class<?>[] _addAnswersParameterTypes2 = new Class[] {
		String.class, double.class, long.class,
		com.liferay.portal.kernel.service.ServiceContext.class
	};
	private static final Class<?>[] _editAnswersParameterTypes3 = new Class[] {
		long.class, String.class, double.class, long.class,
		com.liferay.portal.kernel.service.ServiceContext.class
	};
	private static final Class<?>[] _deleteAnswersByIdParameterTypes4 =
		new Class[] {long.class};
	private static final Class<?>[] _getAnswersByQuestionsIdParameterTypes5 =
		new Class[] {long.class};

}