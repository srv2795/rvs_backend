package com.example.corejavademo.facatorypattern;

import com.example.corejavademo.facatorypattern.Asus;
import com.example.corejavademo.facatorypattern.Dell;
import com.example.corejavademo.facatorypattern.Hp;
import com.example.corejavademo.facatorypattern.Laptop;

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
