package com.example.solidprinciples;

public class SingleRespPrinc {
    public static void main(String[] args) {
        Employee e = new Employee(1, "ashu", new Address("Delhi"));
        System.out.println(e);
    }

}

// In single responsibility principle each class has a single reason for change.
// Employee should have only employee related operation.
// Address should address related operation.
class Employee {
    private int id;
    private String name;
    private Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}

class Address {
    private String location;

    public Address(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Address{" +
                "location='" + location + '\'' +
                '}';
    }
}