public class Main
{
    public static void main (String[] args)
    {
        int graph[][] = {{1, 2 ,3}, {1, 3 ,8}, {1, 5 ,-4}, {2, 4 ,1}, {2, 5 ,7}, {3, 2 ,4}, {4, 1 ,2}, {4, 3 ,-5}, {5, 4 ,6}};

        FloydWarshall floydWarshall = new FloydWarshall();
        floydWarshall.floydWarshallAlgorithm(graph,5);


        BFS bfs = new BFS(14);
        bfs.addEdge(0,1);
        bfs.addEdge(0,2);
        bfs.addEdge(0,8);
        bfs.addEdge(1,4);
        bfs.addEdge(1,5);
        bfs.addEdge(1,7);
        bfs.addEdge(2,9);
        bfs.addEdge(3,0);
        bfs.addEdge(3,10);
        bfs.addEdge(3,11);
        bfs.addEdge(4,13);
        bfs.addEdge(5,6);
        bfs.addEdge(5,7);
        bfs.addEdge(5,13);
        bfs.addEdge(7,8);
        bfs.addEdge(8,9);
        bfs.addEdge(10,9);
        bfs.addEdge(10,11);
        bfs.addEdge(12,0);
        bfs.addEdge(12,3);
        bfs.addEdge(13,12);
        bfs.bfsAlgorithm(1,2);
    }
}
