package com.ashu.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class manyToManyDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Emp emp1 = new Emp();
        Emp emp2 = new Emp();

        emp1.setEmpId(123);
        emp1.setEmpName("Ashu");
        emp2.setEmpId(124);
        emp2.setEmpName("Himanshu");

        Proj proj1 = new Proj();
        Proj proj2 = new Proj();

        proj1.setProjId(678);
        proj1.setProjName("Rural Society");
        proj2.setProjId(679);
        proj2.setProjName("Urban Society");

        List<Proj> projList = new ArrayList<>();
        projList.add(proj1);
        projList.add(proj2);

        List<Emp> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);

        emp1.setProjects(projList);
        emp2.setProjects(projList);
        proj1.setEmployees(empList);
        proj2.setEmployees(empList);


        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(emp1);
        session.save(emp2);
        session.save(proj1);
        session.save(proj2);
        tx.commit();

        System.out.print("Done...");
        session.close();
        factory.close();

    }
}
