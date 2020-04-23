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
 * This class is used by SOAP remote services, specifically {@link com.btpn.opera.operationsurvey.service.http.SurveyOperationViewServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class SurveyOperationViewSoap implements Serializable {

	public static SurveyOperationViewSoap toSoapModel(
		SurveyOperationView model) {

		SurveyOperationViewSoap soapModel = new SurveyOperationViewSoap();

		soapModel.setId(model.getId());
		soapModel.setTitle(model.getTitle());
		soapModel.setSurveyObject(model.getSurveyObject());
		soapModel.setStartDate(model.getStartDate());
		soapModel.setEndDate(model.getEndDate());
		soapModel.setSubmitted_date(model.getSubmitted_date());

		return soapModel;
	}

	public static SurveyOperationViewSoap[] toSoapModels(
		SurveyOperationView[] models) {

		SurveyOperationViewSoap[] soapModels =
			new SurveyOperationViewSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SurveyOperationViewSoap[][] toSoapModels(
		SurveyOperationView[][] models) {

		SurveyOperationViewSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new SurveyOperationViewSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SurveyOperationViewSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SurveyOperationViewSoap[] toSoapModels(
		List<SurveyOperationView> models) {

		List<SurveyOperationViewSoap> soapModels =
			new ArrayList<SurveyOperationViewSoap>(models.size());

		for (SurveyOperationView model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new SurveyOperationViewSoap[soapModels.size()]);
	}

	public SurveyOperationViewSoap() {
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

	public String getSurveyObject() {
		return _surveyObject;
	}

	public void setSurveyObject(String surveyObject) {
		_surveyObject = surveyObject;
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

	public Date getSubmitted_date() {
		return _submitted_date;
	}

	public void setSubmitted_date(Date submitted_date) {
		_submitted_date = submitted_date;
	}

	private long _id;
	private String _title;
	private String _surveyObject;
	private Date _startDate;
	private Date _endDate;
	private Date _submitted_date;

}