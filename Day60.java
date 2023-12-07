package day60;

import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int jumlahBaris = sc.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int jumlahKolom = sc.nextInt();
        
        int[][] matrix = new int[jumlahBaris][jumlahKolom];
        
        System.out.println("Masukkan elemen matriks:");
        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                System.out.print("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Nilai dalam matriks:");
        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
