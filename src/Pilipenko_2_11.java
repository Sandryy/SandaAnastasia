import java.util.Scanner;

public class Pilipenko_2_11 {
    public static void main(String[] args) {
        // написать программу для нахождения корней квадратного уравнения. (ввод через сканер)
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите значение a");
        float number = scn.nextFloat();
        System.out.println("Введите значение b");
        float number2 = scn.nextFloat();
        System.out.println("Введите значение c");
        float number3 = scn.nextFloat();
        float a = number;
        float b = number2;
        float c = number3;
        double d;
        d = (b * b) - (4 * a * c);
        float e = 0;
        float f = 0;
        if (d == 0) {
            e = -1 * (b / (2 * a));
            System.out.println("Уравнеие имеет 1 квадратный корень, который равен " + e);
        } else {
            if (d > 0) {
                e = ((-1 * b) + (float) Math.sqrt(d)) / (2 * a);
                f = ((-1 * b) - (float) Math.sqrt(d)) / (2 * a);
                System.out.println("Уравнение имеет 2 квадратных корня: " + e + " и " + f);
            } else {
                System.out.println("Уравнение не имеет квадратных корней");
            }
        }
    }
}









