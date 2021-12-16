package com.proj;

import java.util.Arrays;

import static com.proj.FirstNonRepeatingLetter.firstNonRepeatingLetter;
import static com.proj.GetIntegersFromList.getIntegersFromList;
import static com.proj.Int32toIP.int32toIP;
import static com.proj.NextBigger.nextBigger;
import static com.proj.SumOfDigits.sumOfDigits;
import static com.proj.TargetSum.targetSum;


public class Main {

    public static void main(String[] args) {
        System.out.println("getIntegersFromList");
        System.out.println(getIntegersFromList(Arrays.asList(1,2,'a','b',"aasf",'1',"123",231)));
        System.out.println(getIntegersFromList(Arrays.asList(1,2,'a','b',0,15)));
        System.out.println(getIntegersFromList(Arrays.asList(1,2,'a','b')));

        System.out.println("firstNonRepeatingLetter");
        System.out.println(firstNonRepeatingLetter("aaaa aaaa"));
        System.out.println(firstNonRepeatingLetter("abaaa aaa aaa"));
        System.out.println(firstNonRepeatingLetter("qwevk;'eq;wmzvk"));
        System.out.println(firstNonRepeatingLetter("qq"));

        System.out.println("sumOfDigits");
        System.out.println(sumOfDigits(5));
        System.out.println(sumOfDigits(66));
        System.out.println(sumOfDigits(942));
        System.out.println(sumOfDigits(132189));
        System.out.println(sumOfDigits(493193));

        System.out.println("targetSum");
        System.out.println(targetSum(new int[]{1, 3, 6, 2, 2, 0, 4, 5}, 5));

        System.out.println("nextBigger");
        System.out.println(nextBigger(2017));
        System.out.println(nextBigger(99909991));

        System.out.println("int32toIP");
        System.out.println(int32toIP(2149583361L));
        System.out.println(int32toIP(32));

    }
}
