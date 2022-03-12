package com.example.solidprinciples;

public class OpenClosedPrinc {
    public static void main(String[] args) {
        Students s = new Students("himanshu", 1);
        WeakStudent ws = new WeakStudent("ashu", 2, "short tamperedd");
        System.out.println(s);
        System.out.println(ws);
    }
}

class Students {
    private int rollno;
    private String name;

    public Students(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}

class WeakStudent extends Students {
    private String weakness;

    public WeakStudent(String name, int rollno, String weakness) {
        super(name, rollno);
        this.weakness = weakness;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }
}