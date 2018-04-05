import java.util.Scanner;

public class Calculator {

    public void calculate() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Первое число:\t");
        double numberOne = sc.nextDouble();

        System.out.print("Второе число:\t");
        double numberTwo = sc.nextDouble();

        System.out.print("Действие:\t");
        String action = sc.next();

        char act = action.charAt(0);
        sc.close();

        switch (act) {
            case '+':
                System.out.printf("\nРезультат: %.4f ", numberOne + numberTwo);
                break;
            case '-':
                System.out.printf("\nРезультат: %.4f ", numberOne - numberTwo);
                break;
            case '*':
                System.out.printf("\nРезультат: %.4f ", numberOne * numberTwo);
                break;
            case '/':
                if (numberTwo != 0) {
                    System.out.printf("\nРезультат: %.4f ", numberOne / numberTwo);
                    break;
                }
            default:
                System.out.println("\nДанная операция не поддерживается");
                break;
        }

    }
}
