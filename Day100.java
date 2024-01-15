package day100;

import javax.swing.JOptionPane;

public class Day100 {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Input nama : ");
        String input1 = JOptionPane.showInputDialog("Masukkan nilai UTS : ");
        String input2 = JOptionPane.showInputDialog("Masukkan nilai UAS : ");
        String input3 = JOptionPane.showInputDialog("Masukkan nilai Tugas : ");
        double uts = Double.parseDouble(input1);
        double uas = Double.parseDouble(input2);
        double tugas = Double.parseDouble(input3);
        double ratarata = (uts + uas + tugas) / 3;

        JOptionPane.showMessageDialog(null, "Nama Anda : " + nama + "\nNilai UTS : " + input1 +
                "\nNilai UAS : " + input2 + "\nNilai Tugas : " + input3 + "\nRata-rata nilai : "
                + ratarata, "Hasil", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
