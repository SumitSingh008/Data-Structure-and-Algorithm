package OOPS;

public class Abstraction {
    public static void main(String[] args) {
        Car c1 = new Audi();
        c1.start();
    }
}

class Audi extends Car {
    void start() {
        System.out.println("Audi car started");
    }
}

class BMW extends Car {
    void start() {
        System.out.println("BMW car started");
    }
}

abstract class Car {
    String brand;
    int price;

    abstract void start();
    // agr abstract method ya function h to uska body nhi bnate or uski class ko bhi
    // abstract bnate hain
}

// abstract class mtlb ki is class ka object nhi bna skte
// abstract class mtlb ki is class m ek ya usse jyada abstract methods honge
// abstract method mtlb ki is method ka koi body nhi hoga, sirf declaration hoga
// abstract class ko inherit krke uske abstract methods ko implement krna padta
// h