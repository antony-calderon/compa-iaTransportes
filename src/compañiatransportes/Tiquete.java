
package compañiatransportes;


public class Tiquete {
    private String numeroViaje;
    private String fecha;
    private String hora;
    private String nombrePasajero;
    private int costo;

    /**
     * @return the numeroViaje
     */
    public String getNumeroViaje() {
        return numeroViaje;
    }

    /**
     * @param numeroViaje the numeroViaje to set
     */
    public void setNumeroViaje(String numeroViaje) {
        this.numeroViaje = numeroViaje;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the nombrePasajero
     */
    public String getNombrePasajero() {
        return nombrePasajero;
    }

    /**
     * @param nombrePasajero the nombrePasajero to set
     */
    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }

    /**
     * @return the costo
     */
    public int getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }
}
