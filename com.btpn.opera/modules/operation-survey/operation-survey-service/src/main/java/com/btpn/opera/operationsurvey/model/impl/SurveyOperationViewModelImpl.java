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

package com.btpn.opera.operationsurvey.model.impl;

import com.btpn.opera.operationsurvey.model.SurveyOperationView;
import com.btpn.opera.operationsurvey.model.SurveyOperationViewModel;
import com.btpn.opera.operationsurvey.model.SurveyOperationViewSoap;

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

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model implementation for the SurveyOperationView service. Represents a row in the &quot;survey_operation_view&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>SurveyOperationViewModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SurveyOperationViewImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationViewImpl
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class SurveyOperationViewModelImpl
	extends BaseModelImpl<SurveyOperationView>
	implements SurveyOperationViewModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a survey operation view model instance should use the <code>SurveyOperationView</code> interface instead.
	 */
	public static final String TABLE_NAME = "survey_operation_view";

	public static final Object[][] TABLE_COLUMNS = {
		{"id", Types.BIGINT}, {"title", Types.VARCHAR},
		{"survey_object", Types.VARCHAR}, {"start_date", Types.TIMESTAMP},
		{"end_date", Types.TIMESTAMP}, {"submitted_date", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("title", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("survey_object", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("start_date", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("end_date", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("submitted_date", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE =
		"create table survey_operation_view (id LONG not null primary key,title VARCHAR(75) null,survey_object VARCHAR(75) null,start_date DATE null,end_date DATE null,submitted_date DATE null)";

	public static final String TABLE_SQL_DROP =
		"drop table survey_operation_view";

	public static final String ORDER_BY_JPQL =
		" ORDER BY surveyOperationView.id ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY survey_operation_view.id ASC";

	public static final String DATA_SOURCE = "externalDataSource";

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
	public static SurveyOperationView toModel(
		SurveyOperationViewSoap soapModel) {

		if (soapModel == null) {
			return null;
		}

		SurveyOperationView model = new SurveyOperationViewImpl();

		model.setId(soapModel.getId());
		model.setTitle(soapModel.getTitle());
		model.setSurveyObject(soapModel.getSurveyObject());
		model.setStartDate(soapModel.getStartDate());
		model.setEndDate(soapModel.getEndDate());
		model.setSubmitted_date(soapModel.getSubmitted_date());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<SurveyOperationView> toModels(
		SurveyOperationViewSoap[] soapModels) {

		if (soapModels == null) {
			return null;
		}

		List<SurveyOperationView> models = new ArrayList<SurveyOperationView>(
			soapModels.length);

		for (SurveyOperationViewSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public SurveyOperationViewModelImpl() {
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
		return SurveyOperationView.class;
	}

	@Override
	public String getModelClassName() {
		return SurveyOperationView.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<SurveyOperationView, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<SurveyOperationView, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SurveyOperationView, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((SurveyOperationView)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<SurveyOperationView, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<SurveyOperationView, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(SurveyOperationView)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<SurveyOperationView, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<SurveyOperationView, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, SurveyOperationView>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			SurveyOperationView.class.getClassLoader(),
			SurveyOperationView.class, ModelWrapper.class);

		try {
			Constructor<SurveyOperationView> constructor =
				(Constructor<SurveyOperationView>)proxyClass.getConstructor(
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

	private static final Map<String, Function<SurveyOperationView, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<SurveyOperationView, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<SurveyOperationView, Object>>
			attributeGetterFunctions =
				new LinkedHashMap
					<String, Function<SurveyOperationView, Object>>();
		Map<String, BiConsumer<SurveyOperationView, ?>>
			attributeSetterBiConsumers =
				new LinkedHashMap<String, BiConsumer<SurveyOperationView, ?>>();

		attributeGetterFunctions.put("id", SurveyOperationView::getId);
		attributeSetterBiConsumers.put(
			"id",
			(BiConsumer<SurveyOperationView, Long>)SurveyOperationView::setId);
		attributeGetterFunctions.put("title", SurveyOperationView::getTitle);
		attributeSetterBiConsumers.put(
			"title",
			(BiConsumer<SurveyOperationView, String>)
				SurveyOperationView::setTitle);
		attributeGetterFunctions.put(
			"surveyObject", SurveyOperationView::getSurveyObject);
		attributeSetterBiConsumers.put(
			"surveyObject",
			(BiConsumer<SurveyOperationView, String>)
				SurveyOperationView::setSurveyObject);
		attributeGetterFunctions.put(
			"startDate", SurveyOperationView::getStartDate);
		attributeSetterBiConsumers.put(
			"startDate",
			(BiConsumer<SurveyOperationView, Date>)
				SurveyOperationView::setStartDate);
		attributeGetterFunctions.put(
			"endDate", SurveyOperationView::getEndDate);
		attributeSetterBiConsumers.put(
			"endDate",
			(BiConsumer<SurveyOperationView, Date>)
				SurveyOperationView::setEndDate);
		attributeGetterFunctions.put(
			"submitted_date", SurveyOperationView::getSubmitted_date);
		attributeSetterBiConsumers.put(
			"submitted_date",
			(BiConsumer<SurveyOperationView, Date>)
				SurveyOperationView::setSubmitted_date);

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
		_columnBitmask |= TITLE_COLUMN_BITMASK;

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
	public String getSurveyObject() {
		if (_surveyObject == null) {
			return "";
		}
		else {
			return _surveyObject;
		}
	}

	@Override
	public void setSurveyObject(String surveyObject) {
		_surveyObject = surveyObject;
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
	public Date getSubmitted_date() {
		return _submitted_date;
	}

	@Override
	public void setSubmitted_date(Date submitted_date) {
		_submitted_date = submitted_date;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, SurveyOperationView.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SurveyOperationView toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, SurveyOperationView>
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
		SurveyOperationViewImpl surveyOperationViewImpl =
			new SurveyOperationViewImpl();

		surveyOperationViewImpl.setId(getId());
		surveyOperationViewImpl.setTitle(getTitle());
		surveyOperationViewImpl.setSurveyObject(getSurveyObject());
		surveyOperationViewImpl.setStartDate(getStartDate());
		surveyOperationViewImpl.setEndDate(getEndDate());
		surveyOperationViewImpl.setSubmitted_date(getSubmitted_date());

		surveyOperationViewImpl.resetOriginalValues();

		return surveyOperationViewImpl;
	}

	@Override
	public int compareTo(SurveyOperationView surveyOperationView) {
		long primaryKey = surveyOperationView.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SurveyOperationView)) {
			return false;
		}

		SurveyOperationView surveyOperationView = (SurveyOperationView)obj;

		long primaryKey = surveyOperationView.getPrimaryKey();

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
		SurveyOperationViewModelImpl surveyOperationViewModelImpl = this;

		surveyOperationViewModelImpl._originalTitle =
			surveyOperationViewModelImpl._title;

		surveyOperationViewModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<SurveyOperationView> toCacheModel() {
		SurveyOperationViewCacheModel surveyOperationViewCacheModel =
			new SurveyOperationViewCacheModel();

		surveyOperationViewCacheModel.id = getId();

		surveyOperationViewCacheModel.title = getTitle();

		String title = surveyOperationViewCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			surveyOperationViewCacheModel.title = null;
		}

		surveyOperationViewCacheModel.surveyObject = getSurveyObject();

		String surveyObject = surveyOperationViewCacheModel.surveyObject;

		if ((surveyObject != null) && (surveyObject.length() == 0)) {
			surveyOperationViewCacheModel.surveyObject = null;
		}

		Date startDate = getStartDate();

		if (startDate != null) {
			surveyOperationViewCacheModel.startDate = startDate.getTime();
		}
		else {
			surveyOperationViewCacheModel.startDate = Long.MIN_VALUE;
		}

		Date endDate = getEndDate();

		if (endDate != null) {
			surveyOperationViewCacheModel.endDate = endDate.getTime();
		}
		else {
			surveyOperationViewCacheModel.endDate = Long.MIN_VALUE;
		}

		Date submitted_date = getSubmitted_date();

		if (submitted_date != null) {
			surveyOperationViewCacheModel.submitted_date =
				submitted_date.getTime();
		}
		else {
			surveyOperationViewCacheModel.submitted_date = Long.MIN_VALUE;
		}

		return surveyOperationViewCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<SurveyOperationView, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<SurveyOperationView, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SurveyOperationView, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((SurveyOperationView)this));
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
		Map<String, Function<SurveyOperationView, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<SurveyOperationView, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SurveyOperationView, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((SurveyOperationView)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, SurveyOperationView>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private long _id;
	private String _title;
	private String _originalTitle;
	private String _surveyObject;
	private Date _startDate;
	private Date _endDate;
	private Date _submitted_date;
	private long _columnBitmask;
	private SurveyOperationView _escapedModel;

}