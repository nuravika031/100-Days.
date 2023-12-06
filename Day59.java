package day59;
public class Day59 {

    public static void main(String[] args) {
            int[][] tabel = {
                {24, 31, 68},
                {55, 83, 99},
                {23, 45, 77}
            };
            int jumlah = 0;
            for (int i = 0; i < tabel.length; i++) {
                for (int j = 0; j < tabel[i].length; j++) {                   
                    jumlah += tabel[i][j];
                }
            }
        System.out.println("Jumlah nilai dalam tabel : " + jumlah);
        }
    }
