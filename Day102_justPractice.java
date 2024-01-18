package day102_justpractice;

import java.util.ArrayList;
import java.util.Vector;

public class Day102_justPractice {

    public static void main(String[] args) {
        // ArrayList dengan tipe wrapper
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        System.out.println("ArrayList (Tipe Wrapper{integer}): " + arrayList);

        // Vector dengan tipe wrapper
        Vector<Double> vector = new Vector<>();
        vector.add(3.14);
        vector.add(2.71);
        vector.add(1.618);

        System.out.println("Vector (Tipe Wrapper{double}): " + vector);
    }

}
