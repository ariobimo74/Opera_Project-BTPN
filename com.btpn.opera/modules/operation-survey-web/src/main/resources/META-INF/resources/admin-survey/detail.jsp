<%@ include file="../init.jsp" %>

<%
    final long surveyId = ParamUtil.getLong(renderRequest, "surveyId");

    final SurveyOperation survey = SurveyOperationLocalServiceUtil.getSurveyOperationById(surveyId);
    final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
%>

<liferay-portlet:renderURL var="respondentURL">
    <portlet:param name="surveyId" value="<%= String.valueOf(surveyId) %>"/>
    <portlet:param name="mvcPath" value="/admin-survey/respondent/detail.jsp" />
</liferay-portlet:renderURL>

<aui:container cssClass="detail-container">
    <aui:row>
        <aui:col width="20">
            <span>Deskripsi</span>
        </aui:col>
        <aui:col width="80">
            <span><%= survey.getDescription() %></span>
        </aui:col>
    </aui:row>
    <aui:row>
        <aui:col width="20">
            <span>Objek Survey</span>
        </aui:col>
        <aui:col width="80">
            <span><%= SurveyObjectLocalServiceUtil.getSurveyObjectById(survey.getSurveyObjectId()).getName()  %></span>
        </aui:col>
    </aui:row>
    <aui:row>
        <aui:col width="20">
            <span>Responden</span>
        </aui:col>
        <aui:col width="10">
            <span class="count-number">0</span>
        </aui:col>
        <aui:col width="70">
            <aui:button href="${ respondentURL }" type="button" value="Detil responden" />
        </aui:col>
    </aui:row>
    <aui:row>
        <aui:col width="20">
            <span>Periode survey</span>
        </aui:col>
        <aui:col width="80">
            <span><%= dateFormat.format(survey.getStartDate()) %></span>
            <span class="pl-3 pr-3">s.d.</span>
            <span><%= dateFormat.format(survey.getEndDate()) %></span>
        </aui:col>
    </aui:row>
    <aui:row>
        <aui:col width="20">
            <span>Daftar Pertanyaan</span>
        </aui:col>
        <aui:col width="80">
            <liferay-ui:search-container
                    emptyResultsMessage="survey.admin.edit.search-container.emptyResultMessage"
                    total="<%= QuestionLocalServiceUtil.getQuestionsCount() %>">
                <liferay-ui:search-container-results
                        results="<%= QuestionLocalServiceUtil.getQuestions(searchContainer.getStart(), searchContainer.getEnd()) %>"/>
                <liferay-ui:search-container-row className="com.btpn.opera.operationsurvey.model.Question"
                                                 indexVar="rowNum">
                    <liferay-ui:search-container-column-text name="Pertanyaan" property="question"/>
                    <liferay-ui:search-container-column-jsp name="Pilihan Jawaban"
                                                            path="/admin-survey/question/pilihan-jawaban.jsp"/>
                    <liferay-ui:search-container-column-jsp name="Nilai" path="/admin-survey/question/nilai.jsp"/>
                </liferay-ui:search-container-row>

                <liferay-ui:search-iterator/>
            </liferay-ui:search-container>
        </aui:col>
    </aui:row>
</aui:container>