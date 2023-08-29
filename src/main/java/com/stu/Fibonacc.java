package com.stu;

import org.junit.jupiter.api.Test;


public class Fibonacc {
    public int Test(int n){
        int a = 0;
        int b = 1;
        for(int i=0; i<n-1 ;i++){
            b= a+b;
            a=b-a;
        }
        return b;
    }

    @Test
    public void test2(){
        System.out.println(Test(8));
    }
}


