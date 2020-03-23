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

package responden.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

import responden.model.SurveyResponden;

/**
 * The cache model class for representing SurveyResponden in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class SurveyRespondenCacheModel
	implements CacheModel<SurveyResponden>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SurveyRespondenCacheModel)) {
			return false;
		}

		SurveyRespondenCacheModel surveyRespondenCacheModel =
			(SurveyRespondenCacheModel)obj;

		if (id == surveyRespondenCacheModel.id) {
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
		StringBundler sb = new StringBundler(33);

		sb.append("{id=");
		sb.append(id);
		sb.append(", nik=");
		sb.append(nik);
		sb.append(", surveyId=");
		sb.append(surveyId);
		sb.append(", answer1=");
		sb.append(answer1);
		sb.append(", answer2=");
		sb.append(answer2);
		sb.append(", answer3=");
		sb.append(answer3);
		sb.append(", answer4=");
		sb.append(answer4);
		sb.append(", answer5=");
		sb.append(answer5);
		sb.append(", answer6=");
		sb.append(answer6);
		sb.append(", answer7=");
		sb.append(answer7);
		sb.append(", answer8=");
		sb.append(answer8);
		sb.append(", answer9=");
		sb.append(answer9);
		sb.append(", answer10=");
		sb.append(answer10);
		sb.append(", note=");
		sb.append(note);
		sb.append(", status=");
		sb.append(status);
		sb.append(", submittedDate=");
		sb.append(submittedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SurveyResponden toEntityModel() {
		SurveyRespondenImpl surveyRespondenImpl = new SurveyRespondenImpl();

		surveyRespondenImpl.setId(id);

		if (nik == null) {
			surveyRespondenImpl.setNik("");
		}
		else {
			surveyRespondenImpl.setNik(nik);
		}

		surveyRespondenImpl.setSurveyId(surveyId);
		surveyRespondenImpl.setAnswer1(answer1);
		surveyRespondenImpl.setAnswer2(answer2);
		surveyRespondenImpl.setAnswer3(answer3);
		surveyRespondenImpl.setAnswer4(answer4);
		surveyRespondenImpl.setAnswer5(answer5);
		surveyRespondenImpl.setAnswer6(answer6);
		surveyRespondenImpl.setAnswer7(answer7);
		surveyRespondenImpl.setAnswer8(answer8);
		surveyRespondenImpl.setAnswer9(answer9);
		surveyRespondenImpl.setAnswer10(answer10);

		if (note == null) {
			surveyRespondenImpl.setNote("");
		}
		else {
			surveyRespondenImpl.setNote(note);
		}

		if (status == null) {
			surveyRespondenImpl.setStatus("");
		}
		else {
			surveyRespondenImpl.setStatus(status);
		}

		if (submittedDate == Long.MIN_VALUE) {
			surveyRespondenImpl.setSubmittedDate(null);
		}
		else {
			surveyRespondenImpl.setSubmittedDate(new Date(submittedDate));
		}

		surveyRespondenImpl.resetOriginalValues();

		return surveyRespondenImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		nik = objectInput.readUTF();

		surveyId = objectInput.readLong();

		answer1 = objectInput.readDouble();

		answer2 = objectInput.readDouble();

		answer3 = objectInput.readDouble();

		answer4 = objectInput.readDouble();

		answer5 = objectInput.readDouble();

		answer6 = objectInput.readDouble();

		answer7 = objectInput.readDouble();

		answer8 = objectInput.readDouble();

		answer9 = objectInput.readDouble();

		answer10 = objectInput.readDouble();
		note = objectInput.readUTF();
		status = objectInput.readUTF();
		submittedDate = objectInput.readLong();
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

		objectOutput.writeLong(surveyId);

		objectOutput.writeDouble(answer1);

		objectOutput.writeDouble(answer2);

		objectOutput.writeDouble(answer3);

		objectOutput.writeDouble(answer4);

		objectOutput.writeDouble(answer5);

		objectOutput.writeDouble(answer6);

		objectOutput.writeDouble(answer7);

		objectOutput.writeDouble(answer8);

		objectOutput.writeDouble(answer9);

		objectOutput.writeDouble(answer10);

		if (note == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(note);
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
	public String nik;
	public long surveyId;
	public double answer1;
	public double answer2;
	public double answer3;
	public double answer4;
	public double answer5;
	public double answer6;
	public double answer7;
	public double answer8;
	public double answer9;
	public double answer10;
	public String note;
	public String status;
	public long submittedDate;

}