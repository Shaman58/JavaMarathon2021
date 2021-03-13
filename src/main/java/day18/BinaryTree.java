package day18;

public class BinaryTree {

    private Node root;

    public void addNode(int value, BinaryTree binaryTree) {
        addNode(value, binaryTree.getRoot());
    }

    private void addNode(int value, Node node) {
        if (value > node.getValue()) {
            if (node.getRight() == null) {
                node.setRight(new Node(value));
            } else addNode(value, node.getRight());
        } else if (node.getLeft() == null) {
            node.setLeft(new Node(value));
        } else addNode(value, node.getLeft());
    }

    public static void dfs(BinaryTree binaryTree) {
        dfs(binaryTree.getRoot());
    }

    private static void dfs(Node node) {
        if (node.getLeft() != null)
            dfs(node.getLeft());
        System.out.print(node.getValue() + " ");
        if (node.getRight() != null)
            dfs(node.getRight());
    }

    public Node getRoot() {
        return root;
    }

    public BinaryTree(int value) {
        this.root = new Node(value);
    }

    public static class Node {
        private int value;
        private Node right;
        private Node left;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

    }
}