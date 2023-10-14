package day6;
public class Day6 {
    public static void main(String[] args) {
       int nilaiQuis = 100;
       
       if (nilaiQuis >= 90)
            System.out.println("Luar Biasaa! Kerenn");
       else if (nilaiQuis >= 80 && nilaiQuis < 90)
            System.out.println("Baguss, Tingkatkan ya!!");
       else if (nilaiQuis >= 70 && nilaiQuis < 80)
            System.out.println("Bagus, Tapi Belajar lagi ya!");
       else if (nilaiQuis >= 60 &&  nilaiQuis < 70)
            System.out.println("Waduh, tapi gpp tetap lulus kok");
       else if (nilaiQuis >= 40 && nilaiQuis < 60)
            System.out.println("fix harus belajar banyak-banyak ya!");
       else
            System.out.println("Maaf, Anda gagal! see you tahun depan dengan matkul yang sama:(");
    }
    
}
