package day42;

import java.util.Scanner;

public class Day42 {

    public static void main(String[] args) {
     //Menampilkan Angka Genap dengan menginput Angka Awal dan Akhir
        Scanner i = new Scanner(System.in);
        System.out.print("Angka awal  : ");
        int a = i.nextInt();
        System.out.print("Angka akhir : ");
        int b = i.nextInt();
        for (int j = a; j <= b; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
    }
}
