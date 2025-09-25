package STARTING;

// 1.INPUT/OUTPUT IN JAVA

/*import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.println("Hey how are you?");
        // String name = input.next();

        int a = 10;
    }
}
*/

// 2. TYPECASTING IN JAVA

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            float num = input.nextFloat();
            System.out.println(num);
        }
    }
}

// agr tum float puchh rho ho or integer de rhe ho to ye program chalega
// agr int puchh rhe ho or float de rhe ho to ye program nhi chalega
// INT -> float