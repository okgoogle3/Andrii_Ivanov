package com.proj;

public class FirstNonRepeatingLetter {
    public static char firstNonRepeatingLetter(String str){
        char[] arr = str.toCharArray();
        int tmp;
        for (int i = 0; i < arr.length; i++){
            tmp=0;
            for(int j = 0; j < arr.length; j++){
                if (arr[i]==arr[j] && i!=j) tmp++;
            }
            if (tmp==0 && arr[i]!=' ') return arr[i];
            else if(tmp==0) {
                System.out.print("Next symbol is 'Space' ->");
                return arr[i];
            }
        }
        throw new UnsupportedOperationException("None");
    }
}
