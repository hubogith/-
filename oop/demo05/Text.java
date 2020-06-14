package com.cssl.oop.demo05;

import java.util.Scanner;

public class Text {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		JiQuanQi jiquan = new JiQuanQi();
		System.out.print("请选择运算:1.加法2.减法3.乘法4.除法:");
		int as = input.nextInt();
		System.out.print("请输入第一个数:");
		int num1 = input.nextInt();
		System.out.print("请输入第二个数:");
		int num2 = input.nextInt();
		
		
		switch (as) {
		case 1:
			jiquan.add(num1, num2);
			break;
		case 2:
			jiquan.jian(num1, num2);
			break;
		case 3:
			jiquan.chengFa(num1, num2);
			break;
		case 4:
			jiquan.chuFa(num1, num2);
			break;

		}

	}

}
