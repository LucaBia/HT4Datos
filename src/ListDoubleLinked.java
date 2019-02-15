import java.util.Iterator;

public class ListDoubleLinked<E> extends AbstractList<E> {
    private int count;
    protected NodeDoubleLinked<E> head;
    private NodeDoubleLinked<E> tail;

    public ListDoubleLinked() {
        // post: constructs an empty list
        head = null;
        tail = null;
        count = 0;
    }

    @Override
    public void addFirst(E value) {
        // pre: value is not null
        // post: adds element to head of list
        // construct a new element, making it head
        head = new NodeDoubleLinked<E>(value, head, null);
        // fix tail, if necessary
        if (tail == null) tail = head;
        count++;
    }

    @Override
    public void addLast(E value) {
        // pre: value is not null
        // post: adds new value to tail of list
        // construct new element
        tail = new NodeDoubleLinked<E>(value, null, tail);
        // fix up head
        if (head == null) head = tail;
        count++;
    }

    @Override
    public E removeLast() {
        //####################################################################################################
        // pre: list is not empty
        // post: removes value from tail of list
        /*
        NodeDoubleLinked<E> temp = tail;
        tail = tail.previous();
        if (tail == null) {
            head = null;
        } else {
            tail.setNext(null);
        }
        count--;
        return temp.value();
        */
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public E getFirst() {
        return null;
    }

    @Override
    public E getLast() {
        return null;
    }

    @Override
    public E removeFirst() {
        return null;
    }


    @Override
    public E remove(E value) {
        return null;
    }

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
