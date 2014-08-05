package Final;
/*******************************************
  Universidad del Valle de Guatemala
  Algoritmos y Estructura de Datos
  Autores:
  Juan Tzun         Carnet 13017
  Carlos Cordero    Carnet 13152
  Fecha: 08/05/2014
********************************************/
public class DoubleList<E> extends AbstractList<E> {
    protected int count;
    protected DoublyLinkedNode<E> head;
    protected DoublyLinkedNode<E> tail;

    public DoubleList()
    // post: constructs an empty list
    {
       head = null;
       tail = null;
       count = 0;
    }

    public int size()
    // post: returns number of elements in list
    {
      return count;
    }
    
    public E removeFirst()
    // pre: list is not empty
    // post: removes and returns value from beginning of list
    {
        DoublyLinkedNode<E> temp = head;
        head = head.next(); // move head down list
        count--;
        return temp.value();
    }
     
     public E getFirst()
    // pre: list is not empty
    // post: returns first value in list
    {
        return head.value();
    }
     
    public void addFirst(E value)
    // pre: value is not null
    // post: adds element to head of list
    {
       // construct a new element, making it head
       head = new DoublyLinkedNode<E>(value, head, null);
       // fix tail, if necessary
       if (tail == null) tail = head;
       count++;
    }


    public void addLast(E value)
    // pre: value is not null
    // post: adds new value to tail of list
    {
       // construct new element
       tail = new DoublyLinkedNode<E>(value, null, tail);
       // fix up head
       if (head == null) head = tail;
       count++;
    }


    public E removeLast()
    // pre: list is not empty
    // post: removes value from tail of list
    {
       DoublyLinkedNode<E> temp = tail;
       tail = tail.previous();
       if (tail == null) {
           head = null;
       } else {
           tail.setNext(null);
       }
       count--;
       return temp.value();
    }
}
