public class Pilipenko_2_3 {
    public static void main(String[] args) {
        // явное преобразование
        long longVar = 1_000_000_000L; // L - обязательно
        short shortVar = (short) longVar;
        byte byteVar = (byte) longVar;
        int intVar = (int) longVar;
        float floatVar = (float) longVar;
        double doubleVar = (double) longVar;
        System.out.println("longVar =" + "  " + longVar);
        System.out.println("shortVar =" + "  " + shortVar);
        System.out.println("byteVar = " + "  " + byteVar);
        System.out.println("intVar =" + "  " + intVar);
        System.out.println("floatVar = " + "  " + floatVar);
        System.out.println("double = " + "  " + doubleVar);


    }
}
