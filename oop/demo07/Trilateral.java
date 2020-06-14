package com.cssl.oop.demo07;
//三角形类
public class Trilateral {
    public void prin(int row,String ch){
        for (int i=0;i<row;i++) {
            for (int j = 0; j < (i + 1); j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
