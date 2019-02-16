/**
 * Clase lista doublelinked
 * @param <E> generico
 */
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

    /**
     * Construye un elemento
     * @param v valor
     */
    public NodeDoubleLinked(E v) {
        // post: constructs a single element
        this(v,null,null);
    }

    /**
     * referencia al siguiente valor en la lista
     * @return siguiente elemento
     */
    public NodeDoubleLinked<E> next() {
        // post: returns reference to next value in list
        return nextElement;
    }

    /**
     * Referencua ak siguiente nuevo valor
     * @param next proximo
     */
    public void setNext(NodeDoubleLinked<E> next) {
        // post: sets reference to new next value
        nextElement = next;
    }

    /**
     * retorna un valor asociado con el elemento
     * @return el valor
     */
    public E value() {
        // post: returns value associated with this element
        return data;
    }

    /**
     * Setea un valor asociado al elemento
     * @param value valor
     */
    public void setValue(E value) {
        // post: sets value associated with this element
        data = value;
    }

    /**
     * Retorna el anterior elemento
     * @return elemento precio
     */
    public NodeDoubleLinked previous() {
        return this.previousElement;
    }
}
