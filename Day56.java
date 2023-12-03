package day56;

import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("masukan bilangan : ");
        int jml = input.nextInt();
        int[] angka = new int [jml];
        int i;
        for(i = 0; i<angka.length; i++){
            System.out.print("masukan angka "+(i+1)+" : ");
        angka[i]= input.nextInt();
        }
        System.out.println("===================");
        System.out.println(" menjumlahkan semua angka ");
        int total=0;
        for(i= 0; i<angka.length; i++){
        System.out.print(angka[i]);
        total += angka[i];

            if (i <angka[i]){
            System.out.print("+");
        }
        }
        System.out.println("="+total);
    }
    
}
