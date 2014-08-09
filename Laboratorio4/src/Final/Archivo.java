package Final;
/*******************************************
  Universidad del Valle de Guatemala
  Algoritmos y Estructura de Datos
  Autores:
  Juan Tzun         Carnet 13017
  Carlos Cordero    Carnet 13152
  Fecha: 08/05/2014
********************************************/
import java.io.*;
public class Archivo {
    //ATRIBUTOS
    private File archivo;
    private BufferedReader br;
    private FileReader fr;

    //Constructor
    public Archivo(String nombre){
            archivo = new File(nombre);
            if(!archivo.exists()){
                    System.out.print("No existe el archivo");
            }
            else{
                    try{
                            fr = new FileReader(archivo);
                            br = new BufferedReader(fr);
                    }catch (Exception e){
                            System.out.println(e.getMessage());
                    }
            }

    }

    //Metodo que permite leer el contenido del archivo de texto
    public String leerArchivo(){
            String contenido = new String("");
            try{
                    String Slinea;
                    while((Slinea=br.readLine())!=null){
                            contenido = Slinea;
                    }
                    fr.close();
            }catch (Exception e){
                    System.out.println(e.getMessage());
            }

            return contenido;
    }
}