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
 * This class is used by SOAP remote services, specifically {@link com.btpn.opera.operationsurvey.service.http.SurveyOperationUsersViewServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class SurveyOperationUsersViewSoap implements Serializable {

	public static SurveyOperationUsersViewSoap toSoapModel(
		SurveyOperationUsersView model) {

		SurveyOperationUsersViewSoap soapModel =
			new SurveyOperationUsersViewSoap();

		soapModel.setId(model.getId());
		soapModel.setTitle(model.getTitle());
		soapModel.setObjectName(model.getObjectName());
		soapModel.setStartDate(model.getStartDate());
		soapModel.setEndDate(model.getEndDate());
		soapModel.setRespondenId(model.getRespondenId());
		soapModel.setRespondenNik(model.getRespondenNik());
		soapModel.setSubmittedDate(model.getSubmittedDate());

		return soapModel;
	}

	public static SurveyOperationUsersViewSoap[] toSoapModels(
		SurveyOperationUsersView[] models) {

		SurveyOperationUsersViewSoap[] soapModels =
			new SurveyOperationUsersViewSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SurveyOperationUsersViewSoap[][] toSoapModels(
		SurveyOperationUsersView[][] models) {

		SurveyOperationUsersViewSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new SurveyOperationUsersViewSoap
					[models.length][models[0].length];
		}
		else {
			soapModels = new SurveyOperationUsersViewSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SurveyOperationUsersViewSoap[] toSoapModels(
		List<SurveyOperationUsersView> models) {

		List<SurveyOperationUsersViewSoap> soapModels =
			new ArrayList<SurveyOperationUsersViewSoap>(models.size());

		for (SurveyOperationUsersView model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new SurveyOperationUsersViewSoap[soapModels.size()]);
	}

	public SurveyOperationUsersViewSoap() {
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

	public String getObjectName() {
		return _objectName;
	}

	public void setObjectName(String objectName) {
		_objectName = objectName;
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

	public long getRespondenId() {
		return _respondenId;
	}

	public void setRespondenId(long respondenId) {
		_respondenId = respondenId;
	}

	public String getRespondenNik() {
		return _respondenNik;
	}

	public void setRespondenNik(String respondenNik) {
		_respondenNik = respondenNik;
	}

	public Date getSubmittedDate() {
		return _submittedDate;
	}

	public void setSubmittedDate(Date submittedDate) {
		_submittedDate = submittedDate;
	}

	private long _id;
	private String _title;
	private String _objectName;
	private Date _startDate;
	private Date _endDate;
	private long _respondenId;
	private String _respondenNik;
	private Date _submittedDate;

}