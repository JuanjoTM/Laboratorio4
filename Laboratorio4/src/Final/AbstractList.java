package Final;
/*******************************************
  Universidad del Valle de Guatemala
  Algoritmos y Estructura de Datos
  Autores:
  Juan Tzun         Carnet 13017
  Carlos Cordero    Carnet 13152
  Fecha: 08/05/2014
********************************************/
abstract public class AbstractList<E> 
implements List<E>
{
    public AbstractList()
   // post: does nothing
   {
   }

   public boolean isEmpty()
   // post: returns true iff list has no elements
   {
      return size() == 0;
   }
  
}
