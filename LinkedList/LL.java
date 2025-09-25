package LinkedList;

public class LL {

    // Head: pehle node ka reference rakhta hai
    // Tail: last node ka reference rakhta hai
    // Size: list me total nodes ki count rakhta hai
    private Node head;
    private Node tail;
    private int size;

    // Constructor -> jab new LL banegi, tab size = 0 set hoga (list empty hogi)
    public LL() {
        this.size = 0;
    }

    // INSERTION AT first ELEMENT IN A LINKED LIST
    public void insertFirst(int val) {
        Node node = new Node(val); // naya node banaya jisme value val hai
        node.next = head; // naya node ka next head ko point karega
        head = node; // head ab naya node ho gaya

        if (tail == null) {
            tail = head;
        }

        size += 1; // size 1 se badh gaya
    }

    // insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    // INSERT AT LAST
    public void insertLast(int val) {
        Node node = new Node(val); // ek naya node banaya (value = val, next = null)

        if (tail == null) { // agar list abhi empty hai tail null hone se pta lg jata h ki list null h mtlb
                            // khaali h
            insertFirst(val);
            return;
        }
        tail.next = node; // current tail ka next ab naye node ko point karega
        tail = node; // aur ab tail ko update karke new node bana do
        size += 1; // list ka size badh gaya
    }

    // INSERT A VALUE AT A PERTICULAR INDEX
    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // DELETION OF FIRST ELEMENT
    public int deleteFirst() {
        int val = head.value; // head ka value store karlo
        head = head.next; // head ko next node pe le jao

        if (head == null) { // agar ab head null ho gaya mtlb list khaali ho gayi
            tail = null; // to tail bhi null kar do
        }

        size--; // size 1 se ghat gaya
        return val; // deleted node ka value return kar do
    }

    // DELETION OF LAST ELEMENT
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2); // second last node ko get karo

        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    // very important function to get node at a perticular index⭐⭐⭐
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // FIND A VALUE IN THE LINKED LIST ⭐⭐⭐
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // DELETE PERTICULAR INDEX
    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    // DISPLAY THE LINKED LIST
    public void display() {
        Node temp = head; // ek temporary node banaya jo head ko point karega
        while (temp != null) { // jab tak temp null nahi ho
            System.out.print(temp.value + " -> "); // current node ka value print karo
            temp = temp.next; // temp ko next node pe le jao
        }
        System.out.println("END"); // list ke end me "END" print karo
    }

    // Inner class Node -> ek node banane ka blueprint
    private class Node {
        private int value; // node ka data
        private Node next; // next node ka reference

        // Constructor -> ek node banata hai jisme data hoga aur next null hoga
        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        // Constructor -> ek node banata hai jisme data hoga aur manually next assign
        // kar sakte ho
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void duplicates() {
        Node node = head;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }

        tail = node;
        tail.next = null;
    }

    // MERGE OF LINKED LIST
    public static LL merge(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }

        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }

    // umr waale merge me problem thi ki usme new ans naam ki list bnanyi h
    // NOW Optimal approach
    /*
     * public static Node merge(Node f, Node s) {
     * Node dummy = new Node(); // temporary starter
     * Node tail = dummy;
     * 
     * while (f != null && s != null) {
     * if (f.value < s.value) {
     * tail.next = f;
     * f = f.next;
     * } else {
     * tail.next = s;
     * s = s.next;
     * }
     * tail = tail.next;
     * }
     * 
     * // attach remaining nodes
     * if (f != null)
     * tail.next = f;
     * if (s != null)
     * tail.next = s;
     * 
     * return dummy.next; // merged head
     * }
     */

    public static void main(String[] args) {
        // LL list = new LL();
        // list.insertLast(1);
        // list.insertLast(1);
        // list.insertLast(2);
        // list.insertLast(3);
        // list.insertLast(3);
        // list.insertLast(3);
        // list.display();
        // list.duplicates();
        // list.display();

        LL first = new LL();
        LL second = new LL();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        LL ans = LL.merge(first, second);
        ans.display();
    }
}
