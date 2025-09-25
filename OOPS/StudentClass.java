package OOPS;

public class StudentClass {

    // creating a new data type

    public static void main(String[] args) {

        // p1 is the object of class person
        Person p1 = new Person();
        p1.name = "John";
        p1.age = 21;

        Person p2 = new Person();
        p2.name = "Alice";
        p2.age = 22;

        System.out.println("Name: " + p1.name);
        System.out.println("Age: " + p1.age);
        p1.walk();
        p1.talk();

        System.out.println("Name: " + p2.name);
        System.out.println("Age: " + p2.age);
        p2.walk();
        p2.talk();
        p2.walk(10);

        System.out.println("Number of persons: " + Person.count);

    }
}

class Developer extends Person {
    public Developer(int age, String name) {
        super(age, name); // super keyword is used to call the constructor of parent class
    }
}

// THIS IS CLASS
class Person {
    String name;
    int age;

    static int count;

    public Person() {
        count++;
        System.out.println("Constructor called");
    }

    public Person(int age, String name) {
        this.name = name;
        this.age = age;
    }

    // BEHAVIOUR (METHODS OF CLASS or FUNCTIONS)
    void walk() {
        System.out.println(name + " is walking");
    }

    void talk() {
        System.out.println(name + " is talking");
    }

    void walk(int steps) {
        System.out.println(name + " walked " + steps + " steps");
    }

    void doWork() {
        System.out.println(name + " is working");
    }
}

// POLYMORPHISM - same name function with different parameters jaise ki ye
// walk waala function h uper ek me koi parameter nhi h or dusre m ek
// integer parameter h

// INHERITANCE - ek class ki properties dusri class m use krna
// eg - class A extends B mtlb class A m class B ki properties aa jaengi