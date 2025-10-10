package STRING;

public class equals {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s1 == s2); // ye to true bta dega lekin
        System.out.println(s1 == s3); // ye false kyuki == address ko dekhta h mtlb s1 or s2 ka address same h to true

        System.out.println(s1.equals(s3));// .equals() hmesha jo bhi data hoga us string me usko compare krta h
    }
}
