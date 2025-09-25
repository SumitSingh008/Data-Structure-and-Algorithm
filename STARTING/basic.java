package STARTING;

public class basic {
    public static void main(String[] args) {
        // using string in java
        /*
         * String s = "Hello";
         * s = s + " World";
         * System.out.println(s); // Creates new String object internally
         */
        // using StringBuilder in java
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb.toString()); // Modifies the same object

    }
}
