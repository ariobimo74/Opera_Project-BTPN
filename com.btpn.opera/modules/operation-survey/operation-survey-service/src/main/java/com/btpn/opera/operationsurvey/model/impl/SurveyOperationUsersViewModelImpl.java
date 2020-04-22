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

import com.btpn.opera.operationsurvey.model.SurveyOperationUsersView;
import com.btpn.opera.operationsurvey.model.SurveyOperationUsersViewModel;
import com.btpn.opera.operationsurvey.model.SurveyOperationUsersViewSoap;

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
 * The base model implementation for the SurveyOperationUsersView service. Represents a row in the &quot;survey_operation_users_view&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>SurveyOperationUsersViewModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SurveyOperationUsersViewImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SurveyOperationUsersViewImpl
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class SurveyOperationUsersViewModelImpl
	extends BaseModelImpl<SurveyOperationUsersView>
	implements SurveyOperationUsersViewModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a survey operation users view model instance should use the <code>SurveyOperationUsersView</code> interface instead.
	 */
	public static final String TABLE_NAME = "survey_operation_users_view";

	public static final Object[][] TABLE_COLUMNS = {
		{"id", Types.BIGINT}, {"title", Types.VARCHAR},
		{"object_name", Types.VARCHAR}, {"start_date", Types.TIMESTAMP},
		{"end_date", Types.TIMESTAMP}, {"responden_id", Types.BIGINT},
		{"responden_nik", Types.VARCHAR}, {"submitted_date", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("title", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("object_name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("start_date", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("end_date", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("responden_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("responden_nik", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("submitted_date", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE =
		"create table survey_operation_users_view (id LONG not null primary key,title VARCHAR(75) null,object_name VARCHAR(75) null,start_date DATE null,end_date DATE null,responden_id LONG,responden_nik VARCHAR(75) null,submitted_date DATE null)";

	public static final String TABLE_SQL_DROP =
		"drop table survey_operation_users_view";

	public static final String ORDER_BY_JPQL =
		" ORDER BY surveyOperationUsersView.id ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY survey_operation_users_view.id ASC";

	public static final String DATA_SOURCE = "externalDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long RESPONDENID_COLUMN_BITMASK = 1L;

	public static final long RESPONDENNIK_COLUMN_BITMASK = 2L;

	public static final long ID_COLUMN_BITMASK = 4L;

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
	public static SurveyOperationUsersView toModel(
		SurveyOperationUsersViewSoap soapModel) {

		if (soapModel == null) {
			return null;
		}

		SurveyOperationUsersView model = new SurveyOperationUsersViewImpl();

		model.setId(soapModel.getId());
		model.setTitle(soapModel.getTitle());
		model.setObjectName(soapModel.getObjectName());
		model.setStartDate(soapModel.getStartDate());
		model.setEndDate(soapModel.getEndDate());
		model.setRespondenId(soapModel.getRespondenId());
		model.setRespondenNik(soapModel.getRespondenNik());
		model.setSubmittedDate(soapModel.getSubmittedDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<SurveyOperationUsersView> toModels(
		SurveyOperationUsersViewSoap[] soapModels) {

		if (soapModels == null) {
			return null;
		}

		List<SurveyOperationUsersView> models =
			new ArrayList<SurveyOperationUsersView>(soapModels.length);

		for (SurveyOperationUsersViewSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public SurveyOperationUsersViewModelImpl() {
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
		return SurveyOperationUsersView.class;
	}

	@Override
	public String getModelClassName() {
		return SurveyOperationUsersView.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<SurveyOperationUsersView, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<SurveyOperationUsersView, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SurveyOperationUsersView, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((SurveyOperationUsersView)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<SurveyOperationUsersView, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<SurveyOperationUsersView, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(SurveyOperationUsersView)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<SurveyOperationUsersView, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<SurveyOperationUsersView, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, SurveyOperationUsersView>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			SurveyOperationUsersView.class.getClassLoader(),
			SurveyOperationUsersView.class, ModelWrapper.class);

		try {
			Constructor<SurveyOperationUsersView> constructor =
				(Constructor<SurveyOperationUsersView>)
					proxyClass.getConstructor(InvocationHandler.class);

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

	private static final Map<String, Function<SurveyOperationUsersView, Object>>
		_attributeGetterFunctions;
	private static final Map
		<String, BiConsumer<SurveyOperationUsersView, Object>>
			_attributeSetterBiConsumers;

	static {
		Map<String, Function<SurveyOperationUsersView, Object>>
			attributeGetterFunctions =
				new LinkedHashMap
					<String, Function<SurveyOperationUsersView, Object>>();
		Map<String, BiConsumer<SurveyOperationUsersView, ?>>
			attributeSetterBiConsumers =
				new LinkedHashMap
					<String, BiConsumer<SurveyOperationUsersView, ?>>();

		attributeGetterFunctions.put("id", SurveyOperationUsersView::getId);
		attributeSetterBiConsumers.put(
			"id",
			(BiConsumer<SurveyOperationUsersView, Long>)
				SurveyOperationUsersView::setId);
		attributeGetterFunctions.put(
			"title", SurveyOperationUsersView::getTitle);
		attributeSetterBiConsumers.put(
			"title",
			(BiConsumer<SurveyOperationUsersView, String>)
				SurveyOperationUsersView::setTitle);
		attributeGetterFunctions.put(
			"objectName", SurveyOperationUsersView::getObjectName);
		attributeSetterBiConsumers.put(
			"objectName",
			(BiConsumer<SurveyOperationUsersView, String>)
				SurveyOperationUsersView::setObjectName);
		attributeGetterFunctions.put(
			"startDate", SurveyOperationUsersView::getStartDate);
		attributeSetterBiConsumers.put(
			"startDate",
			(BiConsumer<SurveyOperationUsersView, Date>)
				SurveyOperationUsersView::setStartDate);
		attributeGetterFunctions.put(
			"endDate", SurveyOperationUsersView::getEndDate);
		attributeSetterBiConsumers.put(
			"endDate",
			(BiConsumer<SurveyOperationUsersView, Date>)
				SurveyOperationUsersView::setEndDate);
		attributeGetterFunctions.put(
			"respondenId", SurveyOperationUsersView::getRespondenId);
		attributeSetterBiConsumers.put(
			"respondenId",
			(BiConsumer<SurveyOperationUsersView, Long>)
				SurveyOperationUsersView::setRespondenId);
		attributeGetterFunctions.put(
			"respondenNik", SurveyOperationUsersView::getRespondenNik);
		attributeSetterBiConsumers.put(
			"respondenNik",
			(BiConsumer<SurveyOperationUsersView, String>)
				SurveyOperationUsersView::setRespondenNik);
		attributeGetterFunctions.put(
			"submittedDate", SurveyOperationUsersView::getSubmittedDate);
		attributeSetterBiConsumers.put(
			"submittedDate",
			(BiConsumer<SurveyOperationUsersView, Date>)
				SurveyOperationUsersView::setSubmittedDate);

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
		_title = title;
	}

	@JSON
	@Override
	public String getObjectName() {
		if (_objectName == null) {
			return "";
		}
		else {
			return _objectName;
		}
	}

	@Override
	public void setObjectName(String objectName) {
		_objectName = objectName;
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
	public long getRespondenId() {
		return _respondenId;
	}

	@Override
	public void setRespondenId(long respondenId) {
		_columnBitmask |= RESPONDENID_COLUMN_BITMASK;

		if (!_setOriginalRespondenId) {
			_setOriginalRespondenId = true;

			_originalRespondenId = _respondenId;
		}

		_respondenId = respondenId;
	}

	public long getOriginalRespondenId() {
		return _originalRespondenId;
	}

	@JSON
	@Override
	public String getRespondenNik() {
		if (_respondenNik == null) {
			return "";
		}
		else {
			return _respondenNik;
		}
	}

	@Override
	public void setRespondenNik(String respondenNik) {
		_columnBitmask |= RESPONDENNIK_COLUMN_BITMASK;

		if (_originalRespondenNik == null) {
			_originalRespondenNik = _respondenNik;
		}

		_respondenNik = respondenNik;
	}

	public String getOriginalRespondenNik() {
		return GetterUtil.getString(_originalRespondenNik);
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
			0, SurveyOperationUsersView.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SurveyOperationUsersView toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, SurveyOperationUsersView>
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
		SurveyOperationUsersViewImpl surveyOperationUsersViewImpl =
			new SurveyOperationUsersViewImpl();

		surveyOperationUsersViewImpl.setId(getId());
		surveyOperationUsersViewImpl.setTitle(getTitle());
		surveyOperationUsersViewImpl.setObjectName(getObjectName());
		surveyOperationUsersViewImpl.setStartDate(getStartDate());
		surveyOperationUsersViewImpl.setEndDate(getEndDate());
		surveyOperationUsersViewImpl.setRespondenId(getRespondenId());
		surveyOperationUsersViewImpl.setRespondenNik(getRespondenNik());
		surveyOperationUsersViewImpl.setSubmittedDate(getSubmittedDate());

		surveyOperationUsersViewImpl.resetOriginalValues();

		return surveyOperationUsersViewImpl;
	}

	@Override
	public int compareTo(SurveyOperationUsersView surveyOperationUsersView) {
		long primaryKey = surveyOperationUsersView.getPrimaryKey();

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

		if (!(obj instanceof SurveyOperationUsersView)) {
			return false;
		}

		SurveyOperationUsersView surveyOperationUsersView =
			(SurveyOperationUsersView)obj;

		long primaryKey = surveyOperationUsersView.getPrimaryKey();

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
		SurveyOperationUsersViewModelImpl surveyOperationUsersViewModelImpl =
			this;

		surveyOperationUsersViewModelImpl._originalRespondenId =
			surveyOperationUsersViewModelImpl._respondenId;

		surveyOperationUsersViewModelImpl._setOriginalRespondenId = false;

		surveyOperationUsersViewModelImpl._originalRespondenNik =
			surveyOperationUsersViewModelImpl._respondenNik;

		surveyOperationUsersViewModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<SurveyOperationUsersView> toCacheModel() {
		SurveyOperationUsersViewCacheModel surveyOperationUsersViewCacheModel =
			new SurveyOperationUsersViewCacheModel();

		surveyOperationUsersViewCacheModel.id = getId();

		surveyOperationUsersViewCacheModel.title = getTitle();

		String title = surveyOperationUsersViewCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			surveyOperationUsersViewCacheModel.title = null;
		}

		surveyOperationUsersViewCacheModel.objectName = getObjectName();

		String objectName = surveyOperationUsersViewCacheModel.objectName;

		if ((objectName != null) && (objectName.length() == 0)) {
			surveyOperationUsersViewCacheModel.objectName = null;
		}

		Date startDate = getStartDate();

		if (startDate != null) {
			surveyOperationUsersViewCacheModel.startDate = startDate.getTime();
		}
		else {
			surveyOperationUsersViewCacheModel.startDate = Long.MIN_VALUE;
		}

		Date endDate = getEndDate();

		if (endDate != null) {
			surveyOperationUsersViewCacheModel.endDate = endDate.getTime();
		}
		else {
			surveyOperationUsersViewCacheModel.endDate = Long.MIN_VALUE;
		}

		surveyOperationUsersViewCacheModel.respondenId = getRespondenId();

		surveyOperationUsersViewCacheModel.respondenNik = getRespondenNik();

		String respondenNik = surveyOperationUsersViewCacheModel.respondenNik;

		if ((respondenNik != null) && (respondenNik.length() == 0)) {
			surveyOperationUsersViewCacheModel.respondenNik = null;
		}

		Date submittedDate = getSubmittedDate();

		if (submittedDate != null) {
			surveyOperationUsersViewCacheModel.submittedDate =
				submittedDate.getTime();
		}
		else {
			surveyOperationUsersViewCacheModel.submittedDate = Long.MIN_VALUE;
		}

		return surveyOperationUsersViewCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<SurveyOperationUsersView, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<SurveyOperationUsersView, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SurveyOperationUsersView, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(
				attributeGetterFunction.apply((SurveyOperationUsersView)this));
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
		Map<String, Function<SurveyOperationUsersView, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<SurveyOperationUsersView, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SurveyOperationUsersView, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(
				attributeGetterFunction.apply((SurveyOperationUsersView)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function
			<InvocationHandler, SurveyOperationUsersView>
				_escapedModelProxyProviderFunction =
					_getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private long _id;
	private String _title;
	private String _objectName;
	private Date _startDate;
	private Date _endDate;
	private long _respondenId;
	private long _originalRespondenId;
	private boolean _setOriginalRespondenId;
	private String _respondenNik;
	private String _originalRespondenNik;
	private Date _submittedDate;
	private long _columnBitmask;
	private SurveyOperationUsersView _escapedModel;

}