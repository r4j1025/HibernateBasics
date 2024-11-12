package com.HibernateBasics;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App 
{
    public static void main( String[] args )
    {
//        Alien al=new Alien();
//        al.setAid(102);
//        al.setAname("pino");
//        al.setColor("green");
//        
//        Laptop lap=new Laptop();
//        lap.setLid(10001);
//        lap.setLname("dell");
//        
//        Laptop lap1=new Laptop();
//        lap1.setLid(10002);
//        lap1.setLname("Hp");
//        
//        Laptop lap3=new Laptop();
//        lap3.setLid(10003);
//        lap3.setLname("Apple");
//        
//        
//        //al.getLaps().add(lap3);
//        al.getLaps().add(lap);
//        //al.getLaps().add(lap);
//        
        Configuration con= new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop.class);
        
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        
        SessionFactory sf= con.buildSessionFactory(reg);
        
        Session session=sf.openSession();
        
        Transaction tx=session.beginTransaction();
        
//        Alien fetched_alien = (Alien) session.get(Alien.class, 102);
//        System.out.print(fetched_alien);
        
//        
//        session.save(lap1);
//        session.save(al);
//        session.save(lap);
//        session.save(lap);
        tx.commit();
    }
}
