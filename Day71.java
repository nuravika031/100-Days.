package day71;

import java.util.Scanner;

public class Day71 {

    public static void main(String[] args) {
        int angka, hitungPositif = 0, hitungNegatif = 0, hitungNol = 0;
        int array[] = new int[50];
        Scanner input = new Scanner(System.in);
        System.out.print("Berapa banyak angka yang ingin dimasukan ? : ");
        angka = input.nextInt();
        System.out.println("Masukan " + angka + " Angka :");
        for (int i = 0; i < angka; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < angka; i++) {
            if (array[i] > 0) {
                hitungPositif++;
            } else if (array[i] < 0) {
                hitungNegatif++;
            } else {
                hitungNol++;
            }
        }
        System.out.println(hitungPositif + " : Angka Positif ");
        System.out.println(hitungNegatif + " : Angka Negatif ");
        System.out.println(hitungNol + " : Angka Nol ");
    }
}
