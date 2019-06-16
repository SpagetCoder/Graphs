public class Main
{
    final static int INF = 9999;

    public static void main (String[] args)
    {
        int graph[][] = {{1, 2 ,3}, {1, 3 ,8}, {1, 5 ,-4}, {2, 4 ,1}, {2, 5 ,7}, {3, 2 ,4}, {4, 1 ,2}, {4, 3 ,-5}, {5, 4 ,6}};

        FloydWarshall floydWarshall = new FloydWarshall();
        floydWarshall.floydWarshallAlgorithm(graph,5);
    }
}
