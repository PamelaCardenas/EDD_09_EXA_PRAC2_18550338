
import java.util.Scanner;

/*
 * 
 */

/**
 *
 * @author Pamela Cardenas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Grafos G = new Grafos();
        Scanner s = new Scanner(System.in);
        int opc;
        do{
        System.out.println("1) Ingresar vertices \n"
                         + "2) Ingresar Arcos \n"
                         + "0) Salir \n");
        opc = s.nextInt();
        switch(opc){
            case 0:
                System.exit(0);
                break;
            case 1:
                System.out.println("Ingresa cuantos vertices agregarás");
                int cant = s.nextInt();
                for (int i = 0; i < cant; i++) {
                    System.out.println("Ingresa el vertice "+i);;
                    String v = s.next();
                    G.agregarVertice(new Vertice(v));                    
                }
                break;
            case 2:
                System.out.println("Ingresa cuantos arcos vas a crear");
                int cc = s.nextInt();
                for (int i = 0; i < cc; i++) {
                    System.out.println("Ingresa el valor de X");
                    int x = s.nextInt();
                    System.out.println("Ingresa el valor de Y");
                    int y = s.nextInt();
                    if(G.Comparacion(x, y)==false){
                        System.out.println("Ingresa el nombre del arco");
                        String nomb=s.next();
                        G.agregarArco(new Arcos(nomb, x, y));
                    }else
                        System.out.println("Duplicado");
                    
                }
                System.out.println("--------------- Matriz de incidencia ----------------");
                System.out.println(G.incidencia());
                
                System.out.println("--------------- Matriz de Adyacencia ----------------");
                System.out.println(G.matrizAdyacencia());
                break;
        }
        
    }while(opc!=0);
        }

    
}
