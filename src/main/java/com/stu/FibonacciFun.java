package com.stu;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

//斐波拉契数列0,1,1,2,3,5,8
public class FibonacciFun {

    public ArrayList<Integer> Fibonacci(ArrayList<Integer> arr, int n){
        int a = arr.get(0);
        int b = arr.get(1);
        for(int i=0; i<n ;i++){
            b= a+b;
            a=b-a;
            arr.add(b);
        }
        return arr;
    }
    @Test
    public void  Test() {
        ArrayList<Integer> list= new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        ArrayList<Integer> newlist = Fibonacci(list,10);
        System.out.println(newlist);
    }

}
