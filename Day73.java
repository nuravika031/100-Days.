package day73;

public class Day73 {

    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 4}, {44, 20, 6}, {12, 5, 9}};
        int[][] array2 = {{9, 7, 6}, {7, 5, 4}, {3, 2, 1}};

        int angka1 = array1.length;
        int angka2 = array1[0].length;

        int[][] hasil = new int[angka1][angka2];

        for (int i = 0; i < angka1; i++) {
            for (int j = 0; j < angka2; j++) {
                hasil[i][j] = array1[i][j] - array2[i][j];
            }
        }


        System.out.println("Hasil pengurangan :");
        for (int i = 0; i < angka1; i++) {
            for (int j = 0; j < angka2; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}
