package org.learning;

import java.util.*;

public class Graph<T> {

    private Map<Node<T>, List<Node<T>>> nodes;

    public Graph() {
        this.nodes = new HashMap<>();
    }

    public void addNode(T value) {
        this.nodes.put(new Node<>(value), new ArrayList<>());
    }

    public Map<Node<T>, List<Node<T>>> getNodes() {
        return this.nodes;
    }

    public void setEdge(T value1, T value2) {
        Node<T> node1 = new Node<>(value1);
        Node<T> node2 = new Node<>(value2);

        this.nodes.get(node1).add(node2);
        this.nodes.get(node2).add(node1);
    }


    public static class Node<T> {
        T value;

        public Node(T value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?> node = (Node<?>) o;
            return Objects.equals(value, node.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
