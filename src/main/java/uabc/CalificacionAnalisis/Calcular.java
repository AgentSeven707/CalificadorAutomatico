package uabc.CalificacionAnalisis;

/**
 *
 * @author Alexandra Anchondo Robles
 */
public class Calcular {

    public int Calificacion(boolean tipo, boolean extension) {
        int calif = 0;
        if (tipo == true && extension == true) {
            calif = 100;
        } else if (tipo == false && extension == true || tipo == true && extension == false) {
            calif = 50;
        } else if (tipo == false && extension == false) {
            calif = 0;
        }
        return calif;
    }
}
