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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services, specifically {@link com.btpn.opera.operationsurvey.service.http.SurveyOperationServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class SurveyOperationSoap implements Serializable {

	public static SurveyOperationSoap toSoapModel(SurveyOperation model) {
		SurveyOperationSoap soapModel = new SurveyOperationSoap();

		soapModel.setId(model.getId());
		soapModel.setTitle(model.getTitle());
		soapModel.setDescription(model.getDescription());
		soapModel.setSurveyObjectId(model.getSurveyObjectId());
		soapModel.setStartDate(model.getStartDate());
		soapModel.setEndDate(model.getEndDate());
		soapModel.setSubmittedDate(model.getSubmittedDate());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static SurveyOperationSoap[] toSoapModels(SurveyOperation[] models) {
		SurveyOperationSoap[] soapModels =
			new SurveyOperationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SurveyOperationSoap[][] toSoapModels(
		SurveyOperation[][] models) {

		SurveyOperationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new SurveyOperationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SurveyOperationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SurveyOperationSoap[] toSoapModels(
		List<SurveyOperation> models) {

		List<SurveyOperationSoap> soapModels =
			new ArrayList<SurveyOperationSoap>(models.size());

		for (SurveyOperation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SurveyOperationSoap[soapModels.size()]);
	}

	public SurveyOperationSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public long getSurveyObjectId() {
		return _surveyObjectId;
	}

	public void setSurveyObjectId(long surveyObjectId) {
		_surveyObjectId = surveyObjectId;
	}

	public Date getStartDate() {
		return _startDate;
	}

	public void setStartDate(Date startDate) {
		_startDate = startDate;
	}

	public Date getEndDate() {
		return _endDate;
	}

	public void setEndDate(Date endDate) {
		_endDate = endDate;
	}

	public Date getSubmittedDate() {
		return _submittedDate;
	}

	public void setSubmittedDate(Date submittedDate) {
		_submittedDate = submittedDate;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public long getCreatedBy() {
		return _createdBy;
	}

	public void setCreatedBy(long createdBy) {
		_createdBy = createdBy;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getModifiedBy() {
		return _modifiedBy;
	}

	public void setModifiedBy(long modifiedBy) {
		_modifiedBy = modifiedBy;
	}

	private long _id;
	private String _title;
	private String _description;
	private long _surveyObjectId;
	private Date _startDate;
	private Date _endDate;
	private Date _submittedDate;
	private Date _createdDate;
	private long _createdBy;
	private Date _modifiedDate;
	private long _modifiedBy;

}