package day43;

import java.util.Scanner;

public class Day43 {

    public static void main(String[] args) {
        /*Program perulangan dalam do-while. Menginput nilai, Jika bilangan ganjil maka menampilkan "ini bilangan ganjil",
        jika bilangan genap maka akan dikalikan dengan 10 */

        Scanner sc = new Scanner(System.in);
        int nilai;

        do {
            System.out.print("Masukkan nilai: ");
            nilai = sc.nextInt();
            if (nilai % 2 != 0) {
                System.out.println("ini bilangan ganjil ");
            } else {
                System.out.println("Bilangan genap Jadi akan dikalikan dgn 10 = ");
            }

        } while (nilai % 2 != 0);
        System.out.print(nilai + " * 10 = " + (nilai * 10));

        System.out.println();
    }
}
