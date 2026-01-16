import java.util.*;

public class Graph1adjcencylist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.println("Enter edges (u v):");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int w = sc.nextInt();

            adj.get(u).add(w);
        }


        System.out.println("\nAdjacency List:");
        for (int i = 0; i < v; i++) {
            System.out.print(i + " -> ");
            System.out.println(adj.get(i));
        }

        sc.close();
    }
}
