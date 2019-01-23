package graphs;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class TopologicalSort {
    
    public static void main(String args[]){
        
        //Prepare the graph        
        AdjacencyMatrixGraph graph1 = new AdjacencyMatrixGraph(8,Graph.GraphType.DIRECTED);
        graph1.addEdge(2, 7);
        graph1.addEdge(0, 3);
        graph1.addEdge(0, 4);
        graph1.addEdge(0, 1);
        graph1.addEdge(2, 1);
        graph1.addEdge(1, 3);
        graph1.addEdge(3, 5);
        graph1.addEdge(3, 6);
        graph1.addEdge(4, 7);  
        
        sort(graph1);
    }
    
    public static void sort(Graph graph){
        
        LinkedList<Integer> queue = new LinkedList<Integer>();
        LinkedList<Integer> sortedList = new LinkedList<Integer>();
        
        //FIND INDEGREES AND SAVE IT IN A MAP
        //IF INDEGREE IS ZERO, ADD THE VERTEX TO queue and ADD THE VERTEX TO THE RESULT SORTEDLIST
        //START WITH VERTEX WITH INDEGREE 0 and GET THE ADJACENT VERTICES
        //UPDATE THE INDEGREE OF ADJACENET VERTICES BY SUBRACTING 1
        //ADD THE VERTEX WITH INDEGREE=0 to queue
        
        //FIND INDEGREES AND SAVE IT IN A MAP
        Map<Integer,Integer> inDegreeMap = new HashMap();
        for(int vertex =0;vertex<graph.getNumOfVertices();vertex++){
            int inDegree = graph.inDegree(vertex);
            inDegreeMap.put(vertex, inDegree);
            
            if(inDegree == 0)
            {
                queue.add(vertex);
               
            }
        }
        
        while(!queue.isEmpty()){
            int vertex = queue.pollLast();
            sortedList.add(vertex);
            List<Integer> adjVertices = graph.getAdjacentVertices(vertex);
            for(int adjVertex : adjVertices){
                int inDegreeTemp = inDegreeMap.get(adjVertex);
                if(inDegreeTemp-1==0){
                    queue.add(adjVertex);
                   
                }
                inDegreeMap.remove(adjVertex);
                inDegreeMap.put(adjVertex,inDegreeTemp-1);
            }
        }
        if(sortedList.size()!=graph.getNumOfVertices()){
            throw new RuntimeException("GRAPH HAS A CYCLE");
        }
        System.out.println(sortedList);
        
    }
}
