package com.itshaala;

import com.itshaala.model.ContractEmployee;
import com.itshaala.model.Employee;
import com.itshaala.model.FullTimeEmployee;
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
    public static void main( String[] args ) {
        Employee emp = new Employee();
        emp.setName("Jack");


        FullTimeEmployee fte = new FullTimeEmployee();
        fte.setName("Ram");
        fte.setSalary(50000);

        ContractEmployee cte = new ContractEmployee();
        cte.setName("Ravan");
        cte.setInvoiceAmount(12000);

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
        session.persist(emp);
        session.persist(fte);
        session.persist(cte);
        transaction.commit();
        session.close();
        System.out.println("Save Successfully");
    }
}
