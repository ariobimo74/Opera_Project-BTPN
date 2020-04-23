package com.btpn.opera.operationsurvey.portlet;

import com.btpn.opera.operationsurvey.constants.OperationSurveyWebPortletKeys;
import com.btpn.opera.operationsurvey.model.Answers;
import com.btpn.opera.operationsurvey.model.Question;
import com.btpn.opera.operationsurvey.model.SurveyOperation;
import com.btpn.opera.operationsurvey.service.AnswersLocalService;
import com.btpn.opera.operationsurvey.service.QuestionLocalService;
import com.btpn.opera.operationsurvey.service.SurveyOperationLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.*;
import javax.portlet.filter.MutableActionParametersWrapper;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component(
        immediate = true,
        property = {
                "com.liferay.portlet.display-category=BTPN",
                "com.liferay.portlet.header-portlet-css=/css/main.css",
                "com.liferay.portlet.instanceable=false",
                "javax.portlet.display-name=OperationSurveyWeb",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/admin-survey/view.jsp",
                "javax.portlet.name=" + OperationSurveyWebPortletKeys.OPERATIONSURVEYADMINWEB,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user"
        },
        service = Portlet.class
)
public class OperationSurveyAdminWebPortlet extends MVCPortlet {

    @Override
    public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

               /* List<Survey> surveyList = new ArrayList<Survey>() {
                        {
                                add(new Survey(1, "Lorem ipsum dolor sit amet", 4, "Ut enim ad", "01/01/2020 - 30/06/2020", "submitted"));
                                add(new Survey(2, "consectetur  adspiscing elit", 39, "minim veniam", "01/07/2020 - 30/08/2020", "saved"));
                        }
                };

                List<String> strings = new ArrayList<String>(Arrays.asList("IT Development", "Management", "Marketing"));

                List<Question> questionList = new ArrayList<Question>() {
                        {
                                add(new Question(1, "Question 1"));
                                add(new Question(2, "Question 2"));
                                add(new Question(3, "Question 3"));
                        }
                };

                List<Answer> answerList = new ArrayList<Answer>() {
                        {
                                add(new Answer(1, 1, "Sangat Setuju", 10));
                                add(new Answer(2, 1, "Setuju", 8));
                                add(new Answer(3, 1, "Biasa Saja", 6));
                                add(new Answer(4, 1, "Tidak Setuju", 2));
                                add(new Answer(5, 1, "Sangat Tidak Setuju", 0));
                                add(new Answer(6, 2, "Sangat Setuju", 10));
                                add(new Answer(7, 2, "Setuju", 8));
                                add(new Answer(8, 2, "Biasa Saja", 6));
                                add(new Answer(9, 2, "Tidak Setuju", 4));
                                add(new Answer(10, 2, "Sangat Tidak Setuju", 2));
                                add(new Answer(11, 3, "Setuju", 10));
                                add(new Answer(12, 3, "Biasa Saja", 0));
                                add(new Answer(13, 3, "Tidak Setuju", -5));
                        }
                };

                renderRequest.setAttribute("surveyList", surveyList);
                renderRequest.setAttribute("objectSurvey", strings);
                renderRequest.setAttribute("questionList", questionList);
                renderRequest.setAttribute("answerList", answerList);*/

        super.render(renderRequest, renderResponse);
    }

    public void addSurvey(ActionRequest request, ActionResponse response) throws PortalException {
        final ServiceContext serviceContext = ServiceContextFactory.getInstance(SurveyOperation.class.getName(), request);

        final long id = ParamUtil.getLong(request, "id");
        System.out.println("id = " + id);
        final long surveyObjectId = ParamUtil.getLong(request, "surveyObjectId");
        System.out.println("surveyObjectId = " + surveyObjectId);
        final String title = ParamUtil.getString(request, "title");
        System.out.println("title = " + title);
        final String description = ParamUtil.getString(request, "description");
        System.out.println("description = " + description);
        final Date startDate = ParamUtil.getDate(request, "startDate", new SimpleDateFormat("yyyy-MM-dd"));
        System.out.println("startDate = " + startDate);
        final Date endDate = ParamUtil.getDate(request, "endDate", new SimpleDateFormat("yyyy-MM-dd"));
        System.out.println("endDate = " + endDate);

        SurveyOperation surveyOperation = null;
        if (id > 0) {
            surveyOperation = _surveyService.editSurveyOperation(serviceContext.getUserId(), id, title, description, surveyObjectId, startDate, endDate, serviceContext);
        } else {
            surveyOperation = _surveyService.addSurveyOperation(serviceContext.getUserId(), title, description, surveyObjectId, startDate, endDate, serviceContext);
        }

        response.getRenderParameters().setValue("surveyId", String.valueOf(surveyOperation.getId()));
    }

    public void addQuestion(ActionRequest request, ActionResponse response) throws PortalException {
        final ServiceContext serviceContext = ServiceContextFactory.getInstance(Question.class.getName(), request);

        final long id = ParamUtil.getLong(request, "id");
        System.out.println("id = " + id);
        final long surveyId = ParamUtil.getLong(request, "surveyId");
        System.out.println("surveyId = " + surveyId);
        final String question = ParamUtil.getString(request, "question");
        System.out.println("question = " + question);

        final Question newQuestion = _questionService.addQuestion(question, surveyId, serviceContext);

        addAnswers(newQuestion.getId(), request);
    }

    private void addAnswers(long questionId, ActionRequest request) throws PortalException {
        final ServiceContext serviceContext = ServiceContextFactory.getInstance(Answers.class.getName(), request);

        final String answer = ParamUtil.getString(request, "answer");
        System.out.println("answer = " + answer);
        final double value = ParamUtil.getDouble(request, "value");
        System.out.println("value = " + value);

        _answersService.addAnswers(answer, value, questionId, serviceContext);
    }

    @Reference
    private SurveyOperationLocalService _surveyService;

    @Reference
    private QuestionLocalService _questionService;

    @Reference
    private AnswersLocalService _answersService;
}
