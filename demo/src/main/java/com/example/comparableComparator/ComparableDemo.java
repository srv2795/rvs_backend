package com.example.comparableComparator;

import java.util.*;

public class ComparableDemo {

    public static void main(String[] args) {

        Laptop lap1 =  new Laptop("HP", 8, 500);
        Laptop lap2 =  new Laptop("Dell", 4, 450);
        Laptop lap3 =  new Laptop("Apple", 12, 1200);

        List<Laptop> list = Arrays.asList(lap1, lap2, lap3);

        // One way of using comparator
        /*Collections.sort(list, new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                if(o1.getRam() > o2.getRam())
                    return +1;
                else if (o1.getRam() < o2.getRam()) {
                    return -1;
                }
                return 0;
            }
        });*/
        // Other way of using comparator
        Collections.sort(list, (laptop1, laptop2) -> {
                if(laptop1.getRam() > laptop2.getRam())
                    return +1;
                else if (laptop1.getRam() < laptop2.getRam()) {
                    return -1;
                }
                return 0;
            });
        System.out.println(list);

    }
}

class Laptop /*implements Comparable<Laptop>*/ {
    private String brand;
    private Integer ram;
    private Integer price;

    public Laptop(String brand, Integer ram, Integer price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

   /* @Override
    public int compareTo(Laptop o) {
        if(this.getRam() > o.getRam())
            return 1;
        else if (this.getRam() < o.getRam()) {
            return -1;
        }
        return 0;
    }*/

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }
}


