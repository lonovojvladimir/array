package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {


    static final int[] A = {1, 60, 23, 30, 21, 90, 17, 3, 77, 40, 31};
    static final int N = 61;

    static int countPairs(int[] a, int n) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(n - a[i])) {
                result++;
            }
            map.put(a[i], i);
        }
//        System.out.println(map);
        return result;
    }
    //        for(int i = 0; i<a.length; i++){
//            for(int j = i+1; j<a.length; j++){
//                if(a[i]>=0 && a[j]>=0 && a[i] + a[j] == n) {
//
//                    result = result + 1;
//
//                    a[i]=-1;
//                    a[j]=-1;
//
//                }
//            }
//        }
//        return result;
//    }
//
//
    public static void main(String[] args) {
        System.out.println( countPairs(A, N) );
    }
}