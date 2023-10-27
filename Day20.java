package day20;

import java.util.Scanner;

public class Day20 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Gaji Bulanan Anda!");
        double gaji = input.nextDouble();
        System.out.println("Gaji :"+ gaji);
       
        if (gaji >= 3000000 && gaji < 5000000){
            System.out.println("Pajak 5%");
            System.out.println ("Gaji bersih : " + (gaji-(gaji*0.05)));
        }else if (gaji >= 5000000){
            System.out.println("Pajak 10%");
            System.out.println("Gaji bersih : " + (gaji-(gaji*0.1)));
        }else{
            System.out.println("Tidak kena pajak");
        }
    }
  }  

