<%@ include file="../init.jsp" %>

<p>
	<b><liferay-ui:message key="surveyoperation.message"/></b>
</p>


<!-- Survey Operation Search Bar -->

<liferay-ui:success key="surveyAdded" message="survey-added"/>
<liferay-ui:success key="surveyEdited" message="survey-edited" />
<liferay-ui:success key="surveyDeleted" message="survey-deleted" />

<portlet:renderURL var="searchURL">
    <portlet:param name="mvcPath" value="/operation-survey/search-survey-operation.jsp" />
</portlet:renderURL>

<aui:form action="<%= searchURL %>" name="fm">

    <div class="row">
        <div class="col-md-8">
            <aui:input inlineLabel="left" type="text" label="" name="keyword"
                placeholder="Search Survey by Title" size="256" />
        </div>

        <div class="col-md-4">
            <aui:button type="submit" value="search" />
        </div>
    </div>

 </aui:form>


<!-- View Data Survey -->

<aui:button-row cssClass="guestbook-buttons">

    <portlet:renderURL var="addSurveyURL">
        <portlet:param name="mvcPath" value="/operation-survey/edit.jsp" />
    </portlet:renderURL>

    <aui:button onClick="<%=addSurveyURL.toString()%>" value="Add Survey"></aui:button>

</aui:button-row>

<liferay-ui:search-container total="<%= SurveyOperationLocalServiceUtil.getSurveyOperationsCount() %>">
    <liferay-ui:search-container-results results="<%=SurveyOperationLocalServiceUtil.getAllSurveyOperation()%>" />

    <% int k = 0; %>
    <liferay-ui:search-container-row className="operation.model.SurveyOperation" modelVar="surveyOperation">
        <liferay-ui:search-container-column-text name="No" value="<%= Integer.toString(k += 1 ) %>" />
        <liferay-ui:search-container-column-text property="title" />
        <liferay-ui:search-container-column-text property="surveyObj" />
        <liferay-ui:search-container-column-text name="startDate" value="<%= simpleDateFormat.format(surveyOperation.getStartDate()) %>" />
        <liferay-ui:search-container-column-text name="endDate" value="<%= simpleDateFormat.format(surveyOperation.getEndDate()) %>" />
        <liferay-ui:search-container-column-text name="submittedDate" value="<%= simpleDateFormat.format(surveyOperation.getSubmittedDate()) %>" />
        <liferay-ui:search-container-column-jsp align="right" path="/operation-survey/action.jsp" />
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />
</liferay-ui:search-container>
