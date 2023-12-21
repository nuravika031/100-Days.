package day74;

import java.util.Arrays;
import java.util.Scanner;

public class Day74 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Element: ");
        int ukuran = input.nextInt();
        int[] array = new int[ukuran];
        System.out.println("Masukan Nilai/Element: ");
        for (int j = 0; j < ukuran; j++) {
            array[j] = input.nextInt();
        }
        Arrays.sort(array);
        System.out.println("----Berhasil di urutkan---- ");
        for (int index : array) {
            System.out.println(index);
            }
        }
    }

