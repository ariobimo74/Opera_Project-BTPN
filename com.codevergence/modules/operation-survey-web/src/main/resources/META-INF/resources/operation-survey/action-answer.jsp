<%@ include file="../init.jsp" %>

<%

String mvcPath = ParamUtil.getString(request, "mvcPath");
ResultRow resultRow = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
Answers answers = (Answers)resultRow.getObject();

%>

<liferay-ui:icon-menu>
    <portlet:renderURL var="editAnswersURL">
        <portlet:param name="id" value="<%= String.valueOf(answers.getId()) %>"/>
        <portlet:param name="mvcPath" value="/operation-survey/edit-answer.jsp" />
    </portlet:renderURL>
    <liferay-ui:icon image="edit" message="Edit" url="<%= editAnswersURL.toString() %>" />
    
    <portlet:actionURL name="deleteAnswers" var="deleteAnswersURL">
        <portlet:param name="id" value="<%= String.valueOf(answers.getId()) %>" />
    </portlet:actionURL>
    <liferay-ui:icon-delete image="delete" message="Delete" url="<%= deleteAnswersURL.toString() %>" />
</liferay-ui:icon-menu>
