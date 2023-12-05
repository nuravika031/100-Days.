package day58;

import java.util.Arrays;
import java.util.Scanner;

public class Day58 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] data = new int[2][2];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Masukkan angka ke-" + i + " " + j + " : ");
                data[i][j] = sc.nextInt();
            }
        }

        System.out.println("Cara 1: Menggunakan for loop");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Cara 2: Menggunakan Arrays.deepToString untuk seluruh array");
        System.out.println(Arrays.deepToString(data));

        System.out.println("Cara 3: Menggunakan for-each loop");
        for (int[] baris : data) {
            for (int nilai : baris) {
                System.out.print(nilai + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

