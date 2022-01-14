package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Mükemmel Sayı Nedir ?
        //Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
        
        Scanner input = new Scanner(System.in);
        System.out.print(" Sayi : ");
        int n = input.nextInt();
        int top = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                top += i;
            }
        }
        if (top == n) {
            System.out.print("Mükemmel sayı");
        } else
            System.out.print("Mükemmel Sayı Degil");

    }
}
