<%@ include file="../init.jsp" %>

<%--<jsp:useBean id="surveyList" scope="request" type="java.util.List<com.btpn.opera.operationsurvey.model.Survey>"/>--%>

<liferay-portlet:renderURL var="addSurveyURL">
    <portlet:param name="mvcPath" value="/admin-survey/edit.jsp"/>
</liferay-portlet:renderURL>

<%
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
%>

<aui:container>
    <liferay-ui:icon image="add" message="survey.admin.edit" url="${ addSurveyURL }" label="true"/>
    <liferay-ui:search-container emptyResultsMessage="survey.admin.edit.search-container.emptyResultMessage"
                                 total="<%= SurveyOperationLocalServiceUtil.getSurveyOperationsCount() %>">
        <liferay-ui:search-container-results
                results="<%= SurveyOperationLocalServiceUtil.getAllSurveyOperation(searchContainer.getStart(), searchContainer.getEnd()) %>"/>
        <liferay-ui:search-container-row className="com.btpn.opera.operationsurvey.model.SurveyOperation"
                                         modelVar="survey"
                                         indexVar="rowNum">
            <liferay-ui:search-container-column-text name="No"
                                                     value="<%= String.valueOf(searchContainer.getStart() + rowNum + 1) %>"/>
            <liferay-ui:search-container-column-text name="Judul Survey" property="title"/>
            <liferay-ui:search-container-column-text name="Object Survey" value="<%= SurveyObjectLocalServiceUtil.getSurveyObjectById(survey.getSurveyObjectId()).getName() %>"/>
            <liferay-ui:search-container-column-text name="Jumlah Responden" value="0"/>
            <liferay-ui:search-container-column-text name="Periode Survey" value='<%=(dateFormat.format(survey.getStartDate()) + " - " + dateFormat.format(survey.getEndDate())) %>'/>
<%--            <liferay-ui:search-container-column-text name="Status" property="status"/>--%>
            <liferay-ui:search-container-column-jsp path="/admin-survey/action.jsp"/>
        </liferay-ui:search-container-row>
        <liferay-ui:search-iterator/>
    </liferay-ui:search-container>
</aui:container>