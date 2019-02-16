/**
 * Clase del nodo para simplelinked
 * @param <E> generico
 */
public class Node<E> {

    private E data; // value stored in this element
    private Node<E> nextElement; // ref to next

    /**
     *  Nueva cabeza de la lista
     * @param v valor
     * @param next referencia al remainder de la lista
     */
    public Node(E v, Node<E> next) {
        // pre: v is a value, next is a reference to remainder of list
        // post: an element is constructed as the new head of list
        data = v;
        nextElement = next;
    }

    /**
     * Construye la nueva cola de la lista
     * @param v valor
     */
    public Node(E v) {
        // post: constructs a new tail of a list with value v
        this(v,null);
    }

    /**
     * referencia al siguiente valor
     * @return siguiente elemento
     */
    public Node<E> next() {
        // post: returns reference to next value in list
        return nextElement;
    }

    /**
     * nuevo valor que sigue
     * @param next proximo valor
     */
    public void setNext(Node<E> next) {
        // post: sets reference to new next value
        nextElement = next;
    }

    /**
     * retorna un valor que este asociado al elemento
     * @return el valor
     */
    public E value() {
        // post: returns value associated with this element
        return data;
    }

    /**
     * setea un valor asociado al elemento
     * @param value valor
     */
    public void setValue(E value) {
        // post: sets value associated with this element
        data = value;
    }
}
