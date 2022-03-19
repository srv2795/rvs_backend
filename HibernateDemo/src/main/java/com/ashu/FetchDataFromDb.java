package com.ashu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDataFromDb {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        // fetch using get()
        Student st = session.get(Student.class, 1);
        Student st1 = session.get(Student.class, 1);
        System.out.println("student: "+ st);
        System.out.println("student: "+ st1);
        System.out.println(st.toString());

        // fetch  using load()
        Address ad1 = session.load(Address.class, 1);
        System.out.println("address: "+ ad1);
        System.out.println(ad1.toString());
        System.out.println("date added : "+ad1.getAddedDate());
        session.close();
    }
}
