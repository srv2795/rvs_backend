package com.ashu;

import com.ashu.secondLevelCache.Vehicle;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.awt.*;
import java.util.List;

public class CriteriaExample {
    public static void main(String[] args) {
        Session session = new Configuration().configure("hibernate_caching.cfg.xml")
                .buildSessionFactory().openSession();

        Criteria c = session.createCriteria(Vehicle.class);
        c.add(Restrictions.eq("type", "Car"));
        c.add(Restrictions.gt("id", 234));
        List<Vehicle> list = c.list();
        for(Vehicle v : list) {
            System.out.println(v);
        }
        session.close();
    }
}
