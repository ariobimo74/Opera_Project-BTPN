<%@ include file="../init.jsp" %>

<liferay-portlet:actionURL name="addSurvey" var="addSurveyURL"/>

<liferay-portlet:renderURL var="addRespondenURL" windowState="pop_up">
    <portlet:param name="mvcPath" value="/admin-survey/respondent/view.jsp"/>
</liferay-portlet:renderURL>

<%
    final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    final long surveyId = ParamUtil.getLong(renderRequest, "surveyId");

    SurveyOperation survey = SurveyOperationLocalServiceUtil.getSurveyOperationById(surveyId);
%>

<aui:container>
    <aui:form action="${ addSurveyURL }" name="fm" method="post">

        <% assert survey != null; %>

        <aui:input name="id" value="<%= survey.getId()%>" type="hidden"/>

        <aui:fieldset>
            <aui:row>
                <aui:col width="20">
                    <label for="<portlet:namespace/>title">Judul survey</label>
                </aui:col>
                <aui:col width="80">
                    <aui:input name="title" value="<%= survey.getTitle() %>" label=""/>
                </aui:col>
            </aui:row>
            <aui:row>
                <aui:col width="20">
                    <label for="<portlet:namespace/>description">Deskripsi</label>
                </aui:col>
                <aui:col width="80">
                    <aui:input name="description" value="<%= survey.getDescription() %>" label=""/>
                </aui:col>
            </aui:row>
            <aui:row>
                <aui:col width="20">
                    <label for="<portlet:namespace/>objectSurvey">Objek survey</label>
                </aui:col>
                <aui:col width="80">
                    <aui:select name="surveyObjectId" value="<%= survey.getSurveyObjectId() %>" label="">
                        <c:forEach items="<%= SurveyObjectLocalServiceUtil.getAllSurveyObject() %>" var="surveyObject">
                            <aui:option value="${ surveyObject.id }">${ surveyObject.name }</aui:option>
                        </c:forEach>
                    </aui:select>
                </aui:col>
            </aui:row>
            <c:if test='<%= surveyId > 0 %>'>
                <aui:row>
                    <aui:col width="20">
                        <label for="<portlet:namespace/>respondenCount">Jumlah Responden</label>
                    </aui:col>
                    <aui:col width="80">
                        <aui:row>
                            <aui:col width="30">
                                <aui:input name="respondenCount" label="" readonly=""/>
                            </aui:col>
                            <aui:col width="70">
                                <aui:button href="${addRespondenURL}" value="Pilih Responden" useDialog="true"/>
                            </aui:col>
                        </aui:row>
                    </aui:col>
                </aui:row>
            </c:if>
            <aui:row>
                <aui:col width="20">
                    <label for="<portlet:namespace/>startDate">Periode survey</label>
                </aui:col>
                <aui:col width="80">
                    <aui:row>
                        <aui:col width="45">
                            <aui:input name="startDate" value='<%= survey.getStartDate() == null ? "" : dateFormat.format(survey.getStartDate()) %>' label=""  type="date">
                                <aui:validator name="required"/>
                            </aui:input>
                        </aui:col>
                        <aui:col width="10" cssClass="text-center">
                            <span>S/D</span>
                        </aui:col>
                        <aui:col width="45">
                            <aui:input name="endDate" value='<%= survey.getEndDate() == null ? "" : dateFormat.format(survey.getEndDate()) %>' label="" type="date">
                                <aui:validator name="required"/>
                                <aui:validator errorMessage="ahayde" name="custom">
                                    function (val, fieldNode, ruleValue) {
                                        console.log(val);

                                        let endDate = new Date(val);
                                        let startDate = new Date($('#<portlet:namespace/>startDate').val());

                                        return startDate <= endDate;
                                    }
                                </aui:validator>
                            </aui:input>
                        </aui:col>
                    </aui:row>
                </aui:col>
            </aui:row>
        </aui:fieldset>
        <c:if test='<%= surveyId > 0 %>'>
            <aui:button-row>
                <liferay-portlet:renderURL var="addQuestionURL">
                    <portlet:param name="surveyId" value="<%= String.valueOf(surveyId) %>"/>
                    <portlet:param name="mvcPath" value="/admin-survey/question/edit.jsp"/>
                </liferay-portlet:renderURL>

                <aui:button href="${ addQuestionURL }" value="survey.admin.edit.fm.btn.add-question" type="button"/>
            </aui:button-row>

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
        </c:if>
        <aui:button-row>
            <aui:button type="submit" value='<%= surveyId == 0 ? "Save as draft" : "Submit" %>'/>
            <liferay-portlet:renderURL var="backURL">
                <portlet:param name="mvcPath" value="/admin-survey/view.jsp" />
            </liferay-portlet:renderURL>
            <aui:button type="cancel" href="${ backURL }" />
        </aui:button-row>
    </aui:form>
</aui:container>