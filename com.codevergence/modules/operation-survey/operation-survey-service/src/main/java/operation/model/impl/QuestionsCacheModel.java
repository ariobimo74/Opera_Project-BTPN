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

import operation.model.Questions;

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
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", question=");
		sb.append(question);
		sb.append(", answer=");
		sb.append(answer);
		sb.append(", value=");
		sb.append(value);
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

		if (answer == null) {
			questionsImpl.setAnswer("");
		}
		else {
			questionsImpl.setAnswer(answer);
		}

		questionsImpl.setValue(value);

		questionsImpl.resetOriginalValues();

		return questionsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		question = objectInput.readUTF();
		answer = objectInput.readUTF();

		value = objectInput.readDouble();
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

		if (answer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(answer);
		}

		objectOutput.writeDouble(value);
	}

	public long id;
	public String question;
	public String answer;
	public double value;

}