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

package operation.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link Questions}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Questions
 * @generated
 */
@ProviderType
public class QuestionsWrapper
	extends BaseModelWrapper<Questions>
	implements Questions, ModelWrapper<Questions> {

	public QuestionsWrapper(Questions questions) {
		super(questions);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("question", getQuestion());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String question = (String)attributes.get("question");

		if (question != null) {
			setQuestion(question);
		}
	}

	/**
	 * Returns the ID of this questions.
	 *
	 * @return the ID of this questions
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the primary key of this questions.
	 *
	 * @return the primary key of this questions
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the question of this questions.
	 *
	 * @return the question of this questions
	 */
	@Override
	public String getQuestion() {
		return model.getQuestion();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the ID of this questions.
	 *
	 * @param id the ID of this questions
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the primary key of this questions.
	 *
	 * @param primaryKey the primary key of this questions
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the question of this questions.
	 *
	 * @param question the question of this questions
	 */
	@Override
	public void setQuestion(String question) {
		model.setQuestion(question);
	}

	@Override
	protected QuestionsWrapper wrap(Questions questions) {
		return new QuestionsWrapper(questions);
	}

}