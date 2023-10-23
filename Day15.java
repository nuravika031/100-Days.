package day15;
public class Day15 {
    public static void main(String[] args) {
        int fakultas = 1;
        int jurusan = 2;

        switch (fakultas) {
            case 1:
                System.out.println("Anda masuk ke Fakultas Teknik");
                switch (jurusan) {
                    case 1:
                        System.out.println("Jurusan Teknik Informatika");
                        break;
                    case 2:
                        System.out.println("Jurusan Teknik Sipil");
                        break;
                    case 3:
                        System.out.println("Jurusan Teknik Perencanaan Wilayah dan Kota");
                        break;
                    default:
                        System.out.println("Jurusan tidak valid");
                }
                break;
            case 2:
                System.out.println("Anda masuk ke Fakultas Ekonomi");
                switch (jurusan) {
                    case 1:
                        System.out.println("Jurusan Manajemen");
                        break;
                    case 2:
                        System.out.println("Jurusan Akuntansi");
                        break;
                    default:
                        System.out.println("Jurusan tidak valid");
                }
                break;
            default:
                System.out.println("Fakultas tidak valid");
        }
    }
}
