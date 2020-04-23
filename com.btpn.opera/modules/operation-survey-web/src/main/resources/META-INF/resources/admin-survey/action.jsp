<%@ include file="../init.jsp" %>

<%
    ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

    SurveyOperation surveyOperation = (SurveyOperation) row.getObject();

    String surveyId = String.valueOf(surveyOperation.getId());
%>

<liferay-portlet:renderURL var="redirectBackURL">
    <portlet:param name="mvcPath" value="/admin-survey/view.jsp"/>
</liferay-portlet:renderURL>

<liferay-ui:icon-menu>

    <portlet:renderURL var="viewURL" windowState="pop_up">
        <portlet:param name="surveyId" value="<%= surveyId %>"/>
        <portlet:param name="redirect" value="${ redirectBackURL }"/>
        <portlet:param name="mvcPath" value="/admin-survey/detail.jsp" />
    </portlet:renderURL>
    <liferay-ui:icon icon="view" message="Detail" url="${ viewURL }" useDialog="true" />

    <portlet:renderURL var="editURL">
        <portlet:param name="surveyId" value="<%= surveyId %>"/>
        <portlet:param name="mvcPath" value="/admin-survey/edit.jsp" />
    </portlet:renderURL>
    <liferay-ui:icon icon="edit" message="Edit" url="${ editURL }" />

    <portlet:actionURL name="deleteSurvey" var="deleteURL">
        <portlet:param name="surveyId" value="<%= surveyId %>"/>
    </portlet:actionURL>
    <liferay-ui:icon icon="delete" message="Delete" url="${ deleteURL }" />

</liferay-ui:icon-menu>