package Final;
/*******************************************
  Universidad del Valle de Guatemala
  Algoritmos y Estructura de Datos
  Autores:
  Juan Tzun         Carnet 13017
  Carlos Cordero    Carnet 13152
  Fecha: 08/05/2014
********************************************/
public class StackList<E> extends AbstractStack<E> {
    protected List<E> data;
    protected ListFactory<E> factory;

    public StackList(String entry)
    // post: constructs a new, empty stack
    {
            factory = new ListFactory();
            data = factory.getList(entry);
    }

    public void push(E item)
    // post: the value is added to the stack
    //          will be popped next if no intervening push
    {
            data.addFirst(item);
    }

    public E pop()
    // pre: stack is not empty
    // post: most recently pushed item is removed and returned
    {
            return data.removeFirst();
    }

    public E peek()
    // pre: stack is not empty
    // post: top value (next to be popped) is returned
    {
            return data.removeFirst();
    }

    public int size()
    // post: returns the number of elements in the stack
    {
            return data.size();
    }
}
