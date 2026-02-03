import java.util.*;
public class Tree17printinRange {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void printRange(Node root, int k1, int k2) {
        if (root == null) return;

        if (root.data >= k1 && root.data <= k2) {
            printRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printRange(root.right, k1, k2);
        } 
        else if (root.data < k1) {
            printRange(root.right, k1, k2);
        } 
        else {
            printRange(root.left, k1, k2);
        }
    }

    public static void printRoot2Leaf(Node root, ArrayList <Integer> path){

    }

    public static void main(String args[]) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for (int val : values) {
            root = insert(root, val);
        }

        System.out.print("Inorder Traversal: ");
        inorder(root);
        System.out.println();

        System.out.print("Nodes in range (5–12): ");
        printRange(root, 5, 12);
    }
}
