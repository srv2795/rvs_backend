package com.ashu.secondLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SecondLevelCacheDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate_caching.cfg.xml")
                .buildSessionFactory();
       /* Vehicle v1 = new Vehicle(534, "Scooter", "Jupiter");
        Vehicle v2 = new Vehicle(657, "Scooter", "Activa 5G");
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(v1);
        vehicleList.add(v2);
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Iterator<Vehicle> itr = vehicleList.iterator();
        while(itr.hasNext()) {
            session.save((Vehicle) itr.next());
        }
        tx.commit();
        session.close();*/

        Session session1 = factory.openSession();
        Vehicle vehicle1 = session1.get(Vehicle.class, 123);
        System.out.println(vehicle1);
        session1.close();

        Session session2 = factory.openSession();
        Vehicle vehicle2 = session2.get(Vehicle.class, 123);
        System.out.println(vehicle2);
        session2.close();

        factory.close();
    }
}
