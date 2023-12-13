package day66;

import java.util.Scanner;

public class Day66 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah nilai: ");
        int jumlahNilai = input.nextInt();
        int[] nilai = new int[jumlahNilai];
        double rataRata = 0;
        System.out.println("Masukkan nilai-nilai: ");
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            rataRata += nilai[i];
        }
        rataRata /= jumlahNilai;

        System.out.println("Rata-rata nilai: " + rataRata);

        input.close();
    }
}
