package com.cssl.oop.demo02;

import java.util.Scanner;

//学生类
public class Student {
    String[] names = new String[5];
    Scanner input = new Scanner(System.in);
    String name;

    //添加姓名
    public void addName() {
        for (int i = 0; i < names.length; i++) {
            System.out.print("输入客户姓名:");
            names[i] = input.next();
        }
    }

    //显示姓名
    public void showName() {
        System.out.println("*******************");
        System.out.println("   客户姓名列表:");
        System.out.println("*******************");
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                names[i] = name;
            }
            if (names[i] != null) {
                System.out.print(names[i] + "  ");
            }
        }
    }
    public void xiuGai(String name,String num){
        for (int i = 0; i <names.length ; i++) {
            if (names[i].equals(name)) {
                names[i] = num;
                System.out.println("找到并修改成功！");
            }
        }
    }
}
