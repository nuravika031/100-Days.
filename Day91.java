package day91;

import java.util.Scanner;

public class Day91 {
    static double hitungBMI(double beratBadan, double tinggiBadan) {
        return beratBadan / (tinggiBadan * tinggiBadan);
    }
    static void keteranganBMI(double bmi) {
        System.out.print("Keterangan BMI: ");
        if (bmi < 18.5) {
            System.out.println("Berat badan kurang");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Berat badan normal");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Berat badan berlebih");
        } else {
            System.out.println("Obesitas");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selamat datang di Kalkulator BMI!");
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = sc.nextDouble();
        System.out.print("Masukkan tinggi badan (m): ");
        double tinggiBadan = sc.nextDouble();
        double bmi = hitungBMI(beratBadan, tinggiBadan);
        System.out.println("BMI Anda adalah: " + bmi);
        keteranganBMI(bmi);
    }
    
}
