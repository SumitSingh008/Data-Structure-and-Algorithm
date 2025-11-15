package Trees;

import java.util.*;

public class traversal {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    // Insert into BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Node root = null;

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " node values: ");

        // store inserted values only for printing
        List<Integer> insertedValues = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
            insertedValues.add(val);
        }

        System.out.println("Values inserted (in input order):");
        for (int v : insertedValues) {
            System.out.println(v + " ");
        }
    }
}
