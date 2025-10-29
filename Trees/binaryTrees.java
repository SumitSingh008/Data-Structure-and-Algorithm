package Trees;

import java.util.*;

// public class binaryTrees {

//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class BinaryTree {
//         static int idx = -1;

//         public static Node buidTree(int nodes[]) {
//             idx++;
//             if (nodes[idx] == -1) {
//                 return null;
//             }
//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buidTree(nodes);
//             newNode.right = buidTree(nodes);
//             return newNode;
//         }
//     }

//     // code for PreOrder Traversal
//     public static void preOrder(Node root) {
//         if (root == null) {
//             return;
//         }
//         System.out.print(root.data + " ");
//         preOrder(root.left);
//         preOrder(root.right);
//     }

//     // code for in-Order Traversal
//     public static void inOrder(Node root) {
//         if (root == null) {
//             return;
//         }
//         inOrder(root.left);
//         System.out.print(root.data + " ");
//         inOrder(root.right);

//     }

//     // code for Post-Order Traversal
//     public static void postOrder(Node root) {
//         if (root == null) {
//             return;
//         }

//         postOrder(root.left);
//         postOrder(root.right);
//         System.out.print(root.data + " ");
//     }

//     // Level Order Traversal
//     public static void LevelOrder(Node root) {
//         if (root == null) {
//             return;
//         }
//         Queue<Node> q = new LinkedList<>();
//         q.add(root);
//         q.add(null);

//         while (!q.isEmpty()) {
//             Node currNode = q.remove();
//             if (currNode == null) {
//                 System.out.println();
//                 if (q.isEmpty()) {
//                     break;
//                 } else {
//                     q.add(null);
//                 }
//             } else {
//                 System.out.print(currNode.data + " ");
//                 if (currNode.left != null) {
//                     q.add(currNode.left);
//                 }
//                 if (currNode.right != null) {
//                     q.add(currNode.right);
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buidTree(nodes);
//         System.out.println(root.data);
//         // preOrder(root);
//         // inOrder(root);
//         // postOrder(root);
//         LevelOrder(root);
//     }
// }

public class binaryTrees {

    public binaryTrees() {

    }

    private static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    // insert elements in the binary tree
    public void populate(Scanner scanner) {
        System.out.println("Enter the root node data: ");
        int data = scanner.nextInt();
        root = new Node(data);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter the left of " + node.data);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the data of the left of " + node.data);
        }
    }
}