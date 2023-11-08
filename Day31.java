package day31;
import java.util.Scanner;
public class Day31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan sebuah angka : ");
        int angka = input.nextInt();
        System.out.println("Masukkan pangkatnya : ");
        int pangkat = input.nextInt();
        int hasil = 1;
        for (int i = 1; i <= pangkat; i++){
            hasil *=angka;
        }
        System.out.println(angka + " Pangkat " + pangkat + " adalah " + hasil);
    }
    
}
