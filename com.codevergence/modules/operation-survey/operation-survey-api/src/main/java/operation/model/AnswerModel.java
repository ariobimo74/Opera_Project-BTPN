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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Answer service. Represents a row in the &quot;answers&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>operation.model.impl.AnswerModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>operation.model.impl.AnswerImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Answer
 * @generated
 */
@ProviderType
public interface AnswerModel extends BaseModel<Answer> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a answer model instance should use the {@link Answer} interface instead.
	 */

	/**
	 * Returns the primary key of this answer.
	 *
	 * @return the primary key of this answer
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this answer.
	 *
	 * @param primaryKey the primary key of this answer
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this answer.
	 *
	 * @return the ID of this answer
	 */
	public long getId();

	/**
	 * Sets the ID of this answer.
	 *
	 * @param id the ID of this answer
	 */
	public void setId(long id);

	/**
	 * Returns the answer of this answer.
	 *
	 * @return the answer of this answer
	 */
	@AutoEscape
	public String getAnswer();

	/**
	 * Sets the answer of this answer.
	 *
	 * @param answer the answer of this answer
	 */
	public void setAnswer(String answer);

	/**
	 * Returns the value of this answer.
	 *
	 * @return the value of this answer
	 */
	public double getValue();

	/**
	 * Sets the value of this answer.
	 *
	 * @param value the value of this answer
	 */
	public void setValue(double value);

}