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
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services, specifically {@link com.btpn.opera.operationsurvey.service.http.QuestionsServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class QuestionsSoap implements Serializable {

	public static QuestionsSoap toSoapModel(Questions model) {
		QuestionsSoap soapModel = new QuestionsSoap();

		soapModel.setId(model.getId());
		soapModel.setQuestion(model.getQuestion());
		soapModel.setAnswer(model.getAnswer());
		soapModel.setSurveyOperationId(model.getSurveyOperationId());

		return soapModel;
	}

	public static QuestionsSoap[] toSoapModels(Questions[] models) {
		QuestionsSoap[] soapModels = new QuestionsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QuestionsSoap[][] toSoapModels(Questions[][] models) {
		QuestionsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QuestionsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QuestionsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QuestionsSoap[] toSoapModels(List<Questions> models) {
		List<QuestionsSoap> soapModels = new ArrayList<QuestionsSoap>(
			models.size());

		for (Questions model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QuestionsSoap[soapModels.size()]);
	}

	public QuestionsSoap() {
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

	public String getQuestion() {
		return _question;
	}

	public void setQuestion(String question) {
		_question = question;
	}

	public String getAnswer() {
		return _answer;
	}

	public void setAnswer(String answer) {
		_answer = answer;
	}

	public long getSurveyOperationId() {
		return _surveyOperationId;
	}

	public void setSurveyOperationId(long surveyOperationId) {
		_surveyOperationId = surveyOperationId;
	}

	private long _id;
	private String _question;
	private String _answer;
	private long _surveyOperationId;

}