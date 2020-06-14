package com.cssl.oop.demo04;


import java.util.Scanner;

public class Text {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account account = new Account();
		boolean flas = true;

		do {
			account.xuanZe();
			System.out.print("请选择您需要办理的业务:");
			int as = input.nextInt();
			switch (as) {
			case 1:
				account.cunKuan();
				break;
			case 2:
				account.quKuan();
				break;
			case 0:
				System.out.println("谢谢使用！");
				flas = false;
				break;

			default:
				System.out.println("对不起，输入错误。请重新输入");
				break;
			}
		} while (flas);

	}

}
