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
 * This class is a wrapper for {@link SurveyOperation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperation
 * @generated
 */
@ProviderType
public class SurveyOperationWrapper
	extends BaseModelWrapper<SurveyOperation>
	implements SurveyOperation, ModelWrapper<SurveyOperation> {

	public SurveyOperationWrapper(SurveyOperation surveyOperation) {
		super(surveyOperation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("surveyObjectId", getSurveyObjectId());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());
		attributes.put("submittedDate", getSubmittedDate());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("modifiedBy", getModifiedBy());

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

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long surveyObjectId = (Long)attributes.get("surveyObjectId");

		if (surveyObjectId != null) {
			setSurveyObjectId(surveyObjectId);
		}

		Date startDate = (Date)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		Date endDate = (Date)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}

		Date submittedDate = (Date)attributes.get("submittedDate");

		if (submittedDate != null) {
			setSubmittedDate(submittedDate);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Long createdBy = (Long)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long modifiedBy = (Long)attributes.get("modifiedBy");

		if (modifiedBy != null) {
			setModifiedBy(modifiedBy);
		}
	}

	/**
	 * Returns the created by of this survey operation.
	 *
	 * @return the created by of this survey operation
	 */
	@Override
	public long getCreatedBy() {
		return model.getCreatedBy();
	}

	/**
	 * Returns the created date of this survey operation.
	 *
	 * @return the created date of this survey operation
	 */
	@Override
	public Date getCreatedDate() {
		return model.getCreatedDate();
	}

	/**
	 * Returns the description of this survey operation.
	 *
	 * @return the description of this survey operation
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the end date of this survey operation.
	 *
	 * @return the end date of this survey operation
	 */
	@Override
	public Date getEndDate() {
		return model.getEndDate();
	}

	/**
	 * Returns the ID of this survey operation.
	 *
	 * @return the ID of this survey operation
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the modified by of this survey operation.
	 *
	 * @return the modified by of this survey operation
	 */
	@Override
	public long getModifiedBy() {
		return model.getModifiedBy();
	}

	/**
	 * Returns the modified date of this survey operation.
	 *
	 * @return the modified date of this survey operation
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this survey operation.
	 *
	 * @return the primary key of this survey operation
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the start date of this survey operation.
	 *
	 * @return the start date of this survey operation
	 */
	@Override
	public Date getStartDate() {
		return model.getStartDate();
	}

	/**
	 * Returns the submitted date of this survey operation.
	 *
	 * @return the submitted date of this survey operation
	 */
	@Override
	public Date getSubmittedDate() {
		return model.getSubmittedDate();
	}

	/**
	 * Returns the survey object ID of this survey operation.
	 *
	 * @return the survey object ID of this survey operation
	 */
	@Override
	public long getSurveyObjectId() {
		return model.getSurveyObjectId();
	}

	/**
	 * Returns the title of this survey operation.
	 *
	 * @return the title of this survey operation
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
	 * Sets the created by of this survey operation.
	 *
	 * @param createdBy the created by of this survey operation
	 */
	@Override
	public void setCreatedBy(long createdBy) {
		model.setCreatedBy(createdBy);
	}

	/**
	 * Sets the created date of this survey operation.
	 *
	 * @param createdDate the created date of this survey operation
	 */
	@Override
	public void setCreatedDate(Date createdDate) {
		model.setCreatedDate(createdDate);
	}

	/**
	 * Sets the description of this survey operation.
	 *
	 * @param description the description of this survey operation
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the end date of this survey operation.
	 *
	 * @param endDate the end date of this survey operation
	 */
	@Override
	public void setEndDate(Date endDate) {
		model.setEndDate(endDate);
	}

	/**
	 * Sets the ID of this survey operation.
	 *
	 * @param id the ID of this survey operation
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the modified by of this survey operation.
	 *
	 * @param modifiedBy the modified by of this survey operation
	 */
	@Override
	public void setModifiedBy(long modifiedBy) {
		model.setModifiedBy(modifiedBy);
	}

	/**
	 * Sets the modified date of this survey operation.
	 *
	 * @param modifiedDate the modified date of this survey operation
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this survey operation.
	 *
	 * @param primaryKey the primary key of this survey operation
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the start date of this survey operation.
	 *
	 * @param startDate the start date of this survey operation
	 */
	@Override
	public void setStartDate(Date startDate) {
		model.setStartDate(startDate);
	}

	/**
	 * Sets the submitted date of this survey operation.
	 *
	 * @param submittedDate the submitted date of this survey operation
	 */
	@Override
	public void setSubmittedDate(Date submittedDate) {
		model.setSubmittedDate(submittedDate);
	}

	/**
	 * Sets the survey object ID of this survey operation.
	 *
	 * @param surveyObjectId the survey object ID of this survey operation
	 */
	@Override
	public void setSurveyObjectId(long surveyObjectId) {
		model.setSurveyObjectId(surveyObjectId);
	}

	/**
	 * Sets the title of this survey operation.
	 *
	 * @param title the title of this survey operation
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	@Override
	protected SurveyOperationWrapper wrap(SurveyOperation surveyOperation) {
		return new SurveyOperationWrapper(surveyOperation);
	}

}