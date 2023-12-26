package day79;

import java.util.Scanner;

public class Day79 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai yang ingin dicek: ");
        int nilaiDicari = scanner.nextInt();
        int[] nilai = {9, 5, 8, 3, 4, 7};

        boolean ditemukan = false;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == nilaiDicari) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("Nilai " + nilaiDicari + " ditemukan dalam array.");
        } else {
            System.out.println("Nilai " + nilaiDicari + " tidak ditemukan dalam array.");
        }

    }
}
