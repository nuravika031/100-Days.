package day54;

import java.util.Scanner;

public class Day54 {

    public static void main(String[] args) {
       //Pencarian Nama dalam Daftar Menggunakan Array
        Scanner input = new Scanner(System.in);

        String[] name = {"Nurul", "Cinta", "Astiara", "Masda", "Mirna"};

        System.out.println("Daftar Nama:");
        for (String namaSeseorang : name) {
            System.out.println(namaSeseorang);
        }
        System.out.print("Masukkan nama yang ingin Anda cari: ");
        String namaCari = input.nextLine();
        boolean ditemukan = false;

        for (String namaSeseorang : name) {
            if (namaSeseorang.equals(namaCari)) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println(namaCari + " ditemukan dalam daftar nama.");
        } else {
            System.out.println(namaCari + " tidak ditemukan dalam daftar nama.");
        }
    }
}
