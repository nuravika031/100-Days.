package day64;

import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("pilihan elemen :");
        int pilih = sc.nextInt();

        System.out.print("indeks : ");
        int indeks = -1;

        int nilai[] = {1, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < nilai.length; i++) {
            if (pilih == nilai[i]) {
                indeks = i;
            }
        }
        System.out.println(indeks);
    }
    
}
