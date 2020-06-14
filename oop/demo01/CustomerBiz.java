package com.cssl.oop.demo01;
import java.util.Scanner;
/*
业务类：CustomerBiz,循环实现客户姓名的添加和显示
 */
public class CustomerBiz {
    String[] names = new String[30];
    Scanner input = new Scanner(System.in);
    //属性
    String name;

    //显示姓名方法showName（）
    public void showName() {
        System.out.println("   客户姓名列表:");
        System.out.println("*******************");

        for (int i = 0; i <names.length; i++) {
            if (names[i] == null) {
                names[i]=name;
            }
            if (names[i] != null) {
                System.out.print(names[i] + "  ");
            }

        }
    }

    //添加姓名方法
    public void addName() {
        int num = 0;
        String xuanZe = " ";
        do {
            System.out.print("输入客户姓名:");
            names[num] = input.next();
            System.out.print("是否继续（y/n）:");
            xuanZe = input.next();
            num = num+1;
        } while ("y".equals(xuanZe));
        System.out.println("*******************");
    }
}
