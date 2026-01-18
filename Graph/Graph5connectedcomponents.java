import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph5connectedcomponents {

    static class Edge {
        int src, dest, wt;

        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            wt = w;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }

    // BFS (Connected Components) 
    public static void bfs(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                bfsUtil(graph, i, vis);
                System.out.println();
            }
        }
    }

    static void bfsUtil(ArrayList<Edge>[] graph, int start, boolean vis[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;

                for (Edge e : graph[curr]) {
                    if (!vis[e.dest]) {
                        q.add(e.dest);
                    }
                }
            }
        }
    }

    //DFS (Connected Components) 
    public static void dfs(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                dfsUtil(graph, i, vis);
                System.out.println();
            }
        }
    }

    static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
        System.out.print(curr + " ");
        vis[curr] = true;

        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                dfsUtil(graph, e.dest, vis);
            }
        }
    }

    // Path Existence 
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean vis[]) {
        if (src == dest) return true;

        vis[src] = true;

        for (Edge e : graph[src]) {
            if (!vis[e.dest] && hasPath(graph, e.dest, dest, vis)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);

        System.out.println("BFS Traversal (Connected Components):");
        bfs(graph);

        System.out.println("DFS Traversal (Connected Components):");
        dfs(graph);

        System.out.println("Has Path 0 → 5 : " + hasPath(graph, 0, 5, new boolean[v]));
    }
}
