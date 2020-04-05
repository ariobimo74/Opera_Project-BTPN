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

package operation.service.impl;

import com.liferay.portal.aop.AopService;

import operation.model.SurveyObject;
import operation.service.base.SurveyObjectServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * The implementation of the survey object remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>operation.service.SurveyObjectService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyObjectServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=surveyoperation",
		"json.web.service.context.path=SurveyObject"
	},
	service = AopService.class
)
public class SurveyObjectServiceImpl extends SurveyObjectServiceBaseImpl
{
	public List<SurveyObject> getAllSurveyObject()
	{
		return surveyObjectLocalService.getAllSurveyObjext();
	}
}