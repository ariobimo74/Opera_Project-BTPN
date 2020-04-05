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
 * This class is a wrapper for {@link SurveyObject}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyObject
 * @generated
 */
@ProviderType
public class SurveyObjectWrapper
	extends BaseModelWrapper<SurveyObject>
	implements SurveyObject, ModelWrapper<SurveyObject> {

	public SurveyObjectWrapper(SurveyObject surveyObject) {
		super(surveyObject);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	/**
	 * Returns the ID of this survey object.
	 *
	 * @return the ID of this survey object
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the name of this survey object.
	 *
	 * @return the name of this survey object
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this survey object.
	 *
	 * @return the primary key of this survey object
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the ID of this survey object.
	 *
	 * @param id the ID of this survey object
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the name of this survey object.
	 *
	 * @param name the name of this survey object
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this survey object.
	 *
	 * @param primaryKey the primary key of this survey object
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected SurveyObjectWrapper wrap(SurveyObject surveyObject) {
		return new SurveyObjectWrapper(surveyObject);
	}

}