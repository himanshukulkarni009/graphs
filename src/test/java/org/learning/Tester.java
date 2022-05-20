package org.learning;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class Tester {

    @Test
    public void testAddingNodes() {
        Graph<Integer> g = new Graph<>();
        g.addNode(1);
        g.addNode(2);

        Map<Graph.Node<Integer>, List<Graph.Node<Integer>>> nodes = g.getNodes();
        Assert.assertEquals(2, nodes.size());
    }

    @Test
    public void testShouldNotAllowDuplicates() {
        Graph<Integer> g = new Graph<>();
        g.addNode(1);
        g.addNode(1);

        Map<Graph.Node<Integer>, List<Graph.Node<Integer>>> nodes = g.getNodes();
        Assert.assertEquals(1, nodes.size());
    }

    @Test
    public void testAddingEdges() {
        Graph<Integer> g = new Graph<>();
        g.addNode(1);
        g.addNode(2);

        g.setEdge(1, 2);

        System.out.println(g.getNodes());
    }
}
