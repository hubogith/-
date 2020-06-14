package com.cssl.oop.demo04;
//银行类
import java.util.Scanner;
public class Account {
	Scanner input = new Scanner(System.in);
	// 属性
	int cun;
	int qu;
	double sum;

	// 选择方法
	public void xuanZe() {
		System.out.println("1.存款2.取款0.退出");
	}

	// ����
	public void cunKuan() {
		System.out.print("请输入存款金额:");
		cun = input.nextInt();

		if (cun > 0) {
			System.out.println("存款成功！");
			sum = sum + cun;
			System.out.println("***当前余额为:" + sum + "元***");
		}

	}

	// 取款方法
	public void quKuan() {
		System.out.print("请输入存款金额:");
		qu = input.nextInt();
		if (qu < sum) {
			System.out.println("取款成功！");
			sum = sum - qu;
			System.out.println("***当前余额为:" + sum + "元***");
		} else {
			System.out.println("余额不够，请重新选择");
		}

	}

}
