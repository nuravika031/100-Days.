package day94;

import java.util.Scanner;

public class Day94 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama depan Anda: ");
        String namaDepan = sc.nextLine();
        System.out.print("Masukkan nama belakang Anda: ");
        String namaBelakang = sc.nextLine();
        String namaLengkap = namaDepan.concat(" ").concat(namaBelakang);
        System.out.println("Nama lengkap Anda: " + namaLengkap);

        System.out.print("Masukkan kalimat: ");
        String inputKalimat = sc.nextLine();
        if (inputKalimat.contains(namaDepan) || inputKalimat.contains(namaBelakang)) {
            System.out.println("Kalimat mengandung nama Anda.");
        } else {
            System.out.println("Kalimat tidak mengandung nama Anda.");
        }
    }
}
