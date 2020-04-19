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

import com.btpn.opera.operationsurvey.service.QuestionsServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the HTTP utility for the
 * <code>QuestionsServiceUtil</code> service
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
 * @see QuestionsServiceSoap
 * @generated
 */
@ProviderType
public class QuestionsServiceHttp {

	public static java.util.List<com.btpn.opera.operationsurvey.model.Questions>
		getAllQuestions(HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				QuestionsServiceUtil.class, "getAllQuestions",
				_getAllQuestionsParameterTypes0);

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
				<com.btpn.opera.operationsurvey.model.Questions>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.btpn.opera.operationsurvey.model.Questions
			getQuestionsById(HttpPrincipal httpPrincipal, long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				QuestionsServiceUtil.class, "getQuestionsById",
				_getQuestionsByIdParameterTypes1);

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

			return (com.btpn.opera.operationsurvey.model.Questions)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.btpn.opera.operationsurvey.model.Questions>
		getQuestionsBySurveyOperationId(
			HttpPrincipal httpPrincipal, long surveyOperationId) {

		try {
			MethodKey methodKey = new MethodKey(
				QuestionsServiceUtil.class, "getQuestionsBySurveyOperationId",
				_getQuestionsBySurveyOperationIdParameterTypes2);

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
				<com.btpn.opera.operationsurvey.model.Questions>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.btpn.opera.operationsurvey.model.Questions addQuestions(
		HttpPrincipal httpPrincipal, String question, String answer,
		long surveyOperationId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		try {
			MethodKey methodKey = new MethodKey(
				QuestionsServiceUtil.class, "addQuestions",
				_addQuestionsParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, question, answer, surveyOperationId, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (com.btpn.opera.operationsurvey.model.Questions)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.btpn.opera.operationsurvey.model.Questions editQuestions(
			HttpPrincipal httpPrincipal, long id, String question,
			String answer, long surveyOperationId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				QuestionsServiceUtil.class, "editQuestions",
				_editQuestionsParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, id, question, answer, surveyOperationId,
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

			return (com.btpn.opera.operationsurvey.model.Questions)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.btpn.opera.operationsurvey.model.Questions
			deleteQuestionsById(HttpPrincipal httpPrincipal, long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				QuestionsServiceUtil.class, "deleteQuestionsById",
				_deleteQuestionsByIdParameterTypes5);

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

			return (com.btpn.opera.operationsurvey.model.Questions)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void deleteQuestionsByOperationSurveyId(
		HttpPrincipal httpPrincipal, long surveyOperationId) {

		try {
			MethodKey methodKey = new MethodKey(
				QuestionsServiceUtil.class,
				"deleteQuestionsByOperationSurveyId",
				_deleteQuestionsByOperationSurveyIdParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, surveyOperationId);

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

	private static Log _log = LogFactoryUtil.getLog(QuestionsServiceHttp.class);

	private static final Class<?>[] _getAllQuestionsParameterTypes0 =
		new Class[] {};
	private static final Class<?>[] _getQuestionsByIdParameterTypes1 =
		new Class[] {long.class};
	private static final Class<?>[]
		_getQuestionsBySurveyOperationIdParameterTypes2 = new Class[] {
			long.class
		};
	private static final Class<?>[] _addQuestionsParameterTypes3 = new Class[] {
		String.class, String.class, long.class,
		com.liferay.portal.kernel.service.ServiceContext.class
	};
	private static final Class<?>[] _editQuestionsParameterTypes4 =
		new Class[] {
			long.class, String.class, String.class, long.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteQuestionsByIdParameterTypes5 =
		new Class[] {long.class};
	private static final Class<?>[]
		_deleteQuestionsByOperationSurveyIdParameterTypes6 = new Class[] {
			long.class
		};

}