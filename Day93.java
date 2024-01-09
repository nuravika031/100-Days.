package day93;

import java.util.Scanner;

public class Day93 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah kata atau kalimat: ");
        String Masukkan = input.nextLine();
        String hurufKecil = Masukkan.toLowerCase();
        String hurufBesar = Masukkan.toUpperCase();
        System.out.println("Teks asli: " + Masukkan);
        System.out.println("Teks setelah diubah menjadi huruf kecil: " + hurufKecil);
        System.out.println("Teks setelah diubah menjadi huruf besar: " + hurufBesar);
    }
}
