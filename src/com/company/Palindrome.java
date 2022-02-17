package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
        }
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = in.nextLine(); //метод для ввода строки
        s=s.toLowerCase(); // делаем все большие буквы в исходной строке маленькими
        System.out.println(isPalindrome(s)); //вызов метода isPalindrome(s)
    }
    public static String reverseString(String s){
        String sr = "";
        for (int i = s.length() - 1; i >= 0; i--)
            sr=sr+s.charAt(i); // Добавление к строке символов
        return sr;
    }
    public static boolean isPalindrome(String s){
        String sr = reverseString(s); //вызов функции reverseString(s) для переворота строки
        return s.equals(sr);
    }
}
