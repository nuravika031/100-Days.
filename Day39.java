package day39;

import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean logout = false;

        do {
            System.out.println("Apakah Anda ingin logout? (ya/tidak): ");
            String jawaban = input.next();

            if (jawaban.equalsIgnoreCase("ya")) {
                System.out.println("Anda berhasil logout.");
                logout = true;
            } else if (jawaban.equalsIgnoreCase("tidak")) {
                System.out.println("Anda tidak logout. Program akan tetap berjalan.");
            } else {
                System.out.println("Pilihan tidak valid. Silakan masukkan 'ya' atau 'tidak'.");
            }

        } while (!logout);

        input.close();
    }
}

