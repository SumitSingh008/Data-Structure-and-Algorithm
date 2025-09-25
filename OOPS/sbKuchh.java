package OOPS;

/*public class OOPS {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "sumit";
        s1.age = 23;
    }
}*/

/*
/*class Student {
//    String name;
//    int age;
    
//    public void printInfo() {
//        System.out.println(this.name);
 //       System.out.println(this.age);
    }
}
*/
/*
class Pen {
    String color;
    String type;
    
    public void write() {
        System.out.println("Writing something");
    }
    
    public void printColor() {
        System.out.println(this.color);
    }
}*/

public class sbKuchh {
    public static void main(String[] args) {
        // object creation
        Student s1 = new Student("Sumit", 21, 101);
        Student s2 = new Student("Amit", 22, 102);

        // behavior calls
        s1.study();
        s2.attendStudent();

    }
}

class Student {
    // state
    String name;
    int age;
    long rollNo;

    // constructor
    Student(String naam, int umr, int anukramaank) {
        name = naam;
        age = umr;
        rollNo = anukramaank;
    }

    // Behavior (Method)
    void study() {
        System.out.println(name + " is studying.");
    }

    void play() {
        System.out.println(name + " is playing football");
    }

    void attendStudent() {
        System.out.println(name + " is attending classes today.");
    }
}

/*
 * public class Singleton {
 * private Singleton
 * }
 */
