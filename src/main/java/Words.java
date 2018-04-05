import java.util.Scanner;

public class Words {
    private String[] words;

    public void initialization() {
        Scanner vol = new Scanner(System.in);

        System.out.print("`Введите количество слов:\t");
        int size = vol.nextInt();

        words = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("`Введите слово:\t");
            words[i] = vol.next();
        }
        vol.close();
    }

    public void maxWord() {
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > result.length()) {
                result = words[i];
            }
        }

        System.out.println("Самое длинное слово:\t" + result);
    }
}
