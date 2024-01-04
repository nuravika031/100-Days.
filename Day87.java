package day87;

public class Day87 {

    static void cariRataRata(int angka1, int angka2) {
        int rataRata = (angka1 + angka2) / 2;
        System.out.println("Hasil rata-rata dari " + angka1 + " dan " + angka2 + " adalah: " + rataRata);
    }

    public static void main(String[] args) {
        cariRataRata(8, 2);
        cariRataRata(17, 20);
    }

}
