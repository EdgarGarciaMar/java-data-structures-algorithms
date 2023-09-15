import java.util.*;

/*
    You are given an array points representing integer coordinates of some points on a 2D-plane, where points[i] = [xi, yi].
    The cost of connecting two points [xi, yi] and [xj, yj] is the manhattan distance between them: |xi - xj| + |yi - yj|, where |val| denotes the absolute value of val.
    Return the minimum cost to make all points connected. All points are connected if there is exactly one simple path between any two points.

    Input: points = [[0,0],[2,2],[3,10],[5,2],[7,0]]
    Output: 20
 */
class LeetcodeMinCosttoConnectAllPoints {
    public static int minCostConnectPoints(int[][] points) {
        int n = points.length;
        List<Edge> edges = new ArrayList<>();

        // Create edges between all pairs of points
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int distance = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
                edges.add(new Edge(i, j, distance));
            }
        }

        // Sort the edges by their weights
        Collections.sort(edges, Comparator.comparingInt(a -> a.weight));

        // Initialize a parent array for Union-Find
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        int minCost = 0;
        int edgeCount = 0;

        // Kruskal's algorithm
        for (Edge edge : edges) {
            int u = edge.u;
            int v = edge.v;
            int weight = edge.weight;

            int parentU = findParent(parent, u);
            int parentV = findParent(parent, v);

            if (parentU != parentV) {
                // Union the two sets
                parent[parentU] = parentV;
                minCost += weight;
                edgeCount++;
                if (edgeCount == n - 1) {
                    break; // Minimum spanning tree is found
                }
            }
        }

        return minCost;
    }

    private static int findParent(int[] parent, int node) {
        if (parent[node] == node) {
            return node;
        }
        return parent[node] = findParent(parent, parent[node]);
    }

    private static class Edge {
        int u;
        int v;
        int weight;

        public Edge(int u, int v, int weight) {
            this.u = u;
            this.v = v;
            this.weight = weight;
        }
    }
    public static void main(String[] args) {
        int[][] points = {{0,0},{2,2},{3,10},{5,2},{7,0}};
        int minCost = minCostConnectPoints(points);
        System.out.println(minCost); // Output: 20 
    }
}