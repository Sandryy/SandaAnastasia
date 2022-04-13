public class Pilipenko_2_10 {
    public static void main(String[] args) {
        // выводить на экран целочисленное случайное число (использовать генератор случайный чисел)
        final long max = 1000000000000000L;
        final long rnd = rnd(max);
        System.out.println("Случайное число = " + rnd);
    }

    public static long rnd(long max) {
        return (long) (Math.random() * ++max);
    }
}
