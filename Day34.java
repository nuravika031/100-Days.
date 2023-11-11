package day34;
public class Day34 {
    public static void main(String[] args) {
       int angka1 = 15, angka2 = 30, angka3 = 50;
       
        if (angka1 >= angka2 && angka1 >= angka3){
        System.out.println(angka1 + " : adalah yang terbesar");
            
        } else if (angka2 >= angka1 && angka2 >= angka3) {
        System.out.println(angka2 + " : adalah yang terbesar");
                
        }else {
        System.out.println(angka3 + " : adalah yang terbesar");
    }
  } 
}
