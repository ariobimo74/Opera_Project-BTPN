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

package responden.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link SurveyResponden}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyResponden
 * @generated
 */
@ProviderType
public class SurveyRespondenWrapper
	extends BaseModelWrapper<SurveyResponden>
	implements SurveyResponden, ModelWrapper<SurveyResponden> {

	public SurveyRespondenWrapper(SurveyResponden surveyResponden) {
		super(surveyResponden);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("nik", getNik());
		attributes.put("surveyId", getSurveyId());
		attributes.put("answer1", getAnswer1());
		attributes.put("answer2", getAnswer2());
		attributes.put("answer3", getAnswer3());
		attributes.put("answer4", getAnswer4());
		attributes.put("answer5", getAnswer5());
		attributes.put("answer6", getAnswer6());
		attributes.put("answer7", getAnswer7());
		attributes.put("answer8", getAnswer8());
		attributes.put("answer9", getAnswer9());
		attributes.put("answer10", getAnswer10());
		attributes.put("note", getNote());
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

		String nik = (String)attributes.get("nik");

		if (nik != null) {
			setNik(nik);
		}

		Long surveyId = (Long)attributes.get("surveyId");

		if (surveyId != null) {
			setSurveyId(surveyId);
		}

		Double answer1 = (Double)attributes.get("answer1");

		if (answer1 != null) {
			setAnswer1(answer1);
		}

		Double answer2 = (Double)attributes.get("answer2");

		if (answer2 != null) {
			setAnswer2(answer2);
		}

		Double answer3 = (Double)attributes.get("answer3");

		if (answer3 != null) {
			setAnswer3(answer3);
		}

		Double answer4 = (Double)attributes.get("answer4");

		if (answer4 != null) {
			setAnswer4(answer4);
		}

		Double answer5 = (Double)attributes.get("answer5");

		if (answer5 != null) {
			setAnswer5(answer5);
		}

		Double answer6 = (Double)attributes.get("answer6");

		if (answer6 != null) {
			setAnswer6(answer6);
		}

		Double answer7 = (Double)attributes.get("answer7");

		if (answer7 != null) {
			setAnswer7(answer7);
		}

		Double answer8 = (Double)attributes.get("answer8");

		if (answer8 != null) {
			setAnswer8(answer8);
		}

		Double answer9 = (Double)attributes.get("answer9");

		if (answer9 != null) {
			setAnswer9(answer9);
		}

		Double answer10 = (Double)attributes.get("answer10");

		if (answer10 != null) {
			setAnswer10(answer10);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
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
	 * Returns the answer1 of this survey responden.
	 *
	 * @return the answer1 of this survey responden
	 */
	@Override
	public Double getAnswer1() {
		return model.getAnswer1();
	}

	/**
	 * Returns the answer10 of this survey responden.
	 *
	 * @return the answer10 of this survey responden
	 */
	@Override
	public Double getAnswer10() {
		return model.getAnswer10();
	}

	/**
	 * Returns the answer2 of this survey responden.
	 *
	 * @return the answer2 of this survey responden
	 */
	@Override
	public Double getAnswer2() {
		return model.getAnswer2();
	}

	/**
	 * Returns the answer3 of this survey responden.
	 *
	 * @return the answer3 of this survey responden
	 */
	@Override
	public Double getAnswer3() {
		return model.getAnswer3();
	}

	/**
	 * Returns the answer4 of this survey responden.
	 *
	 * @return the answer4 of this survey responden
	 */
	@Override
	public Double getAnswer4() {
		return model.getAnswer4();
	}

	/**
	 * Returns the answer5 of this survey responden.
	 *
	 * @return the answer5 of this survey responden
	 */
	@Override
	public Double getAnswer5() {
		return model.getAnswer5();
	}

	/**
	 * Returns the answer6 of this survey responden.
	 *
	 * @return the answer6 of this survey responden
	 */
	@Override
	public Double getAnswer6() {
		return model.getAnswer6();
	}

	/**
	 * Returns the answer7 of this survey responden.
	 *
	 * @return the answer7 of this survey responden
	 */
	@Override
	public Double getAnswer7() {
		return model.getAnswer7();
	}

	/**
	 * Returns the answer8 of this survey responden.
	 *
	 * @return the answer8 of this survey responden
	 */
	@Override
	public Double getAnswer8() {
		return model.getAnswer8();
	}

	/**
	 * Returns the answer9 of this survey responden.
	 *
	 * @return the answer9 of this survey responden
	 */
	@Override
	public Double getAnswer9() {
		return model.getAnswer9();
	}

	/**
	 * Returns the ID of this survey responden.
	 *
	 * @return the ID of this survey responden
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the nik of this survey responden.
	 *
	 * @return the nik of this survey responden
	 */
	@Override
	public String getNik() {
		return model.getNik();
	}

	/**
	 * Returns the note of this survey responden.
	 *
	 * @return the note of this survey responden
	 */
	@Override
	public String getNote() {
		return model.getNote();
	}

	/**
	 * Returns the primary key of this survey responden.
	 *
	 * @return the primary key of this survey responden
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this survey responden.
	 *
	 * @return the status of this survey responden
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the submitted date of this survey responden.
	 *
	 * @return the submitted date of this survey responden
	 */
	@Override
	public Date getSubmittedDate() {
		return model.getSubmittedDate();
	}

	/**
	 * Returns the survey ID of this survey responden.
	 *
	 * @return the survey ID of this survey responden
	 */
	@Override
	public long getSurveyId() {
		return model.getSurveyId();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the answer1 of this survey responden.
	 *
	 * @param answer1 the answer1 of this survey responden
	 */
	@Override
	public void setAnswer1(Double answer1) {
		model.setAnswer1(answer1);
	}

	/**
	 * Sets the answer10 of this survey responden.
	 *
	 * @param answer10 the answer10 of this survey responden
	 */
	@Override
	public void setAnswer10(Double answer10) {
		model.setAnswer10(answer10);
	}

	/**
	 * Sets the answer2 of this survey responden.
	 *
	 * @param answer2 the answer2 of this survey responden
	 */
	@Override
	public void setAnswer2(Double answer2) {
		model.setAnswer2(answer2);
	}

	/**
	 * Sets the answer3 of this survey responden.
	 *
	 * @param answer3 the answer3 of this survey responden
	 */
	@Override
	public void setAnswer3(Double answer3) {
		model.setAnswer3(answer3);
	}

	/**
	 * Sets the answer4 of this survey responden.
	 *
	 * @param answer4 the answer4 of this survey responden
	 */
	@Override
	public void setAnswer4(Double answer4) {
		model.setAnswer4(answer4);
	}

	/**
	 * Sets the answer5 of this survey responden.
	 *
	 * @param answer5 the answer5 of this survey responden
	 */
	@Override
	public void setAnswer5(Double answer5) {
		model.setAnswer5(answer5);
	}

	/**
	 * Sets the answer6 of this survey responden.
	 *
	 * @param answer6 the answer6 of this survey responden
	 */
	@Override
	public void setAnswer6(Double answer6) {
		model.setAnswer6(answer6);
	}

	/**
	 * Sets the answer7 of this survey responden.
	 *
	 * @param answer7 the answer7 of this survey responden
	 */
	@Override
	public void setAnswer7(Double answer7) {
		model.setAnswer7(answer7);
	}

	/**
	 * Sets the answer8 of this survey responden.
	 *
	 * @param answer8 the answer8 of this survey responden
	 */
	@Override
	public void setAnswer8(Double answer8) {
		model.setAnswer8(answer8);
	}

	/**
	 * Sets the answer9 of this survey responden.
	 *
	 * @param answer9 the answer9 of this survey responden
	 */
	@Override
	public void setAnswer9(Double answer9) {
		model.setAnswer9(answer9);
	}

	/**
	 * Sets the ID of this survey responden.
	 *
	 * @param id the ID of this survey responden
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the nik of this survey responden.
	 *
	 * @param nik the nik of this survey responden
	 */
	@Override
	public void setNik(String nik) {
		model.setNik(nik);
	}

	/**
	 * Sets the note of this survey responden.
	 *
	 * @param note the note of this survey responden
	 */
	@Override
	public void setNote(String note) {
		model.setNote(note);
	}

	/**
	 * Sets the primary key of this survey responden.
	 *
	 * @param primaryKey the primary key of this survey responden
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this survey responden.
	 *
	 * @param status the status of this survey responden
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the submitted date of this survey responden.
	 *
	 * @param submittedDate the submitted date of this survey responden
	 */
	@Override
	public void setSubmittedDate(Date submittedDate) {
		model.setSubmittedDate(submittedDate);
	}

	/**
	 * Sets the survey ID of this survey responden.
	 *
	 * @param surveyId the survey ID of this survey responden
	 */
	@Override
	public void setSurveyId(long surveyId) {
		model.setSurveyId(surveyId);
	}

	@Override
	protected SurveyRespondenWrapper wrap(SurveyResponden surveyResponden) {
		return new SurveyRespondenWrapper(surveyResponden);
	}

}