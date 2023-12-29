package day82;

import java.util.Scanner;

public class Day82 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai yang ingin dihitung kemunculannya: ");
        int[] nilai = {9, 4, 6, 3, 8, 6, 9, 4, 6, 5, 2, 1, 9, 8, 6, 3, 7, 5, 3, 0, 2, 4, 6, 9, 7, 4, 7, 2, 5};
        int angka = sc.nextInt();

        int bilangan = 0;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == angka) {
                bilangan++;
            }
        }
        System.out.println("Jumlah kemunculan nilai " + angka + " dalam array: " + bilangan);
    }

}
