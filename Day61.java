package day61;
public class Day61 {
    public static void main(String[] args) {
        int[][] tabel = {
            {24, 31, 68},
            {55, 83, 99},
            {23, 45, 77}
        };
        int nilaiTertinggi = tabel[0][0];
        int nilaiTerendah = tabel[0][0];
        for (int i = 0; i < tabel.length; i++) {
            for (int j = 0; j < tabel[i].length; j++) {
                if (tabel[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = tabel[i][j];
                }

                if (tabel[i][j] < nilaiTerendah) {
                    nilaiTerendah = tabel[i][j];
                }
            }
        }
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
    }   
}
