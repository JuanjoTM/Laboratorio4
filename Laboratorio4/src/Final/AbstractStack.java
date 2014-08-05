package Final;
/*******************************************
  Universidad del Valle de Guatemala
  Algoritmos y Estructura de Datos
  Autores:
  Juan Tzun         Carnet 13017
  Carlos Cordero    Carnet 13152
  Fecha: 08/05/2014
********************************************/

abstract public class AbstractStack<E> 
implements Stack<E>
{
      public boolean empty()
   // post: regresa true si el stack esta vacio
   {
      return size() == 0;
   }
}