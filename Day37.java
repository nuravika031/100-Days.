package day37;

import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double jumlahBarang, totalHarga = 0;

        System.out.print("Masukkan jumlah barang: ");
        jumlahBarang = scanner.nextInt();

        for (double i = 1; i <= jumlahBarang; i++) {
            System.out.print("Masukkan harga barang ke-" + i + ": ");
            double hargaBarang = scanner.nextInt();
            totalHarga += hargaBarang;
        }

        System.out.println("Total pembelian: " + totalHarga);
    }
    
}
