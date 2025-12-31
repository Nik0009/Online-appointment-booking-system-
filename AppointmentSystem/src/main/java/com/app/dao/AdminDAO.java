package com.app.dao;

import org.hibernate.*;
import com.app.config.HibernateUtil;
import com.app.entity.Admin;

public class AdminDAO {

    public void save(Admin admin) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        session.save(admin);
        tx.commit();
        session.close();
    }
}
