<%@ include file="../init.jsp" %>

<%
long id = ParamUtil.getLong(renderRequest, "id");

SurveyOperation surveyOperation = null;
if (id > 0)
{
    surveyOperation = SurveyOperationLocalServiceUtil.getSurveyOperation(id);
}
%>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/operation-survey/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addSurvey" var="addSurveyURL" />

<aui:form action="<%= addSurveyURL %>" name="<portlet:namespace />fm">

<aui:model-context bean="<%= surveyOperation %>" model="<%= SurveyOperation.class %>" />

	<aui:fieldset>
	    <aui:input name="id" type="hidden" />
		<aui:input name="title" />
		<aui:input name="description" />
		<aui:input name="surveyObj" />
		<aui:input name="startDate" />
		<aui:input name="endDate" />
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" value="submit"></aui:button>
		<aui:button cssClass="btn btn-warning" type="save" value="save"></aui:button>
		<aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>
	</aui:button-row>
</aui:form>
