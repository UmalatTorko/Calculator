import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите выражение в формате:\nN * N\n" +
                           "Где (N) арабское или римское число от одного до десяти,\n" +
                           "а (*) арифметическая операция (+,-,*,/)");

        calculator();
    }

    public static void calculator(){
        String lineExp = scanner.nextLine();
        String[] expSplit = lineExp.split("\s");
        if (expSplit.length == 3) {
            String value1 = expSplit[0];
            String value2 = expSplit[2];
            char operation = expSplit[1].charAt(0);

            Cheсker.chek(value1, value2, operation);
        } else{
            System.out.println("Не правильный формат! Попробуйте еще раз.");
            calculator();
        }
    }
}