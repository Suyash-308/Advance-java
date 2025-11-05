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
        Transaction tx = session.beginTransaction();

        Address address1 = new Address();
        address1.setCity("pune");
        address1.setStreet("bangalore-road");
        address1.setPincode("12345");
        address1.setState("maharashtra");

        Address address2 = new Address();
        address2.setCity("mumbai");
        address2.setStreet("gandhi-road");
        address2.setPincode("400605");
        address2.setState("maharashtra");

        Employee employee = new Employee();
        employee.setName("ram");
        employee.setSalary("40000");
        employee.getAddress().add(address1);
        employee.getAddress().add(address2);

        session.persist(address1);
        session.persist(address2);
        session.persist(employee);
        tx.commit();
        session.close();


    }
}
