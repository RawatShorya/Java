package DSA.Graphs;

public class AdjacencyMatrixWithWeight {

    int [][] adjMatrix;

    AdjacencyMatrixWithWeight(int nodes){
        adjMatrix = new int [nodes][nodes];
//        [[],[],[]]
    }

    public void addEdges(int [][]edges, boolean isDirectedGraph){
        for (int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            if (isDirectedGraph){
                adjMatrix[u][v] = 1;
            }else{
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;
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
        AdjacencyMatrixWithWeight adjacencyMatrix = new AdjacencyMatrixWithWeight(4);
        boolean isDirectedGraph = Boolean.FALSE;
        int [][]edgesArray = {{0,2}, {0,1}, {1,3}};
        adjacencyMatrix.addEdges(edgesArray, isDirectedGraph);
        adjacencyMatrix.printAdjMatrix();
    }

}
