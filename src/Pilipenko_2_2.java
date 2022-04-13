public class Pilipenko_2_2 {
    public static void main(String[] args) {
        // неявное преобразование
        byte byteVar = 10;
        short shortVar = byteVar;
        int intVar = byteVar;
        long longVar = byteVar;
        float floatVar = byteVar;
        double doubleVar = byteVar;
        System.out.println("byteVar =" + " " + byteVar);
        System.out.println("shortVar =" + "  " + shortVar);
        System.out.println("intVar =" + "  " + intVar);
        System.out.println("longVar =" + "  " + longVar);
        System.out.println("floatVar =" + "  " + floatVar);
        System.out.println("doubleVar =" + "  " + doubleVar);
    }
}
