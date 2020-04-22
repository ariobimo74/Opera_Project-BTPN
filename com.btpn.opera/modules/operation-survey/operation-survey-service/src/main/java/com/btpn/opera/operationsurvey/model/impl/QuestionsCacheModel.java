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

import com.btpn.opera.operationsurvey.model.Questions;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing Questions in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class QuestionsCacheModel
	implements CacheModel<Questions>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QuestionsCacheModel)) {
			return false;
		}

		QuestionsCacheModel questionsCacheModel = (QuestionsCacheModel)obj;

		if (id == questionsCacheModel.id) {
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
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", question=");
		sb.append(question);
		sb.append(", surveyOperationId=");
		sb.append(surveyOperationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Questions toEntityModel() {
		QuestionsImpl questionsImpl = new QuestionsImpl();

		questionsImpl.setId(id);

		if (question == null) {
			questionsImpl.setQuestion("");
		}
		else {
			questionsImpl.setQuestion(question);
		}

		questionsImpl.setSurveyOperationId(surveyOperationId);

		questionsImpl.resetOriginalValues();

		return questionsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		question = objectInput.readUTF();

		surveyOperationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(id);

		if (question == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(question);
		}

		objectOutput.writeLong(surveyOperationId);
	}

	public long id;
	public String question;
	public long surveyOperationId;

}