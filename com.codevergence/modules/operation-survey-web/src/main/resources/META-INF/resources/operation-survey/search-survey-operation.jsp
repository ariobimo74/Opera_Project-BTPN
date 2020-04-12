<%@ include file="../init.jsp" %>

<%
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");

    String keyword = ParamUtil.getString(request, "keyword");
    long id = ParamUtil.getLong(renderRequest, "id");
%>

<portlet:renderURL var="searchURL">
        <portlet:param name="mvcPath" value="/operation-survey/search-survey-operation.jsp" />
</portlet:renderURL>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/operation-survey/view.jsp" />
</portlet:renderURL>

<aui:form action="<%= searchURL %>" name="fm">

	<liferay-ui:header backURL="<%= viewURL %>" title="back" />

	<div class="row">
		<div class="col-md-8">
			<aui:input inlineLabel="left" type="text" label="" name="keyword"
				placeholder="Search Survey by Title" size="256" />
		</div>

		<div class="col-md-4">
			<aui:button type="submit" value="search" />
		</div>
	</div>
</aui:form>

<%
    SearchContext searchContext = SearchContextFactory.getInstance(request);
    searchContext.setKeywords(keyword);

    List<SurveyOperation> surveyOperations = SurveyOperationLocalServiceUtil.getAllSurveyOperation();
    List<SurveyOperation> surveyOperationSearch = new ArrayList<SurveyOperation>();

    for (int i = 0; i < surveyOperations.size(); i++)
    {
        if (surveyOperations.get(i).getTitle().toLowerCase().contains(keyword.toLowerCase()))
        {
            surveyOperationSearch.add(surveyOperations.get(i));
        }
    }
%>

<liferay-ui:search-container emptyResultsMessage="no-survey-operation-found" total="<%= surveyOperationSearch.size() %>">
    <liferay-ui:search-container-results results="<%= surveyOperationSearch %>" />

    <% int k = 0; %>
    <liferay-ui:search-container-row className="operation.model.SurveyOperation" keyProperty="id" modelVar="surveyOperation">
        <liferay-ui:search-container-column-text name="No" value="<%= Integer.toString( k += 1 ) %>" />
        <liferay-ui:search-container-column-text property="title" />
        <liferay-ui:search-container-column-text property="surveyObj" />
        <liferay-ui:search-container-column-text name="startDate" value="<%= simpleDateFormat.format(surveyOperation.getStartDate()) %>" />
        <liferay-ui:search-container-column-text name="endDate" value="<%= simpleDateFormat.format(surveyOperation.getEndDate()) %>" />
        <liferay-ui:search-container-column-text name="submittedDate" value="<%= simpleDateFormat.format(surveyOperation.getSubmittedDate()) %>" />
        <liferay-ui:search-container-column-jsp align="right" path="/operation-survey/action.jsp" />
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />
</liferay-ui:search-container>
