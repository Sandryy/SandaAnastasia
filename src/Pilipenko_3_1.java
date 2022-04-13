public class Pilipenko_3_1 {
    public static void main(String[] args) {
        // примеры из лекции
        int a = 10;
        if (a < 20) {
            System.out.println("Это оператор if");
        }

        int x = 30;
        if (x < 20) {
            System.out.println("Это оператор - if");

        } else {
            System.out.println("Это оператор - else");
        }
        int b = 30;
        if (b == 10) {
            System.out.println("Значение b=10");


        } else if (b == 20) {
            System.out.println("значение b=20");

        } else if (b == 30) {
            System.out.println("Значение b=30");
        } else {
            System.out.println("Это оператор else");
        }

        char grade = 'C';
        switch (grade) {
            case 'A':
                System.out.println("Отлично!");
                break;
            case 'B':
            case 'C':
                System.out.println("Отлично выполнено!");
                break;
            case 'D':
                System.out.println("Вы прошли!");
            case 'F':
                System.out.println("Лучше попробуйте снова");
                break;
            default:
                System.out.println("Неверная оценка!");

        }
        System.out.println("Ваша оценка " + grade);

        int w = 30;
        int y = 10;
        if (w == 30) {
            if (y == 10) {
                System.out.println("w = 30 и y = 10");
            }
        }
    }

}
