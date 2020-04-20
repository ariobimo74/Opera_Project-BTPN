package com.btpn.opera.operationsurvey.service.persistence.impl;

import com.btpn.opera.operationsurvey.model.Questions;
import com.btpn.opera.operationsurvey.model.impl.QuestionsImpl;
import com.btpn.opera.operationsurvey.service.persistence.QuestionsFinder;
import com.liferay.portal.dao.orm.custom.sql.CustomSQL;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.List;

@Component(service = QuestionsFinder.class)
public class QuestionsFinderImpl extends QuestionsFinderBaseImpl implements QuestionsFinder
{
    @Reference
    private CustomSQL customSQL;

    public List<Questions> findQuestionsBySurveyOperationIdQuery(long surveyOperationId)
    {
        Session session = null;

        try
        {
            session = openSession();

            String sql = customSQL.get(getClass(), "findQuestionsBySurveyOperationIdQuery");
            SQLQuery sqlQuery = session.createSQLQuery(sql);
            sqlQuery.setCacheable(false);
            sqlQuery.addEntity("Questions", QuestionsImpl.class);

            QueryPos queryPos = QueryPos.getInstance(sqlQuery);
            queryPos.add(surveyOperationId);

            return (List<Questions>) sqlQuery.list();
        }
        catch (Exception e)
        {
            System.out.println(e);
            e.getCause().getMessage();
        }
        finally {
            closeSession(session);
        }

        return null;
    }
}
