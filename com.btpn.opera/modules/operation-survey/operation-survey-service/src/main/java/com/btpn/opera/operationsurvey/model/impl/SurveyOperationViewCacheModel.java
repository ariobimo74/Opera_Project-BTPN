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

package com.btpn.opera.operationsurvey.model.impl;

import com.btpn.opera.operationsurvey.model.SurveyOperationView;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing SurveyOperationView in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class SurveyOperationViewCacheModel
	implements CacheModel<SurveyOperationView>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SurveyOperationViewCacheModel)) {
			return false;
		}

		SurveyOperationViewCacheModel surveyOperationViewCacheModel =
			(SurveyOperationViewCacheModel)obj;

		if (id == surveyOperationViewCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(id);
		sb.append(", title=");
		sb.append(title);
		sb.append(", name=");
		sb.append(name);
		sb.append(", startDate=");
		sb.append(startDate);
		sb.append(", endDate=");
		sb.append(endDate);
		sb.append(", submitted_date=");
		sb.append(submitted_date);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SurveyOperationView toEntityModel() {
		SurveyOperationViewImpl surveyOperationViewImpl =
			new SurveyOperationViewImpl();

		surveyOperationViewImpl.setId(id);

		if (title == null) {
			surveyOperationViewImpl.setTitle("");
		}
		else {
			surveyOperationViewImpl.setTitle(title);
		}

		if (name == null) {
			surveyOperationViewImpl.setName("");
		}
		else {
			surveyOperationViewImpl.setName(name);
		}

		if (startDate == Long.MIN_VALUE) {
			surveyOperationViewImpl.setStartDate(null);
		}
		else {
			surveyOperationViewImpl.setStartDate(new Date(startDate));
		}

		if (endDate == Long.MIN_VALUE) {
			surveyOperationViewImpl.setEndDate(null);
		}
		else {
			surveyOperationViewImpl.setEndDate(new Date(endDate));
		}

		if (submitted_date == Long.MIN_VALUE) {
			surveyOperationViewImpl.setSubmitted_date(null);
		}
		else {
			surveyOperationViewImpl.setSubmitted_date(new Date(submitted_date));
		}

		surveyOperationViewImpl.resetOriginalValues();

		return surveyOperationViewImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		title = objectInput.readUTF();
		name = objectInput.readUTF();
		startDate = objectInput.readLong();
		endDate = objectInput.readLong();
		submitted_date = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(id);

		if (title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeLong(startDate);
		objectOutput.writeLong(endDate);
		objectOutput.writeLong(submitted_date);
	}

	public long id;
	public String title;
	public String name;
	public long startDate;
	public long endDate;
	public long submitted_date;

}