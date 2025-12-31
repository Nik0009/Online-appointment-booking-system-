package com.app.dao;

import org.hibernate.*;
import com.app.config.HibernateUtil;
import com.app.entity.User;

public class UserDAO {

    public void save(User user) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        session.save(user);
        tx.commit();
        session.close();
    }
}
