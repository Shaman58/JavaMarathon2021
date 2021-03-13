package day18;

public class Task3 {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(20);
        binaryTree.addNode(14, binaryTree);
        binaryTree.addNode(16, binaryTree);
        binaryTree.addNode(18, binaryTree);
        binaryTree.addNode(15, binaryTree);
        binaryTree.addNode(11, binaryTree);
        binaryTree.addNode(5, binaryTree);
        binaryTree.addNode(8, binaryTree);
        binaryTree.addNode(23, binaryTree);
        binaryTree.addNode(22, binaryTree);
        binaryTree.addNode(27, binaryTree);
        binaryTree.addNode(24, binaryTree);
        binaryTree.addNode(150, binaryTree);
        BinaryTree.dfs(binaryTree);
    }
}