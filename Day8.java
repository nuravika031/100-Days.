package day8;
public class Day8 {
    public static void main(String[] args) {
        // Proses konversi tipe data primitif ke string
        //Integer ke String
        int angka1 = 1998;
        String stringAngka1 = Integer.toString(angka1);
        System.out.println("Integer angka1 ke String adalah: " + stringAngka1);
        //Double ke String
        double angka2 = 27.6;
        String stringAngka2 = Double.toString(angka2);
        System.out.println("Double angka2 ke String adalah: " + stringAngka2);
        //Char ke String
        char karakter = 'A';
        String stringKarakter = String.valueOf(karakter);
        System.out.println("Char karakter ke String adalah: " + stringKarakter);       
        //Boolean ke String
        boolean benar = true;
        String stringBooleanBenar = String.valueOf(benar);
        System.out.println("Boolean benar ke String adalah : " + stringBooleanBenar);
    }
    
}
