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

package com.btpn.opera.operationsurvey.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link SurveyOperationUsersView}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationUsersView
 * @generated
 */
@ProviderType
public class SurveyOperationUsersViewWrapper
	extends BaseModelWrapper<SurveyOperationUsersView>
	implements SurveyOperationUsersView,
			   ModelWrapper<SurveyOperationUsersView> {

	public SurveyOperationUsersViewWrapper(
		SurveyOperationUsersView surveyOperationUsersView) {

		super(surveyOperationUsersView);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("title", getTitle());
		attributes.put("surveyObject", getSurveyObject());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());
		attributes.put("respondenId", getRespondenId());
		attributes.put("respondenNik", getRespondenNik());
		attributes.put("submittedDate", getSubmittedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String surveyObject = (String)attributes.get("surveyObject");

		if (surveyObject != null) {
			setSurveyObject(surveyObject);
		}

		Date startDate = (Date)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		Date endDate = (Date)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}

		Long respondenId = (Long)attributes.get("respondenId");

		if (respondenId != null) {
			setRespondenId(respondenId);
		}

		String respondenNik = (String)attributes.get("respondenNik");

		if (respondenNik != null) {
			setRespondenNik(respondenNik);
		}

		Date submittedDate = (Date)attributes.get("submittedDate");

		if (submittedDate != null) {
			setSubmittedDate(submittedDate);
		}
	}

	/**
	 * Returns the end date of this survey operation users view.
	 *
	 * @return the end date of this survey operation users view
	 */
	@Override
	public Date getEndDate() {
		return model.getEndDate();
	}

	/**
	 * Returns the ID of this survey operation users view.
	 *
	 * @return the ID of this survey operation users view
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the primary key of this survey operation users view.
	 *
	 * @return the primary key of this survey operation users view
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the responden ID of this survey operation users view.
	 *
	 * @return the responden ID of this survey operation users view
	 */
	@Override
	public long getRespondenId() {
		return model.getRespondenId();
	}

	/**
	 * Returns the responden nik of this survey operation users view.
	 *
	 * @return the responden nik of this survey operation users view
	 */
	@Override
	public String getRespondenNik() {
		return model.getRespondenNik();
	}

	/**
	 * Returns the start date of this survey operation users view.
	 *
	 * @return the start date of this survey operation users view
	 */
	@Override
	public Date getStartDate() {
		return model.getStartDate();
	}

	/**
	 * Returns the submitted date of this survey operation users view.
	 *
	 * @return the submitted date of this survey operation users view
	 */
	@Override
	public Date getSubmittedDate() {
		return model.getSubmittedDate();
	}

	/**
	 * Returns the survey object of this survey operation users view.
	 *
	 * @return the survey object of this survey operation users view
	 */
	@Override
	public String getSurveyObject() {
		return model.getSurveyObject();
	}

	/**
	 * Returns the title of this survey operation users view.
	 *
	 * @return the title of this survey operation users view
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the end date of this survey operation users view.
	 *
	 * @param endDate the end date of this survey operation users view
	 */
	@Override
	public void setEndDate(Date endDate) {
		model.setEndDate(endDate);
	}

	/**
	 * Sets the ID of this survey operation users view.
	 *
	 * @param id the ID of this survey operation users view
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the primary key of this survey operation users view.
	 *
	 * @param primaryKey the primary key of this survey operation users view
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the responden ID of this survey operation users view.
	 *
	 * @param respondenId the responden ID of this survey operation users view
	 */
	@Override
	public void setRespondenId(long respondenId) {
		model.setRespondenId(respondenId);
	}

	/**
	 * Sets the responden nik of this survey operation users view.
	 *
	 * @param respondenNik the responden nik of this survey operation users view
	 */
	@Override
	public void setRespondenNik(String respondenNik) {
		model.setRespondenNik(respondenNik);
	}

	/**
	 * Sets the start date of this survey operation users view.
	 *
	 * @param startDate the start date of this survey operation users view
	 */
	@Override
	public void setStartDate(Date startDate) {
		model.setStartDate(startDate);
	}

	/**
	 * Sets the submitted date of this survey operation users view.
	 *
	 * @param submittedDate the submitted date of this survey operation users view
	 */
	@Override
	public void setSubmittedDate(Date submittedDate) {
		model.setSubmittedDate(submittedDate);
	}

	/**
	 * Sets the survey object of this survey operation users view.
	 *
	 * @param surveyObject the survey object of this survey operation users view
	 */
	@Override
	public void setSurveyObject(String surveyObject) {
		model.setSurveyObject(surveyObject);
	}

	/**
	 * Sets the title of this survey operation users view.
	 *
	 * @param title the title of this survey operation users view
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	@Override
	protected SurveyOperationUsersViewWrapper wrap(
		SurveyOperationUsersView surveyOperationUsersView) {

		return new SurveyOperationUsersViewWrapper(surveyOperationUsersView);
	}

}