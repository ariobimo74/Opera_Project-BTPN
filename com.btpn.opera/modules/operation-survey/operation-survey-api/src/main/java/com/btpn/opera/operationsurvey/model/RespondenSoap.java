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
 * This class is used by SOAP remote services, specifically {@link com.btpn.opera.operationsurvey.service.http.RespondenServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class RespondenSoap implements Serializable {

	public static RespondenSoap toSoapModel(Responden model) {
		RespondenSoap soapModel = new RespondenSoap();

		soapModel.setId(model.getId());
		soapModel.setNik(model.getNik());
		soapModel.setFullName(model.getFullName());
		soapModel.setLob(model.getLob());
		soapModel.setDivision(model.getDivision());
		soapModel.setSurveyOperationId(model.getSurveyOperationId());
		soapModel.setTotalValue(model.getTotalValue());
		soapModel.setAnswerRecord(model.getAnswerRecord());
		soapModel.setSubmittedDate(model.getSubmittedDate());
		soapModel.setNotes(model.getNotes());

		return soapModel;
	}

	public static RespondenSoap[] toSoapModels(Responden[] models) {
		RespondenSoap[] soapModels = new RespondenSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RespondenSoap[][] toSoapModels(Responden[][] models) {
		RespondenSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RespondenSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RespondenSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RespondenSoap[] toSoapModels(List<Responden> models) {
		List<RespondenSoap> soapModels = new ArrayList<RespondenSoap>(
			models.size());

		for (Responden model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RespondenSoap[soapModels.size()]);
	}

	public RespondenSoap() {
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

	public String getNik() {
		return _nik;
	}

	public void setNik(String nik) {
		_nik = nik;
	}

	public String getFullName() {
		return _fullName;
	}

	public void setFullName(String fullName) {
		_fullName = fullName;
	}

	public String getLob() {
		return _lob;
	}

	public void setLob(String lob) {
		_lob = lob;
	}

	public String getDivision() {
		return _division;
	}

	public void setDivision(String division) {
		_division = division;
	}

	public long getSurveyOperationId() {
		return _surveyOperationId;
	}

	public void setSurveyOperationId(long surveyOperationId) {
		_surveyOperationId = surveyOperationId;
	}

	public double getTotalValue() {
		return _totalValue;
	}

	public void setTotalValue(double totalValue) {
		_totalValue = totalValue;
	}

	public String getAnswerRecord() {
		return _answerRecord;
	}

	public void setAnswerRecord(String answerRecord) {
		_answerRecord = answerRecord;
	}

	public Date getSubmittedDate() {
		return _submittedDate;
	}

	public void setSubmittedDate(Date submittedDate) {
		_submittedDate = submittedDate;
	}

	public String getNotes() {
		return _notes;
	}

	public void setNotes(String notes) {
		_notes = notes;
	}

	private long _id;
	private String _nik;
	private String _fullName;
	private String _lob;
	private String _division;
	private long _surveyOperationId;
	private double _totalValue;
	private String _answerRecord;
	private Date _submittedDate;
	private String _notes;

}