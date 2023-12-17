package day70;

import java.util.Arrays;
import java.util.Scanner;

public class Day70 {

    public static void main(String[] args) {
        String output;

        char[] arrayKarakter = {'x', 'a', 'n', 'f', 't', 'c', 'ɗ', 'b'};
        System.out.println("Huruf yang belum diurutkan: ");
        for (char urutanHuruf : arrayKarakter) {
            output = "" + urutanHuruf;
            System.out.print(output);
        }
        Arrays.sort(arrayKarakter);
        System.out.println("\nHuruf yang sudah diurutkan: ");
        for (char urutanHuruf : arrayKarakter) {
            output = "" + urutanHuruf;
            System.out.print(output);
        }
    }
}


