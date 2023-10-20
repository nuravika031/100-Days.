package day12;
import java.util.Scanner;
public class Day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan harga laptop : ");
        int hargaLaptop = input.nextInt();
        String saran = (hargaLaptop < 5000000) ? " Silahkan Beli" : " Jangan beli! Duitmu tak cukup, silahkan menabung dulu.";
        System.out.println("Saran :" + saran );
    }
    
}
