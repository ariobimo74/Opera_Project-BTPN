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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

import operation.model.SurveyOperation;
import operation.model.SurveyOperationModel;
import operation.model.SurveyOperationSoap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model implementation for the SurveyOperation service. Represents a row in the &quot;survey_operation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>SurveyOperationModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SurveyOperationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationImpl
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class SurveyOperationModelImpl
	extends BaseModelImpl<SurveyOperation> implements SurveyOperationModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a survey operation model instance should use the <code>SurveyOperation</code> interface instead.
	 */
	public static final String TABLE_NAME = "survey_operation";

	public static final Object[][] TABLE_COLUMNS = {
		{"id", Types.BIGINT}, {"title", Types.VARCHAR},
		{"description", Types.VARCHAR}, {"survey_obj", Types.VARCHAR},
		{"start_date", Types.TIMESTAMP}, {"end_date", Types.TIMESTAMP},
		{"status", Types.VARCHAR}, {"submitted_date", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("title", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("survey_obj", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("start_date", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("end_date", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("status", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("submitted_date", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE =
		"create table survey_operation (id LONG not null primary key,title VARCHAR(75) null,description VARCHAR(75) null,survey_obj VARCHAR(75) null,start_date DATE null,end_date DATE null,status VARCHAR(75) null,submitted_date DATE null)";

	public static final String TABLE_SQL_DROP = "drop table survey_operation";

	public static final String ORDER_BY_JPQL =
		" ORDER BY surveyOperation.id ASC, surveyOperation.title ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY survey_operation.id ASC, survey_operation.title ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long TITLE_COLUMN_BITMASK = 1L;

	public static final long ID_COLUMN_BITMASK = 2L;

	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
		_entityCacheEnabled = entityCacheEnabled;
	}

	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
		_finderCacheEnabled = finderCacheEnabled;
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static SurveyOperation toModel(SurveyOperationSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		SurveyOperation model = new SurveyOperationImpl();

		model.setId(soapModel.getId());
		model.setTitle(soapModel.getTitle());
		model.setDescription(soapModel.getDescription());
		model.setSurveyObj(soapModel.getSurveyObj());
		model.setStartDate(soapModel.getStartDate());
		model.setEndDate(soapModel.getEndDate());
		model.setStatus(soapModel.getStatus());
		model.setSubmittedDate(soapModel.getSubmittedDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<SurveyOperation> toModels(
		SurveyOperationSoap[] soapModels) {

		if (soapModels == null) {
			return null;
		}

		List<SurveyOperation> models = new ArrayList<SurveyOperation>(
			soapModels.length);

		for (SurveyOperationSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public SurveyOperationModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SurveyOperation.class;
	}

	@Override
	public String getModelClassName() {
		return SurveyOperation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<SurveyOperation, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<SurveyOperation, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SurveyOperation, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((SurveyOperation)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<SurveyOperation, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<SurveyOperation, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(SurveyOperation)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<SurveyOperation, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<SurveyOperation, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, SurveyOperation>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			SurveyOperation.class.getClassLoader(), SurveyOperation.class,
			ModelWrapper.class);

		try {
			Constructor<SurveyOperation> constructor =
				(Constructor<SurveyOperation>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException roe) {
					throw new InternalError(roe);
				}
			};
		}
		catch (NoSuchMethodException nsme) {
			throw new InternalError(nsme);
		}
	}

	private static final Map<String, Function<SurveyOperation, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<SurveyOperation, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<SurveyOperation, Object>>
			attributeGetterFunctions =
				new LinkedHashMap<String, Function<SurveyOperation, Object>>();
		Map<String, BiConsumer<SurveyOperation, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<SurveyOperation, ?>>();

		attributeGetterFunctions.put("id", SurveyOperation::getId);
		attributeSetterBiConsumers.put(
			"id", (BiConsumer<SurveyOperation, Long>)SurveyOperation::setId);
		attributeGetterFunctions.put("title", SurveyOperation::getTitle);
		attributeSetterBiConsumers.put(
			"title",
			(BiConsumer<SurveyOperation, String>)SurveyOperation::setTitle);
		attributeGetterFunctions.put(
			"description", SurveyOperation::getDescription);
		attributeSetterBiConsumers.put(
			"description",
			(BiConsumer<SurveyOperation, String>)
				SurveyOperation::setDescription);
		attributeGetterFunctions.put(
			"surveyObj", SurveyOperation::getSurveyObj);
		attributeSetterBiConsumers.put(
			"surveyObj",
			(BiConsumer<SurveyOperation, String>)SurveyOperation::setSurveyObj);
		attributeGetterFunctions.put(
			"startDate", SurveyOperation::getStartDate);
		attributeSetterBiConsumers.put(
			"startDate",
			(BiConsumer<SurveyOperation, Date>)SurveyOperation::setStartDate);
		attributeGetterFunctions.put("endDate", SurveyOperation::getEndDate);
		attributeSetterBiConsumers.put(
			"endDate",
			(BiConsumer<SurveyOperation, Date>)SurveyOperation::setEndDate);
		attributeGetterFunctions.put("status", SurveyOperation::getStatus);
		attributeSetterBiConsumers.put(
			"status",
			(BiConsumer<SurveyOperation, String>)SurveyOperation::setStatus);
		attributeGetterFunctions.put(
			"submittedDate", SurveyOperation::getSubmittedDate);
		attributeSetterBiConsumers.put(
			"submittedDate",
			(BiConsumer<SurveyOperation, Date>)
				SurveyOperation::setSubmittedDate);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_columnBitmask = -1L;

		_id = id;
	}

	@JSON
	@Override
	public String getTitle() {
		if (_title == null) {
			return "";
		}
		else {
			return _title;
		}
	}

	@Override
	public void setTitle(String title) {
		_columnBitmask = -1L;

		if (_originalTitle == null) {
			_originalTitle = _title;
		}

		_title = title;
	}

	public String getOriginalTitle() {
		return GetterUtil.getString(_originalTitle);
	}

	@JSON
	@Override
	public String getDescription() {
		if (_description == null) {
			return "";
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@JSON
	@Override
	public String getSurveyObj() {
		if (_surveyObj == null) {
			return "";
		}
		else {
			return _surveyObj;
		}
	}

	@Override
	public void setSurveyObj(String surveyObj) {
		_surveyObj = surveyObj;
	}

	@JSON
	@Override
	public Date getStartDate() {
		return _startDate;
	}

	@Override
	public void setStartDate(Date startDate) {
		_startDate = startDate;
	}

	@JSON
	@Override
	public Date getEndDate() {
		return _endDate;
	}

	@Override
	public void setEndDate(Date endDate) {
		_endDate = endDate;
	}

	@JSON
	@Override
	public String getStatus() {
		if (_status == null) {
			return "";
		}
		else {
			return _status;
		}
	}

	@Override
	public void setStatus(String status) {
		_status = status;
	}

	@JSON
	@Override
	public Date getSubmittedDate() {
		return _submittedDate;
	}

	@Override
	public void setSubmittedDate(Date submittedDate) {
		_submittedDate = submittedDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, SurveyOperation.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SurveyOperation toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, SurveyOperation>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SurveyOperationImpl surveyOperationImpl = new SurveyOperationImpl();

		surveyOperationImpl.setId(getId());
		surveyOperationImpl.setTitle(getTitle());
		surveyOperationImpl.setDescription(getDescription());
		surveyOperationImpl.setSurveyObj(getSurveyObj());
		surveyOperationImpl.setStartDate(getStartDate());
		surveyOperationImpl.setEndDate(getEndDate());
		surveyOperationImpl.setStatus(getStatus());
		surveyOperationImpl.setSubmittedDate(getSubmittedDate());

		surveyOperationImpl.resetOriginalValues();

		return surveyOperationImpl;
	}

	@Override
	public int compareTo(SurveyOperation surveyOperation) {
		int value = 0;

		if (getId() < surveyOperation.getId()) {
			value = -1;
		}
		else if (getId() > surveyOperation.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		value = getTitle().compareTo(surveyOperation.getTitle());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SurveyOperation)) {
			return false;
		}

		SurveyOperation surveyOperation = (SurveyOperation)obj;

		long primaryKey = surveyOperation.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
	}

	@Override
	public void resetOriginalValues() {
		SurveyOperationModelImpl surveyOperationModelImpl = this;

		surveyOperationModelImpl._originalTitle =
			surveyOperationModelImpl._title;

		surveyOperationModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<SurveyOperation> toCacheModel() {
		SurveyOperationCacheModel surveyOperationCacheModel =
			new SurveyOperationCacheModel();

		surveyOperationCacheModel.id = getId();

		surveyOperationCacheModel.title = getTitle();

		String title = surveyOperationCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			surveyOperationCacheModel.title = null;
		}

		surveyOperationCacheModel.description = getDescription();

		String description = surveyOperationCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			surveyOperationCacheModel.description = null;
		}

		surveyOperationCacheModel.surveyObj = getSurveyObj();

		String surveyObj = surveyOperationCacheModel.surveyObj;

		if ((surveyObj != null) && (surveyObj.length() == 0)) {
			surveyOperationCacheModel.surveyObj = null;
		}

		Date startDate = getStartDate();

		if (startDate != null) {
			surveyOperationCacheModel.startDate = startDate.getTime();
		}
		else {
			surveyOperationCacheModel.startDate = Long.MIN_VALUE;
		}

		Date endDate = getEndDate();

		if (endDate != null) {
			surveyOperationCacheModel.endDate = endDate.getTime();
		}
		else {
			surveyOperationCacheModel.endDate = Long.MIN_VALUE;
		}

		surveyOperationCacheModel.status = getStatus();

		String status = surveyOperationCacheModel.status;

		if ((status != null) && (status.length() == 0)) {
			surveyOperationCacheModel.status = null;
		}

		Date submittedDate = getSubmittedDate();

		if (submittedDate != null) {
			surveyOperationCacheModel.submittedDate = submittedDate.getTime();
		}
		else {
			surveyOperationCacheModel.submittedDate = Long.MIN_VALUE;
		}

		return surveyOperationCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<SurveyOperation, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<SurveyOperation, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SurveyOperation, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((SurveyOperation)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<SurveyOperation, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<SurveyOperation, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SurveyOperation, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((SurveyOperation)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, SurveyOperation>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private long _id;
	private String _title;
	private String _originalTitle;
	private String _description;
	private String _surveyObj;
	private Date _startDate;
	private Date _endDate;
	private String _status;
	private Date _submittedDate;
	private long _columnBitmask;
	private SurveyOperation _escapedModel;

}