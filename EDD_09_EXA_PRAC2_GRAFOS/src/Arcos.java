/*
 * 
 */

/**
 *
 * @author Pamela Cardenas
 */
public class Arcos {
    
    private String nombre;
    private int i;
    private int j;
    
    private Arcos sig;

    public Arcos() {
        this.sig = null;
    }

    public Arcos(String nombre, int i, int j) {
        this.nombre = nombre;
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Arcos getSig() {
        return sig;
    }

    public void setSig(Arcos sig) {
        this.sig = sig;
    }
    
    
}
