package day48;
import java.util.Scanner;
public class Day48 {
    public static void main(String[] args) {
        // Menampilkan item pada indeks tertentu
        Scanner a = new Scanner(System.in);
        int[] array = {10, 20, 30, 40, 50};
        System.out.print("input index Array : ");
        int tampilkanIndex = a.nextInt();
        if (tampilkanIndex >= 0 && tampilkanIndex < array.length) {
            System.out.println("Nilai pada index " + tampilkanIndex + ": " + array[tampilkanIndex]);
        } else {
            System.out.println("Indeks tidak valid");
        }
    }
}
