import java.util.Arrays;

import static java.lang.String.format;

public class FloydWarshall
{
    void floydWarshallAlgorithm (int graph[][], int size)
    {
        double[][] temp = new double[size][size];
        for (double[] row : temp)
            Arrays.fill(row, Double.POSITIVE_INFINITY);

        for (int[] x : graph)
            temp[x[0] - 1][x[1] - 1] = x[2];

        int [][] next = new int[size][size];
        for (int i = 0; i < next.length; i++)
        {
            for (int j = 0; j < next.length; j++)
                if (i != j)
                    next[i][j] = j+1;
        }

        for(int k = 0; k < size; k++)
            for(int i = 0; i < size; i++)
                for(int j = 0; j < size; j++)
                    if (temp[i][k] + temp[k][j] < temp[i][j])
                    {
                        temp[i][j] = temp[i][k] + temp[k][j];
                        next[i][j] = next[i][k];
                    }

            printFloydWarshar(temp,next);
    }

    void printFloydWarshar(double [][]temp,int[][] next)
    {
        System.out.println("Pair \tDistance \t Path");
        for(int i = 0; i < next.length; i++)
        {
            for(int j=0; j < next.length; j++)
            {
                if (i != j)
                {
                    int a = i + 1;
                    int b = j + 1;
                    String result = format("%d -> %d    %2d     %d", a, b, (int) temp[i][j], a);
                    do {
                        a = next[a - 1][b - 1];
                        result += " -> " + a;
                    } while (a != b);
                    System.out.println(result);
                }
            }
            System.out.println();
        }
    }

}
