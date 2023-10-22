package day14;
import java.util.Scanner;
public class Day14 {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner (System.in);
        System.out.print("Pilih opsi angka dan lihat mata kuliah anda : ");
        int hari = masukkan.nextInt();

        switch (hari) {
            case 1:
                System.out.println("Hari Senin: Mata kuliah Matematika Dasar");
                break;
            case 2:
                System.out.println("Hari Selasa: Mata kuliah Dasar-dasar Pemrograman");
                break;
            case 3:
                System.out.println("Hari Rabu: Mata kuliah Fisika Elektronika");
                break;
            case 4:
                System.out.println("Hari Kamis: Mata kuliah Pendidikan Agama Islam");
                break;
            case 5:
                System.out.println("Hari Jumat: Mata kuliah Pendidikan Pancasila");
                break;
            default:
                System.out.println("Hari tidak valid atau tidak ada kuliah");
        }
    }
}
    
