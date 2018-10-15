package DepthFirstSearch;

import java.util.LinkedList;
import java.util.List;

public class Vertex {

    private String name;
    private boolean visited;
    private List<Vertex> neighbourList;

    public Vertex(String name) {
        this.name = name;
        this.neighbourList = new LinkedList<>();
    }

    public void addNeighbour(Vertex vertex) {
        this.neighbourList.add(vertex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public List<Vertex> getNeighbourList() {
        return neighbourList;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setNeighbourList(List<Vertex> neighbourList) {
        this.neighbourList = neighbourList;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
