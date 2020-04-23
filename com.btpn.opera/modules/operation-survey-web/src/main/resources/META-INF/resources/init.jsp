<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.stream.Collectors" %>

<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.exception.PortalException" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.btpn.opera.operationsurvey.model.SurveyOperation" %>
<%@ page import="com.btpn.opera.operationsurvey.service.AnswersLocalServiceUtil" %>
<%@ page import="com.btpn.opera.operationsurvey.service.QuestionLocalServiceUtil" %>
<%@ page import="com.btpn.opera.operationsurvey.service.SurveyOperationLocalServiceUtil" %>
<%@ page import="com.btpn.opera.operationsurvey.service.SurveyObjectLocalServiceUtil" %>
<%@ page import="com.btpn.opera.operationsurvey.service.SurveyOperationLocalServiceUtil" %>
