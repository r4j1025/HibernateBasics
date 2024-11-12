package com.HibernateMultiTable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class App {
	public static void main(String[] args) {
		Laptop laptop1=new Laptop();
		laptop1.setLid(10005);
		laptop1.setLname("Mi");
		
		Laptop laptop2=new Laptop();
		laptop2.setLid(10006);
		laptop2.setLname("Apple");
		
		Students s= new Students();
		s.setRollno(103);
		s.setName("Ravi");
		s.setMarks(320);
		s.getLaps().add(laptop1);
		s.getLaps().add(laptop2);
		
		laptop1.getS().add(s);
		laptop2.getS().add(s);
		
		Configuration con= new Configuration().configure().addAnnotatedClass(Students.class).addAnnotatedClass(Laptop.class);
		
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        
        SessionFactory sf= con.buildSessionFactory(reg);
        
        Session session=sf.openSession();
        
        Transaction tx=session.beginTransaction();
        
        session.save(laptop1);
        session.save(laptop2);
        session.save(s);
        
        tx.commit();
		
	}
}
