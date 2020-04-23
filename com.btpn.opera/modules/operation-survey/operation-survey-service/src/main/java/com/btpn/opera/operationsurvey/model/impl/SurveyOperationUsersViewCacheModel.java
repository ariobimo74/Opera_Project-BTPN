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

import com.btpn.opera.operationsurvey.model.SurveyOperationUsersView;

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
 * The cache model class for representing SurveyOperationUsersView in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class SurveyOperationUsersViewCacheModel
	implements CacheModel<SurveyOperationUsersView>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SurveyOperationUsersViewCacheModel)) {
			return false;
		}

		SurveyOperationUsersViewCacheModel surveyOperationUsersViewCacheModel =
			(SurveyOperationUsersViewCacheModel)obj;

		if (id == surveyOperationUsersViewCacheModel.id) {
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
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", title=");
		sb.append(title);
		sb.append(", surveyObject=");
		sb.append(surveyObject);
		sb.append(", startDate=");
		sb.append(startDate);
		sb.append(", endDate=");
		sb.append(endDate);
		sb.append(", respondenId=");
		sb.append(respondenId);
		sb.append(", respondenNik=");
		sb.append(respondenNik);
		sb.append(", submittedDate=");
		sb.append(submittedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SurveyOperationUsersView toEntityModel() {
		SurveyOperationUsersViewImpl surveyOperationUsersViewImpl =
			new SurveyOperationUsersViewImpl();

		surveyOperationUsersViewImpl.setId(id);

		if (title == null) {
			surveyOperationUsersViewImpl.setTitle("");
		}
		else {
			surveyOperationUsersViewImpl.setTitle(title);
		}

		if (surveyObject == null) {
			surveyOperationUsersViewImpl.setSurveyObject("");
		}
		else {
			surveyOperationUsersViewImpl.setSurveyObject(surveyObject);
		}

		if (startDate == Long.MIN_VALUE) {
			surveyOperationUsersViewImpl.setStartDate(null);
		}
		else {
			surveyOperationUsersViewImpl.setStartDate(new Date(startDate));
		}

		if (endDate == Long.MIN_VALUE) {
			surveyOperationUsersViewImpl.setEndDate(null);
		}
		else {
			surveyOperationUsersViewImpl.setEndDate(new Date(endDate));
		}

		surveyOperationUsersViewImpl.setRespondenId(respondenId);

		if (respondenNik == null) {
			surveyOperationUsersViewImpl.setRespondenNik("");
		}
		else {
			surveyOperationUsersViewImpl.setRespondenNik(respondenNik);
		}

		if (submittedDate == Long.MIN_VALUE) {
			surveyOperationUsersViewImpl.setSubmittedDate(null);
		}
		else {
			surveyOperationUsersViewImpl.setSubmittedDate(
				new Date(submittedDate));
		}

		surveyOperationUsersViewImpl.resetOriginalValues();

		return surveyOperationUsersViewImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		title = objectInput.readUTF();
		surveyObject = objectInput.readUTF();
		startDate = objectInput.readLong();
		endDate = objectInput.readLong();

		respondenId = objectInput.readLong();
		respondenNik = objectInput.readUTF();
		submittedDate = objectInput.readLong();
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

		if (surveyObject == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(surveyObject);
		}

		objectOutput.writeLong(startDate);
		objectOutput.writeLong(endDate);

		objectOutput.writeLong(respondenId);

		if (respondenNik == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(respondenNik);
		}

		objectOutput.writeLong(submittedDate);
	}

	public long id;
	public String title;
	public String surveyObject;
	public long startDate;
	public long endDate;
	public long respondenId;
	public String respondenNik;
	public long submittedDate;

}