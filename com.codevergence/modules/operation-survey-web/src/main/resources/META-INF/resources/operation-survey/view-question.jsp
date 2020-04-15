<%@ include file="../init.jsp" %>

<!-- View Data Questions -->

<liferay-ui:success key="questionAdded" message="question-added" />
<liferay-ui:success key="questionEdited" message="question-edited" />
<liferay-ui:success key="questionDeleted" message="question-deleted" />

<p>
    <br/>
    <b><liferay-ui:message key="questions.message"/></b>
</p>

<aui:button-row cssClass="guestbook-buttons">

    <portlet:renderURL var="addQuestionsURL">
        <portlet:param name="mvcPath" value="/operation-survey/edit-question.jsp" />
    </portlet:renderURL>

    <aui:button onClick="<%= addQuestionsURL.toString() %>" value="Add Questions"></aui:button>

</aui:button-row>

<liferay-ui:search-container total="<%= QuestionsLocalServiceUtil.getQuestionsesCount() %>">
    <liferay-ui:search-container-results results="<%= QuestionsLocalServiceUtil.getAllQuestions() %>" />

    <% int k = 0; %>
    <liferay-ui:search-container-row className="operation.model.Questions" modelVar="questions">
        <liferay-ui:search-container-column-text name="No" value="<%= Integer.toString( k += 1 ) %>" />
        <liferay-ui:search-container-column-text property="question" />
        <liferay-ui:search-container-column-jsp align="right" path="/operation-survey/action-question.jsp" />
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />
</liferay-ui:search-container>


<!-- View Data Answers -->

<liferay-ui:success key="answerAdded" message="answer-added" />
<liferay-ui:success key="answerEdited" message="answer-edited" />
<liferay-ui:success key="answerDeleted" message="answer-deleted" />

<p>
    <br/>
    <b><liferay-ui:message key="answers.message"/></b>
</p>

<aui:button-row cssClass="guestbook-buttons">

    <portlet:renderURL var="addAnswersURL">
        <portlet:param name="mvcPath" value="/operation-survey/edit-answer.jsp" />
    </portlet:renderURL>

    <aui:button onClick="<%= addAnswersURL.toString() %>" value="Add Answers"></aui:button>

</aui:button-row>

<liferay-ui:search-container total="<%= AnswersLocalServiceUtil.getAnswersesCount() %>">
    <liferay-ui:search-container-results results="<%= AnswersLocalServiceUtil.getAllAnswers() %>" />

    <% int k = 0; %>
    <liferay-ui:search-container-row className="operation.model.Answers" modelVar="answers">
        <liferay-ui:search-container-column-text name="No" value="<%= Integer.toString( k += 1 ) %>" />
        <liferay-ui:search-container-column-text property="answer" />
        <liferay-ui:search-container-column-text property="value" />
        <liferay-ui:search-container-column-jsp align="right" path="/operation-survey/action-answer.jsp" />
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />
</liferay-ui:search-container>
