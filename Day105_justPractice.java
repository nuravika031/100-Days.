package day105_justpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Day105_justPractice {
//add( ), get( ), set( ), size( ), indexOf( ), isEmpty( ), remove( ), toArray( ), contains( ), sort( )

    public static void main(String[] args) {
        // Membuat ArrayList
        ArrayList<String> buah = new ArrayList<>();

        // Menambahkan elemen ke ArrayList menggunakan add()
        buah.add("Apel");
        buah.add("Pisang");
        buah.add("Cherry");
        buah.add("Durian");

        // Menampilkan elemen menggunakan get()
        System.out.println("Elemen pada index 2: " + buah.get(2));

        // Mengubah elemen pada indeks 1 menggunakan set()
        buah.set(1, "Belimbing");
        System.out.println("Elemen setelah diubah: " + buah);

        // Menampilkan jumlah elemen menggunakan size()
        System.out.println("Jumlah elemen dalam ArrayList: " + buah.size());

        // Menampilkan indeks dari elemen menggunakan indexOf()
        System.out.println("Index pada Belimbing: " + buah.indexOf("Belimbing"));

        // Menampilkan apakah ArrayList kosong menggunakan isEmpty()
        System.out.println("Apakah ArrayList kosong? " + buah.isEmpty());

        // Menghapus elemen pada indeks 3 menggunakan remove()
        buah.remove(3);

        // Menampilkan ArrayList setelah penghapusan
        System.out.println("ArrayList setelah dihapus: " + buah);

        // Mengonversi ArrayList ke array menggunakan toArray()
        String[] array = buah.toArray(new String[0]);

        // Menampilkan apakah ArrayList berisi elemen tertentu menggunakan contains()
        System.out.println("Apakah dalam ArrayList ada buah Belimbing? " + buah.contains("Belimbing"));

        // Mengurutkan elemen-elemen menggunakan Collections.sort()
        Collections.sort(buah);
        System.out.println("ArrayList setelah diurutkan: " + buah);
    }
}
