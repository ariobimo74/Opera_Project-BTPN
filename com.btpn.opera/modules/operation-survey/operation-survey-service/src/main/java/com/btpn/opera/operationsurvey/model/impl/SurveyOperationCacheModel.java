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

import com.btpn.opera.operationsurvey.model.SurveyOperation;

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
 * The cache model class for representing SurveyOperation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class SurveyOperationCacheModel
	implements CacheModel<SurveyOperation>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SurveyOperationCacheModel)) {
			return false;
		}

		SurveyOperationCacheModel surveyOperationCacheModel =
			(SurveyOperationCacheModel)obj;

		if (id == surveyOperationCacheModel.id) {
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
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(id);
		sb.append(", title=");
		sb.append(title);
		sb.append(", description=");
		sb.append(description);
		sb.append(", surveyObjectId=");
		sb.append(surveyObjectId);
		sb.append(", startDate=");
		sb.append(startDate);
		sb.append(", endDate=");
		sb.append(endDate);
		sb.append(", submittedDate=");
		sb.append(submittedDate);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", modifiedBy=");
		sb.append(modifiedBy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SurveyOperation toEntityModel() {
		SurveyOperationImpl surveyOperationImpl = new SurveyOperationImpl();

		surveyOperationImpl.setId(id);

		if (title == null) {
			surveyOperationImpl.setTitle("");
		}
		else {
			surveyOperationImpl.setTitle(title);
		}

		if (description == null) {
			surveyOperationImpl.setDescription("");
		}
		else {
			surveyOperationImpl.setDescription(description);
		}

		surveyOperationImpl.setSurveyObjectId(surveyObjectId);

		if (startDate == Long.MIN_VALUE) {
			surveyOperationImpl.setStartDate(null);
		}
		else {
			surveyOperationImpl.setStartDate(new Date(startDate));
		}

		if (endDate == Long.MIN_VALUE) {
			surveyOperationImpl.setEndDate(null);
		}
		else {
			surveyOperationImpl.setEndDate(new Date(endDate));
		}

		if (submittedDate == Long.MIN_VALUE) {
			surveyOperationImpl.setSubmittedDate(null);
		}
		else {
			surveyOperationImpl.setSubmittedDate(new Date(submittedDate));
		}

		if (createdDate == Long.MIN_VALUE) {
			surveyOperationImpl.setCreatedDate(null);
		}
		else {
			surveyOperationImpl.setCreatedDate(new Date(createdDate));
		}

		surveyOperationImpl.setCreatedBy(createdBy);

		if (modifiedDate == Long.MIN_VALUE) {
			surveyOperationImpl.setModifiedDate(null);
		}
		else {
			surveyOperationImpl.setModifiedDate(new Date(modifiedDate));
		}

		surveyOperationImpl.setModifiedBy(modifiedBy);

		surveyOperationImpl.resetOriginalValues();

		return surveyOperationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		title = objectInput.readUTF();
		description = objectInput.readUTF();

		surveyObjectId = objectInput.readLong();
		startDate = objectInput.readLong();
		endDate = objectInput.readLong();
		submittedDate = objectInput.readLong();
		createdDate = objectInput.readLong();

		createdBy = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		modifiedBy = objectInput.readLong();
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

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(surveyObjectId);
		objectOutput.writeLong(startDate);
		objectOutput.writeLong(endDate);
		objectOutput.writeLong(submittedDate);
		objectOutput.writeLong(createdDate);

		objectOutput.writeLong(createdBy);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(modifiedBy);
	}

	public long id;
	public String title;
	public String description;
	public long surveyObjectId;
	public long startDate;
	public long endDate;
	public long submittedDate;
	public long createdDate;
	public long createdBy;
	public long modifiedDate;
	public long modifiedBy;

}