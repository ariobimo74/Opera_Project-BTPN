<%@ include file="../init.jsp" %>

<%

String mvcPath = ParamUtil.getString(request, "mvcPath");
ResultRow resultRow = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
Questions questions = (Questions)resultRow.getObject();

%>

<liferay-ui:icon-menu>
    <portlet:renderURL var="editQuestionsURL">
        <portlet:param name="id" value="<%= String.valueOf(questions.getId()) %>" />
        <portlet:param name="mvcPath" value="/operation-survey/edit-question.jsp" />
    </portlet:renderURL>
    <liferay-ui:icon image="edit" message="Edit" url="<%= editQuestionsURL.toString() %>" />

    <portlet:actionURL name="deleteQuestions" var="deleteQuestionsURL">
        <portlet:param name="id" value="<%= String.valueOf(questions.getId()) %>" />
    </portlet:actionURL>
    <liferay-ui:icon-delete image="delete" message="Delete" url="<%= deleteQuestionsURL.toString() %>" />
</liferay-ui:icon-menu>
