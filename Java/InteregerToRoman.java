import java.util.HashMap;
import java.util.Scanner;

public class InteregerToRoman {
    public static void main(String[] args) {
        System. out. print("Please enter roman value: ");
        Scanner sc=new Scanner (System.in);
        String romanNumeral = sc.next();// Replace this with the Roman numeral you want to convert
        romanNumeral = romanNumeral.toUpperCase() ;
        
        int result = romanToInt(romanNumeral);
        System.out.println("Integer representation of Roman numeral " + romanNumeral + " is: " + result);
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curValue = romanMap.get(s.charAt(i));
            if (curValue < prevValue) {
                result -= curValue;
            } else {
                result += curValue;
            }
            prevValue = curValue;
        }
        return result;
    }
}
