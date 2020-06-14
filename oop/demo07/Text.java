package com.cssl.oop.demo07;

import java.util.Scanner;
//三角形测试类
public class Text {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Trilateral tri = new Trilateral();
        System.out.print("请输入行高:");
        int row = input.nextInt();
        System.out.print("请输入要打印的字符:");
        String ch = input.next();
        tri.prin(row,ch);

    }
}
