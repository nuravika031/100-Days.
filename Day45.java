package day45;

import java.util.Scanner;

public class Day45 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah nilai yang akan dihitung: ");
        int jumlahNilai = scanner.nextInt();
        int totalNilai = 0;

        for (int i = 1; i <= jumlahNilai; i++) {
            System.out.print("Masukkan nilai ke-" + i + ": ");
            int nilai = scanner.nextInt();
            totalNilai += nilai;
        }
        double rataRata = totalNilai / jumlahNilai;
        System.out.println("Total nilai: " + totalNilai);
        System.out.println("Rata-rata nilai: " + rataRata);

        scanner.close();
    }
}
