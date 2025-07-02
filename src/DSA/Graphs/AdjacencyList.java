package DSA.Graphs;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {
    List<List<Integer>> adjList;

    AdjacencyList(int nodes){
        adjList = new ArrayList<>();
        for (int i = 0;i<nodes; i++){
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdges(int [][] edges, boolean isDirected){
        for(int []edge : edges){
            int u = edge[0];
            int v = edge[1];
            if (isDirected){
                adjList.get(u).add(v);
            }else {
                adjList.get(u).add(v);
                adjList.get(v).add(u);
            }
        }
    }

    public void printList(){
        for (int i=0; i<adjList.size(); i++){
            System.out.print(i + " -> ");
            for (int j=0; j<adjList.get(i).size(); j++){
                System.out.print(adjList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        AdjacencyList adjacencyList = new AdjacencyList(4);
        int [][]edgesArray = {{0,2,10}, {0,1,20}, {1,3, 30}};
        System.out.println("Directed Graph");
        adjacencyList.addEdges(edgesArray, Boolean.TRUE);
        adjacencyList.printList();
        System.out.println("UnDirected Graph");
        AdjacencyList adjacencyList1 = new AdjacencyList(4);
        adjacencyList1.addEdges(edgesArray, Boolean.FALSE);
        adjacencyList1.printList();
    }

}
