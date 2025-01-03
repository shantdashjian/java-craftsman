package chapter3.document_implementation_decisions.solution;

public class Supply implements Comparable<Supply> {

    private String name;

    public Supply(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Supply o) {
        return this.name.compareTo(o.name);
    }
}
