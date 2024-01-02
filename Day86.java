package day86;

public class Day86 {

    static void informasiIPK(double ipk) {
        System.out.print("Mahasiswa dengan IPK " + ipk + ": ");
        
        if (ipk >= 3.5) {
            System.out.println("Termasuk dalam Kategori Pujian.");
        } else if (ipk >= 3.0) {
            System.out.println("Termasuk dalam Kategori Sangat Memuaskan.");
        } else if (ipk >= 2.5) {
            System.out.println("Termasuk dalam Kategori Memuaskan.");
        } else if (ipk >= 2.0) {
            System.out.println("Termasuk dalam Kategori Cukup.");
        } else {
            System.out.println("Termasuk dalam Kategori Tidak Lulus.");
        }
    }

    public static void main(String[] args) {
        informasiIPK(3.8);
        informasiIPK(3.2);
        informasiIPK(2.7);
        informasiIPK(1.9);
    }

}
