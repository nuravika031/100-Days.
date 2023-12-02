package day55;

import java.util.Scanner;

public class Day55 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String lanjut;

        do {
            System.out.print("Masukkan sebuah angka: ");
            int batas = input.nextInt();
            int total = 0;

            for (int i = 1; i < batas; i += 2) {
                total += i;
            }

            System.out.println("menjumlahkan semua bilangan ganjil di bawah angka : " + batas + "\ntotal dari penjumlahannya :  " + total);
            System.out.println("======================================================");
            System.out.print("Lagi? (yes/no): ");
            lanjut = input.next().toLowerCase();
        } while (lanjut.equals("yes"));
    }
}
