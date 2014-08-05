package Final;
/*******************************************
  Universidad del Valle de Guatemala
  Algoritmos y Estructura de Datos
  Autores:
  Juan Tzun         Carnet 13017
  Carlos Cordero    Carnet 13152
  Fecha: 08/05/2014
********************************************/

public class ListFactory<E> {
    //selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory
   public List<E> getList(String entry) {
    // seleccion de la implementacion a utilizar:
	if (entry.equals("S"))
            return new SingleList<E>(); //regresa Encadenada Simple
        else if(entry.equals("C"))
            return new CircularList<E>(); //regresa Encadenada Circular
        else
            return new DoubleList<E>(); //regresa Encadenada Doble
   }
}
