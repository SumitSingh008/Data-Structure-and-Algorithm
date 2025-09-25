package LinkedList;

public class DllMain {

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.display();
        list.insertLast(99);
        list.display();
        list.insert(8, 65);
        list.display();
    }
}
