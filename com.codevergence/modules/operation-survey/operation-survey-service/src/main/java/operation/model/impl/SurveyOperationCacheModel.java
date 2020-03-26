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

package operation.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import operation.model.SurveyOperation;

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
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", title=");
		sb.append(title);
		sb.append(", description=");
		sb.append(description);
		sb.append(", surveyObj=");
		sb.append(surveyObj);
		sb.append(", startDate=");
		sb.append(startDate);
		sb.append(", endDate=");
		sb.append(endDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", submittedDate=");
		sb.append(submittedDate);
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

		if (surveyObj == null) {
			surveyOperationImpl.setSurveyObj("");
		}
		else {
			surveyOperationImpl.setSurveyObj(surveyObj);
		}

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

		if (status == null) {
			surveyOperationImpl.setStatus("");
		}
		else {
			surveyOperationImpl.setStatus(status);
		}

		if (submittedDate == Long.MIN_VALUE) {
			surveyOperationImpl.setSubmittedDate(null);
		}
		else {
			surveyOperationImpl.setSubmittedDate(new Date(submittedDate));
		}

		surveyOperationImpl.resetOriginalValues();

		return surveyOperationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		title = objectInput.readUTF();
		description = objectInput.readUTF();
		surveyObj = objectInput.readUTF();
		startDate = objectInput.readLong();
		endDate = objectInput.readLong();
		status = objectInput.readUTF();
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

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (surveyObj == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(surveyObj);
		}

		objectOutput.writeLong(startDate);
		objectOutput.writeLong(endDate);

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		objectOutput.writeLong(submittedDate);
	}

	public long id;
	public String title;
	public String description;
	public String surveyObj;
	public long startDate;
	public long endDate;
	public String status;
	public long submittedDate;

}