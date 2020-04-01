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

package operation.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services, specifically {@link operation.service.http.SurveyOperationServiceSoap}.
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
		soapModel.setSurveyObj(model.getSurveyObj());
		soapModel.setStartDate(model.getStartDate());
		soapModel.setEndDate(model.getEndDate());
		soapModel.setSubmittedDate(model.getSubmittedDate());

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

	public String getSurveyObj() {
		return _surveyObj;
	}

	public void setSurveyObj(String surveyObj) {
		_surveyObj = surveyObj;
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

	private long _id;
	private String _title;
	private String _description;
	private String _surveyObj;
	private Date _startDate;
	private Date _endDate;
	private Date _submittedDate;

}