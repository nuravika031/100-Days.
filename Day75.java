package day75;
public class Day75 {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        int indexHapus = 3;

        int[] array1 = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != indexHapus) {
                array1[j++] = array[i];
            }
        }
        for (int nilai : array1) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }
    
}
