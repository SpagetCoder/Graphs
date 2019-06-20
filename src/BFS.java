import java.util.LinkedList;

public class BFS
{
    private int vertex;
    private LinkedList<Integer> adj[];

    BFS(int vertex)
    {
        this.vertex = vertex;
        adj = new LinkedList[vertex];

        for (int i = 0; i < vertex; i++)
            adj[i] = new LinkedList<>();
    }

    public void addEdge(int source, int destination)
    {
        adj[source].add(destination);
    }

    void bfsAlgorithm(int source, int destination)
    {
        int predecessor[] = new int[vertex];
        double distance[] = new double[vertex];
        boolean visited[] = new boolean[vertex];

        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 0; i < vertex; i++)
        {
            visited[i] = false;
            distance[i] = Double.POSITIVE_INFINITY;
            predecessor[i] = -1;
        }

        visited[source] = true;
        distance[source] = 0;
        queue.add(source);

        while(!queue.isEmpty())
        {
            int v = queue.poll();
            for (int u : adj[v])
            {
                if(!visited[u])
                {
                    visited[u] = true;
                    queue.add(u);
                    distance[u] = distance[v] + 1;
                    predecessor[u] = v;
                }
            }
        }
        printBFS(destination,predecessor);
    }

    void printBFS(int destination, int[] predescesor)
    {
        LinkedList<Integer> path = new LinkedList<>();
        int helper = destination;
        path.add(helper);
        while (predescesor[helper] != -1)
        {
            path.add(predescesor[helper]);
            helper = predescesor[helper];
        }

        for (int i = path.size() - 1; i >= 0; i--)
            System.out.println(path.get(i));
    }
}
