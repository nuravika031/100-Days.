package day103_justpractice;

import java.util.ArrayList;
import java.util.Vector;

public class Day103_justPractice {

    public static void main(String[] args) {
        // ArrayList dengan tipe String
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("~RPL~");
        arrayList.add("Web");
        arrayList.add("UI-UX");

        System.out.println("ArrayList (Tipe String): " + arrayList);

        // Vector dengan tipe String
        Vector<String> vector = new Vector<>();
        vector.add("Sistem Cerdas");
        vector.add("IoT");
        vector.add("Mobile");

        System.out.println("Vector (Tipe String): " + vector);
    }
}
