package com.proj;

public class SumOfDigits {
    static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0)
        {
            sum = sum + num % 10;
            num /= 10;
        }
        if (sum>9) return sumOfDigits(sum);
        return sum;
    }
}
