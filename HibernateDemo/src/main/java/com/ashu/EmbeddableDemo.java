package com.ashu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddableDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
        Teacher teacher1 = new Teacher("abc", "Shreya");
        Teacher teacher2 = new Teacher("def", "Priya");
        School school1 = new School();
        school1.setName("DPS");
        school1.setLocation("Delhi");
        school1.setTeacher(teacher1);

        School school2 = new School();
        school2.setName("RYAN");
        school2.setLocation("Gurgaon");
        school2.setTeacher(teacher2);

        Session session = factory.openSession();
        Transaction tx  = session.beginTransaction();
        session.save(school1);
        session.save(school2);
        tx.commit();
        session.close();
        factory.close();
    }
}
