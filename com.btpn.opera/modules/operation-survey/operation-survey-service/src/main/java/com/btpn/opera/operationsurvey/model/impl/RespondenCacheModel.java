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

import com.btpn.opera.operationsurvey.model.Responden;

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
 * The cache model class for representing Responden in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class RespondenCacheModel
	implements CacheModel<Responden>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RespondenCacheModel)) {
			return false;
		}

		RespondenCacheModel respondenCacheModel = (RespondenCacheModel)obj;

		if (id == respondenCacheModel.id) {
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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", nik=");
		sb.append(nik);
		sb.append(", fullName=");
		sb.append(fullName);
		sb.append(", lob=");
		sb.append(lob);
		sb.append(", division=");
		sb.append(division);
		sb.append(", surveyoperationId=");
		sb.append(surveyoperationId);
		sb.append(", totalValue=");
		sb.append(totalValue);
		sb.append(", answerRecord=");
		sb.append(answerRecord);
		sb.append(", submittedDate=");
		sb.append(submittedDate);
		sb.append(", notes=");
		sb.append(notes);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Responden toEntityModel() {
		RespondenImpl respondenImpl = new RespondenImpl();

		respondenImpl.setId(id);

		if (nik == null) {
			respondenImpl.setNik("");
		}
		else {
			respondenImpl.setNik(nik);
		}

		if (fullName == null) {
			respondenImpl.setFullName("");
		}
		else {
			respondenImpl.setFullName(fullName);
		}

		if (lob == null) {
			respondenImpl.setLob("");
		}
		else {
			respondenImpl.setLob(lob);
		}

		if (division == null) {
			respondenImpl.setDivision("");
		}
		else {
			respondenImpl.setDivision(division);
		}

		respondenImpl.setSurveyoperationId(surveyoperationId);
		respondenImpl.setTotalValue(totalValue);

		if (answerRecord == null) {
			respondenImpl.setAnswerRecord("");
		}
		else {
			respondenImpl.setAnswerRecord(answerRecord);
		}

		if (submittedDate == Long.MIN_VALUE) {
			respondenImpl.setSubmittedDate(null);
		}
		else {
			respondenImpl.setSubmittedDate(new Date(submittedDate));
		}

		if (notes == null) {
			respondenImpl.setNotes("");
		}
		else {
			respondenImpl.setNotes(notes);
		}

		respondenImpl.resetOriginalValues();

		return respondenImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		nik = objectInput.readUTF();
		fullName = objectInput.readUTF();
		lob = objectInput.readUTF();
		division = objectInput.readUTF();

		surveyoperationId = objectInput.readLong();

		totalValue = objectInput.readDouble();
		answerRecord = objectInput.readUTF();
		submittedDate = objectInput.readLong();
		notes = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(id);

		if (nik == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nik);
		}

		if (fullName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fullName);
		}

		if (lob == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lob);
		}

		if (division == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(division);
		}

		objectOutput.writeLong(surveyoperationId);

		objectOutput.writeDouble(totalValue);

		if (answerRecord == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(answerRecord);
		}

		objectOutput.writeLong(submittedDate);

		if (notes == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(notes);
		}
	}

	public long id;
	public String nik;
	public String fullName;
	public String lob;
	public String division;
	public long surveyoperationId;
	public double totalValue;
	public String answerRecord;
	public long submittedDate;
	public String notes;

}