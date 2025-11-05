package com.itshaala;

import com.itshaala.model.Address;
import com.itshaala.model.Employee;
import com.itshaala.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
       Transaction transaction= session.beginTransaction();


       Address address = new Address();
       address.setStreet("baner-road");
       address.setCity("pune");
       address.setState("maharashtra");
       address.setPincode("411005");


       Employee employee = new Employee();
       employee.setName("ram");
       employee.setSalary(5000);
       employee.setAddress(address);

       session.persist(employee);
       session.persist(address);

       transaction.commit();
       session.close();
       System.out.println("added successfully");
    }
}
