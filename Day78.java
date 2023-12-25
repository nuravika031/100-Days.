package day78;
public class Day78 {
    public static void main(String[] args) {
        int[] angka = {17,63,57,39,44,81}; 
        int angkaTerkecil = angka[0]; 

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] < angkaTerkecil) {
                angkaTerkecil = angka[i];
            }
        }
        System.out.println("Angka terkecil dalam array adalah: " + angkaTerkecil);
    }
    
}
