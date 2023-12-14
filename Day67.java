package day67;

public class Day67 {

    public static void main(String[] args) {
        int[] nilaiArray = {1, 2, 3, 4, 5};
        for (int i = 0; i < nilaiArray.length; i++) {
            System.out.print(nilaiArray[i] + " ");
        }
        System.out.println(" ");
        int pengganti = 4;
        int nilai = 17;
        nilaiArray[pengganti] = nilai;

        for (int nilai1 : nilaiArray) {
            System.out.print(nilai1 + " ");
        }
        System.out.println("");
    }

}
