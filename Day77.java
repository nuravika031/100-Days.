package day77;

public class Day77 {

    public static void main(String[] args) {
        String[] nama = {"lala", "lisa", "siti", "diana", "lela", "putri", "kiki", "lina", "nadia", "ayu"};
        int i = 0;
        while (i < nama.length) {
            if (i % 2 == 0) {
                System.out.println(nama[i]);
            }
            i++;
        }
    }
}
