package day95;

public class Day95 {

    public static void main(String[] args) {
        String data = "durian-rambutan-apel-pisang";

        String[] buahArray = data.split("-");

        System.out.println("Hasil pemecahan string:");
        for (String buah : buahArray)
        System.out.println(buah);
    }
}
