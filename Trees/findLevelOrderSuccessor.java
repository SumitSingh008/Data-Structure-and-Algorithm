package Trees;

public class findLevelOrderSuccessor {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static TreeNode findSuccessor(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.offer(root); // .offer() is used to add elements to the queue

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();

            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }

            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }

            if (currentNode.val == key) {
                break;
            }
        }
        return queue.isEmpty() ? null : queue.poll();
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(12);
        root.left.right = new TreeNode(14);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(11);
        root.left.right.left = new TreeNode(36);
        root.left.right.right = new TreeNode(9);
        root.right.right.left = new TreeNode(2);
        root.right.right.left.right = new TreeNode(44);

        TreeNode result = findSuccessor(root, 14);
        if (result != null) {
            System.out.println("Level order successor of 14 is: " + result.val);
        } else {
            System.out.println("Level order successor of 14 does not exist");
        }

        result = findSuccessor(root, 9);
        if (result != null) {
            System.out.println("Level order successor of 9 is: " + result.val);
        } else {
            System.out.println("Level order successor of 9 does not exist");
        }
    }
}