<%@ include file="../../init.jsp" %>

<%
    String surveyId = ParamUtil.getString(renderRequest, "surveyId");
%>


<liferay-portlet:actionURL name="addQuestion" var="addQuestionURL"/>

<%--<jsp:useBean id="answerList" scope="request" type="java.util.List<com.btpn.opera.operationsurvey.model.Answer>"/>--%>

<aui:container>
    <aui:form action="${ addQuestionURL }" method="post" name="fm">

        <aui:input name="surveyId" type="hidden" value="<%= surveyId %>" />

        <aui:fieldset>
            <aui:row>
                <aui:col width="20">
                    <label for="<portlet:namespace/>question">Pertanyaan</label>
                </aui:col>
                <aui:col width="80">
                    <aui:input name="question" label=""/>
                </aui:col>
            </aui:row>
            <aui:row>
                <aui:col width="20">
                    <label for="<portlet:namespace/>question">Jawaban</label>
                </aui:col>
                <aui:col width="80">
                    <aui:input name="answer" label=""/>
                </aui:col>
            </aui:row>
            <aui:row>
                <aui:col width="20">
                    <label for="<portlet:namespace/>value">Nilai</label>
                </aui:col>
                <aui:col width="80">
                    <aui:input name="value" label="" type="number"/>
                </aui:col>
            </aui:row>
        </aui:fieldset>
        <aui:button-row>
            <aui:button type="submit" />

            <liferay-portlet:renderURL var="backURL">
                <portlet:param name="surveyId" value="<%= surveyId %>"/>
                <portlet:param name="mvcPath" value="/admin-survey/edit.jsp"/>
            </liferay-portlet:renderURL>
            <aui:button type="cancel" href="${ backURL }" />
        </aui:button-row>
    </aui:form>
    <liferay-ui:search-container
            emptyResultsMessage="survey.admin.edit.quiestion.answer.search-container.emptyResultMessage"
            total="<%= AnswersLocalServiceUtil.getAnswersesCount() %>">
        <liferay-ui:search-container-results results="<%= AnswersLocalServiceUtil.getAllAnswers() %>"/>
        <liferay-ui:search-container-row className="com.btpn.opera.operationsurvey.model.Answers" keyProperty="id" indexVar="rowNum" >
            <liferay-ui:search-container-column-text name="Pilihan" value="<%= String.valueOf((char)(rowNum + 97))%>" />
            <liferay-ui:search-container-column-text name="Jawban" property="answer" />
            <liferay-ui:search-container-column-text name="Nilai" property="value" />
        </liferay-ui:search-container-row>
        <liferay-ui:search-iterator />
    </liferay-ui:search-container>
</aui:container>