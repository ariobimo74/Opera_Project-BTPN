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
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services, specifically {@link operation.service.http.AnswersServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class AnswersSoap implements Serializable {

	public static AnswersSoap toSoapModel(Answers model) {
		AnswersSoap soapModel = new AnswersSoap();

		soapModel.setId(model.getId());
		soapModel.setAnswer(model.getAnswer());
		soapModel.setValue(model.getValue());

		return soapModel;
	}

	public static AnswersSoap[] toSoapModels(Answers[] models) {
		AnswersSoap[] soapModels = new AnswersSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AnswersSoap[][] toSoapModels(Answers[][] models) {
		AnswersSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AnswersSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AnswersSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AnswersSoap[] toSoapModels(List<Answers> models) {
		List<AnswersSoap> soapModels = new ArrayList<AnswersSoap>(
			models.size());

		for (Answers model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AnswersSoap[soapModels.size()]);
	}

	public AnswersSoap() {
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

	public String getAnswer() {
		return _answer;
	}

	public void setAnswer(String answer) {
		_answer = answer;
	}

	public double getValue() {
		return _value;
	}

	public void setValue(double value) {
		_value = value;
	}

	private long _id;
	private String _answer;
	private double _value;

}