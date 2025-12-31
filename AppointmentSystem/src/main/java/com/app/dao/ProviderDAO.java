package com.app.dao;

import org.hibernate.*;
import com.app.config.HibernateUtil;
import com.app.entity.Provider;

public class ProviderDAO {

    public void save(Provider provider) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        session.save(provider);
        tx.commit();
        session.close();
    }
}
