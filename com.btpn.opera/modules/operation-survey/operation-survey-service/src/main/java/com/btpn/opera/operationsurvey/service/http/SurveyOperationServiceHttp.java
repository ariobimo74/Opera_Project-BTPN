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
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

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

	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperation>
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

			return (java.util.List
				<com.btpn.opera.operationsurvey.model.SurveyOperation>)
					returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperation>
			getAllSurveyOperationPaging(
				HttpPrincipal httpPrincipal, int startPage, int endPage) {

		try {
			MethodKey methodKey = new MethodKey(
				SurveyOperationServiceUtil.class, "getAllSurveyOperationPaging",
				_getAllSurveyOperationPagingParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, startPage, endPage);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.List
				<com.btpn.opera.operationsurvey.model.SurveyOperation>)
					returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.btpn.opera.operationsurvey.model.SurveyOperation
			getSurveyOperationById(HttpPrincipal httpPrincipal, long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				SurveyOperationServiceUtil.class, "getSurveyOperationById",
				_getSurveyOperationByIdParameterTypes2);

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

			return (com.btpn.opera.operationsurvey.model.SurveyOperation)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.btpn.opera.operationsurvey.model.SurveyOperation
			addSurveyOperation(
				HttpPrincipal httpPrincipal, long userId, String title,
				String description, long surveyObjectId,
				java.util.Date startdate, java.util.Date endDate,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				SurveyOperationServiceUtil.class, "addSurveyOperation",
				_addSurveyOperationParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, userId, title, description, surveyObjectId,
				startdate, endDate, serviceContext);

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

			return (com.btpn.opera.operationsurvey.model.SurveyOperation)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.btpn.opera.operationsurvey.model.SurveyOperation
			editSurveyOperation(
				HttpPrincipal httpPrincipal, long userId, long id, String title,
				String description, long surveyObjectId,
				java.util.Date startDate, java.util.Date endDate,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				SurveyOperationServiceUtil.class, "editSurveyOperation",
				_editSurveyOperationParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, userId, id, title, description, surveyObjectId,
				startDate, endDate, serviceContext);

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

			return (com.btpn.opera.operationsurvey.model.SurveyOperation)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.btpn.opera.operationsurvey.model.SurveyOperation
			deleteSurveyOperationById(HttpPrincipal httpPrincipal, long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				SurveyOperationServiceUtil.class, "deleteSurveyOperationById",
				_deleteSurveyOperationByIdParameterTypes5);

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

			return (com.btpn.opera.operationsurvey.model.SurveyOperation)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperation>
			getSurveyOperationByTitle(
				HttpPrincipal httpPrincipal, String title) {

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

			return (java.util.List
				<com.btpn.opera.operationsurvey.model.SurveyOperation>)
					returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperation>
			getSurveyOperationByTitlePaging(
				HttpPrincipal httpPrincipal, String title, int startPage,
				int endPage) {

		try {
			MethodKey methodKey = new MethodKey(
				SurveyOperationServiceUtil.class,
				"getSurveyOperationByTitlePaging",
				_getSurveyOperationByTitlePagingParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, title, startPage, endPage);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.List
				<com.btpn.opera.operationsurvey.model.SurveyOperation>)
					returnObj;
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
				_countAllSurveyOperationParameterTypes8);

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
				_countSurveyOperationByTitleParameterTypes9);

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

	public static void deleteAllSurveyOperation(HttpPrincipal httpPrincipal) {
		try {
			MethodKey methodKey = new MethodKey(
				SurveyOperationServiceUtil.class, "deleteAllSurveyOperation",
				_deleteAllSurveyOperationParameterTypes10);

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

	public static void deleteSurveyOperationAfterEndDate(
			HttpPrincipal httpPrincipal)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				SurveyOperationServiceUtil.class,
				"deleteSurveyOperationAfterEndDate",
				_deleteSurveyOperationAfterEndDateParameterTypes11);

			MethodHandler methodHandler = new MethodHandler(methodKey);

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

	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperationView>
			getAllSurveyOperationMapping(HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				SurveyOperationServiceUtil.class,
				"getAllSurveyOperationMapping",
				_getAllSurveyOperationMappingParameterTypes12);

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
				<com.btpn.opera.operationsurvey.model.SurveyOperationView>)
					returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperation>
			getSurveyOperationBeforeEndDate(HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				SurveyOperationServiceUtil.class,
				"getSurveyOperationBeforeEndDate",
				_getSurveyOperationBeforeEndDateParameterTypes13);

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
				<com.btpn.opera.operationsurvey.model.SurveyOperation>)
					returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List
		<com.btpn.opera.operationsurvey.model.SurveyOperation>
			getSurveyOperationByTitleQuery(
				HttpPrincipal httpPrincipal, String title) {

		try {
			MethodKey methodKey = new MethodKey(
				SurveyOperationServiceUtil.class,
				"getSurveyOperationByTitleQuery",
				_getSurveyOperationByTitleQueryParameterTypes14);

			MethodHandler methodHandler = new MethodHandler(methodKey, title);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.List
				<com.btpn.opera.operationsurvey.model.SurveyOperation>)
					returnObj;
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
	private static final Class<?>[]
		_getAllSurveyOperationPagingParameterTypes1 = new Class[] {
			int.class, int.class
		};
	private static final Class<?>[] _getSurveyOperationByIdParameterTypes2 =
		new Class[] {long.class};
	private static final Class<?>[] _addSurveyOperationParameterTypes3 =
		new Class[] {
			long.class, String.class, String.class, long.class,
			java.util.Date.class, java.util.Date.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _editSurveyOperationParameterTypes4 =
		new Class[] {
			long.class, long.class, String.class, String.class, long.class,
			java.util.Date.class, java.util.Date.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteSurveyOperationByIdParameterTypes5 =
		new Class[] {long.class};
	private static final Class<?>[] _getSurveyOperationByTitleParameterTypes6 =
		new Class[] {String.class};
	private static final Class<?>[]
		_getSurveyOperationByTitlePagingParameterTypes7 = new Class[] {
			String.class, int.class, int.class
		};
	private static final Class<?>[] _countAllSurveyOperationParameterTypes8 =
		new Class[] {};
	private static final Class<?>[]
		_countSurveyOperationByTitleParameterTypes9 = new Class[] {
			String.class
		};
	private static final Class<?>[] _deleteAllSurveyOperationParameterTypes10 =
		new Class[] {};
	private static final Class<?>[]
		_deleteSurveyOperationAfterEndDateParameterTypes11 = new Class[] {};
	private static final Class<?>[]
		_getAllSurveyOperationMappingParameterTypes12 = new Class[] {};
	private static final Class<?>[]
		_getSurveyOperationBeforeEndDateParameterTypes13 = new Class[] {};
	private static final Class<?>[]
		_getSurveyOperationByTitleQueryParameterTypes14 = new Class[] {
			String.class
		};

}