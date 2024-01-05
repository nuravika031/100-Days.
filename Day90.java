package day90;

import java.util.Scanner;

public class Day90 {

    static int hitungJumlahDigit(long angka) {
        angka = Math.abs(angka);
        String angkaString = Long.toString(angka);
        return angkaString.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        long angka = scanner.nextLong();
        int jumlahDigit = hitungJumlahDigit(angka);
        System.out.println("Jumlah digit dari " + angka + " adalah: " + jumlahDigit);
        scanner.close();
    }
}
