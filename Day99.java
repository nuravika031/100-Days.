package day99;

import java.util.Scanner;

public class Day99 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mengecek kata palindrome atau bukan");
        System.out.print("masukan kata : ");
        String kata = sc.nextLine();
        if(palindrome(kata)){
            System.out.println(kata+" <-- ini adalah palindrome");
        }else{
            System.out.println(kata+" <-- ini bukan palindrome");
        }
        }
    public static boolean palindrome (String sama){
        return sama.equals(new StringBuilder (sama).reverse().toString());
    }
    
}
