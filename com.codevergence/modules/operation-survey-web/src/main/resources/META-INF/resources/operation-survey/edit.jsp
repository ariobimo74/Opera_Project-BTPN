<%@ include file="../init.jsp" %>

<%
long id = ParamUtil.getLong(renderRequest, "id");

SurveyOperation surveyOperation = null;
if (id > 0)
{
    surveyOperation = SurveyOperationLocalServiceUtil.getSurveyOperationById(id);
}
%>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/operation-survey/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addSurvey" var="addSurveyURL" />

<aui:form action="<%= addSurveyURL %>" name="<portlet:namespace />fm">

<aui:model-context bean="<%= surveyOperation %>" model="<%= SurveyOperation.class %>" />

	<aui:fieldset>
	    <aui:input name="id" type="hidden" />
		<aui:input name="title" label="Judul Survey" />
		<aui:input name="description" label="Catatan" type="textarea" resizable="true" />
		<aui:select name="surveyObj" label="Survey Object" required= "true" showRequiredLabel="true" showEmptyOption="true"	>
			<%
			List<SurveyObject> surveyObjectList = SurveyObjectLocalServiceUtil.getAllSurveyObjext();
				for (SurveyObject surveyObject : surveyObjectList)
				{
			%>
				<option value="<%= surveyObject.getName() %>"><%= surveyObject.getName() %></option>
			<%
				}
			%>
			<!-- 
		    <aui:option value="IT Development">IT Development</aui:option>
            <aui:option value="Quality Assurance">Quality Assurance</aui:option>
			 -->
        </aui:select>
		<aui:input name="startDate" label="Tanggal Mulai Survey" required= "true" showRequiredLabel="true" />
		<aui:input name="endDate" label="Tanggal Berakhir Survey" required= "true" showRequiredLabel="true" />
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" value="submit"></aui:button>
		<aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>
	</aui:button-row>
</aui:form>
