package com.app.dao;

import org.hibernate.*;
import com.app.config.HibernateUtil;
import com.app.entity.Appointment;

public class AppointmentDAO {
	
	public void save(Appointment ap) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.save(ap);
		tx.commit();
		s.close();
		}
}