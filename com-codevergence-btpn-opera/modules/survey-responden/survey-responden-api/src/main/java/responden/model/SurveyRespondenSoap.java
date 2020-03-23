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

package responden.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services, specifically {@link responden.service.http.SurveyRespondenServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class SurveyRespondenSoap implements Serializable {

	public static SurveyRespondenSoap toSoapModel(SurveyResponden model) {
		SurveyRespondenSoap soapModel = new SurveyRespondenSoap();

		soapModel.setId(model.getId());
		soapModel.setNik(model.getNik());
		soapModel.setSurveyId(model.getSurveyId());
		soapModel.setAnswer1(model.getAnswer1());
		soapModel.setAnswer2(model.getAnswer2());
		soapModel.setAnswer3(model.getAnswer3());
		soapModel.setAnswer4(model.getAnswer4());
		soapModel.setAnswer5(model.getAnswer5());
		soapModel.setAnswer6(model.getAnswer6());
		soapModel.setAnswer7(model.getAnswer7());
		soapModel.setAnswer8(model.getAnswer8());
		soapModel.setAnswer9(model.getAnswer9());
		soapModel.setAnswer10(model.getAnswer10());
		soapModel.setNote(model.getNote());
		soapModel.setStatus(model.getStatus());
		soapModel.setSubmittedDate(model.getSubmittedDate());

		return soapModel;
	}

	public static SurveyRespondenSoap[] toSoapModels(SurveyResponden[] models) {
		SurveyRespondenSoap[] soapModels =
			new SurveyRespondenSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SurveyRespondenSoap[][] toSoapModels(
		SurveyResponden[][] models) {

		SurveyRespondenSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new SurveyRespondenSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SurveyRespondenSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SurveyRespondenSoap[] toSoapModels(
		List<SurveyResponden> models) {

		List<SurveyRespondenSoap> soapModels =
			new ArrayList<SurveyRespondenSoap>(models.size());

		for (SurveyResponden model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SurveyRespondenSoap[soapModels.size()]);
	}

	public SurveyRespondenSoap() {
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

	public long getSurveyId() {
		return _surveyId;
	}

	public void setSurveyId(long surveyId) {
		_surveyId = surveyId;
	}

	public Double getAnswer1() {
		return _answer1;
	}

	public void setAnswer1(Double answer1) {
		_answer1 = answer1;
	}

	public Double getAnswer2() {
		return _answer2;
	}

	public void setAnswer2(Double answer2) {
		_answer2 = answer2;
	}

	public Double getAnswer3() {
		return _answer3;
	}

	public void setAnswer3(Double answer3) {
		_answer3 = answer3;
	}

	public Double getAnswer4() {
		return _answer4;
	}

	public void setAnswer4(Double answer4) {
		_answer4 = answer4;
	}

	public Double getAnswer5() {
		return _answer5;
	}

	public void setAnswer5(Double answer5) {
		_answer5 = answer5;
	}

	public Double getAnswer6() {
		return _answer6;
	}

	public void setAnswer6(Double answer6) {
		_answer6 = answer6;
	}

	public Double getAnswer7() {
		return _answer7;
	}

	public void setAnswer7(Double answer7) {
		_answer7 = answer7;
	}

	public Double getAnswer8() {
		return _answer8;
	}

	public void setAnswer8(Double answer8) {
		_answer8 = answer8;
	}

	public Double getAnswer9() {
		return _answer9;
	}

	public void setAnswer9(Double answer9) {
		_answer9 = answer9;
	}

	public Double getAnswer10() {
		return _answer10;
	}

	public void setAnswer10(Double answer10) {
		_answer10 = answer10;
	}

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
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
	private String _nik;
	private long _surveyId;
	private Double _answer1;
	private Double _answer2;
	private Double _answer3;
	private Double _answer4;
	private Double _answer5;
	private Double _answer6;
	private Double _answer7;
	private Double _answer8;
	private Double _answer9;
	private Double _answer10;
	private String _note;
	private String _status;
	private Date _submittedDate;

}