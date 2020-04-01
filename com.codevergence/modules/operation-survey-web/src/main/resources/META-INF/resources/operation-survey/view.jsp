<%@ include file="../init.jsp" %>

<p>
	<b><liferay-ui:message key="operationsurveyweb.caption"/></b>
</p>

<%
    long id = Long.valueOf((Long) renderRequest.getAttribute("id"));
%>


<aui:button-row cssClass="guestbook-buttons">

    <portlet:renderURL var="addSurveyURL">
        <portlet:param name="mvcPath" value="/operation-survey/edit.jsp" />
        <portlet:param name="id" value="<%=String.valueOf(id)%>" />
    </portlet:renderURL>

    <aui:button onClick="<%=addSurveyURL.toString()%>" value="Add Survey"></aui:button>

</aui:button-row>

<liferay-ui:search-container total="<%=SurveyOperationLocalServiceUtil.getSurveyOperationsCount()%>">
    <liferay-ui:search-container-results results="<%=SurveyOperationLocalServiceUtil.getAllSurveyOperation()%>" />

    <liferay-ui:search-container-row className="operation.model.SurveyOperation" modelVar="surveyOperation">
        <liferay-ui:search-container-column-text property="title" />
        <liferay-ui:search-container-column-text property="surveyObj" />
        <liferay-ui:search-container-column-text property="startDate" />
        <liferay-ui:search-container-column-text property="endDate" />
        <liferay-ui:search-container-column-text property="submittedDate" />
        <liferay-ui:search-container-column-jsp align="right" path="/operation-survey/action.jsp" />
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />
</liferay-ui:search-container>
