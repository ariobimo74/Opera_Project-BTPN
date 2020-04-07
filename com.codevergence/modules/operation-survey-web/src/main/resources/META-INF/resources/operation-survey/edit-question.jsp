<%@ include file="../init.jsp" %>

<%
long id = ParamUtil.getLong(renderRequest, "id");

Questions questions = null;
if (id > 0)
{
    questions = QuestionsLocalServiceUtil.getQuestions(id);
}
%>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/operation-survey/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addQuestions" var="addQuestionsURL" />

<aui:form action="<%= addQuestionsURL %>" name="< portlet:namespace />fm">

    <aui:model-context bean="<%= questions %>" model="<%= Questions.class %>" />

    <aui:fieldset>
	    <aui:input name="id" type="hidden" />
		<aui:input name="question" label="Pertanyaan" required="true"/>		
	</aui:fieldset>

    <aui:button-row>
		<aui:button type="submit" value="submit"></aui:button>
		<aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>
	</aui:button-row>
</aui:form>
