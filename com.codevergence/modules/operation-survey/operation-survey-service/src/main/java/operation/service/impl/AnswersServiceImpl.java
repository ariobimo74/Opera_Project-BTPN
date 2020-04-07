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
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import operation.model.Answers;
import operation.service.base.AnswersServiceBaseImpl;
import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * The implementation of the answers remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>operation.service.AnswersService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AnswersServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=surveyoperation",
		"json.web.service.context.path=Answers"
	},
	service = AopService.class
)
public class AnswersServiceImpl extends AnswersServiceBaseImpl
{
	public List<Answers> getAllAnswers()
	{
		return answersLocalService.getAllAnswers();
	}

	public Answers getAnswersById(long id) throws PortalException
	{
		return answersLocalService.getAnswersById(id);
	}

	public Answers addAnswers(String answer, long value, ServiceContext serviceContext) throws PortalException
	{
		return answersLocalService.addAnswers(answer, value, serviceContext);
	}

	public Answers editAnswers(long id, String answer, double value, ServiceContext serviceContext) throws PortalException
	{
		return answersLocalService.editAnswers(id, answer, value, serviceContext);
	}

	public Answers deleteAnswersById(long id) throws PortalException
	{
		return answersLocalService.deleteAnswersById(id);
	}

	public void deleteAllAnswers()
	{
		answersLocalService.deleteAllAnswers();
	}
}