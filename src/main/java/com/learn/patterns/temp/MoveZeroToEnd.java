package com.learn.patterns.temp;

public class MoveZeroToEnd {

    public static void main(String[] args) {
        int[][] lists = {
                {0, 1, 0, 2, 3},
                {0, 1, 0, 2, 3, 4, 0, 5},
                {1, 2, 3, 4, 0, 5, 0, 6},
                {1, 2, 3, 4}
        };
        for(int[] a: lists) {
            show(a);
            solve(a);
            show(a);
            System.out.println();
        }
    }
    public static void show(int[] a){
        for(int n: a)
            System.out.print(n + " ");
        System.out.println();
    }

    public static void solve(int[] a){
        for(int r = 0, l = 0; r != a.length; ++r){
            if(a[r] != 0 && a[l] == 0){
                a[l] = a[r];
                a[r] = 0;
            }
            if(a[l] != 0) ++l;

        }
    }

    public static void solve2(int[] a){
        int zeroCountSoFar = 0;
        for(int i = 0 ; i != a.length; ++i){
            if(a[i] != 0 && zeroCountSoFar > 0){
                a[i-zeroCountSoFar] = a[i];
                a[i] = 0;
            }else if(a[i] == 0){
                zeroCountSoFar += 1;
            }

        }
    }

    //working but not readable
    public static void solve3(int[] a){
        int l = 0, r = 0;
        while(l < a.length && r < a.length){
            while(l < a.length && r < a.length && (a[l] != 0 || a[r] == 0)){
                if(a[l] != 0) l++;
                if(a[r] == 0) r++;
            }
            if(l < a.length && r < a.length && l < r){
                a[l] = a[r];
                a[r] = 0;
            }else{
                l = r;
            }

            l++;
            r++;
        }
    }
}
