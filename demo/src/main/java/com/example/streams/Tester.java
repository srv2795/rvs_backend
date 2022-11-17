package com.example.streams;


import java.util.List;


public class Tester {
    private int id;
    private String name;
    private List<String> subject;

    public Tester(int id, String name, List<String> subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject=" + subject +
                '}';
    }
}
