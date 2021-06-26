import java.util.ArrayList;
import java.util.Arrays;

public class RomanCalc {

    public static String calcRoman(String num1, String num2, char operation){

        int romeToArab1 = converterRomanToArab(num1);
        int romeToArab2 = converterRomanToArab(num2);
        int resultArab = ArabicCalc.calcArabic(romeToArab1, romeToArab2, operation);

        return convertArabToRoman(resultArab);
    }

    public static int converterRomanToArab(String numRoman){

        String [] rome = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        ArrayList<String> arrayRome = new ArrayList<>(Arrays.asList(rome));

        return arrayRome.indexOf(numRoman)+1;
    }

    public static String convertArabToRoman (int numArab) {

        if (numArab <= 0){
            return "Результат не может быть отрицательным числом или ноль.\n" +
                    "Пожалуйста, введите данные заного!";
        }

        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI",
                "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI",
                "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        return roman[numArab];
    }
}
