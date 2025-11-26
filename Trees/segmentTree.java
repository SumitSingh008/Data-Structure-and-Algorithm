package Trees;

public class segmentTree {

    public static void main(String[] args) {
        int[] arr = { 3, 8, 6, 7, -2, -8, 4, 9 };
        int n = arr.length;
        segmentTree tree = new segmentTree(arr);
    }

    private static class Node {
        int data;
        int startInterval, endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
            this.data = 0;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    public segmentTree(int[] arr) {
        // create a tree using this array
        this.root = buildTree(arr, 0, arr.length - 1);
    }

    private Node buildTree(int[] arr, int start, int end) {
        // base case
        if (start == end) {
            // leaf node
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        // create new node with index you are at
        Node node = new Node(start, end);

        int mid = start + (end - start) / 2;

        node.left = buildTree(arr, start, mid);
        node.right = buildTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;
        return node;
    }
}
