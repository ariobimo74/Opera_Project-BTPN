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

package com.btpn.opera.operationsurvey.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link Answers}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Answers
 * @generated
 */
@ProviderType
public class AnswersWrapper
	extends BaseModelWrapper<Answers>
	implements Answers, ModelWrapper<Answers> {

	public AnswersWrapper(Answers answers) {
		super(answers);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("answer", getAnswer());
		attributes.put("value", getValue());
		attributes.put("questionsId", getQuestionsId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String answer = (String)attributes.get("answer");

		if (answer != null) {
			setAnswer(answer);
		}

		Double value = (Double)attributes.get("value");

		if (value != null) {
			setValue(value);
		}

		Long questionsId = (Long)attributes.get("questionsId");

		if (questionsId != null) {
			setQuestionsId(questionsId);
		}
	}

	/**
	 * Returns the answer of this answers.
	 *
	 * @return the answer of this answers
	 */
	@Override
	public String getAnswer() {
		return model.getAnswer();
	}

	/**
	 * Returns the ID of this answers.
	 *
	 * @return the ID of this answers
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the primary key of this answers.
	 *
	 * @return the primary key of this answers
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the questions ID of this answers.
	 *
	 * @return the questions ID of this answers
	 */
	@Override
	public long getQuestionsId() {
		return model.getQuestionsId();
	}

	/**
	 * Returns the value of this answers.
	 *
	 * @return the value of this answers
	 */
	@Override
	public double getValue() {
		return model.getValue();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the answer of this answers.
	 *
	 * @param answer the answer of this answers
	 */
	@Override
	public void setAnswer(String answer) {
		model.setAnswer(answer);
	}

	/**
	 * Sets the ID of this answers.
	 *
	 * @param id the ID of this answers
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the primary key of this answers.
	 *
	 * @param primaryKey the primary key of this answers
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the questions ID of this answers.
	 *
	 * @param questionsId the questions ID of this answers
	 */
	@Override
	public void setQuestionsId(long questionsId) {
		model.setQuestionsId(questionsId);
	}

	/**
	 * Sets the value of this answers.
	 *
	 * @param value the value of this answers
	 */
	@Override
	public void setValue(double value) {
		model.setValue(value);
	}

	@Override
	protected AnswersWrapper wrap(Answers answers) {
		return new AnswersWrapper(answers);
	}

}