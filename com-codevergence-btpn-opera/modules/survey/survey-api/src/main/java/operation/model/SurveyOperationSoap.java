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
		soapModel.setSurveyObjId(model.getSurveyObjId());
		soapModel.setStartDate(model.getStartDate());
		soapModel.setEndDate(model.getEndDate());
		soapModel.setQuestion1(model.getQuestion1());
		soapModel.setQuestion2(model.getQuestion2());
		soapModel.setQuestion3(model.getQuestion3());
		soapModel.setQuestion4(model.getQuestion4());
		soapModel.setQuestion5(model.getQuestion5());
		soapModel.setQuestion6(model.getQuestion6());
		soapModel.setQuestion7(model.getQuestion7());
		soapModel.setQuestion8(model.getQuestion8());
		soapModel.setQuestion9(model.getQuestion9());
		soapModel.setQuestion10(model.getQuestion10());
		soapModel.setStatus(model.getStatus());
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

	public long getSurveyObjId() {
		return _surveyObjId;
	}

	public void setSurveyObjId(long surveyObjId) {
		_surveyObjId = surveyObjId;
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

	public String getQuestion1() {
		return _question1;
	}

	public void setQuestion1(String question1) {
		_question1 = question1;
	}

	public String getQuestion2() {
		return _question2;
	}

	public void setQuestion2(String question2) {
		_question2 = question2;
	}

	public String getQuestion3() {
		return _question3;
	}

	public void setQuestion3(String question3) {
		_question3 = question3;
	}

	public String getQuestion4() {
		return _question4;
	}

	public void setQuestion4(String question4) {
		_question4 = question4;
	}

	public String getQuestion5() {
		return _question5;
	}

	public void setQuestion5(String question5) {
		_question5 = question5;
	}

	public String getQuestion6() {
		return _question6;
	}

	public void setQuestion6(String question6) {
		_question6 = question6;
	}

	public String getQuestion7() {
		return _question7;
	}

	public void setQuestion7(String question7) {
		_question7 = question7;
	}

	public String getQuestion8() {
		return _question8;
	}

	public void setQuestion8(String question8) {
		_question8 = question8;
	}

	public String getQuestion9() {
		return _question9;
	}

	public void setQuestion9(String question9) {
		_question9 = question9;
	}

	public String getQuestion10() {
		return _question10;
	}

	public void setQuestion10(String question10) {
		_question10 = question10;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
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
	private long _surveyObjId;
	private Date _startDate;
	private Date _endDate;
	private String _question1;
	private String _question2;
	private String _question3;
	private String _question4;
	private String _question5;
	private String _question6;
	private String _question7;
	private String _question8;
	private String _question9;
	private String _question10;
	private String _status;
	private Date _submittedDate;

}