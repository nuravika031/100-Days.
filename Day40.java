package day40;
public class Day40 {
    public static void main(String[] args) {
        int tinggi = 5;

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + (" "));
            }
            System.out.println(i);  
        }
    }
}


