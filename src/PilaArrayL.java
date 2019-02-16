import java.util.ArrayList;

public class PilaArrayL<E> extends Pila<E>{

    private ArrayList<E> arraylst;

    public PilaArrayL() {
        arraylst = new ArrayList<>();
    }

    @Override
    public void push(E item) {
        //Will be popped next if no intervening push
        arraylst.add(item);
    }

    @Override
    public E pop() {
        //Most recently pushed item is removed and returned
        return arraylst.remove(size() -1);
    }

    @Override
    public E peek() {
        //Top value (next to be popped) is returned
        return arraylst.get(size() -1);
    }

    /**
     * Valida si el stack esta vacio
     * @return true/false
     */
    @Override
    public boolean empty() {
        //Returns true if and only if the stack is empty
        return arraylst.isEmpty();
    }

    /**
     * Cantidad de elementos en el stack
     * @return tamanio
     */
    @Override
    public int size() {
        //Returns the number of elements in the stack
        return arraylst.size();
    }

}
