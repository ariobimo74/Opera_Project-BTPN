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
		StringBundler sb = new StringBundler(37);

		sb.append("{id=");
		sb.append(id);
		sb.append(", title=");
		sb.append(title);
		sb.append(", description=");
		sb.append(description);
		sb.append(", surveyObjId=");
		sb.append(surveyObjId);
		sb.append(", startDate=");
		sb.append(startDate);
		sb.append(", endDate=");
		sb.append(endDate);
		sb.append(", question1=");
		sb.append(question1);
		sb.append(", question2=");
		sb.append(question2);
		sb.append(", question3=");
		sb.append(question3);
		sb.append(", question4=");
		sb.append(question4);
		sb.append(", question5=");
		sb.append(question5);
		sb.append(", question6=");
		sb.append(question6);
		sb.append(", question7=");
		sb.append(question7);
		sb.append(", question8=");
		sb.append(question8);
		sb.append(", question9=");
		sb.append(question9);
		sb.append(", question10=");
		sb.append(question10);
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

		surveyOperationImpl.setSurveyObjId(surveyObjId);

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

		if (question1 == null) {
			surveyOperationImpl.setQuestion1("");
		}
		else {
			surveyOperationImpl.setQuestion1(question1);
		}

		if (question2 == null) {
			surveyOperationImpl.setQuestion2("");
		}
		else {
			surveyOperationImpl.setQuestion2(question2);
		}

		if (question3 == null) {
			surveyOperationImpl.setQuestion3("");
		}
		else {
			surveyOperationImpl.setQuestion3(question3);
		}

		if (question4 == null) {
			surveyOperationImpl.setQuestion4("");
		}
		else {
			surveyOperationImpl.setQuestion4(question4);
		}

		if (question5 == null) {
			surveyOperationImpl.setQuestion5("");
		}
		else {
			surveyOperationImpl.setQuestion5(question5);
		}

		if (question6 == null) {
			surveyOperationImpl.setQuestion6("");
		}
		else {
			surveyOperationImpl.setQuestion6(question6);
		}

		if (question7 == null) {
			surveyOperationImpl.setQuestion7("");
		}
		else {
			surveyOperationImpl.setQuestion7(question7);
		}

		if (question8 == null) {
			surveyOperationImpl.setQuestion8("");
		}
		else {
			surveyOperationImpl.setQuestion8(question8);
		}

		if (question9 == null) {
			surveyOperationImpl.setQuestion9("");
		}
		else {
			surveyOperationImpl.setQuestion9(question9);
		}

		if (question10 == null) {
			surveyOperationImpl.setQuestion10("");
		}
		else {
			surveyOperationImpl.setQuestion10(question10);
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

		surveyObjId = objectInput.readLong();
		startDate = objectInput.readLong();
		endDate = objectInput.readLong();
		question1 = objectInput.readUTF();
		question2 = objectInput.readUTF();
		question3 = objectInput.readUTF();
		question4 = objectInput.readUTF();
		question5 = objectInput.readUTF();
		question6 = objectInput.readUTF();
		question7 = objectInput.readUTF();
		question8 = objectInput.readUTF();
		question9 = objectInput.readUTF();
		question10 = objectInput.readUTF();
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

		objectOutput.writeLong(surveyObjId);
		objectOutput.writeLong(startDate);
		objectOutput.writeLong(endDate);

		if (question1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(question1);
		}

		if (question2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(question2);
		}

		if (question3 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(question3);
		}

		if (question4 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(question4);
		}

		if (question5 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(question5);
		}

		if (question6 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(question6);
		}

		if (question7 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(question7);
		}

		if (question8 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(question8);
		}

		if (question9 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(question9);
		}

		if (question10 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(question10);
		}

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
	public long surveyObjId;
	public long startDate;
	public long endDate;
	public String question1;
	public String question2;
	public String question3;
	public String question4;
	public String question5;
	public String question6;
	public String question7;
	public String question8;
	public String question9;
	public String question10;
	public String status;
	public long submittedDate;

}