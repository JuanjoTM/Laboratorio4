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
    private String postfix;
    private Double resultado;

    //Inicializa el archivo y la pila
    private Calculadora(){
        resultado = 0.0;
    }
    
    // creador sincronizado para protegerse de posibles problemas  multi-hilo
    // otra prueba para evitar instanciación múltiple 
    private synchronized static void createInstance() {
        if (instancia == null) { 
            instancia = new Calculadora();
        }
        else
            System.out.println("Ya existe una Calculadora creada");
    }
 
    public static Calculadora getInstance() {
        if (instancia == null) createInstance();
        return instancia;
    }
    //**********************FINAL*********************
    
    //Cambia el postfix
    public void setPostfix(String postfix){
        this.postfix = postfix;
        
    }
    //Obtiene el resultado
    public Double getResultado(){
        return resultado;
    }
    
    //Divide y guarda los elementos del postfix en la pila
    public void separarGuardar(Stack miPila){
            String[] elementos = postfix.split("\\s+");
            int i = elementos.length - 1;
            while(i>=0){
                    miPila.push(elementos[i]);
                    i--;
            }
    }

    //Opera el postfix, se repite hasta no encontrar mas operadores
    public void operar(Stack miPila){
            double a,b = 0;
            String operacion;
            while(miPila.size()>2){
                    a = Double.parseDouble(miPila.pop()+"");
                    b = Double.parseDouble(miPila.pop()+"");
                    operacion = miPila.pop()+"";
                    if(operacion.equals("+")){
                            this.resultado = a + b;
                            miPila.push(this.resultado+"");
                    }
                    if(operacion.equals("-")){
                            this.resultado = a - b;
                            miPila.push(this.resultado+"");
                    }
                    if(operacion.equals("*")){
                            this.resultado = a * b;
                            miPila.push(this.resultado+"");
                    }
                    if(operacion.equals("/")){
                            this.resultado = a / b;
                            miPila.push(this.resultado+"");
                    }
            }
    }
}