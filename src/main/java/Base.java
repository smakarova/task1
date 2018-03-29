import java.util.Scanner;

/**
 * Base class <br/>
 * task2
 * сложение чисел
 */
public class Base {
    /**
     * метод main
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Первое число:\t");
        double one = scanner.nextDouble();

        System.out.print("Второе число:\t");
        double two = scanner.nextDouble();

        double result = one + two;

        System.out.printf("\nРезультат: %.4f ", result);

        scanner.close();

    }
}
