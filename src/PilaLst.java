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

    /**
     * elimento push, es eliminado
     * @return elemento eliminado
     */
    @Override
    public E pop() {
        //Most recently pushed item is removed and returned
        return (E) lst.removeLast();
    }

    /**
     * Proximo valor a pop
     * @return valor
     */
    @Override
    public E peek() {
        //Top value (next to be popped) is returned
        return (E) lst.get(size() -1);
    }

    /**
     * Valida si esta vacio el stack
     * @return true/false
     */
    @Override
    public boolean empty() {
        //Returns true if and only if the stack is empty
        return lst.isEmpty();
    }

    /**
     * Retorna la cantidad de elementos en el stack
     * @return tamanio
     */
    @Override
    public int size() {
        //Returns the number of elements in the stack
        return lst.size();
    }
}
