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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link SurveyOperation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperation
 * @generated
 */
@ProviderType
public class SurveyOperationWrapper
	extends BaseModelWrapper<SurveyOperation>
	implements SurveyOperation, ModelWrapper<SurveyOperation> {

	public SurveyOperationWrapper(SurveyOperation surveyOperation) {
		super(surveyOperation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("surveyObjId", getSurveyObjId());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());
		attributes.put("question1", getQuestion1());
		attributes.put("question2", getQuestion2());
		attributes.put("question3", getQuestion3());
		attributes.put("question4", getQuestion4());
		attributes.put("question5", getQuestion5());
		attributes.put("question6", getQuestion6());
		attributes.put("question7", getQuestion7());
		attributes.put("question8", getQuestion8());
		attributes.put("question9", getQuestion9());
		attributes.put("question10", getQuestion10());
		attributes.put("status", getStatus());
		attributes.put("submittedDate", getSubmittedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long surveyObjId = (Long)attributes.get("surveyObjId");

		if (surveyObjId != null) {
			setSurveyObjId(surveyObjId);
		}

		Date startDate = (Date)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		Date endDate = (Date)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}

		String question1 = (String)attributes.get("question1");

		if (question1 != null) {
			setQuestion1(question1);
		}

		String question2 = (String)attributes.get("question2");

		if (question2 != null) {
			setQuestion2(question2);
		}

		String question3 = (String)attributes.get("question3");

		if (question3 != null) {
			setQuestion3(question3);
		}

		String question4 = (String)attributes.get("question4");

		if (question4 != null) {
			setQuestion4(question4);
		}

		String question5 = (String)attributes.get("question5");

		if (question5 != null) {
			setQuestion5(question5);
		}

		String question6 = (String)attributes.get("question6");

		if (question6 != null) {
			setQuestion6(question6);
		}

		String question7 = (String)attributes.get("question7");

		if (question7 != null) {
			setQuestion7(question7);
		}

		String question8 = (String)attributes.get("question8");

		if (question8 != null) {
			setQuestion8(question8);
		}

		String question9 = (String)attributes.get("question9");

		if (question9 != null) {
			setQuestion9(question9);
		}

		String question10 = (String)attributes.get("question10");

		if (question10 != null) {
			setQuestion10(question10);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Date submittedDate = (Date)attributes.get("submittedDate");

		if (submittedDate != null) {
			setSubmittedDate(submittedDate);
		}
	}

	/**
	 * Returns the description of this survey operation.
	 *
	 * @return the description of this survey operation
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the end date of this survey operation.
	 *
	 * @return the end date of this survey operation
	 */
	@Override
	public Date getEndDate() {
		return model.getEndDate();
	}

	/**
	 * Returns the ID of this survey operation.
	 *
	 * @return the ID of this survey operation
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the primary key of this survey operation.
	 *
	 * @return the primary key of this survey operation
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the question1 of this survey operation.
	 *
	 * @return the question1 of this survey operation
	 */
	@Override
	public String getQuestion1() {
		return model.getQuestion1();
	}

	/**
	 * Returns the question10 of this survey operation.
	 *
	 * @return the question10 of this survey operation
	 */
	@Override
	public String getQuestion10() {
		return model.getQuestion10();
	}

	/**
	 * Returns the question2 of this survey operation.
	 *
	 * @return the question2 of this survey operation
	 */
	@Override
	public String getQuestion2() {
		return model.getQuestion2();
	}

	/**
	 * Returns the question3 of this survey operation.
	 *
	 * @return the question3 of this survey operation
	 */
	@Override
	public String getQuestion3() {
		return model.getQuestion3();
	}

	/**
	 * Returns the question4 of this survey operation.
	 *
	 * @return the question4 of this survey operation
	 */
	@Override
	public String getQuestion4() {
		return model.getQuestion4();
	}

	/**
	 * Returns the question5 of this survey operation.
	 *
	 * @return the question5 of this survey operation
	 */
	@Override
	public String getQuestion5() {
		return model.getQuestion5();
	}

	/**
	 * Returns the question6 of this survey operation.
	 *
	 * @return the question6 of this survey operation
	 */
	@Override
	public String getQuestion6() {
		return model.getQuestion6();
	}

	/**
	 * Returns the question7 of this survey operation.
	 *
	 * @return the question7 of this survey operation
	 */
	@Override
	public String getQuestion7() {
		return model.getQuestion7();
	}

	/**
	 * Returns the question8 of this survey operation.
	 *
	 * @return the question8 of this survey operation
	 */
	@Override
	public String getQuestion8() {
		return model.getQuestion8();
	}

	/**
	 * Returns the question9 of this survey operation.
	 *
	 * @return the question9 of this survey operation
	 */
	@Override
	public String getQuestion9() {
		return model.getQuestion9();
	}

	/**
	 * Returns the start date of this survey operation.
	 *
	 * @return the start date of this survey operation
	 */
	@Override
	public Date getStartDate() {
		return model.getStartDate();
	}

	/**
	 * Returns the status of this survey operation.
	 *
	 * @return the status of this survey operation
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the submitted date of this survey operation.
	 *
	 * @return the submitted date of this survey operation
	 */
	@Override
	public Date getSubmittedDate() {
		return model.getSubmittedDate();
	}

	/**
	 * Returns the survey obj ID of this survey operation.
	 *
	 * @return the survey obj ID of this survey operation
	 */
	@Override
	public long getSurveyObjId() {
		return model.getSurveyObjId();
	}

	/**
	 * Returns the title of this survey operation.
	 *
	 * @return the title of this survey operation
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the description of this survey operation.
	 *
	 * @param description the description of this survey operation
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the end date of this survey operation.
	 *
	 * @param endDate the end date of this survey operation
	 */
	@Override
	public void setEndDate(Date endDate) {
		model.setEndDate(endDate);
	}

	/**
	 * Sets the ID of this survey operation.
	 *
	 * @param id the ID of this survey operation
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the primary key of this survey operation.
	 *
	 * @param primaryKey the primary key of this survey operation
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the question1 of this survey operation.
	 *
	 * @param question1 the question1 of this survey operation
	 */
	@Override
	public void setQuestion1(String question1) {
		model.setQuestion1(question1);
	}

	/**
	 * Sets the question10 of this survey operation.
	 *
	 * @param question10 the question10 of this survey operation
	 */
	@Override
	public void setQuestion10(String question10) {
		model.setQuestion10(question10);
	}

	/**
	 * Sets the question2 of this survey operation.
	 *
	 * @param question2 the question2 of this survey operation
	 */
	@Override
	public void setQuestion2(String question2) {
		model.setQuestion2(question2);
	}

	/**
	 * Sets the question3 of this survey operation.
	 *
	 * @param question3 the question3 of this survey operation
	 */
	@Override
	public void setQuestion3(String question3) {
		model.setQuestion3(question3);
	}

	/**
	 * Sets the question4 of this survey operation.
	 *
	 * @param question4 the question4 of this survey operation
	 */
	@Override
	public void setQuestion4(String question4) {
		model.setQuestion4(question4);
	}

	/**
	 * Sets the question5 of this survey operation.
	 *
	 * @param question5 the question5 of this survey operation
	 */
	@Override
	public void setQuestion5(String question5) {
		model.setQuestion5(question5);
	}

	/**
	 * Sets the question6 of this survey operation.
	 *
	 * @param question6 the question6 of this survey operation
	 */
	@Override
	public void setQuestion6(String question6) {
		model.setQuestion6(question6);
	}

	/**
	 * Sets the question7 of this survey operation.
	 *
	 * @param question7 the question7 of this survey operation
	 */
	@Override
	public void setQuestion7(String question7) {
		model.setQuestion7(question7);
	}

	/**
	 * Sets the question8 of this survey operation.
	 *
	 * @param question8 the question8 of this survey operation
	 */
	@Override
	public void setQuestion8(String question8) {
		model.setQuestion8(question8);
	}

	/**
	 * Sets the question9 of this survey operation.
	 *
	 * @param question9 the question9 of this survey operation
	 */
	@Override
	public void setQuestion9(String question9) {
		model.setQuestion9(question9);
	}

	/**
	 * Sets the start date of this survey operation.
	 *
	 * @param startDate the start date of this survey operation
	 */
	@Override
	public void setStartDate(Date startDate) {
		model.setStartDate(startDate);
	}

	/**
	 * Sets the status of this survey operation.
	 *
	 * @param status the status of this survey operation
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the submitted date of this survey operation.
	 *
	 * @param submittedDate the submitted date of this survey operation
	 */
	@Override
	public void setSubmittedDate(Date submittedDate) {
		model.setSubmittedDate(submittedDate);
	}

	/**
	 * Sets the survey obj ID of this survey operation.
	 *
	 * @param surveyObjId the survey obj ID of this survey operation
	 */
	@Override
	public void setSurveyObjId(long surveyObjId) {
		model.setSurveyObjId(surveyObjId);
	}

	/**
	 * Sets the title of this survey operation.
	 *
	 * @param title the title of this survey operation
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	@Override
	protected SurveyOperationWrapper wrap(SurveyOperation surveyOperation) {
		return new SurveyOperationWrapper(surveyOperation);
	}

}