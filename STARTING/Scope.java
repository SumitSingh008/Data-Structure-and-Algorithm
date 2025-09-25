package STARTING;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            int c = 30;
            System.out.println("Inside block: a = " + a + ", b = " + b + ", c = " + c);
        }
    }

}
