import static org.junit.Assert.*;
import org.junit.*;

public class TestGraph_M {

    @Test
    public void testAddVertex() {
        Graph_M g = new Graph_M();
        g.addVertex("TestVertex");
        assertTrue(g.containsVertex("TestVertex"));
    }

    @Test
    public void testAddEdge() {
        Graph_M g = new Graph_M();
        g.addVertex("Vertex1");
        g.addVertex("Vertex2");
        g.addEdge("Vertex1", "Vertex2", 10);
        assertTrue(g.containsEdge("Vertex1", "Vertex2"));
    }

    @Test
    public void testRemoveVertex() {
        Graph_M g = new Graph_M();
        g.addVertex("TestVertex");
        g.removeVertex("TestVertex");
        assertFalse(g.containsVertex("TestVertex"));
    }

    @Test
    public void testRemoveEdge() {
        Graph_M g = new Graph_M();
        g.addVertex("Vertex1");
        g.addVertex("Vertex2");
        g.addEdge("Vertex1", "Vertex2", 10);
        g.removeEdge("Vertex1", "Vertex2");
        assertFalse(g.containsEdge("Vertex1", "Vertex2"));
    }

    @Test
    public void testDijkstra() {
        Graph_M g = new Graph_M();
        Graph_M.Create_Metro_Map(g);
        int distance = g.dijkstra("Airport", "Egmore Metro", false);
        assertEquals(6300, distance); // Adjust the expected value based on your specific map
    }
}

// Use the following Command to Compile 
//javac -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar TestGraph_M.java 
//Use the following Command to Run
//java -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore TestGraph_M 


