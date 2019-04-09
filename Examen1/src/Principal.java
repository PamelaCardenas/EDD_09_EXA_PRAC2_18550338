
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INTEGRANTES DEL EQUIPO:

	---> Luisa María González Ordóñez 18550352
	---> Karla Pamela Cárdenas Leyva 18550338
	---> Josué David Martínez García 18550360
	---> Roberto Antonio Pedroza Fernández 18550354
	---> Irving Gerardo Mancera Mejía 18550317
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArbolBinario ArbolB = new ArbolBinario();
        Listas MiLista = new Listas();
        
        Scanner sc = new Scanner(System.in);
        int x =0;
        int r = 0;
        int opc;
        do{
        System.out.println( "1) Ingresar valores \n"
                          + "2) Imprimir datos \n"
                          + "3) Buscar Dato \n"
                          + "4) Borrar dato \n"
                          + "0) Salir \n");
        opc= sc.nextInt();
        switch(opc){
            case 0:
                System.exit(0);
                break;
            case 1:
                System.out.println("Ingresar datos");
                int cant;
                System.out.println("Cuantos datos va a almacenar?");
                cant = sc.nextInt();
                for (int i = 0; i < cant; i++) {
                    System.out.println("Ingresa el valor del dato "+(1+i));
                    r =sc.nextInt();
                    sc.nextLine();
                    Boolean exist = ArbolB.verificar(r);
                    if( exist.equals(true)){
                        System.out.println("    ---> Este dato ya existe por lo tanto no se almaceno");
                    }else{
                    ArbolB.agregarNodo(new Nodo(r));
                    MiLista.agregarNodo(new Nodo(r));
                    }  
                }
                System.out.println("Datos almacenados correctamente");
                System.out.println("_____________________________________");
                break;
            case 2:
                System.out.println("Imprimir datos \n"
                                 + "1) Pre-orden \n"
                                 + "2) Post-orden \n"
                                 + "3) In-Orden \n"
                                 + "4) Ver en una lista");
                int imp= sc.nextInt();
                switch(imp){
                    case 1:
                        System.out.println("Pre-Orden");
                        ArbolB.imprimirPre();
                        break;
                    case 2:
                        System.out.println("Post-Orden");
                        ArbolB.imprimirPozole();
                        break;
                    case 3:
                        System.out.println("In-Orden");
                        ArbolB.imprimirInOrder();
                        break;
                    case 4:
                        System.out.println("Imprimir en una lista");
                        MiLista.imprimir();
                    default:
                        System.out.println("---->Opcion incorrecta<----");
                        break;
                }
                break;
            case 3:
                System.out.println("Buscar un valor");
                System.out.println("Ingresa el valor a buscar");
                int ValBus=sc.nextInt();
                sc.nextLine();
                System.out.println("El valor: "+ValBus+" Esta en la posicion "+MiLista.buscar(ValBus));
                break;
            case 4:
                System.out.println("Eliminar un dato");
                System.out.println("Ingresa el elemento a eliminar");
                int e = sc.nextInt();
                MiLista.Delete(e);
                ArbolB.nuevo();
                for (int i = 0; i < MiLista.longitud(); i++) {
                    ArbolB.agregarNodo(new Nodo(MiLista.getValor(i)));
                    
                }
                break;
            default:
                System.out.println("Opcion incorrecta");
                System.out.println("_____________________________________");
                break;
        }
    } while(opc!=0);
        }
}
