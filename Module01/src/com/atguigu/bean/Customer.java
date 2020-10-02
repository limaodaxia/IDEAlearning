package com.atguigu.bean;


import java.util.ArrayList;

public class Customer {
    public static final int INITIAL_SIZE = 10;
    private int a;



    private int b;
    private int t;


    public static void main(String[] args) {
        System.out.println("Hello, world");
        System.out.println("Hello, world");
        ArrayList<Integer> a = new ArrayList<>();
        a.add(0, 123);
        int p = a.get(1);
        System.out.println(p);
        get();
    }

    public int getA() {
        t = 10;
        return a;

    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void get() {

    }

    @Override
    public String toString() { return "Customer{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
    public void eat(){
    get();
    }

}