package com.itshaala.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.security.auth.login.AppConfigurationEntry;

public class hibernateUtil {
   private static SessionFactory sessionFactory;
   private static org.hibernate.cfg.Configuration configuration;
   static {
       configuration=new Configuration();
       configuration.configure("hibernate.cfg.xml");
       }

       public static SessionFactory getSessionFactory(){
       if(sessionFactory==null){
           sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
       }
       return sessionFactory;
   }
}
