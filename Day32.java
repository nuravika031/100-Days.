package day32;
import java.util.Scanner;
public class Day23 {  
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Masukkan dua angka : ");
      double angka1 = input.nextDouble();
      double angka2 = input.nextDouble();
      char operator;
      System.out.println("Operator yang tersedia adalah : (+ - * / % ^)");
      System.out.print("Masukkan operator: ");
      operator = input.next().charAt(0);
      switch(operator) {
         case '+':
            System.out.println("Hasil = "+ (angka1+angka2));
        		break;

	       case '-':
	          System.out.println("Hasil = "+ (angka1-angka2));
	        	break;

	       case '*':
	          System.out.println("Hasil = "+ (angka1*angka2));
        		break;

	       case '/':
	          System.out.println("Hasil = "+ (angka1/angka2));
        		break;

	       case '%':
	          System.out.println("Hasil = "+ (angka1%angka2));
        		break;

      	 case '^':
	          System.out.println("Hasil = "+ 
                               Math.pow(angka1,angka2));
		        break;

	      default:
	          System.out.println("Operator tidak valid");
      }
        input.close();
   }
  }
