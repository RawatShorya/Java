package DSA.Graphs;

public class AdjacencyMatrix {

    int [][] adjMatrix;

    AdjacencyMatrix(int nodes){
        adjMatrix = new int [nodes][nodes];
//        [[],[],[]]
    }

    public void addEdges(int [][]edges, boolean isDirectedGraph){
        for (int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            if (isDirectedGraph){
                adjMatrix[u][v] = w;
            }else{
                adjMatrix[u][v] = w;
                adjMatrix[v][u] = w;
            }
        }
    }
    public void printAdjMatrix(){
        for (int i = 0; i<adjMatrix.length; i++){
            for (int j = 0; j<adjMatrix[i].length; j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        AdjacencyMatrix adjacencyMatrix = new AdjacencyMatrix(4);
        boolean isDirectedGraph = Boolean.TRUE;
        int [][]edgesArray = {{0,2,10}, {0,1,20}, {1,3, 30}};
        adjacencyMatrix.addEdges(edgesArray, isDirectedGraph);
        adjacencyMatrix.printAdjMatrix();
    }

}
