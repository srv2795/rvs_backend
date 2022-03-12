package com.example.corejavademo.facatorypattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        // Instead of creating object with these implementation classes
        // we can get the object of these class from the factory class.
    /*    Laptop dellLaptop = new Dell();
        dellLaptop.specs();
        Laptop hplaptop = new Hp();
        hplaptop.specs();
        Laptop asusLaptop = new Asus();
        asusLaptop.specs();*/

        // creating the object of factory class and get the implementation class objects.
        LaptopObjFactory obj = new LaptopObjFactory();
        Laptop laptopObj1 = obj.getInstance(LaptopEnum.DELL.toString());
        laptopObj1.specs();
        Laptop laptopObj2 = obj.getInstance(LaptopEnum.HP.toString());
        laptopObj2.specs();
        Laptop laptopObj3 = obj.getInstance(LaptopEnum.ASUS.toString());
        laptopObj3.specs();

    }
}
