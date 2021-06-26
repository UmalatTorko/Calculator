public class Cheсker {


    public static void chek(String value1, String value2, char operation){
        if (isArabicNumber(value1) && isArabicNumber(value2) && isArithOp(operation)){
            System.out.println(ArabicCalc.calcArabic(Integer.parseInt(value1),Integer.parseInt(value2), operation));
        } else if (isRomanNumber(value1) && isRomanNumber(value2) && isArithOp(operation)){
            System.out.println(RomanCalc.calcRoman(value1, value2, operation));
        }else {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.err.println("Неправильный формат входных данных!");
            }
        }
    }

    public static boolean isArithOp(char c){
        char[] chars = {'+','-','*','/'};
        for (int i = 0; i < chars.length; i++){
            if (chars[i] == c){
                return true;
            }
        }
        return false;
    }

    public static boolean isArabicNumber(String s){
        int arabNum = 0;
        try {
            arabNum = Integer.parseInt(s);
        } catch (Exception e){
            return false;
        }

        for (int i = 1; i <= 10; i++){
            if (i == arabNum){
                return true;
            }
        }
        return false;
    }

    public static boolean isRomanNumber(String s){
        String[] romanNumExm = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};

        for (String numExm : romanNumExm){
            if (numExm.equals(s)){
                return true;
            }
        }
        return false;
    }
}
