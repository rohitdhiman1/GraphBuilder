package algo;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;

public class WeightedGraph
{

    //Edge
    static class Edge
    {
        int source;
        int destination;
        int weight;

        public Edge(int source, int dest, int weight)
        {
            this.destination = dest;
            this.source = source;
            this.weight = weight;
        }
    }


    static class Graph
    {
        int vertices;
        LinkedList<Edge> [] adjacencyList;

        Graph(int vertices)
        {
            this.vertices = vertices;
            adjacencyList = new LinkedList[vertices];

            // initialize adjacency list for all vertices
            for(int i=0 ; i < vertices; i++)
            {
                adjacencyList[i] = new LinkedList<>();
            }
        }

        public void addEdge(int source, int dest, int weight)
        {
            Edge edge = new Edge(source,dest,weight);
            adjacencyList[source].add(edge);
        }

        public void printGraph()
        {
            for (int i =0; i < vertices ; i++)
            {
                for (int j =0; j < adjacencyList[i].size(); j ++)
                {
                    System.out.println("vertex-" + i + " is connected to vertex " + adjacencyList[i].get(j).destination + " with weight " + adjacencyList[i].get(j).weight) ;
                }
            }
        }


    }


    public static void main(String args[])
    {
        int vertices = 20;
        Graph graph = new Graph(vertices);
        graph.addEdge(0,1,2);

        graph.printGraph();

    }



}
