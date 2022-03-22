package com.ashu.hql;

import com.ashu.model.Student;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class SimpleHqlQuery {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = factory.openSession();
        //one way to use HQL
        String query = "from Student where  location='Delhi'";
        Query<Student> query1 = session.createQuery(query);
        List<Student> list = query1.list();
        for (Student s : list) {
            System.out.println(s.getId() +" : "+s.getName());
        }

        System.out.println("How to use HQL with alias");
        //another way to use HQL
        String query2 = "from Student s where s.location = :x ";
        Query<Student> q2 = session.createQuery(query2);
        q2.setParameter("x", "Delhi");
        List<Student> list1 = query1.list();
        for (Student s : list1) {
            System.out.println(s.getId() +" : "+s.getName());
        }
        session.close();
        factory.close();
    }
}
