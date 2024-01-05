package day89;

public class Day89 {

    static String pesan(String nama, String message) {
        return "Hello, " + nama + "! " + message;
    }

    public static void main(String[] args) {
        String hasilPesan = pesan("Ika", "Apa kabar, semoga sehat-sehat ya");
        System.out.println("Pesan : " + hasilPesan);
    }
}
