package com.example.designpattern.builder;

public class Shop {
    public static void main(String[] args) {
        //Without builder design pattern this sequence of parameter matters.
        Phone phone = new Phone("Samsung", 3, "Mediatek", 5.5F);

        //With builder design pattern order not need to be maintained.
        Phone p1 = new PhoneBuilder().setOs("Octa core").setRam(4).getPhone();
        System.out.println("P1 :" + p1);
        Phone p2 = new PhoneBuilder().setScreenSize(4.5F).setOs("Samsung").getPhone();
        System.out.println("P2 : "+ p2);
    }
}
