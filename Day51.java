package day51;

import java.util.Arrays;

public class Day51 {

    public static void main(String[] args) {
        //Program yang menggunakan kelas Arrays untuk melakukan pengurutan (sorting) array
        int[] angka = {14, 21, 7, 33, 5};
        Arrays.sort(angka);
        System.out.print("Angka Array setelah diurutkan: ");
        for (int nilai : angka) {
            System.out.print(nilai + " ");         
        }
    }
}
