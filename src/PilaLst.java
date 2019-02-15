import java.util.ArrayList;
import java.util.List;

public class PilaLst<E> extends Pila<E> {

    private List<E> lst;

    public PilaLst() {
        lst = new ArrayList<>();
    }

    @Override
    public void push(E item) {
        //Will be popped next if no intervening push
        lst.add(item);
    }

    @Override
    public E pop() {
        //Most recently pushed item is removed and returned
        return lst.remove(size() -1);
    }

    @Override
    public E peek() {
        //Top value (next to be popped) is returned
        return lst.get(size() -1);
    }

    @Override
    public boolean empty() {
        //Returns true if and only if the stack is empty
        return lst.isEmpty();
    }

    @Override
    public int size() {
        //Returns the number of elements in the stack
        return lst.size();
    }
}
