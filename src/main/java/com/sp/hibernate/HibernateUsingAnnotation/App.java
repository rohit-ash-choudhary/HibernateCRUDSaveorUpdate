package com.sp.hibernate.HibernateUsingAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sp.beans.Account;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Account acc=new Account();
//        acc.setAccount_num(1);
//       // acc.setFirst_name("Rohit ");
//        acc.setLast_name("Choudhary");
//        acc.setAccount_balance((long) 1000000000);
//        acc.setCity("Mumbai");
        
        Configuration cfg= new Configuration();
        cfg.configure("/com/sp/resource/hibernate.cfg2.xml");
        
        
        SessionFactory sesionfact=cfg.buildSessionFactory();
        
        Session session=sesionfact.openSession();
        Transaction trans= session.beginTransaction();
        try {
        	Account new_acc=session.get(Account.class,3);
        	new_acc.setAccount_balance((long) 1000);
        	new_acc.setFirst_name("kkkk");
        	
        	new_acc.setCity("New York");
        	//session.update(acc);
        	session.saveOrUpdate(new_acc);
        	System.out.println("Success");
        	trans.commit();
        }
        catch(Exception e)
        {	
        	System.out.println("Success");
        	trans.rollback();
        	e.printStackTrace();
        }
        finally {
        	
        	session.close();
        }
    }
}
