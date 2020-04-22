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
 * The base model interface for the SurveyOperationUsersView service. Represents a row in the &quot;survey_operation_users_view&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.btpn.opera.operationsurvey.model.impl.SurveyOperationUsersViewModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.btpn.opera.operationsurvey.model.impl.SurveyOperationUsersViewImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationUsersView
 * @generated
 */
@ProviderType
public interface SurveyOperationUsersViewModel
	extends BaseModel<SurveyOperationUsersView> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a survey operation users view model instance should use the {@link SurveyOperationUsersView} interface instead.
	 */

	/**
	 * Returns the primary key of this survey operation users view.
	 *
	 * @return the primary key of this survey operation users view
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this survey operation users view.
	 *
	 * @param primaryKey the primary key of this survey operation users view
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this survey operation users view.
	 *
	 * @return the ID of this survey operation users view
	 */
	public long getId();

	/**
	 * Sets the ID of this survey operation users view.
	 *
	 * @param id the ID of this survey operation users view
	 */
	public void setId(long id);

	/**
	 * Returns the title of this survey operation users view.
	 *
	 * @return the title of this survey operation users view
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this survey operation users view.
	 *
	 * @param title the title of this survey operation users view
	 */
	public void setTitle(String title);

	/**
	 * Returns the object name of this survey operation users view.
	 *
	 * @return the object name of this survey operation users view
	 */
	@AutoEscape
	public String getObjectName();

	/**
	 * Sets the object name of this survey operation users view.
	 *
	 * @param objectName the object name of this survey operation users view
	 */
	public void setObjectName(String objectName);

	/**
	 * Returns the start date of this survey operation users view.
	 *
	 * @return the start date of this survey operation users view
	 */
	public Date getStartDate();

	/**
	 * Sets the start date of this survey operation users view.
	 *
	 * @param startDate the start date of this survey operation users view
	 */
	public void setStartDate(Date startDate);

	/**
	 * Returns the end date of this survey operation users view.
	 *
	 * @return the end date of this survey operation users view
	 */
	public Date getEndDate();

	/**
	 * Sets the end date of this survey operation users view.
	 *
	 * @param endDate the end date of this survey operation users view
	 */
	public void setEndDate(Date endDate);

	/**
	 * Returns the responden ID of this survey operation users view.
	 *
	 * @return the responden ID of this survey operation users view
	 */
	public long getRespondenId();

	/**
	 * Sets the responden ID of this survey operation users view.
	 *
	 * @param respondenId the responden ID of this survey operation users view
	 */
	public void setRespondenId(long respondenId);

	/**
	 * Returns the responden nik of this survey operation users view.
	 *
	 * @return the responden nik of this survey operation users view
	 */
	@AutoEscape
	public String getRespondenNik();

	/**
	 * Sets the responden nik of this survey operation users view.
	 *
	 * @param respondenNik the responden nik of this survey operation users view
	 */
	public void setRespondenNik(String respondenNik);

	/**
	 * Returns the submitted date of this survey operation users view.
	 *
	 * @return the submitted date of this survey operation users view
	 */
	public Date getSubmittedDate();

	/**
	 * Sets the submitted date of this survey operation users view.
	 *
	 * @param submittedDate the submitted date of this survey operation users view
	 */
	public void setSubmittedDate(Date submittedDate);

}