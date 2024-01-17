package day101_justpractice;

import java.util.ArrayList;
import java.util.Vector;

public class Day101_justPractice {

    public static void main(String[] args) {
        // ArrayList tanpa tipe
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("Haii");
        arrayList.add(42);
        arrayList.add(3.14);

        System.out.println("ArrayList (Tak Bertipe): " + arrayList);

        // Vector tanpa tipe
        Vector<Object> vector = new Vector<>();
        vector.add("Aku ika");
        vector.add(123);
        vector.add(2.71);

        System.out.println("Vector (Tak Bertipe): " + vector);
    }
}
