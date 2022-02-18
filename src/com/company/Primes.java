package com.company;

import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt(); //ввожу число до которого нужно считать простые числа
        for (int i = 2; i <= num; i++){
            int n=i;
            if (isPrime(n))
                System.out.println(i);
        }
    }
    public static boolean isPrime(int n){
        for (int j = 2; j < n; j++){
            if (n % j == 0)
                return false;
        }
        return true;
    }
}
