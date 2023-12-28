package day81;
public class Day81 {
    public static void main(String[] args) {
        int[][] data = {
            {7, 0, 4},
            {0, 9, 2},
            {0, 6, 0}
        };

        int jumlahNol = 0;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == 0) {
                    jumlahNol++;
                }
            }
        }

        System.out.println("Jumlah elemen array yang bernilai 0: " + jumlahNol);
    }
    
}
