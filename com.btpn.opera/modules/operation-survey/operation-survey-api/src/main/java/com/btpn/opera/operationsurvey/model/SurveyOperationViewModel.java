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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the SurveyOperationView service. Represents a row in the &quot;survey_operation_view&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.btpn.opera.operationsurvey.model.impl.SurveyOperationViewModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.btpn.opera.operationsurvey.model.impl.SurveyOperationViewImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationView
 * @generated
 */
@ProviderType
public interface SurveyOperationViewModel
	extends BaseModel<SurveyOperationView> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a survey operation view model instance should use the {@link SurveyOperationView} interface instead.
	 */

	/**
	 * Returns the primary key of this survey operation view.
	 *
	 * @return the primary key of this survey operation view
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this survey operation view.
	 *
	 * @param primaryKey the primary key of this survey operation view
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this survey operation view.
	 *
	 * @return the ID of this survey operation view
	 */
	public long getId();

	/**
	 * Sets the ID of this survey operation view.
	 *
	 * @param id the ID of this survey operation view
	 */
	public void setId(long id);

	/**
	 * Returns the title of this survey operation view.
	 *
	 * @return the title of this survey operation view
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this survey operation view.
	 *
	 * @param title the title of this survey operation view
	 */
	public void setTitle(String title);

	/**
	 * Returns the name of this survey operation view.
	 *
	 * @return the name of this survey operation view
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this survey operation view.
	 *
	 * @param name the name of this survey operation view
	 */
	public void setName(String name);

	/**
	 * Returns the start date of this survey operation view.
	 *
	 * @return the start date of this survey operation view
	 */
	public Date getStartDate();

	/**
	 * Sets the start date of this survey operation view.
	 *
	 * @param startDate the start date of this survey operation view
	 */
	public void setStartDate(Date startDate);

	/**
	 * Returns the end date of this survey operation view.
	 *
	 * @return the end date of this survey operation view
	 */
	public Date getEndDate();

	/**
	 * Sets the end date of this survey operation view.
	 *
	 * @param endDate the end date of this survey operation view
	 */
	public void setEndDate(Date endDate);

	/**
	 * Returns the submitted_date of this survey operation view.
	 *
	 * @return the submitted_date of this survey operation view
	 */
	public Date getSubmitted_date();

	/**
	 * Sets the submitted_date of this survey operation view.
	 *
	 * @param submitted_date the submitted_date of this survey operation view
	 */
	public void setSubmitted_date(Date submitted_date);

}