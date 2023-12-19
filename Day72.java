package day72;

public class Day72 {

    public static void main(String[] args) {
        int nilaiMahasiswa[] = {45, 78, 71, 89, 93, 58, 62, 63, 34, 78};
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            if (nilaiMahasiswa[i] > 70) {
                System.out.println("Nilai kategori lulus :" + nilaiMahasiswa[i]);
            }
        }
    }
}
