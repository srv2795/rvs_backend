package com.ashu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestHibernateConfigClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        System.out.println("sessionFactory object is created now : " + sessionFactory);
        Student st1 = new Student("ashu", "Ghaziabad");
        Student st2 = new Student("himanshu", "Delhi");
        System.out.println("student 1 : "+ st1);
        System.out.println("student 2 : "+ st2);
        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);

        Address ad = new Address();
        ad.setCity("Delhi");
        ad.setOpen(false);
        ad.setStreet("MV Ph-3");
        ad.setAddedDate(new Date());
        ad.setX(234.543);
        try {
            FileInputStream fis = new FileInputStream("src/main/java/pic.jpg");
            byte[] data = new byte[fis.available()];
            fis.read(data);
            ad.setImage(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(ad);
        Iterator<Student> its = studentList.iterator();
        while (its.hasNext()){
            session.save(its.next());
        }
        tx.commit();
        session.close();
        System.out.println("Done...");
    }
}
