import java.util.Iterator;

/**
 * calae lista simple linked
 * @param <E> generico
 */
public class ListSimpleLinked<E> extends AbstractList<E> {

    private int count; // list size
    protected Node<E> head; // ref. to first element

    public ListSimpleLinked() {
        // post: generates an empty list
        head = null;
        count = 0;
    }

    /**
     * Tamanio de la lista
     * @return tamanio
     */
    @Override
    public int size() {
        // post: returns number of elements in list
        return count;
    }

    /**
     * Agrega al inicio de la lista
     * @param value valor
     */
    @Override
    public void addFirst(E value) {
        // post: value is added to beginning of list
        // note order that things happen:
        // head is parameter, then assigned
        head = new Node<E>(value, head);
        count++;
    }

    /**
     * Elimina el primero de la lista
     * @return valor
     */
    @Override
    public E removeFirst() {
        // pre: list is not empty
        // post: removes and returns value from beginning of list
        Node<E> temp = head;
        head = head.next(); // move head down list
        count--;
        return temp.value();
    }

    /**
     * Captura el primer elemento
     * @return valor
     */
    @Override
    public E getFirst() {
        // pre: list is not empty
        // post: returns first value in list
        return head.value();
    }

    /**
     * Elimina el ultimo elemento
     * @return valor
     */
    @Override
    public E removeLast() {
        Node<E> finger = head;
        Node<E> previous = null;

        while (finger.next() != null) {
            previous = finger;
            finger = finger.next();
        }

        if (previous == null) {
            head = null;
        } else {
            previous.setNext(null);
        }
        count--;
        return finger.value();
    }

    /**
     * Agrega como ultimo elemento
     * @param value valor
     */
    @Override
    public void addLast(E value) {
        // post: adds value to end of list
        // location for new value
        Node<E> temp = new Node<E>(value,null);
        if (head != null) {
            // pointer to possible tail
            Node<E> finger = head;
            while (finger.next() != null) {
                finger = finger.next();
            }
            finger.setNext(temp);
        } else head = temp;

        count++;
    }

    /**
     * Verifica que un valor este dentro de la lista
     * @param value valor
     * @return true/false
     */
    @Override
    public boolean contains(E value) {
        // pre: value is not null
        // post: returns true iff value is found in list
        Node<E> finger = head;

        while (finger != null && !finger.value().equals(value)) {
            finger = finger.next();
        }
        return finger != null;
    }

    /**
     * Captura el ultimo valor
     * @return null
     */
    @Override
    public E getLast() {
        return null;
    }

    /**
     * Limpia la lista completa
     */
    @Override
    public void clear() {

    }

    /**
     * Elimina
     * @param value valor
     * @return null
     */
    @Override
    public E remove(E value) {
        return null;
    }

    /**
     * Agrega
     * @param value valor
     */
    @Override
    public void add(E value) {

    }

    @Override
    public E remove() {
        return null;
    }

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
