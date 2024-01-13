package day97;
public class Day97 {
    public static void main(String[] args) {
        StringBuffer nama = new StringBuffer("Sitti Aisyah");
        System.out.println("Sebelum : " + nama);
        nama.deleteCharAt(3);
        System.out.println("sesudah : " + nama);

        StringBuilder fakultas = new StringBuilder("Teknik,");
        System.out.println("Sebelum: " + fakultas);
        fakultas.deleteCharAt(6);
        System.out.println("Setelah : " + fakultas);
    }
    
}
