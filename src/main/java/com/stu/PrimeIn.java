package com.stu;

import org.junit.jupiter.api.Test;

class PrimeIn{

    public static void PrimeIn(){

        for(int i=2; i<=100; i++){
            boolean flag = true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
            }

    }
    }
    @Test
    public void Test(){
        PrimeIn();
    }

}
