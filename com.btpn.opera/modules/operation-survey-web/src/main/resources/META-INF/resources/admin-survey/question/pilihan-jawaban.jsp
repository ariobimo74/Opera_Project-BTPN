<%@ include file="../../init.jsp" %>

<%--<jsp:useBean id="answerList" scope="request" type="java.util.List<com.btpn.opera.operationsurvey.model.Answers>"/>--%>

<%
    final ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    final long questionId = Long.parseLong(row.getRowId());

%>
<ol type="a">
    <c:forEach items="<%= AnswersLocalServiceUtil.getAllAnswers() %>" var="answer">
        <li>${ answer.answer }</li>
    </c:forEach>
</ol>
