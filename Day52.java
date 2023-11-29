package day52;

import java.util.Scanner;

public class Day52 {

    public static void main(String[] args) {
        //menampilkan hasi & rata-rata sebuah angka menggunakan array
        int[] angka = new int[5];
        
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < angka.length) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = scanner.nextInt();
            i++;
        }

        System.out.println("\nIsi array:");
        i = 0;
        while (i < angka.length) {
            System.out.println("Angka ke-" + (i + 1) + ": " + angka[i]);
            i++;
        }

        int jumlah = 0;
        i = 0;
        while (i < angka.length) {
            jumlah += angka[i];
            i++;
        }

        System.out.println("\nJumlah semua angka dalam array: " + jumlah);

        double rata = (double) jumlah / angka.length;
        System.out.println("Rata-rata angka dalam array: " + rata);

        scanner.close();
    }
}
