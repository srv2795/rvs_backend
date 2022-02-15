package com.example.corejavademo;

public class SingletonDemo {
    public static void main(String[] args) {
        Test22 t1 = Test22.getInstance();
        Test22 t2 = t1;
        Test22 t3 = Test22.getInstance();
        System.out.println("first object : "+  t1);
        System.out.println("Second object : "+  t2);
        System.out.println("Third object : "+  t3);

    }
}

class Test22 {
    private static Test22 test22 = null;
    private Test22() {}

    public static Test22 getInstance() {
        if(null != test22) {
            return test22;
        } else {
            test22 = new Test22();
        }
        return test22;
    }

}