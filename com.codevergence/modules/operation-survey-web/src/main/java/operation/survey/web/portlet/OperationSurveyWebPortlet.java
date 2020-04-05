package operation.survey.web.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import operation.model.SurveyObject;
import operation.model.SurveyOperation;
import operation.service.SurveyObjectLocalService;
import operation.service.SurveyObjectLocalServiceUtil;
import operation.service.SurveyOperationLocalService;
import operation.survey.web.constants.OperationSurveyWebPortletKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
public class OperationSurveyWebPortlet extends MVCPortlet
{
	@Reference
	SurveyOperationLocalService surveyOperationLocalService;

	@Reference
	SurveyObjectLocalService surveyObjectLocalService;

	public void addSurvey(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, ParseException
	{
		ServiceContext serviceContext = ServiceContextFactory.getInstance(SurveyOperation.class.getName(), actionRequest);

		long id = ParamUtil.getLong(actionRequest, "id");
		String title = ParamUtil.getString(actionRequest, "title");
		String description = ParamUtil.getString(actionRequest, "description");
		String surveyObj = ParamUtil.getString(actionRequest, "surveyObj");
		String startDate = ParamUtil.getString(actionRequest, "startDate");
		String endDate = ParamUtil.getString(actionRequest, "endDate");

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
		final Date startDateFinal = simpleDateFormat.parse(startDate);
		final Date endDateFinal = simpleDateFormat.parse(endDate);

		if (id > 0)
		{
			try
			{
				surveyOperationLocalService.editSurveyOperation(id, title, description, surveyObj, startDateFinal, endDateFinal, serviceContext);
				actionResponse.getRenderParameters().setValue("id", Long.toString(id));

				SessionMessages.add(actionRequest, "surveyAdded");
			}
			catch (Exception e)
			{
				System.out.println(e);

				PortalUtil.copyRequestParameters(actionRequest, actionResponse);
				actionResponse.getRenderParameters().setValue("mvcPath", "/operation-survey/edit.jsp");

				SessionErrors.add(actionRequest, e.getClass().getName());
			}
		}
		else
		{
			try
			{
				surveyOperationLocalService.addSurveyOperation(title, description, surveyObj, startDateFinal, endDateFinal, serviceContext);
				actionResponse.getRenderParameters().setValue("id", Long.toString(id));

				SessionMessages.add(actionRequest, "surveyEdited");
			}
			catch (Exception e)
			{
				System.out.println(e);

				PortalUtil.copyRequestParameters(actionRequest, actionResponse);
				actionResponse.getRenderParameters().setValue("mvcPath", "/operation-survey/edit.jsp");

				SessionErrors.add(actionRequest, e.getClass().getName());
			}
		}
	}

	public void deleteSurvey(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException
	{
//		ServiceContext serviceContext = ServiceContextFactory.getInstance(SurveyOperation.class.getName(), actionRequest);

		long id = ParamUtil.getLong(actionRequest, "id");

		try
		{
			surveyOperationLocalService.deleteSurveyOperationById(id);
		}
		catch (Exception e)
		{
			System.out.println(e);

			Logger.getLogger(OperationSurveyWebPortlet.class.getName()).log(Level.SEVERE, null, e);
		}
	}

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException
	{
		try
		{
//			ServiceContext serviceContext = ServiceContextFactory.getInstance(SurveyOperation.class.getName(), renderRequest);
			long id = ParamUtil.getLong(renderRequest, "id");

			List<SurveyOperation> surveyOperationList = surveyOperationLocalService.getAllSurveyOperation();

			renderRequest.setAttribute("id", id);
		}
		catch (Exception e)
		{
			throw new PortletException(e);
		}
		super.render(renderRequest, renderResponse);
	}

	public void test()
	{
		List<SurveyObject> surveyObjectList = SurveyObjectLocalServiceUtil.getAllSurveyObjext();
		for (SurveyObject surveyObject : surveyObjectList)
		{
			surveyObject.getName();
			System.out.println(surveyObject.getName());
		}
	}
}
