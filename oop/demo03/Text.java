package com.cssl.oop.demo03;

public class Text {
    public static void main(String[] args) {
        Customer[] cuss = new Customer[2];
        CustomerBiz as = new CustomerBiz();
        as.addName(cuss);
        as.showInfo(cuss);
    }
}
