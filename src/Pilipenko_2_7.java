public class Pilipenko_2_7 {
    public static void main(String[] args) {
        // Операторы + преобразования типов (сумма, разность, произведение, деление)
        int intVar = 10;
        double doubleVar = 1.24;
        System.out.println("int intVar =" + intVar);
        System.out.println("double doubleVar = " + doubleVar);
        System.out.println();
        System.out.println("Сумма чисел:");
        int sum1 = (int) (intVar + doubleVar);
        int sum2 = intVar + (int) doubleVar;
        double sum3 = intVar + doubleVar;
        System.out.println("int sum1 =" + sum1);
        System.out.println("int sum2 = " + sum2);
        System.out.println("double sum3 =" + sum3);
        System.out.println("Разность чисел:");
        int dif1 = (int) (intVar - doubleVar);
        int dif2 = intVar - (int) doubleVar;
        double dif3 = intVar - doubleVar;
        System.out.println("int dif1 =" + dif1);
        System.out.println("int dif2 =" + dif2);
        System.out.println("int dif3 =" + dif3);
        System.out.println("частное чисел:");
        int div1 = (int) (intVar / doubleVar);
        int div2 = intVar / (int) doubleVar;
        double div3 = intVar / doubleVar;
        System.out.println("int div1 = " + div1);
        System.out.println("int div2 =" + div2);
        System.out.println("div3 =" + div3);
        System.out.println("произведение чисел: ");
        int prod1 = (int) (intVar * doubleVar);
        int prod2 = intVar * (int) doubleVar;
        double prod3 = intVar * doubleVar;
        System.out.println("prod1 = " + prod1);
        System.out.println("prod2= " + prod2);
        System.out.println("prod3=" + prod3);


    }
}
