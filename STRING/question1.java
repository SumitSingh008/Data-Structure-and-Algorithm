package STRING;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {

        String s = "PHysiCs";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch); // just in case of symbols/spaces
            }
        }

        System.out.println(result.toString());
    }
}
