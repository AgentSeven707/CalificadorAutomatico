package uabc.CalificacionAnalisis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Alexandra Anchondo Robles
 */
public class Revisar {

    //Método que analiza si el tipo de tarea es el correspondiente 
    public boolean cumplimientoTipo(String tipo, String archivo) {
        //System.out.println(archivo+" "+tipo);
        boolean resultado = false;
        if (tipo == "resumen") {
            if (archivo.contains("resumen")) {
                resultado = true;
            }
        } else if (tipo == "ensayo") {
            if (archivo.contains("ensayo")) {
                resultado = true;
            }
        } else if (tipo == "preguntas") {
            if (archivo.contains("preguntas")) {
                resultado = true;
            }
        }
        System.out.println(resultado);
        return resultado;
    }

    //Método que analiza si la extensión es la correcta 
    public boolean cumplimientoExtension(int extension, String archivo) {
        //System.out.println(archivo+" "+extension);
        boolean resultado = false; 
        int wordCount = 0; //Contador que va contar las palabras del archivo
        try (FileReader f = new FileReader(archivo); //Lee nuestro archivo
            BufferedReader br = new BufferedReader(f)){ //Abre el archivo para poder leerlo
            String line; //Crea una variable para la linea de nuestro archivo
            while((line = br.readLine()) != null){ //Va recorriendo todo el archivo linea por linea
                String words[] = line.split(" ");
                wordCount += words.length;
            }
        } catch(IOException e){
            System.err.format("IOException: %s%n", e);
        }
        if(wordCount>=extension){
            resultado = true; 
        }
        System.out.println(resultado);
        return resultado;
    }
    
}
