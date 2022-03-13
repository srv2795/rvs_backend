package com.example.corejavademo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(null);
        list.add(4);
        list.add(5);

        Optional<Integer> b =  Optional.ofNullable(null);     // this will not give NullPointerException
        b.ifPresent(y -> System.out.println("value is present : "+ y));
        System.out.println("value" + b);
        b.ifPresentOrElse(z -> System.out.println("value of z : "+ z), () -> System.out.println("not prsent"));
        System.out.println("------------------------------------------------------------------");
        Optional<Integer> a =  Optional.of(null);     // this will give NullPointerException
        System.out.println("value" + a);

    }
}
