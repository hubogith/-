package com.cssl.oop.demo03;

import java.util.Scanner;

public class CustomerBiz {
    public void addName(Customer[] cuss) {
        Customer cus = new Customer("王一", 30, false);
        cuss[0] = cus;
        Customer cus1 = new Customer("郝强", 19, true);
        cuss[1] = cus1;
    }

    public void showInfo(Customer[] cuss) {
        for (Customer cu : cuss) {
            cu.showInfo();
        }
    }


}
