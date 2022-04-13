import java.util.Scanner;

public class Pilipenko_3_2 {
    public static void main (String [] args) {
        // через консоль ввести число с указанием - четное или нечетное
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();
        if ( num % 2 == 0 )
            System.out.println("Число четное");
        else
            System.out.println("Число нечетное");
    }
}


