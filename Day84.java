package day84;

public class Day84 {

    public static void main(String[] args) {
        int[] angka = {2, 4, 6, 8, 10};
        int hasilPerkalian = 1;
        for (int i = 0; i < angka.length; i++) {
            hasilPerkalian *= angka[i];
        }
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
    }

}
