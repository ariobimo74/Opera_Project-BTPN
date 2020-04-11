<%@ include file="../init.jsp" %>

<%
long id = ParamUtil.getLong(renderRequest, "id");

Answers answers = null;
if (id > 0)
{
    answers = AnswersLocalServiceUtil.getAnswers(id);
}
%>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/operation-survey/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addAnswers" var="addAnswersURL" />

<aui:form action="<%= addAnswersURL %>" name="< portlet:namespace />fm">

    <aui:model-context bean="<%= answers %>" model="<%= Answers.class %>" />

    <aui:fieldset>
	    <aui:input name="id" type="hidden" />
		<aui:input name="answer" label="Jawaban" required="true"/>
        <aui:input name="value" label="Nilai Jawaban" required="true"/>
	</aui:fieldset>

    <aui:button-row>
		<aui:button type="submit" value="submit"></aui:button>
		<aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>
	</aui:button-row>
</aui:form>
