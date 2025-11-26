// File: AVLTreeDemo.java
package Trees;

import java.util.*;

import javax.swing.plaf.basic.BasicTreeUI.NodeDimensionsHandler;

public class AVLTreeDemo {

    public static class Node {
        int value;
        Node left, right;
        int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static Node root;

    public void AVL() {

    }

    public static void insert(int value) {
        root = insert(value, root);
    }

    public static insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value < node.value){
            node.left = insert(value, node.left);
        } else if(value > node.value){
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return balance(node);
    }
}
