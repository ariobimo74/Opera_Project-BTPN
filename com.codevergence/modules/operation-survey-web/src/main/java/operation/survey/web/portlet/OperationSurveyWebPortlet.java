package operation.survey.web.portlet;

import operation.survey.web.constants.OperationSurveyWebPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author Ario Bimo
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=Codevergence",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Operation Survey",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/operation-survey/view.jsp",
		"javax.portlet.name=" + OperationSurveyWebPortletKeys.OPERATIONSURVEYWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class OperationSurveyWebPortlet extends MVCPortlet {
}