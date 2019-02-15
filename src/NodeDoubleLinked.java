public class NodeDoubleLinked<E> {
    private E data;
    private NodeDoubleLinked<E> nextElement;
    private NodeDoubleLinked<E> previousElement;

    public NodeDoubleLinked(E v, NodeDoubleLinked<E> next, NodeDoubleLinked<E> previous) {
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }

    public NodeDoubleLinked(E v) {
        // post: constructs a single element
        this(v,null,null);
    }
}
