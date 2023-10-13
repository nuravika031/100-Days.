package day5;
public class Day5 {
    public static void main(String[] args) {
        int x = 7;
        int y = 5;
        
        boolean logikaAnd = x!=y && x<y;
        System.out.println("Apakah nilai x tidak sama dengan nilai y DAN nilai x lebih kecil dari nilai y? : " +logikaAnd);
        
        boolean logikaOr = x>y || x==y;
        System.out.println("Apakah nilai x lebih besar dari nilai y ATAU nilai x sama dengan nilai y? : " +logikaOr);
        
        boolean logikaNegasi = !(x!=y || x==y);
        System.out.println("Apakah nilai x tidak sama dengan nilai y ATAU nilai x sama dengan nilai y? : " + logikaNegasi);
    }
    
}
