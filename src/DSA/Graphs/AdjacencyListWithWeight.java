package DSA.Graphs;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyListWithWeight {

    class Pair{
        int node;
        int weight;
        Pair(int node, int weight){
            this.node = node;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "(" + node + ", " + weight + ")";
        }
    }

    List<List<Pair>> adjList;

    AdjacencyListWithWeight(int nodes){
        adjList = new ArrayList<>();
        for (int i = 0;i<nodes; i++){
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdges(int [][] edges, boolean isDirected){
        for(int []edge : edges){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            if (isDirected){
                Pair pair = new Pair(v, w);
                adjList.get(u).add(pair);
            }else {
                Pair pair = new Pair(v, w);
                adjList.get(u).add(pair);
                Pair pair1 = new Pair(u, w);
                adjList.get(v).add(pair1);
            }
        }
    }

    public void printListWithWeight(){
        for (int i=0; i<adjList.size(); i++){
            System.out.print(i + " -> ");
            for (int j=0; j<adjList.get(i).size(); j++){
                System.out.print(adjList.get(i).get(j) + " ");
            }
        }
    }

    public static void main(String args[]){
        AdjacencyListWithWeight adjacencyList = new AdjacencyListWithWeight(4);
        int [][]edgesArray = {{0,2,10}, {0,1,20}, {1,3, 30}};
        System.out.println("Directed Graph");
        adjacencyList.addEdges(edgesArray, Boolean.TRUE);
        adjacencyList.printListWithWeight();
        System.out.println();
        System.out.println("UnDirected Graph");
        AdjacencyListWithWeight adjacencyList1 = new AdjacencyListWithWeight(4);
        adjacencyList1.addEdges(edgesArray, Boolean.FALSE);
        adjacencyList1.printListWithWeight();
    }

}
