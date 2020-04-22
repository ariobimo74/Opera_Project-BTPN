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
 * This class is a wrapper for {@link SurveyOperationView}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationView
 * @generated
 */
@ProviderType
public class SurveyOperationViewWrapper
	extends BaseModelWrapper<SurveyOperationView>
	implements SurveyOperationView, ModelWrapper<SurveyOperationView> {

	public SurveyOperationViewWrapper(SurveyOperationView surveyOperationView) {
		super(surveyOperationView);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("title", getTitle());
		attributes.put("name", getName());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());
		attributes.put("submitted_date", getSubmitted_date());

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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Date startDate = (Date)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		Date endDate = (Date)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}

		Date submitted_date = (Date)attributes.get("submitted_date");

		if (submitted_date != null) {
			setSubmitted_date(submitted_date);
		}
	}

	/**
	 * Returns the end date of this survey operation view.
	 *
	 * @return the end date of this survey operation view
	 */
	@Override
	public Date getEndDate() {
		return model.getEndDate();
	}

	/**
	 * Returns the ID of this survey operation view.
	 *
	 * @return the ID of this survey operation view
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the name of this survey operation view.
	 *
	 * @return the name of this survey operation view
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this survey operation view.
	 *
	 * @return the primary key of this survey operation view
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the start date of this survey operation view.
	 *
	 * @return the start date of this survey operation view
	 */
	@Override
	public Date getStartDate() {
		return model.getStartDate();
	}

	/**
	 * Returns the submitted_date of this survey operation view.
	 *
	 * @return the submitted_date of this survey operation view
	 */
	@Override
	public Date getSubmitted_date() {
		return model.getSubmitted_date();
	}

	/**
	 * Returns the title of this survey operation view.
	 *
	 * @return the title of this survey operation view
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
	 * Sets the end date of this survey operation view.
	 *
	 * @param endDate the end date of this survey operation view
	 */
	@Override
	public void setEndDate(Date endDate) {
		model.setEndDate(endDate);
	}

	/**
	 * Sets the ID of this survey operation view.
	 *
	 * @param id the ID of this survey operation view
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the name of this survey operation view.
	 *
	 * @param name the name of this survey operation view
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this survey operation view.
	 *
	 * @param primaryKey the primary key of this survey operation view
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the start date of this survey operation view.
	 *
	 * @param startDate the start date of this survey operation view
	 */
	@Override
	public void setStartDate(Date startDate) {
		model.setStartDate(startDate);
	}

	/**
	 * Sets the submitted_date of this survey operation view.
	 *
	 * @param submitted_date the submitted_date of this survey operation view
	 */
	@Override
	public void setSubmitted_date(Date submitted_date) {
		model.setSubmitted_date(submitted_date);
	}

	/**
	 * Sets the title of this survey operation view.
	 *
	 * @param title the title of this survey operation view
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	@Override
	protected SurveyOperationViewWrapper wrap(
		SurveyOperationView surveyOperationView) {

		return new SurveyOperationViewWrapper(surveyOperationView);
	}

}