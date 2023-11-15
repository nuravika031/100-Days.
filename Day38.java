package day38;
import java.util.Scanner;
public class Day38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Masukkan skor: ");
            int skor = scanner.nextInt();

            if (skor >= 0 && skor <= 100) {
                if (skor >= 60) {
                    System.out.println("Selamat! Anda lulus.");
                } else {
                    System.out.println("Maaf, Anda belum lulus. Silakan coba lagi.");
                }
            } else {
                System.out.println("Skor tidak valid. Skor harus berada di antara 0 dan 100.");
            }

            System.out.print("Ingin memasukkan skor lagi? (ya/tidak): ");
            String jawaban = scanner.next();

            if (jawaban.equalsIgnoreCase("tidak")) {
                System.out.println("Program selesai. Sampai jumpa!");
                break;
            }
        }

        scanner.close();
    }
}


