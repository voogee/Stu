package com.stu;

import org.junit.jupiter.api.Test;

public class Sort {
    @Test
    public  void Sort(){

        int[] arr = {18,13,50,15,4,17};
        int temp = 0;
        for(int i = 0; i < arr.length-1; i++){
            for(int j=0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int value : arr) {
            System.out.println(value);
        }

    }

}
