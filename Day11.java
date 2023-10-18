package day11;
import java.util.Scanner;
public class Day11 {
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
        System.out.print("Input Nama Anda   : ");       
        String nama = input.nextLine();
        
        System.out.print("Input Prodi       : ");
        String prodi = input.nextLine();
        
        System.out.print("Input Angkatan    : ");
        int angkatan = input.nextInt();
            
        System.out.print("Input Apakah anda mahasiswa aktif? (true/false) : ");       
        boolean mahasiswaAktif = input.nextBoolean();
        
        System.out.println("DATA YANG ANDA MASUKKAN YAITU :"); 
        System.out.println("Nama              : " + nama); 
        System.out.println("Prodi             : " + prodi); 
        System.out.println("Angkatan          : " + angkatan); 
        System.out.println("Mahasiswa Aktif   : " + mahasiswaAktif);
    }
    
}
