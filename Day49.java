package day49;
import java.util.Scanner;
public class Day49 {
    public static void main(String[] args) {
        //program java Array yang menampilkan item dengan perulangan
        int[] arrayAngka = {1, 2, 3, 4, 5};

        System.out.println("Item-item array:");
        for (int i = 0; i < arrayAngka.length; i++) {
            System.out.println("Item ke-" + i + ": " + arrayAngka[i]);
        }
    }
}
