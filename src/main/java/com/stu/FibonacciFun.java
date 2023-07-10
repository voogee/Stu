package com.stu;

import org.junit.jupiter.api.Test;

//斐波拉契数列0,1,1,2,3,5,8
public class FibonacciFun {

    public void Fibonacci(int[] arr,int n){
        int a = arr[0];
        int b = arr[1];
        for(int i=0; i<n ;i++){
            b= a+b;
            a=b-a;
            System.out.println(b);
        }
    }
    @Test
    public void  Test() {
        int[] arr = {0, 1};
        Fibonacci(arr,10);
    }

}
