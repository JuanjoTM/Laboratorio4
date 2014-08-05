package Final;
/*******************************************
  Universidad del Valle de Guatemala
  Algoritmos y Estructura de Datos
  Autores:
  Juan Tzun         Carnet 13017
  Carlos Cordero    Carnet 13152
  Fecha: 08/05/2014
********************************************/

//Implementacion del Singleton
//*****************COMIENZO***********************
public class Calculadora {
    //ATRIBUTOS
    private static Calculadora instancia = null;
    private Archivo miArchivo;
    private StackVector miPila;
    private String postfix;

    //Inicializa el archivo y la pila
    private Calculadora(String nombreArchivo){
            miArchivo = new Archivo(nombreArchivo);
            miPila = new StackVector<String>();
            postfix = miArchivo.leerArchivo();
    }
    
    // creador sincronizado para protegerse de posibles problemas  multi-hilo
    // otra prueba para evitar instanciación múltiple 
    private synchronized static void createInstance() {
        if (instancia == null) { 
            instancia = new Calculadora("prueba");
        }
        else
            System.out.println("Ya existe una Calculadora creada");
    }
 
    public static Calculadora getInstance() {
        if (instancia == null) createInstance();
        return instancia;
    }
    //**********************FINAL*********************
    
    //Divide y guarda los elementos del postfix en la pila
    public void separarGuardar(){
            String[] elementos = postfix.split("\\s+");
            int i = elementos.length - 1;
            while(i>=0){
                    miPila.push(elementos[i]);
                    i--;
            }
    }

    //Opera el postfix, se repite hasta no encontrar mas operadores
    public double operar(){
            double a,b, resultado = 0;
            String operacion;
            while(miPila.size()>2){
                    a = Double.parseDouble(miPila.pop()+"");
                    b = Double.parseDouble(miPila.pop()+"");
                    operacion = miPila.pop()+"";
                    if(operacion.equals("+")){
                            resultado = a + b;
                            miPila.push(resultado+"");
                    }
                    if(operacion.equals("-")){
                            resultado = a - b;
                            miPila.push(resultado+"");
                    }
                    if(operacion.equals("*")){
                            resultado = a * b;
                            miPila.push(resultado+"");
                    }
                    if(operacion.equals("/")){
                            resultado = a / b;
                            miPila.push(resultado+"");
                    }
            }
            return resultado;
    }
}