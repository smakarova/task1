import java.util.Scanner;

/**
 * Base class <br/>
 * task2
 * сложение чисел
 */
public class Base {
    /**
     * метод main
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Выберите 1 - калькулятор или 2 - массив слов:\t");
        int task = scanner.nextInt();


        switch (task) {
            case 1:
                Calculator calculator = new Calculator();
                calculator.calculate();
                break;
            case 2:
                Words w = new Words();
                w.initialization();
                w.maxWord();
                break;
            default:
                System.out.println("\nНе подходящий вариант");
        }

        scanner.close();

    }


}
