package com.cssl.oop.demo06;

//银行类  根据贷款金额和年限，计算出每月月供
//总利息 = 贷款金额*利率     月供=（贷款金额+总利息）/贷款年限
/* 3年   6.03%
   5年   6.12%
   20年  6.39%

 */
public class Yinghang {
    double yueGong;
    double liLv;
    int yea;

    //月供方法loan()
    public double loan(int jinE, int xuanZe) {
        switch (xuanZe) {
            case 1:
                yea = 36;
                liLv = 0.0603;
                break;
            case 2:
                yea = 60;
                liLv = 0.0612;
                break;
            case 3:
                yea = 240;
                liLv = 0.0639;
                break;
            default:
                System.out.println("输入错误！");
        }
        //总利息 = 贷款金额*利率     月供=（贷款金额+总利息）/贷款年限
        yueGong = (jinE+(jinE*liLv))/yea;
        return yueGong;
    }

}
