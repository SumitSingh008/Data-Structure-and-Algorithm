package Trees;

public class BST {
    public static class Node {
        int val;
        int height;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }
    }

    private Node root;

    public BST() {

    }

    public static int height(Node node) {
        if (node == null) {
            return -1;
        }

        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int val) {
        root = insert(root, val);
    }

    private Node insert(Node node, int val) {
        if (node == null) {
            return new Node(val);
        }

        if (val < node.val) {
            node.left = insert(node.left, val);
        } else if (val > node.val) {
            node.right = insert(node.right, val);
        }

        // Update height of this ancestor node
        node.height = 1 + Math.max(height(node.left), height(node.right));

        return node;
    }

    public static boolean balanced(Node node) {
        if (node == null) {
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.getVal());

        display(node.left, "Left Child of " + node.getVal() + " : ");
        display(node.right, "Right Child of " + node.getVal() + " : ");
    }

    public static void main(String[] args) {
        BST bst = new BST();
        //
        bst.root = new Node(10);
        bst.root.left = new Node(5);
        bst.root.right = new Node(15);
        bst.root.left.left = new Node(3);
        bst.root.left.right = new Node(7);
        bst.root.right.right = new Node(20);

        bst.display();
    }
}

// maximum height of a binary search tree is log(n) where n is the number of
// nodes in the tree.
// minimum height of a binary search tree is 1.