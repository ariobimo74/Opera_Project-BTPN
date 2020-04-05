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
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

import operation.model.Questions;
import operation.model.QuestionsModel;
import operation.model.QuestionsSoap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model implementation for the Questions service. Represents a row in the &quot;questions&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>QuestionsModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QuestionsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuestionsImpl
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class QuestionsModelImpl
	extends BaseModelImpl<Questions> implements QuestionsModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a questions model instance should use the <code>Questions</code> interface instead.
	 */
	public static final String TABLE_NAME = "questions";

	public static final Object[][] TABLE_COLUMNS = {
		{"id", Types.BIGINT}, {"question", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("question", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table questions (id LONG not null primary key,question VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table questions";

	public static final String ORDER_BY_JPQL = " ORDER BY questions.id ASC";

	public static final String ORDER_BY_SQL = " ORDER BY questions.id ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

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
	public static Questions toModel(QuestionsSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Questions model = new QuestionsImpl();

		model.setId(soapModel.getId());
		model.setQuestion(soapModel.getQuestion());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Questions> toModels(QuestionsSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Questions> models = new ArrayList<Questions>(soapModels.length);

		for (QuestionsSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public QuestionsModelImpl() {
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
		return Questions.class;
	}

	@Override
	public String getModelClassName() {
		return Questions.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Questions, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Questions, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Questions, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Questions)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Questions, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Questions, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Questions)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Questions, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Questions, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Questions>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Questions.class.getClassLoader(), Questions.class,
			ModelWrapper.class);

		try {
			Constructor<Questions> constructor =
				(Constructor<Questions>)proxyClass.getConstructor(
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

	private static final Map<String, Function<Questions, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Questions, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Questions, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Questions, Object>>();
		Map<String, BiConsumer<Questions, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Questions, ?>>();

		attributeGetterFunctions.put("id", Questions::getId);
		attributeSetterBiConsumers.put(
			"id", (BiConsumer<Questions, Long>)Questions::setId);
		attributeGetterFunctions.put("question", Questions::getQuestion);
		attributeSetterBiConsumers.put(
			"question", (BiConsumer<Questions, String>)Questions::setQuestion);

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
	public String getQuestion() {
		if (_question == null) {
			return "";
		}
		else {
			return _question;
		}
	}

	@Override
	public void setQuestion(String question) {
		_question = question;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, Questions.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Questions toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Questions>
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
		QuestionsImpl questionsImpl = new QuestionsImpl();

		questionsImpl.setId(getId());
		questionsImpl.setQuestion(getQuestion());

		questionsImpl.resetOriginalValues();

		return questionsImpl;
	}

	@Override
	public int compareTo(Questions questions) {
		int value = 0;

		if (getId() < questions.getId()) {
			value = -1;
		}
		else if (getId() > questions.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof Questions)) {
			return false;
		}

		Questions questions = (Questions)obj;

		long primaryKey = questions.getPrimaryKey();

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
	}

	@Override
	public CacheModel<Questions> toCacheModel() {
		QuestionsCacheModel questionsCacheModel = new QuestionsCacheModel();

		questionsCacheModel.id = getId();

		questionsCacheModel.question = getQuestion();

		String question = questionsCacheModel.question;

		if ((question != null) && (question.length() == 0)) {
			questionsCacheModel.question = null;
		}

		return questionsCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Questions, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Questions, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Questions, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Questions)this));
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
		Map<String, Function<Questions, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Questions, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Questions, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Questions)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Questions>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private long _id;
	private String _question;
	private Questions _escapedModel;

}