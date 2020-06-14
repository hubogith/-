package com.cssl.oop.demo08;

//判断是什么三角形
public class San {
    boolean flas = false;

    public boolean isTriangle(int a, int b, int c) {
        boolean as = ((a+b)>c && (a+c)>b && (b+c)>a);
        if (as==true) {
           flas = true;
        }
        return flas;
    }

    public String shape(int a, int b, int c) {
        //直角三角形
        String sanJiaoXing = " ";
       if (flas ==true){
           if (((a * a) + (b * b) == (c * c)) || ((a * a) + (c * c) == (b * b)) || ((b * b) + (c * c) == (a * a))) {
               sanJiaoXing = "构成直角三角形";
           } else if (((a * a) + (b * b) > (c * c)) || ((a * a) + (c * c) > (b * b)) || ((b * b) + (c * c) > (a * a))) {
               sanJiaoXing = "构成钝角三角形";
           } else {
               sanJiaoXing = "构成锐角三角形";
           }
       }
        return sanJiaoXing;
    }
}
