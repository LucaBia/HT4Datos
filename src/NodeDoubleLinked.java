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

    public NodeDoubleLinked<E> next() {
        // post: returns reference to next value in list
        return nextElement;
    }

    public void setNext(NodeDoubleLinked<E> next) {
        // post: sets reference to new next value
        nextElement = next;
    }

    public E value() {
        // post: returns value associated with this element
        return data;
    }

    public void setValue(E value) {
        // post: sets value associated with this element
        data = value;
    }

    public NodeDoubleLinked previous() {
        return this.previousElement;
    }
}
