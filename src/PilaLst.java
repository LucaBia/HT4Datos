public class PilaLst<E> extends Pila<E> {

    private Lista lst;

    public PilaLst(String t) {
        lst = FactoryLista.createTypeList(t);
    }

    @Override
    public void push(E item) {
        //Will be popped next if no intervening push
        lst.addLast(item);
    }

    @Override
    public E pop() {
        //Most recently pushed item is removed and returned
        return (E) lst.removeLast();
    }

    @Override
    public E peek() {
        //Top value (next to be popped) is returned
        return (E) lst.get(size() -1);
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
