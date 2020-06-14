package com.cssl.oop.demo03;

//业务类
public class Customer {
    //属性\
    String name;
    int age;
    boolean ka;

    public Customer(String name, int age, boolean ka) {
        this.name = name;
        this.age = age;
        this.ka = ka;

    }

    public void showInfo() {
        System.out.println("客户信息:");
        System.out.print(name + "  " + age + "  " + ka + "\n");
    }
}
