package day7;
public class Day7 {
    public static void main(String[] args) {
        //Proses Konversi String ke Type data Primitif
    //String ke Integer
    String angka1 = "12345";
    int angkaDalamInteger = Integer.parseInt(angka1);
    System.out.println("String angka1 ke integer adalah : " + angkaDalamInteger);
    //String ke Short
    String angka2 = "2023";
    short angkaShort = Short.parseShort(angka2);
    System.out.println("String angka2 ke short adalah : " + angkaShort);
    //String ke Long
    String angka3 = "987654321";
    long angkaLong = Long.parseLong(angka3);
    System.out.println("String angka3 ke long adalah : " + angkaLong);
    //String ke Double
    String angka4 = "155";
    double angkaDouble = Double.parseDouble(angka4);
    System.out.println("String angka4 ke double adalah : " + angkaDouble);
    //String ke Float
    String angka5 = "35";
    float angkaFloat = Float.parseFloat(angka5);
    System.out.println("String angka5 ke float adalah : " + angkaFloat);
    //String ke Byte
    String angka6 = "10";
    byte angkaByte = Byte.parseByte(angka6);
    System.out.println("String angka6 ke byte adalah : " + angkaByte);
    //String ke Char
    String variabelKarakter = "Hallo!";
    char angkaChar = variabelKarakter.charAt(0);
    System.out.println("String variabelKarakter ke Char adalah : " + angkaChar);
    //String ke Boolean
    String booleanBenar = "true";
    boolean angkaBoolean = Boolean.parseBoolean(booleanBenar);
    System.out.println("String booleanBenar ke boolean adalah : " + booleanBenar);
    }
    
}
