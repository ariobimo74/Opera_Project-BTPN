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

package operation.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link AnswersService}.
 *
 * @author Brian Wing Shun Chan
 * @see AnswersService
 * @generated
 */
@ProviderType
public class AnswersServiceWrapper
	implements AnswersService, ServiceWrapper<AnswersService> {

	public AnswersServiceWrapper(AnswersService answersService) {
		_answersService = answersService;
	}

	@Override
	public operation.model.Answers addAnswers(
			String answer, long value,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _answersService.addAnswers(answer, value, serviceContext);
	}

	@Override
	public void deleteAllAnswers() {
		_answersService.deleteAllAnswers();
	}

	@Override
	public operation.model.Answers deleteAnswersById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _answersService.deleteAnswersById(id);
	}

	@Override
	public operation.model.Answers editAnswers(
			long id, String answer, double value,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _answersService.editAnswers(id, answer, value, serviceContext);
	}

	@Override
	public java.util.List<operation.model.Answers> getAllAnswers() {
		return _answersService.getAllAnswers();
	}

	@Override
	public operation.model.Answers getAnswersById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _answersService.getAnswersById(id);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _answersService.getOSGiServiceIdentifier();
	}

	@Override
	public AnswersService getWrappedService() {
		return _answersService;
	}

	@Override
	public void setWrappedService(AnswersService answersService) {
		_answersService = answersService;
	}

	private AnswersService _answersService;

}