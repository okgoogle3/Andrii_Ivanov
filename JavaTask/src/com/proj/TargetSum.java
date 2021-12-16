package com.proj;

public class TargetSum {
    public static int targetSum(int[] arr, int target){
        int sum = 0;
        for (int i = 0; i < arr.length-1; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i]+arr[j] == target) sum++;
            }
        }
        return sum;
    }
}
