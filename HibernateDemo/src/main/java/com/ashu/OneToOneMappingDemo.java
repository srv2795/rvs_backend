package com.ashu;

import com.ashu.model.Answer;
import com.ashu.model.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMappingDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
        Answer answer1 = new Answer();
        answer1.setAnswerId(11);
        answer1.setAnswer("Java is a programming language");

        Answer answer2 = new Answer();
        answer2.setAnswerId(12);
        answer2.setAnswer("Sql server is a database");

        Question question1 = new Question();
        question1.setQuestionId(1);
        question1.setQuestion("What is java");
        question1.setAnswer(answer1);
        answer1.setQuestion(question1);
        Question question2 = new Question();
        question2.setQuestionId(2);
        question2.setQuestion("What is Sql Server");
        question2.setAnswer(answer2);
        answer2.setQuestion(question2);

        Session session = factory.openSession();;
        Transaction tx = session.beginTransaction();
        session.save(answer1);
        session.save(answer2);
        session.save(question1);
        session.save(question2);
        tx.commit();

        // fetching the data from db
        Question q = session.load(Question.class, 1);
        System.out.println(q.getQuestion());
        System.out.println(q.getAnswer().getAnswerId() + " : " +q.getAnswer().getAnswer());
        session.close();
    }
}
