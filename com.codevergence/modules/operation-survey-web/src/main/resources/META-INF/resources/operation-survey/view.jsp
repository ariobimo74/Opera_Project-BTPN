<%@ include file="../init.jsp" %>

<p>
	<b><liferay-ui:message key="operationsurveyweb.caption"/></b>
</p>

<%
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");
%>


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
        <liferay-ui:search-container-column-text property="startDate" value="<%= simpleDateFormat.format(surveyOperation.getStartDate()) %>" />
        <liferay-ui:search-container-column-text property="endDate" value="<%= simpleDateFormat.format(surveyOperation.getEndDate()) %>" />
        <liferay-ui:search-container-column-text property="submittedDate" value="<%= simpleDateFormat.format(surveyOperation.getSubmittedDate()) %>" />
        <liferay-ui:search-container-column-jsp align="right" path="/operation-survey/action.jsp" />
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />
</liferay-ui:search-container>


<!-- View Data Questions -->

<p>
    <br/>
    <b><liferay-ui:message key="questions.message"/></b>
</p>

<aui:button-row cssClass="guestbook-buttons">

    <portlet:renderURL var="addQuestionsURL">
        <portlet:param name="mvcPath" value="/operation-survey/edit-question.jsp" />
    </portlet:renderURL>

    <aui:button onClick="<%= addQuestionsURL.toString() %>" value="Add Questions"></aui:button>

</aui:button-row>

<liferay-ui:search-container total="<%= QuestionsLocalServiceUtil.getQuestionsesCount() %>">
    <liferay-ui:search-container-results results="<%= QuestionsLocalServiceUtil.getAllQuestions() %>" />

    <liferay-ui:search-container-row className="operation.model.Questions" modelVar="questions">
        <liferay-ui:search-container-column-text property="question" />
        <liferay-ui:search-container-column-jsp align="right" path="/operation-survey/action-question.jsp" />
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />
</liferay-ui:search-container>
