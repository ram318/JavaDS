package graphs;

import java.util.List;

public interface Graph {
    
    enum GraphType{
        DIRECTED, UNDIRECTED
    };
    
    int getNumOfVertices();
    List<Integer> getAdjacentVertices(int vertex);
    int inDegree(int vertex);
    
    void addEdge(int vertex1, int vertex2);
    void addEdge(int vertex1, int vertex2,int weight);
}
