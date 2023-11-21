package day44;

import java.util.Scanner;

public class Day44 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = a.nextInt();

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 0; j <= tinggi - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
