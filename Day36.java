package day36;
public class Day36 {
    public static void main(String[] args) {
        //menampilkan bilangan genap antara 1 sampai 100 yg habis dibagi 4
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 4 == 0){
            System.out.println(i);
            }
        }
    }
    
}
