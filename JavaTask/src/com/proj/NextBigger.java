package com.proj;

public class NextBigger {
    public static int nextBigger(int num){
        char[] arr = Integer.toString(num).toCharArray();
        if (arr.length<2) return -1;
        int max = Integer.MAX_VALUE;
        char tmp;
        String s="";
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                for (char c : arr) s += c;
                if (Integer.parseInt(s) > num && Integer.parseInt(s)<max) max = Integer.parseInt(s);
                arr = Integer.toString(num).toCharArray();
                s = "";
            }
        }
        if (max<= num || max == Integer.MAX_VALUE)return -1;
        return max;
    }
}
