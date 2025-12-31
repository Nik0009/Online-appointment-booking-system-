package com.app.config;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
	private static SessionFactory factory;
	static {
			factory = new Configuration().configure().buildSessionFactory();
			}
	public static Session getSession() {
		return factory.openSession();
	}
	}