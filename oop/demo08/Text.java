package com.cssl.oop.demo08;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        San san = new San();
        String xuanZe = " ";
        do {
            System.out.print("请输入第一条边:");
            int a = input.nextInt();
            System.out.print("请输入第二条边:");
            int b = input.nextInt();
            System.out.print("请输入第三条边:");
            int c = input.nextInt();

            boolean as = san.isTriangle(a, b, c);
            if (as == true) {
                String sanj = san.shape(a, b, c);
                System.out.println(sanj);
            } else {
                System.out.println("这不能构成三角形!");
            }
            System.out.print("继续吗（y/n）:");
            xuanZe = input.next();
        } while ("y".equals(xuanZe));
        System.out.println("谢谢使用！");

    }
}
