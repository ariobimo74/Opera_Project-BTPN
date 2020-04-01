<%@ include file="../init.jsp" %>

<%

String mvcPath = ParamUtil.getString(request, "mvcPath");
ResultRow resultRow = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
SurveyOperation surveyOperation = (SurveyOperation)resultRow.getObject();

%>

<liferay-ui:icon-menu>
    <portlet:renderURL var="editURL">
        <portlet:param name="id" value="<%= String.valueOf(surveyOperation.getId()) %>" />
        <portlet:param name="mvcPath" value="/operation-survey/edit.jsp" />
    </portlet:renderURL>
    <liferay-ui:icon image="edit" message="Edit" url="<%= editURL.toString() %>" />

    <portlet:actionURL name="deleteSurvey" var="deleteURL">
        <portlet:param name="id" value="<%= String.valueOf(surveyOperation.getId()) %>" />
    </portlet:actionURL>
    <liferay-ui:icon-delete image="delete" message="Delete" url="<%= deleteURL.toString() %>" />
</liferay-ui:icon-menu>
