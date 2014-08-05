package Final;
/*******************************************
  Universidad del Valle de Guatemala
  Algoritmos y Estructura de Datos
  Autores:
  Juan Tzun         Carnet 13017
  Carlos Cordero    Carnet 13152
  Fecha: 08/05/2014
********************************************/
public interface List<E> {
   public int size();
   // post: returns number of elements in list

   public boolean isEmpty();
   // post: returns true iff list has no elements

   public void addFirst(E value);
   // post: value is added to beginning of list

   public void addLast(E value);
   // post: value is added to end of list

   public E getFirst();
   // pre: list is not empty
   // post: returns first value in list

   public E removeFirst();
   // pre: list is not empty
   // post: removes first value from list


}
