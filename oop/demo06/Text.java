package com.cssl.oop.demo06;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Yinghang yinghang = new Yinghang();
        System.out.print("请输入贷款金额:");
        int jinE = input.nextInt();
        System.out.print("请选择贷款年限: 1.3年（36个月） 2.5年（60个月） 3.20(240个月):");
        int xuanZe = input.nextInt();
        double yueGong = yinghang.loan(jinE,xuanZe);
        System.out.println("*****月供为:"+yueGong);
    }
}
