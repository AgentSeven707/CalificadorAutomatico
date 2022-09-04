package uabc.RetroalimentacionTarea;

/**
 *
 * @author Princ
 */
public class Mensaje {
    
    public String mensaje(int op, String tema){
        String mensaje = "";
        if (op == 1){
            mensaje = "Calificación de la tarea sobre "+tema+": 100"; 
        } else if (op == 2){
            mensaje = "Calificación de la tarea sobre "+tema+": 50";
        } else if (op == 3){
            mensaje = "Calificación de la tarea sobre "+tema+": 0";
        }
        return mensaje; 
    }
}
