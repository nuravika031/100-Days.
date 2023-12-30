package day83;

import java.util.Arrays;
import java.util.Scanner;

public class Day83 {

    public static void main(String[] args) {
        int[] angka = {9,3,6,5,10,2,8};
        Arrays.sort(angka);

        double median;

        if (angka.length % 2 == 0) {
            int tengah1 = angka[angka.length / 2 - 1];
            int tengah2 = angka[angka.length / 2];
            median = (double) (tengah1 + tengah2) / 2;
        } else {
            median = angka[angka.length / 2];
        }

        System.out.println("Nilai tengah (median): " + median);
    }
}
