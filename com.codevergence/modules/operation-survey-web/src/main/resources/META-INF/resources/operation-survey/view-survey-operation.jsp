<%@ include file="../init.jsp" %>

<p>
	<b><liferay-ui:message key="surveyoperation.message"/></b>
</p>


<!-- View Data Survey -->

<aui:button-row cssClass="guestbook-buttons">

    <portlet:renderURL var="addSurveyURL">
        <portlet:param name="mvcPath" value="/operation-survey/edit.jsp" />
    </portlet:renderURL>

    <aui:button onClick="<%=addSurveyURL.toString()%>" value="Add Survey"></aui:button>

</aui:button-row>

<liferay-ui:search-container total="<%= SurveyOperationLocalServiceUtil.getSurveyOperationsCount() %>">
    <liferay-ui:search-container-results results="<%=SurveyOperationLocalServiceUtil.getAllSurveyOperation()%>" />

    <liferay-ui:search-container-row className="operation.model.SurveyOperation" modelVar="surveyOperation">
        <liferay-ui:search-container-column-text property="title" />
        <liferay-ui:search-container-column-text property="surveyObj" />
        <liferay-ui:search-container-column-text name="startDate" value="<%= simpleDateFormat.format(surveyOperation.getStartDate()) %>" />
        <liferay-ui:search-container-column-text name="endDate" value="<%= simpleDateFormat.format(surveyOperation.getEndDate()) %>" />
        <liferay-ui:search-container-column-text name="submittedDate" value="<%= simpleDateFormat.format(surveyOperation.getSubmittedDate()) %>" />
        <liferay-ui:search-container-column-jsp align="right" path="/operation-survey/action.jsp" />
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />
</liferay-ui:search-container>
