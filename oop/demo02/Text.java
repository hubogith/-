package com.cssl.oop.demo02;

import java.util.Scanner;

//测试类
public class Text {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student stu = new Student();
        stu.addName();
        System.out.print("请输入要修改的客户姓名：");
        String name = input.next();
        System.out.print("请输入新的客户姓名:");
        String num = input.next();

        stu.xiuGai(name,num);
        stu.showName();
    }
}
