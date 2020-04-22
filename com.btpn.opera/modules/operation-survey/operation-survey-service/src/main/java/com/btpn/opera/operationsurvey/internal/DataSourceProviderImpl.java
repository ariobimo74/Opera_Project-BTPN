package com.btpn.opera.operationsurvey.internal;

import com.liferay.portal.kernel.dao.jdbc.DataSourceFactoryUtil;
import com.liferay.portal.kernel.dao.jdbc.DataSourceProvider;
import com.liferay.portal.kernel.util.PropsUtil;

import javax.sql.DataSource;

public class DataSourceProviderImpl implements DataSourceProvider
{
    @Override
    public DataSource getDataSource() {
        try {
            return DataSourceFactoryUtil.initDataSource(PropsUtil.getProperties("jdbc.ext.", true));
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}