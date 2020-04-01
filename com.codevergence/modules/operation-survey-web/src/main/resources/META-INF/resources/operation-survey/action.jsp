<%@include file=“../init.jsp”%>

<% String mvcPath = ParamUtil.getString(actionRequest, "mvcPath");

ResultRow resultRow = (ResultRow)actionRequest.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

SurveyOperation surveyOperation = (SurveyOperation)row.getObject(); %>

<liferay-ui:icon-menu>
    <portlet:renderURL var="editURL">
        <portlet:param name="id" value="<%= String.valueOf(surveyOperation.getId()) %>" />
        <portlet:param name="mvcPath" value="/operation-survey/edit.jsp" />
    </portlet:renderURL>
    <liferay-ui:icon image="edit" message="Edit" url="<%= editURL.toString() %>" />

    <portlet:actionURL name="deleteSurvey" var="deleteURL">
        <portlet:param name="id" value="<%= String.valueOf(surveyOperation.getId()) %>" />
    </portlet:actionURL>
    <liferay-ui:icon-delete url="<%= deleteURL.toString() %>" />
</liferay-ui:icon-menu>
