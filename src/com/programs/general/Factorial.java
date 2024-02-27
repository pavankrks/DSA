package com.programs.general;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Hello buddy");
        Scanner scan =  new Scanner(System.in);
        int n = scan.nextInt();
        int res = 1;
        for(int i = 1;i<=n;i++){
            res = res * n--;
        }

        System.out.println(res);
    }
}
