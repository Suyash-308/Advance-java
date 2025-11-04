package com.itshaala;

import com.itshaala.model.ContractEmployee;
import com.itshaala.model.Employee;
import com.itshaala.model.FullTimeEmployee;
import com.itshaala.util.hibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.swing.table.TableCellRenderer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee employee = new Employee();
        employee.setName("Suyash");

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        fullTimeEmployee.setSalary(50000);

        ContractEmployee   contractEmployee  = new ContractEmployee();
        contractEmployee.setInvoiceAmount(4000);


        SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
        session.persist(fullTimeEmployee);
        session.persist(employee);
        session.persist(contractEmployee);
        transaction.commit();
        session.close();
    }
}
