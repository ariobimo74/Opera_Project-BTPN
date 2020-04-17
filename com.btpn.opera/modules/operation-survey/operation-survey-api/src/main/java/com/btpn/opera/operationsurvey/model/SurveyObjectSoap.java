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
 * This class is used by SOAP remote services, specifically {@link com.btpn.opera.operationsurvey.service.http.SurveyObjectServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class SurveyObjectSoap implements Serializable {

	public static SurveyObjectSoap toSoapModel(SurveyObject model) {
		SurveyObjectSoap soapModel = new SurveyObjectSoap();

		soapModel.setId(model.getId());
		soapModel.setName(model.getName());

		return soapModel;
	}

	public static SurveyObjectSoap[] toSoapModels(SurveyObject[] models) {
		SurveyObjectSoap[] soapModels = new SurveyObjectSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SurveyObjectSoap[][] toSoapModels(SurveyObject[][] models) {
		SurveyObjectSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SurveyObjectSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SurveyObjectSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SurveyObjectSoap[] toSoapModels(List<SurveyObject> models) {
		List<SurveyObjectSoap> soapModels = new ArrayList<SurveyObjectSoap>(
			models.size());

		for (SurveyObject model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SurveyObjectSoap[soapModels.size()]);
	}

	public SurveyObjectSoap() {
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

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	private long _id;
	private String _name;

}