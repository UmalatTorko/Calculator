
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String lineExp = scanner.nextLine();
        String[] expSplit = lineExp.split("\s");
        String value1 = expSplit[0];
        String value2 = expSplit[2];
        char operation = expSplit[1].charAt(0);
        if (isArabicNumber(value1) && isArabicNumber(value2) && isArithOp(operation)){
            System.out.println(calcArabic(Integer.parseInt(value1),Integer.parseInt(value2), operation));
        } else if (isRomanNumber(value1) && isRomanNumber(value2) && isArithOp(operation)){
            System.out.println(calcRoman(value1, value2, operation));
        }else {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.err.println("Неправильно введены данные");
            }
        }
    }

    public static String calcRoman(String num1, String num2, char operation){

        int romeToArab1 = converterRomanToArab(num1);
        int romeToArab2 = converterRomanToArab(num2);

        int resultArab = calcArabic(romeToArab1, romeToArab2, operation);

        return convertArabToRoman(resultArab);
    }

    private static int converterRomanToArab(String num){

        String [] rome = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        ArrayList<String> arrayRome = new ArrayList<>(Arrays.asList(rome));

        return arrayRome.indexOf(num)+1;
    }

    private static String convertArabToRoman (int numArab) {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        return roman[numArab];
    }

    public static int calcArabic(int num1, int num2, char operation){
        int result = 0;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
        }
        return result;
    }

    private static boolean isArithOp(char c){

        char[] chars = {'+','-','*','/'};

        for (int i = 0; i < chars.length; i++){
            if (chars[i] == c){
                return true;
            }
        }
        return false;
    }

    private static boolean isArabicNumber(String s){
        int num = 0;
        try {
            num = Integer.parseInt(s);
        } catch (Exception e){
        }

        for (int i = 1; i <= 10; i++){
            if (i == num){
                return true;
            }
        }
        return false;
    }

    private static boolean isRomanNumber(String s){
        String[] romanNumExm = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};

        for (String numExm : romanNumExm){
            if (numExm.equals(s)){
                return true;
            }
        }
        return false;
    }
}
