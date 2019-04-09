/*
 * 
 */

/**
 *
 * @author INTEGRANTES DEL	EQUIPO:

	---> Luisa María González Ordóñez 18550352
	---> Karla Pamela Cárdenas Leyva 18550338
	---> Josué David Martínez García 18550360
	---> Roberto Antonio Pedroza Fernández 18550354
	---> Irving Gerardo Mancera Mejía 18550317
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
