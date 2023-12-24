package day76;

public class Day76 {

    public static void main(String[] args) {
        int[][] nilai = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int jumlahBaris = nilai.length;
        int jumlahKolom = nilai[0].length;

        for (int i = 0; i < jumlahBaris; i++) {
            int angkaTerakhir = nilai[i][jumlahKolom - 1];
            System.out.println("Angka terakhir pada baris ke-" + (i + 1) + ": " + angkaTerakhir);
        }
    }
}
