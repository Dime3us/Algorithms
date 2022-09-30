package Homework8;

import java.util.Date;

public class Fibonacci {

    public static void main(String[] args) {

        int n = 46;
//        System.out.println("Recursion = " + rec(n));
        int[] arr = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            arr[i] = -1;
        }
//        System.out.println("Memoization = " + fibonacciDPMemo(n, arr));
//        System.out.println("Tabulation = " + fibonacciDPTab(n));
        long a = new Date().getTime();
        System.out.println(rec(46));                                                     // !!! max 46 element with int, from 47 -int !!!
        long b = new Date().getTime();
        System.out.println("Время выполнения программы recur " + (b - a) + " ms");       //  6458 ms width 46 element
//        long c = new Date().getTime();
//        System.out.println(fibonacciDPTab(46));
//        long d = new Date().getTime();
//        System.out.println("Время выполнения программы tabulation " + (d - c) + " ms");  //  1 ms width 46 element
        long e = new Date().getTime();
        System.out.println(fibonacciDPMemo(n, arr));
        long f = new Date().getTime();
        System.out.println("Время выполнения программы memoization " + (f - e) + " ms");   //  0 ms width 46 element
    }

    private static int rec(int n) {
        if (n < 2) {
            return n;
        }
        return rec(n - 1) + rec(n - 2);
    }

    private static int fibonacciDPMemo(int n, int arr[]) {
        if (n < 2) {
            return n;
        }
        if (arr[n] != -1) {
            return arr[n];
        }
        arr[n] = fibonacciDPMemo(n - 1, arr) + fibonacciDPMemo(n - 2, arr);
        return arr[n];
    }

    private static int fibonacciDPTab(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            if (i == n) {
                return arr[n];
            }
        }
        return -1;
    }
}