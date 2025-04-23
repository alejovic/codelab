package codelab.v4;

import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0, len = s.length(); i < len; i++) {
            int value = map.get(s.charAt(i));
            if (i < len - 1 && value< map.get(s.charAt(i + 1))) {
                result -= value;
            } else {
                result += value;
            }

        }
        return result;
    }
}