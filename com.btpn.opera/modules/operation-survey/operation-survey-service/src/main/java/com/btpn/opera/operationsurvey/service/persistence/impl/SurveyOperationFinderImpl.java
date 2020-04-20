package com.btpn.opera.operationsurvey.service.persistence.impl;

import com.btpn.opera.operationsurvey.model.SurveyOperation;
import com.btpn.opera.operationsurvey.model.impl.SurveyObjectImpl;
import com.btpn.opera.operationsurvey.model.impl.SurveyOperationImpl;
import com.btpn.opera.operationsurvey.service.persistence.SurveyOperationFinder;
import com.liferay.portal.dao.orm.custom.sql.CustomSQL;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.List;

@Component(service = SurveyOperationFinder.class)
public class SurveyOperationFinderImpl extends SurveyOperationFinderBaseImpl implements SurveyOperationFinder
{
    @Reference
    private CustomSQL customSQL;

    public List<SurveyOperation> findAllSurveyOperationMapping()
    {
        Session session = null;

        try
        {
            session = openSession();

            String sql = customSQL.get(getClass(), "findAllSurveyOperationMapping");
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

    public List<SurveyOperation> findSurveyOperationByLikeTitleQuery(String title)
    {
        Session session = null;

        try
        {
            session = openSession();

            String sql = customSQL.get(getClass(), "findSurveyOperationByLikeTitleQuery");
            SQLQuery sqlQuery = session.createSQLQuery(sql);
            sqlQuery.setCacheable(false);
            sqlQuery.addEntity("SurveyOperation", SurveyObjectImpl.class);

            QueryPos queryPos = QueryPos.getInstance(sqlQuery);
            queryPos.add(title);

            return (List<SurveyOperation>) sqlQuery.list();
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }
        finally {
            closeSession(session);
        }

        return null;
    }
}
