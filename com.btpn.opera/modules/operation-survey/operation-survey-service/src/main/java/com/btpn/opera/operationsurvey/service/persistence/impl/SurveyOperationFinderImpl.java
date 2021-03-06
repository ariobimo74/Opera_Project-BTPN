package com.btpn.opera.operationsurvey.service.persistence.impl;

import com.btpn.opera.operationsurvey.model.SurveyOperation;
import com.btpn.opera.operationsurvey.model.SurveyOperationView;
import com.btpn.opera.operationsurvey.model.impl.SurveyObjectImpl;
import com.btpn.opera.operationsurvey.model.impl.SurveyOperationImpl;
import com.btpn.opera.operationsurvey.service.persistence.SurveyOperationFinder;
import com.liferay.portal.dao.orm.custom.sql.CustomSQL;
import com.liferay.portal.kernel.dao.orm.*;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.List;

@Component(service = SurveyOperationFinder.class)
public class SurveyOperationFinderImpl extends SurveyOperationFinderBaseImpl implements SurveyOperationFinder
{
    @Reference
    private CustomSQL customSQL;

    public List<SurveyOperationView> findAllSurveyOperationMapping()
    {
        Session session = null;

        try
        {
            session = openSession();

            String sql = customSQL.get(getClass(), "findAllSurveyOperationMapping");
            SQLQuery sqlQuery = session.createSQLQuery(sql);
            sqlQuery.setCacheable(false);
            sqlQuery.addEntity("SurveyOperation", SurveyOperationImpl.class);
            sqlQuery.addEntity("SurveyObject", SurveyObjectImpl.class);

            return (List<SurveyOperationView>) sqlQuery.list();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            closeSession(session);
        }

        return null;
    }

    public List<SurveyOperation> findSurveyOperationBeforeEndDate()
    {
        Session session = null;

        try
        {
            session = openSession();

            String sql = customSQL.get(getClass(), "findSurveyOperationBeforeEndDate");
            SQLQuery sqlQuery = session.createSQLQuery(sql);
            sqlQuery.setCacheable(false);
            sqlQuery.addEntity("SurveyOperation", SurveyOperationImpl.class);

            return (List<SurveyOperation>) sqlQuery.list();
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

    public List<SurveyOperation> findSurveyOperationByTitleQuery(String title)
    {
        Session session = null;

        try {
            session = openSession();

            String sql = customSQL.get(getClass(), "findSurveyOperationByTitleQuery");
            SQLQuery sqlQuery = session.createSQLQuery(sql);
            sqlQuery.addEntity("SurveyOperation", SurveyOperationImpl.class);
            QueryPos queryPos = QueryPos.getInstance(sqlQuery);
            queryPos.add(title);

            return (List<SurveyOperation>) sqlQuery.list();
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
