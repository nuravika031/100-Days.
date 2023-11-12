package day35;

import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi disini : ");
        int sisi = input.nextInt();
        int luasPersegi = sisi * sisi;
        int kelilingPersegi = 4 * sisi;

        System.out.println("Luasnya adalah = "+ luasPersegi);
        System.out.println("Keliling adalah = "+ kelilingPersegi);

        input.close();
    }
    
}
