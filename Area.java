
package calculoarea;


public class Area {
    private int largo;
    private int ancho;

    /**
     * @return the largo
     */
    public int getLargo() {
        return largo;
    }

    /**
     * @param largo the largo to set
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }

    /**
     * @return the ancho
     */
    public int getAncho() {
        return ancho;
    }
   public int calcularArea() {
    return largo * ancho;
    /**
     * @param ancho the ancho to set
     */
   }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
}
