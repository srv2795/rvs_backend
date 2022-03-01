package com.example.array.facatorypattern;

public class LaptopObjFactory {
    Laptop obj = null;
    public LaptopObjFactory() {
    }
    public Laptop getInstance(String str) {
        try{
            if(str.equals("DELL")) {
                obj =  new Dell();
            } else if (str.equals("HP")) {
                obj = new Hp();
            } else if (str.equals("ASUS")) {
                obj =  new Asus();
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return obj;
    }
}
