package day16;
public class Day16 {
    public static void main(String[] args) {
                int jam = 13;

        String aktivitas = switch (jam) {
            case 8, 9, 10, 11 -> "Belajar";
            case 12, 13, 14 -> "Istirahat dan makan siang";
            case 15, 16, 17, 18 -> "Belajar lagi";
            case 19, 20, 21 -> "Beraktivitas sosial";
            default -> "Waktu luang";
        };

        System.out.println("Jam " + jam + ": " + aktivitas);
        }
    }
}
