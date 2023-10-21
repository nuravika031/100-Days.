package day13;
import java.util.Scanner;
public class Day13 {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.print("Masukkan umur kamu : ");
       int umur = input.nextInt();
       System.out.print("Apakah kamu memiliki SIM ? (true/false) : ");
       boolean memilikiSIM = input.nextBoolean();
       String status = (umur >= 18) ? (memilikiSIM ? "Boleh mengemudi" : "Tidak boleh mengemudi") : "Belum boleh mengemudi";
       System.out.println("Status : " + status);
    }
    
}
