package day62;

import java.util.Scanner;

public class Day62 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mahasiswa[][] = new String[5][3];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.print("Masukkan Nama   : ");
                } else if (j == 1) {
                    System.out.print("Masukkan NIM    : ");
                } else {
                    System.out.print("Masukkan Nilai  : ");
                }

                mahasiswa[i][j] = input.next();
            }
            System.out.println("--------------------");
        }

        System.out.println("=======CETAK DATA=======");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }
}
