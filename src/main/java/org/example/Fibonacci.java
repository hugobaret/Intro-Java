package org.example;

import static java.lang.Integer.parseInt;

public class Fibonacci {
    public void iterativeFibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }

    public int recursiveFibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = parseInt(args[0]);
        Fibonacci fibonacci = new Fibonacci();
        System.out.printf("Suite de Fibonacci de %d:\n", n);
        fibonacci.iterativeFibonacci(n);
        System.out.println(fibonacci.recursiveFibonacci(n));
    }
}
