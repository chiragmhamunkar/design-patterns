package com.learn.patterns.temp;

import java.util.Arrays;

public class NextGreatestNumber {
    public static void main(String[] args) {
        nextGreatestNumber(new int[]{1, 2, 3});
        String ans = "a/b/c";
        ans.split("/");
    }

    public static int[] nextGreatestNumber(int[] numberArr){
        int[] freq = new int[10];
        int i;
        for(i = numberArr.length-1; i > 0; --i){
            freq[numberArr[i]] += 1;
            if(numberArr[i-1] < numberArr[i]){
                i -= 1;
                break;
            }
        }
        if(i == -1) return null;
        //for


        int[] ans = new int[numberArr.length];
        int j;
        for(j = 0; j != i; ++j) ans[j] = numberArr[j];
        ans[j] = numberArr[i];

        return null;
    }
}
