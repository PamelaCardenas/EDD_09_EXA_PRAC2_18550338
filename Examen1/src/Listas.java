/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class Listas {
     private Nodo inicio;
    private Nodo fin;
    private int iCont = 0;
    
    //Al crear la lista, inicia con 0 elementos
    //Lista vacia:
    //3 estados: Vacia, con un nodo, con N nodos
    public Listas() {
        inicio = null;
        fin = null;
    }
    //Primer mètodo: agregar un nodo
    //Metodo que reciba un nodo
    //Eficiencia --> O(N)
    //Nueva eficiencia --> O(1)
    public void agregarNodo(Nodo nNuevo){
    //Verificar el estado de la lista:
        //Esta vacia?
        if(inicio ==null){  //Lista vacia
        inicio =nNuevo;
        fin = nNuevo;  //Modificado -->Mayor eficiencia
        }else{//Lista con un nodo
        //Lista con N nodos
            
            //LLevar al final
          /*  Nodo nTemp = inicio;
            while(nTemp.getSig() != null){  //Tenemos que dejar a nTemp en el ultimo nodo y getsig tiene que ser null
            nTemp = nTemp.getSig();
            
            }
            //Conectamos nTemp.sig --> nuevo
            nTemp.setSig(nNuevo);*/
            iCont++;
        }
    
        fin.setDer(nNuevo);
        fin = nNuevo;
        
    }
    //O(N)
    public void agregarInicio(Nodo nNuevo){

    //Verificar el estado de la lista:
        //Esta vacia?
        if(inicio ==null){  //Lista vacia
        inicio =nNuevo;
        fin = nNuevo;  //Modificado --> Mayor eficiencia
        }else{//Lista con un nodo
            nNuevo.setDer((inicio));//Lo ponemos al incipio
            inicio= nNuevo;
        }      
}
    
    //Eficiencia O(N)
    public void agregarEn(int iPos, Nodo nNuevo){
    
          
          //Debe haber nodos, por tanto, Ipos deve estar en el rango de 0 --> N - 1
          
              
          
           if(inicio ==null){  //Lista vacia
               System.out.println("La lista esta vacia");
             
               
           }else{  
               
           Nodo nTemp= inicio;
           int iCont=0;
           while(iCont !=  iPos ){
               iCont++;
        nTemp = nTemp.getDer();
       
        }
           nNuevo.setDer(nTemp.getDer());
           nTemp.setDer(nNuevo);
          
           iCont++;
           
           //El problema es el nodo fin
           if(nTemp.getDer()== null){//borramos el ultimo nodo
           fin = nTemp;
         
           }
           iCont++;   
       }      
    }
    //O(1)
    public boolean estaVacia(){
    if (inicio == null){
    return true;
    }
    return false;
    }
    
    public int buscar (int iVal){
    int iPos = 1;
    //Como buscamos el valor
    //Recorer elementos por elementos
     
    
    //detener la busqueda cuando lo encontramos
    //Se puede llegar al final de la lista sin encontrarlo
    Nodo nTemp = inicio;
    int iCont =0;
        while(nTemp != null){
        if(iVal == nTemp.getValor()){
              iPos = iCont;
              break;
            }
                  iCont++;
                  nTemp = nTemp.getDer();
    }
    
    return iPos;
    
    }
    //O(n)
    public Listas copiaLista(){
    Listas lsCopia = new Listas();
    //Hay que recorrer toda la lista; ller cada nodo
    //Crear un nodo nuevo para ese valor
    //Insertarlo en la nueva linea
    Nodo nTemp = inicio;
    while(nTemp != null){ 
                lsCopia.agregarNodo(new Nodo(nTemp.getValor()));
                System.out.print("[" + nTemp.getValor()  + "]");
                nTemp = nTemp.getDer();
            }
     
    return lsCopia;
    
    }
    //Eficiencia O(N^2)
    public void inverso(){
    int cont = longitud()-1;
         for (int i = cont -1; i >= 0; i--) {
             System.out.print("[" +getValor(i) + "]");
           
        }
           
            
            System.out.println("");
        
    }
    
    
    //O(N)
    public void imprimir(){
     Nodo nTemp = inicio;
            while(nTemp != null){  //Tenemos que dejar a nTemp en el ultimo nodo y getsig tiene que ser null
               System.out.print("[" + nTemp.getValor()  + "]");
                nTemp = nTemp.getDer();
            }
            System.out.println("");
    }
    //O(N)
    public int longitud(){
     
             
    Nodo nTemp = inicio;
    int con =0;
            while(nTemp != null){  //Tenemos que dejar a nTemp en el ultimo nodo y getsig tiene que ser null
                con++;
                nTemp = nTemp.getDer();
                
            }
            return con;
    }
    //O(1)
    public void vaciar(){
    inicio = null;
    fin = null;
    
            }
    //Listas manejan indice como arreglos
    //Primer Nodo --> 0 
    //Ultimo Nodo --> N - 1
    
    //Eficiencia O(N)
    
    // Agregar:
    //Lista vacia
    //Parametro incorrecto (iPos no este entre 0 y N-1)
    //Excepciones--> Throw 
    //O(N)
    
    public int getValor(int iPos){
        int iVal =0;
        int iCont =0;
     Nodo nTemp = inicio;
            while(nTemp != null){ 
                if(iCont == iPos){
                iVal = nTemp.getValor();
                break;
                }
                nTemp = nTemp.getDer();
                iCont++;
                
            }
            
          return iVal;
    }
    
    public void Delete(int val){
        Nodo Temp = inicio;
        Nodo Temp1 = null;
        if(inicio== null){ //No hay datos
            System.out.println("No hay datos");
        }
        else if(inicio==fin){ //Hay un dato
            if(inicio.getValor()==val){ //Se encuentra el dato
                inicio=fin=null; //Se elimina
            }
            else{
                System.out.println("No se encuentra el valor");
            }
        }
        else{
            while((Temp !=null) && (Temp.getValor()!= val)){ //Se recorre el arbol mientras que temp sea diferente a nulo y el valor actual sea diferente al buscado
                Temp1=Temp; //Se igualan
                Temp=Temp.getDer();} //Temp va a la derecha
                if(Temp==null){ //Si es nulo
                System.out.println("No se encuentra el valor");      //No hay valor a borrar
                }
                else{ //Se establece que la variable auxiliar templ apunta al siguiente de la derecha
                    Temp1.setDer(Temp.getDer());
                }
        }
    }
}
