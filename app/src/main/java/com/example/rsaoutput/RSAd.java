package com.example.rsaoutput;

public class RSAd {
    public static int calculated(int e, int phin,StringBuilder str){
        int d = Euclid.RunEuclid(e,phin,str);
        while (d<0){
            d = d +phin;
        }
        return d;
    }
}
