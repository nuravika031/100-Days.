package day96;

import java.util.Scanner;

public class Day96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan judul buku: ");
        String judulBuku = sc.nextLine();

        System.out.print("Masukkan penulis buku: ");
        String penulisBuku = sc.nextLine();

        System.out.print("Masukkan tahun terbit buku: ");
        int tahunTerbit = sc.nextInt();

        String informasiFormat = String.format("Buku: %s, Penulis: %s, Tahun Terbit: %d",
                judulBuku, penulisBuku, tahunTerbit);

        System.out.println("Informasi Buku yang Diformat:\n" + informasiFormat);
    }  
}
