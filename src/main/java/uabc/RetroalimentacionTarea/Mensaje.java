package uabc.RetroalimentacionTarea;

/**
 *
 * @author Alexandra Anchondo Robles
 */
public class Mensaje {
    
    //Método para dar la retroalimentación en base a la calificación
    public String mensaje(int op, String tema){
        String mensaje = "";
        if (op == 1){
            mensaje = "La tarea sobre "+tema+" cumple con todos los criterios: 100"; 
        } else if (op == 2){
            mensaje = "La tarea sobre "+tema+" solo cumple con la mitad de los criterios: 50";
        } else if (op == 3){
            mensaje = "La tarea sobre "+tema+" no cumple con los criterios: 0";
        }
        return mensaje; 
    }
}
