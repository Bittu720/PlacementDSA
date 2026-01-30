import java.util.*;

public class Tree10LowestcommonAncestor {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }

        path.add(root);

        if (root.data == n) {
            return true;
        }

        if (getPath(root.left, n, path) || getPath(root.right, n, path)) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }

    public static Node LCA(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        if (!getPath(root, n1, path1) || !getPath(root, n2, path2)) {
            return null; 
        }

        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i).data != path2.get(i).data) {
                break;
            }
        }

        return path1.get(i - 1);
    }

    public static Node LCA2(Node root, int n1, int n2) {
    
        if (root == null) {
            return null;
        }

        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLCA = LCA2(root.left, n1, n2);
        Node rightLCA = LCA2(root.right, n1, n2);

        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 7;

        Node lca = LCA2(root, n1, n2);
        if (lca != null) {
            System.out.println("LCA of " + n1 + " and " + n2 + " is: " + lca.data);
        } else {
            System.out.println("LCA not found (one or both nodes missing)");
        }
    }
}
