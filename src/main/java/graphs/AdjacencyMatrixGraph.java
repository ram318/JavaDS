package graphs;

import java.util.List;
import java.util.ArrayList;

public class AdjacencyMatrixGraph implements Graph {

    int[][] graph;
    private int numOfvertices;
    private GraphType graphType = GraphType.DIRECTED;

    AdjacencyMatrixGraph(int numOfvertices, GraphType graphType) {
        this.graphType = graphType;
        this.numOfvertices = numOfvertices;
        graph = new int[numOfvertices][numOfvertices];
        for (int i = 0; i < numOfvertices; i++) {
            for (int j = 0; j < numOfvertices; j++) {
                graph[i][j] = 0;
            }
        }
    }

    public int getNumOfVertices() {
        return this.numOfvertices;
    }

    public List<Integer> getAdjacentVertices(int vertex) {
        List<Integer> adjVertex = new ArrayList<Integer>();
        for (int i = 0; i < numOfvertices; i++) {
            if (graph[vertex][i] != 0) {
                adjVertex.add(i);
            }
        }

        return adjVertex;
    }

    public int inDegree(int vertex) {

        int inDegree = 0;
        for (int i = 0; i < numOfvertices; i++) {
            if (graph[i][vertex] != 0) {
                inDegree++;
            }
        }

        return inDegree;

    }

    public void addEdge(int vertex1, int vertex2) {
        graph[vertex1][vertex2] = 1;
        if (graphType == GraphType.UNDIRECTED) {
            graph[vertex2][vertex1] = 1;
        }
    }

    public void addEdge(int vertex1, int vertex2, int weight) {
        graph[vertex1][vertex2] = weight;
        if (graphType == GraphType.UNDIRECTED) {
            graph[vertex2][vertex1] = weight;
        }
    }

    public GraphType TypeofGraph() {
        return graphType;
    }

}
