package STRING;

public class printAllSubString {
    public static void main(String[] args) {
        // String str = "abcd";
        // for (int i = 0; i <= 3; i++) {
        // for (int j = i + 1; j <= 4; j++) {
        // System.out.print(str.substring(i, j) + " ");
        // }
        // }

        // interning and new
        String s = "Hello";
        String gtr = "hello";
        gtr = "mello";
        System.out.println(gtr);
        System.out.println(s);

        // immutability of Strings mtlb string me hum kisi bhi character ko perticularly
        // change nhi kr skte lekin jaise neeche diya gya h usi trh se hum us string ka
        // refrence jarur change kr skte h mtlb ye s jo "Hello" ko point kr rhi thi uski
        // jgh hum s ka refrence "Heylo" ko de skte h
        // str1.charAt(3) = 'g'; can't do it
        s = s.substring(0, 2) + "y" + s.substring(3);
        System.out.println(s);

        // PERFORMANCE OF STRINGS - poor performance because it is immutable
        // stringBuilder se iski performance thek kr skte h

    }
}
