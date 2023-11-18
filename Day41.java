package day41;

import java.util.Scanner;

public class Day41 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas angka : ");
        int batas = input.nextInt();

        for (int i = 1; i <= batas; i++) {
            if (i % 2 == 1) {
                System.out.println(i + " Bilangan ganjil");
            } else {
                System.out.println(i + " Bilangan genap");
            }
        }
    }
}
