package com.stu;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class PrimeIn{

    public static ArrayList<Integer> PrimeIn(){
        ArrayList<Integer> list= new ArrayList<Integer>();
        for(int i=2; i<=100; i++){
            boolean flag = true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                list.add(i);

            }

    }
        return list;
    }
    @Test
    public void Test(){
        ArrayList<Integer> result = PrimeIn();
        System.out.println(result);
    }

}
