package Final;
/*******************************************
  Universidad del Valle de Guatemala
  Algoritmos y Estructura de Datos
  Autores:
  Juan Tzun         Carnet 13017
  Carlos Cordero    Carnet 13152
  Fecha: 08/05/2014
********************************************/

class StackFactory<E> {
//selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory
   public Stack<E> getStack(String entry, String type) {
    // seleccion de la implementacion a utilizar:
	if (entry.equals("AL"))
            return new StackArrayList<E>(); //regresa ArrayList
        else if(entry.equals("V"))
            return new StackVector<E>(); //regresa Vector
        else
            return new StackList<E>(type);
   }
}