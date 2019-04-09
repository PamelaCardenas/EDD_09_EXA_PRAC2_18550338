/*
 * 
 */

/**
 *
 * @author Karla Pamela Cardenas Leyva 18550338
 */
public class Vertice {
    //ATRIBUTOS VALOR
    private String dato;
    //ATRIBUTO PARA CREAR LA LISTA (REFERENCIAS)
    private Vertice sig;

    public Vertice() {
        this.sig = null;
    }

    public Vertice(String dato) {
        this.dato = dato;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Vertice getSig() {
        return sig;
    }

    public void setSig(Vertice sig) {
        this.sig = sig;
    }
    
}
