/*
Create a RomanNumerals class that can convert a roman numeral to and from an integer value.
It should follow the API demonstrated in the examples below. Multiple roman numeral values
will be tested for each helper method.

Modern Roman numerals are written by expressing each digit separately starting with the left
most digit and skipping any digit with a value of zero. In Roman numerals 1990 is rendered:
1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII.
1666 uses each Roman symbol in descending order: MDCLXVI.
*/

public class RomanNumerals {
    private static final String[] ROMAN_NUMBERS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] ARABIC_NUMBERS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static String toRoman(int n) {
        int remainingValue = n;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < ARABIC_NUMBERS.length; i++) {
            while (remainingValue >= ARABIC_NUMBERS[i]) {
                remainingValue -= ARABIC_NUMBERS[i];
                result.append(ROMAN_NUMBERS[i]);
            }
        }

        return result.toString();
    }

    public static int fromRoman(String romanNumeral) {
        String remainingValue = romanNumeral;
        int result = 0;

        for(int i = 0; i < ROMAN_NUMBERS.length; i++) {
            while(remainingValue.startsWith(ROMAN_NUMBERS[i])) {
                remainingValue = remainingValue.substring(ROMAN_NUMBERS[i].length(), remainingValue.length());
                result += ARABIC_NUMBERS[i];
            }
        }
        return result;
    }
}