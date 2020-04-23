package com.btpn.opera.operationsurvey.portlet;

import com.btpn.opera.operationsurvey.constants.OperationSurveyWebPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author fachru
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=BTPN",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=OperationSurveyWeb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/survey/view.jsp",
		"javax.portlet.name=" + OperationSurveyWebPortletKeys.OPERATIONSURVEYWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class OperationSurveyWebPortlet extends MVCPortlet {
}