package day4;
public class Day4 {
    public static void main(String[] args) {
        int angka1 = 15;
        int angka2 = 3;
        boolean hasil;
        
        hasil = angka1 > angka2;
        System.out.println("Apakah angka1 lebih besar dari angka2? " + hasil);
        
        hasil = angka1 < angka2;
        System.out.println("Apakah angka1 lebih kecil dari angka2? " + hasil);
        
        hasil = angka1 >= angka2;
        System.out.println("Apakah angka1 lebih besar sama dengan angka2? " + hasil);
        
        hasil = angka1 <= angka2;
        System.out.println("Apakah angka1 lebih kecil sama dengan angka2? " + hasil);
        
        hasil = angka1 == angka2;
        System.out.println("Apakah angka1 sama dengan angka2? " + hasil);
        
        hasil = angka1 != angka2;
        System.out.println("Apakah angka1 tidak sama dengan angka2? " + hasil);
    }
    
}
