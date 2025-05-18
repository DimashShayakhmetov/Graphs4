import java.util.*;

public class Vertex<T> {
    private T data;
    private T source;
    private T dest;
    private Double weight;
    private Map<T, Double> adjacentVertices;

    public Vertex(T data) {
        this.data = data;
        this.adjacentVertices = new HashMap<>();
    }

    public Vertex(T source, T dest, Double weight) {
        this.source = source;
        this.dest = dest;
        this.weight = weight;
    }

    public Vertex(T source, T dest) {
        this.source = source;
        this.dest = dest;
    }

    public void setSource(T source) {
        this.source = source;
    }

    public T getSource() {
        return source;
    }

    public void setDest(T dest) {
        this.dest = dest;
    }

    public T getDest() {
        return dest;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void addAdjacentVertex(T vertex, Double weight) {
        adjacentVertices.put(vertex, weight);
    }

    public Map<T, Double> getAdjacentVertices() {
        return adjacentVertices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Vertex<?> otherVertex = (Vertex<?>) o;

        return Objects.equals(this.source, otherVertex.source) &&
                Objects.equals(this.dest, otherVertex.dest);
    }
}