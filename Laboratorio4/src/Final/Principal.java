package Final;
/*******************************************
  Universidad del Valle de Guatemala
  Algoritmos y Estructura de Datos
  Autores:
  Juan Tzun         Carnet 13017
  Carlos Cordero    Carnet 13152
  Fecha: 08/05/2014
********************************************/
public class Principal {
    public static void main(String[] args){
            Calculadora miCalculadora = new Calculadora("prueba");
            miCalculadora.separarGuardar();
            double resultado = miCalculadora.operar();
            System.out.println(resultado+"");
    }
}