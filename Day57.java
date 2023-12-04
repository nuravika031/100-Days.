package day57;

import java.util.Scanner;

public class Day57 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah nilai yang akan diinput: ");
        int jumlahInput = sc.nextInt();
        int[] nilai = new int[jumlahInput];

        for (int i = 0; i < jumlahInput; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
        System.out.println("Hasil deteksi genap atau ganjil:");
        for (int i = 0; i < jumlahInput; i++) {
            if (nilai[i] % 2 == 0) {
                System.out.println("Nilai ke-" + (i + 1) + ": Genap");
            } else {
                System.out.println("Nilai ke-" + (i + 1) + ": Ganjil");
            }
        }
        sc.close();
    }
}
