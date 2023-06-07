package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,k;


        Scanner inp = new Scanner(System.in);

        System.out.print("4 ve 5 sayılarından hangisinin katlarını istersiniz :");
       k = inp.nextInt();
        System.out.print("Sayı sınırı giriniz :");
        n = inp.nextInt();
        if (k==4) {

            for (int i = 4; i < n; i *= 4){
                System.out.println(i);
            }
        } else if (k==5) {
            for (int i = 5; i < n; i *= 5){
                System.out.println(i);
            }

        }else {
            System.out.println("hatalı giriş");
        }

    }
}