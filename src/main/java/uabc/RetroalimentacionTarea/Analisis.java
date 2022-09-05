package uabc.RetroalimentacionTarea;

/**
 *
 * @author Alexandra Anchondo Robles
 */
public class Analisis {

    //Método que lee una calificación y la desgloca en 3 posibles escenarios
    public int analisis(int calif){
        int op = 0; 
        if (calif == 100){
            op = 1; 
        } else if (calif == 50){
            op = 2; 
        } else if (calif == 0){
            op = 3; 
        }
        return op; 
    }
}
