package OOPS;

public class Main {
    public static void main(String[] args) {
        Student Sumit = new Student(13, "Sumit kumar singh", 98.5f);

        System.out.println(Sumit.rno);
        System.out.println(Sumit.name);
        System.out.println(Sumit.marks);
    }
}

class Student {
    int rno;
    String name;
    float marks;

    Student(int rno, String name, float marks) { // this keyword is used to refer to the current object which is being
                                                 // created in main method jaise ki Sumit
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
