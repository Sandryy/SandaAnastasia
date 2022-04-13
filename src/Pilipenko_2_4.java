public class Pilipenko_2_4 {
    public static void main(String[] args) {
        // явное преобразование
        double doubleVar = 1.234567891234567;
        long longVar = (long) doubleVar;
        short shortVar = (short) doubleVar;
        int intVar = (int) doubleVar;
        float floatVar = (float) doubleVar;
        byte byteVar = (byte) doubleVar;
        System.out.println("doubleVar =" + "  " + doubleVar);
        System.out.println("longVar = " + "  " + longVar);
        System.out.println("shortVar =" + "  " + shortVar);
        System.out.println("intVar = " + "  " + intVar);
        System.out.println("floatVar = " + "  " + floatVar);
        System.out.println("byteVar = " + "  " + byteVar);

    }
}
