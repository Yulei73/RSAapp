package com.example.rsaoutput;

public class Euclid {
    public static int x,y,tempx;

    public static int RunEuclid(int a, int b,StringBuilder str){
        if (b==0){
            x=1;
            y=0;
            return(x);
        }
        tempx=RunEuclid(b,a%b,str);
        x=y;
        y=tempx-(a/b)*y;
        str.append(a).append("*").append(x).append("+").append(b).append("*").append(y).append("=gcd(").append(a).append(",").append(b).append(")\n");
        return(x);
    }

}
