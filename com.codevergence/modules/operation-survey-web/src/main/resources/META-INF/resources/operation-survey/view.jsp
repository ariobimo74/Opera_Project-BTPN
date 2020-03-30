<%@ include file="../init.jsp" %>

<p>
	<b><liferay-ui:message key="operationsurveyweb.caption"/></b>
</p>

<aui:button-row>
    <portlet:renderURL var="addSurveyURL">
        <portlet:param name="mvcPath" value="/operation-survey/edit.jsp"></portlet:param>
    </portlet:renderURL>

    <aui:button onClick="<%= addSurveyURL.toString() %>" value="Add Survey"></aui:button>
</aui:button-row>
