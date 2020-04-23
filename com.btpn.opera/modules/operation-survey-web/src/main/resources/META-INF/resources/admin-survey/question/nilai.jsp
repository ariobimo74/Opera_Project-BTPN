<%@ include file="../../init.jsp" %>

<%
    final ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    final long questionId = Long.parseLong(row.getRowId());
%>
<ul>
    <c:forEach items="<%= AnswersLocalServiceUtil.getAllAnswers() %>" var="answer">
        <li>${ answer.value }</li>
    </c:forEach>
</ul>
