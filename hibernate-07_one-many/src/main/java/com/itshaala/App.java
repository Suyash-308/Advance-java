package com.itshaala;

import com.itshaala.model.Address;
import com.itshaala.model.Employee;
import com.itshaala.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Address address1=new Address();
        address1.setCity("pune");
        address1.setStreet("baner-road");
        address1.setPincode("123456");
        address1.setState("maharashtra");


        Address address2=new Address();
        address2.setCity("mumbai");
        address2.setStreet("gandhi-road");
        address2.setPincode("129056");
        address2.setState("maharashtra");

        Employee employee=new Employee();
        employee.setName("suyash");
        employee.setSalary(5000);
        employee.getAddresses().add(address1);
        employee.getAddresses().add(address2);

        address1.setEmployee(employee);
        address2.setEmployee(employee);
        session.persist(address1);
        session.persist(address2);
        session.persist(employee);

        transaction.commit();
        session.close();
        System.out.println("Added successfully");
    }
}
