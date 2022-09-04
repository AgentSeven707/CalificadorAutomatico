package uabc.RetroalimentacionTarea;

/**
 *
 * @author Princ
 */
public class Analisis {

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
