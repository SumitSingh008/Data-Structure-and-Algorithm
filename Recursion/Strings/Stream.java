package Recursion.Strings;

public class Stream {
    /*public static void main(String[] args) {
        skip("","baccab");
    }

    static void skip(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p,up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }




    static String skip(String up) {
        if(up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);

        if(ch == 'a'){
            return skip(up.substring(1));
        } else {
            return skip(up.substring(1));
        }
    }*/

    public static void main(String[] args) {
        String s = "baccad";
        String result = skip(s);
        System.out.println(result);
    }

    static String skip(String str) {
        if(str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);

        // if first char is 'a' , skip it
        if(ch == 'a'){
            return skip(str.substring(1));
        } else {
            return ch + skip(str.substring(1));
        }
    }
}
