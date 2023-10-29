package day22;
public class Day22 {
    public static void main(String[] args) {
        //Menghitung mundur hingga waktu istirahat selesai
        for (int menit = 30; menit >= 0; menit -= 2) {
            System.out.println("Sisa waktu: " + menit + " menit");
        }
        System.out.println("Waktu istirahat selesai!");
    }
    
}
