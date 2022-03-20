package com.ashu.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class OneToManyDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Person person = new Person();
        person.setUserId(1234);
        person.setUsername("Ashu");

        Account account1 = new Account();
        account1.setAccountNo(24323454);
        account1.setBankName("Punjab national Bank");
        account1.setPerson(person);

        Account account2 = new Account();
        account2.setAccountNo(56756678);
        account2.setBankName("HDFC Bank");
        account2.setPerson(person);

        Account account3 = new Account();
        account3.setAccountNo(98988867);
        account3.setBankName("State Bank Of India");
        account3.setPerson(person);

        List<Account> accountList = new ArrayList<>();
        accountList.add(account1);
        accountList.add(account2);
        accountList.add(account3);

        person.setAccounts(accountList);

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(person);
        session.save(account1);
        session.save(account2);
        session.save(account3);
        tx.commit();

        Person p = session.get(Person.class, 1234);
        System.out.println("person id : " + p.getUserId());
        System.out.println("person name : "+ p.getUsername());
        List<Account> list = p.getAccounts();
        for(Account ac : list) {
            System.out.println("acccout no : "+ ac.getAccountNo()+" and bank name is  "+  ac.getBankName());
            System.out.println("person name : "+ p.getUsername());
        }
        session.close();
        factory.close();
        System.out.println("Done....");



    }
}
