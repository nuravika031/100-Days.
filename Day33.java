package day33;
public class Day33 {
    public static void main(String[] args) {
        String[] nama = {"Nurul Imaniar", "Ahmad Suardi", "Febri Eka Wahyuni", "Nur Avika", "Ria Ramadani","Faril", "Silfi Kurnia", "Ahmad Habib Bukhori", "Livia Adi", "Ihksan"};

        System.out.println("10 Nama-nama Mahasiswa Informatika B23 : ");
        int nomor = 1;
        for (String namaMahasiswa : nama) {
            System.out.println(nomor + ". " + namaMahasiswa);
            nomor++;
            }
            
   } 
}