package day63;

import java.util.Arrays;

public class Day63 {

    public static void main(String[] args) {
        int[] nomor = {9, 6, 4, 10, 2, 5, 7, 3, 1, 8};
        String[] nama = {"Gita","Samia","Murni","Cia","Bila","Andre","Ibrahim","Fahmi","Lala","Dani"};
        for (int i = 0; i < 10; i++) {
            Arrays.sort(nomor);
            Arrays.sort(nama);
            System.out.println(nomor[i] + " " + nama[i]);
        }
    }
}
