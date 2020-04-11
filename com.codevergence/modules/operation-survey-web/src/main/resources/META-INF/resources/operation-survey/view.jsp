<%@ include file="../init.jsp" %>

<p>
	<b><liferay-ui:message key="operationsurveyweb.caption"/></b>
</p>

<%
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");
%>


<!-- UI Tabs View -->

<liferay-ui:tabs
    names='<%= "Survey Operation, Questions, Responden" %>'
    param="tabs2"
    refresh="<%= false %>"
    type="tabs nav-tabs-default">

    <liferay-ui:section>
            <%@ include file="/operation-survey/view-survey-operation.jsp" %>
        </liferay-ui:section>

    <liferay-ui:section>
        <%@ include file="/operation-survey/view-question.jsp" %>
    </liferay-ui:section>

    <liferay-ui:section>
            <%@ include file="/operation-survey/view-responden.jsp" %>
        </liferay-ui:section>
</liferay-ui:tabs>
