package com.cssl.oop.demo05;

//计算器类
/*
 * 根据用户选择运算符，进行运算并返回结果
 */
public class JiQuanQi {

	public void add(int num1, int num2) {
		System.out.println("运算结果为:" + (num1 + num2));

	}

	public void add(int num1, double num2) {
		System.out.println("运算结果为:" + (num1 + num2));

	}

	public void jian(int num1, int num2) {
		System.out.println("运算结果为:" + (num1 - num2));

	}

	public void jian(int num1, double num2) {
		System.out.println("运算结果为:"+ (num1 - num2));

	}

	public void chengFa(int num1, double num2) {
		System.out.println("运算结果为:" + (num1 * num2));

	}

	public void chengFa(int num1, int num2) {
		System.out.println("运算结果为:" + (num1 * num2));

	}
	
	public void chengFa(double num1,int num2){
		System.out.println("运算结果为:" + (num1 * num2));
	}

	public void chuFa(int num1, double num2) {
		System.out.println("运算结果为:" + (num1 / num2));
	}

	public void chuFa(int num1, int num2) {
		System.out.println("运算结果为:" + (num1 / num2));
	}
	public void chuFa(double num1, int num2) {
		System.out.println("运算结果为:" + (num1 / num2));
	}

}
