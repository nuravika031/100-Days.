package day104_justpractice;

import java.util.ArrayList;
import java.util.Vector;

public class Day104_justPractice {

    public static void main(String[] args) {
        // Menggunakan ArrayList
        ArrayList<Mahasiswa> arrayList = new ArrayList<>();
        arrayList.add(new Mahasiswa("Nur Avika", 18));
        System.out.println("Data Mahasiswa dari ArrayList:");
        for (Mahasiswa mahasiswa : arrayList) {
            System.out.println("Nama\t: " + mahasiswa.getNama() + "\nUsia\t: " + mahasiswa.getUsia());
        }
        System.out.println();

        // Menggunakan Vector
        Vector<Mahasiswa> vector = new Vector<>();
        vector.add(new Mahasiswa("Astiara", 19));
        System.out.println("Data Mahasiswa dari Vector:");
        for (Mahasiswa data : vector) {
            System.out.println("Nama\t: " + data.getNama() + "\nUsia\t: " + data.getUsia());
        }
    }
}

class Mahasiswa {

    private String nama;
    private int usia;

    public Mahasiswa(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }
}
