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
 * This class is a wrapper for {@link Responden}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Responden
 * @generated
 */
@ProviderType
public class RespondenWrapper
	extends BaseModelWrapper<Responden>
	implements Responden, ModelWrapper<Responden> {

	public RespondenWrapper(Responden responden) {
		super(responden);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("nik", getNik());
		attributes.put("fullName", getFullName());
		attributes.put("lob", getLob());
		attributes.put("division", getDivision());
		attributes.put("surveyOperationId", getSurveyOperationId());
		attributes.put("totalValue", getTotalValue());
		attributes.put("answerRecord", getAnswerRecord());
		attributes.put("submittedDate", getSubmittedDate());
		attributes.put("notes", getNotes());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String nik = (String)attributes.get("nik");

		if (nik != null) {
			setNik(nik);
		}

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		String lob = (String)attributes.get("lob");

		if (lob != null) {
			setLob(lob);
		}

		String division = (String)attributes.get("division");

		if (division != null) {
			setDivision(division);
		}

		Long surveyOperationId = (Long)attributes.get("surveyOperationId");

		if (surveyOperationId != null) {
			setSurveyOperationId(surveyOperationId);
		}

		Double totalValue = (Double)attributes.get("totalValue");

		if (totalValue != null) {
			setTotalValue(totalValue);
		}

		String answerRecord = (String)attributes.get("answerRecord");

		if (answerRecord != null) {
			setAnswerRecord(answerRecord);
		}

		Date submittedDate = (Date)attributes.get("submittedDate");

		if (submittedDate != null) {
			setSubmittedDate(submittedDate);
		}

		String notes = (String)attributes.get("notes");

		if (notes != null) {
			setNotes(notes);
		}
	}

	/**
	 * Returns the answer record of this responden.
	 *
	 * @return the answer record of this responden
	 */
	@Override
	public String getAnswerRecord() {
		return model.getAnswerRecord();
	}

	/**
	 * Returns the division of this responden.
	 *
	 * @return the division of this responden
	 */
	@Override
	public String getDivision() {
		return model.getDivision();
	}

	/**
	 * Returns the full name of this responden.
	 *
	 * @return the full name of this responden
	 */
	@Override
	public String getFullName() {
		return model.getFullName();
	}

	/**
	 * Returns the ID of this responden.
	 *
	 * @return the ID of this responden
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the lob of this responden.
	 *
	 * @return the lob of this responden
	 */
	@Override
	public String getLob() {
		return model.getLob();
	}

	/**
	 * Returns the nik of this responden.
	 *
	 * @return the nik of this responden
	 */
	@Override
	public String getNik() {
		return model.getNik();
	}

	/**
	 * Returns the notes of this responden.
	 *
	 * @return the notes of this responden
	 */
	@Override
	public String getNotes() {
		return model.getNotes();
	}

	/**
	 * Returns the primary key of this responden.
	 *
	 * @return the primary key of this responden
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the submitted date of this responden.
	 *
	 * @return the submitted date of this responden
	 */
	@Override
	public Date getSubmittedDate() {
		return model.getSubmittedDate();
	}

	/**
	 * Returns the survey operation ID of this responden.
	 *
	 * @return the survey operation ID of this responden
	 */
	@Override
	public long getSurveyOperationId() {
		return model.getSurveyOperationId();
	}

	/**
	 * Returns the total value of this responden.
	 *
	 * @return the total value of this responden
	 */
	@Override
	public double getTotalValue() {
		return model.getTotalValue();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the answer record of this responden.
	 *
	 * @param answerRecord the answer record of this responden
	 */
	@Override
	public void setAnswerRecord(String answerRecord) {
		model.setAnswerRecord(answerRecord);
	}

	/**
	 * Sets the division of this responden.
	 *
	 * @param division the division of this responden
	 */
	@Override
	public void setDivision(String division) {
		model.setDivision(division);
	}

	/**
	 * Sets the full name of this responden.
	 *
	 * @param fullName the full name of this responden
	 */
	@Override
	public void setFullName(String fullName) {
		model.setFullName(fullName);
	}

	/**
	 * Sets the ID of this responden.
	 *
	 * @param id the ID of this responden
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the lob of this responden.
	 *
	 * @param lob the lob of this responden
	 */
	@Override
	public void setLob(String lob) {
		model.setLob(lob);
	}

	/**
	 * Sets the nik of this responden.
	 *
	 * @param nik the nik of this responden
	 */
	@Override
	public void setNik(String nik) {
		model.setNik(nik);
	}

	/**
	 * Sets the notes of this responden.
	 *
	 * @param notes the notes of this responden
	 */
	@Override
	public void setNotes(String notes) {
		model.setNotes(notes);
	}

	/**
	 * Sets the primary key of this responden.
	 *
	 * @param primaryKey the primary key of this responden
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the submitted date of this responden.
	 *
	 * @param submittedDate the submitted date of this responden
	 */
	@Override
	public void setSubmittedDate(Date submittedDate) {
		model.setSubmittedDate(submittedDate);
	}

	/**
	 * Sets the survey operation ID of this responden.
	 *
	 * @param surveyOperationId the survey operation ID of this responden
	 */
	@Override
	public void setSurveyOperationId(long surveyOperationId) {
		model.setSurveyOperationId(surveyOperationId);
	}

	/**
	 * Sets the total value of this responden.
	 *
	 * @param totalValue the total value of this responden
	 */
	@Override
	public void setTotalValue(double totalValue) {
		model.setTotalValue(totalValue);
	}

	@Override
	protected RespondenWrapper wrap(Responden responden) {
		return new RespondenWrapper(responden);
	}

}