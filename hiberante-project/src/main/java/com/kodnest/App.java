package com.kodnest;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.kodnest.entity.Customer;
import com.kodnest.entity.Product; 

public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg = new Configuration();
       cfg.configure();
       
       SessionFactory bsf= cfg.buildSessionFactory();
       Session session = bsf.openSession();
       
       try {
    	   Transaction tr = session.beginTransaction();
    	   
    	   Product p1 = new Product();
    	   p1.setPid(1);
    	   p1.setPname("Prod-1");
//    	   session.save(p1);
    	   
    	   Product p2 = new Product();
    	   p2.setPid(2);
    	   p2.setPname("Prod-2");
    	   session.save(p1);
//    	   session.save(p2);
    	   
    	   ArrayList<Product> al = new ArrayList<Product>();
    	   al.add(p1);
    	   al.add(p2);
    	   
    	   Customer c1 = new Customer(1,"John",al);
    	   session.save(c1);
    	   
    	   Customer c2 = new Customer(2,"Jack",al);
    	   session.save(c2);
    	   
    	   ArrayList<Customer> a2 = new ArrayList<Customer>();
    	   a2.add(c1);
    	   a2.add(c2);
    	   
    	   p1.setC(a2);
    	   session.save(p1);
    	   p2.setC(a2);
    	   session.save(p2);
    	   
    	   tr.commit();
       }
       catch(Exception e) {
    	   e.printStackTrace();
       }
       finally {
    	   session.close();
           bsf.close();
       }
    }
}
       
       
//       Product p = new Product(1,"Iphone");
//       Customer c = new Customer(1,"Guru",p);
//       session.save(p);
//       session.save(c);
//       tr.commit();
//       session.close();
//       bsf.close();
   
 
//       Student s = session.get(Student.class,1);
//       System.out.println(s.getId()+"----"+s.getName());
//       System.out.println("++++++++++++++++++++++++");
//       System.out.println(s);
//	       List<Student> list = session.createQuery("from Student").list();
//	       for(Student s:list) {
//	    	   System.out.println(s);
//	       }