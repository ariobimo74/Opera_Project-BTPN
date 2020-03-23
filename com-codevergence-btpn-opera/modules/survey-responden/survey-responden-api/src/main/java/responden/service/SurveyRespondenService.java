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

package responden.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.spring.osgi.OSGiBeanProperties;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

import responden.model.SurveyResponden;

/**
 * Provides the remote service interface for SurveyResponden. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see SurveyRespondenServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@OSGiBeanProperties(
	property = {
		"json.web.service.context.name=responden",
		"json.web.service.context.path=SurveyResponden"
	},
	service = SurveyRespondenService.class
)
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface SurveyRespondenService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SurveyRespondenServiceUtil} to access the survey responden remote service. Add custom service methods to <code>responden.service.impl.SurveyRespondenServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public SurveyResponden addSurveyRespondenByAdmin(
			String nik, long surveyId, ServiceContext serviceContext)
		throws PortalException;

	public SurveyResponden deleteSurveyrespondenByIdByAdmin(long id)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SurveyResponden> getAllSurveyResponden();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public SurveyResponden getSurveyRespondenById(long id)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SurveyResponden> getSurveyRespondenBySurveyId(long surveyId);

	public SurveyResponden updateSurveyRespondenByUser(
			long id, Double answer1, Double answer2, Double answer3,
			Double answer4, Double answer5, Double answer6, Double answer7,
			Double answer8, Double answer9, Double answer10, String note,
			String status, ServiceContext serviceContext)
		throws PortalException;

}