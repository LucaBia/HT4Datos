import java.util.Iterator;

/**
 * Clase de la lista circular
 * @param <E> generico
 */
public class ListCircular<E> extends AbstractList<E> {
    private Node<E> tail;
    private int count;

    public ListCircular() {
        // pre: constructs a new circular list
        tail = null;
        count = 0;
    }

    /**
     * Agrega el valor al inicio
     * @param value valor
     */
    @Override
    public void addFirst(E value) {
        // pre: value non-null
        // post: adds element to head of list
        Node<E> temp = new Node<E>(value);
        if (tail == null) {
            // first value added
            tail = temp;
            tail.setNext(tail);
        } else {
            // element exists in list
            temp.setNext(tail.next());
            tail.setNext(temp);
        }
        count++;
    }

    /**
     * Agrega el valor de ultimo
     * @param value valor
     */
    @Override
    public void addLast(E value) {
        // pre: value non-null
        // post: adds element to tail of list
        // new entry:
        addFirst(value);
        tail = tail.next();
    }

    /**
     * Elimina el ultimo dato de la lista
     * @return valor
     */
    @Override
    public E removeLast() {
        // pre: !isEmpty()
        // post: returns and removes value from tail of list
        Node<E> finger = tail;
        while (finger.next() != tail) {
            finger = finger.next();
        }
        // finger now points to second-to-last value
        Node<E> temp = tail;
        if (finger == tail) {
            tail = null;
        } else {
            finger.setNext(tail.next());
            tail = finger;
        }
        count--;
        return temp.value();
    }

    /**
     * tamanio de la lista
     * @return 0
     */
    @Override
    public int size() {
        return 0;
    }

    /**
     * limpia toda la lista
     */
    @Override
    public void clear() {

    }

    /**
     * Obtiene el primer valor de la lista
     * @return null
     */
    @Override
    public E getFirst() {
        return null;
    }

    /**
     * obtiene el ultimo valor de la lista
     * @return null
     */
    @Override
    public E getLast() {
        return null;
    }

    /**
     * Elimina el primer elemento de la lista
     * @return null
     */
    @Override
    public E removeFirst() {
        return null;
    }

    /**
     * Elimina algun elemento seleccionado
     * @param value valor
     * @return null
     */
    @Override
    public E remove(E value) {
        return null;
    }

    /**
     * Agrega un elemento a la lista
     * @param value valor
     */
    @Override
    public void add(E value) {

    }

    /**
     * Elimina
     * @return null
     */
    @Override
    public E remove() {
        return null;
    }

    /**
     * Captura
     * @return null
     */
    @Override
    public E get() {
        return null;
    }

    @Override
    public int indexOf(E value) {
        return 0;
    }

    @Override
    public int lastIndexOf(E value) {
        return 0;
    }

    @Override
    public E get(int i) {
        return null;
    }

    @Override
    public E set(int i, E o) {
        return null;
    }

    @Override
    public void add(int i, E o) {

    }

    @Override
    public E remove(int i) {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
