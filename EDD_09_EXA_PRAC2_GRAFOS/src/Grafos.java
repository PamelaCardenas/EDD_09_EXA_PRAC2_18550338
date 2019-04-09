

/*
 * 
 */

/**
 *
 * @author Pamela Cardenas
 */
public class Grafos {
    
    private Vertice inicio;
    private Vertice fin;
    private Arcos inicioA;
    private Arcos finA;
    private int contVertices = 0;
    private int contArcos = 0;

    public Grafos() {
        inicio = null;
        fin = null;
    }
    
    public void agregarVertice(Vertice nNuevo){
        //VERIFICAR EL ESTADO DE LA LISTA
        //ESTA VACIA?
        if(inicio == null){
            inicio = nNuevo;
            fin = nNuevo; //MODIFICADO --> EFICIENCIA
        }
        //LISTA CON UN VERTICE
        else{
            fin.setSig(nNuevo);
            fin = nNuevo;
            contVertices++;
            
        }
        //LISTA CON N VERTICES
    }
    
    public void agregarArco(Arcos nNuevo){
        
        if(inicioA == null){
            inicioA = nNuevo;
            finA = nNuevo; 
        }
        
        else{
            finA.setSig(nNuevo);
            finA = nNuevo;
            contArcos++;
            
        }
    }
    
    public int longitudVertices(){
        return contVertices;
    }
    
    public int longitudArcos(){
        return contArcos++;
    }
    
    public String getValor(int iPos){
        String iVal = "";
        int iCont = 0;
        Vertice nTemp = inicio;
        
            while(nTemp != null){
                
                if(iCont == iPos){
                    iVal = nTemp.getDato();
                    break;
                }
                nTemp = nTemp.getSig();
                iCont++;
            }
            return iVal;
    }
    
    public String getNomb(int iPos){
        String iNomb="";
        int count=0;
        Arcos nTemp=inicioA;
        while (nTemp!=null){
            if(count == iPos){
                iNomb= nTemp.getNombre();
                break;
            }
            nTemp=nTemp.getSig();
            count++;
        }
        return iNomb;
    }
    
    public boolean Comparacion(int x, int y){
        Arcos Temp= inicioA;
        while(Temp!=null){
           if(y==Temp.getI()){
               Arcos Temp2 = inicioA;
               while(Temp2!=null){
                   if(x==Temp.getJ()){
                       return true;
                   }
                   Temp2=Temp2.getSig();
               }
           }
            
            Temp=Temp.getSig();
        }
        return false;
    }
    
    public String incidencia(){
            int rows = contVertices;
            int col = contArcos;
            String mnsIncy="";
            String mat[][]= new String[rows+2][col+2];
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j <  mat[i].length; j++) {
                    mat[i][j]="0";
                }
        }
           for (int i = 0; i < mat.length; i++) { //filas
               for (int j = 0; j < mat[i].length; j++) {//columnas
                   if(i==0 && j==0){
                       mat[i][j]=" ";
                   }
                   if(j==0 && i>0){
                       mat[i][j]= getValor((i-1));
                   }
                   if(i==0 && j>0){
                       mat[i][j]=getNomb((j-1));
                   }
                   
                  // mat[getX(j)+2][getX(j)+2]="1";
                   mnsIncy+="["+mat[i][j]+"] ";
               }
            mnsIncy+="\n";
        }
            return mnsIncy;
    }
    
    public String matrizAdyacencia(){
        int tVert = longitudVertices()+2;
        String matrizAdy[][] = new String[tVert][tVert];
        Vertice v = new Vertice();
        Arcos a = new Arcos();
        String matrizA = "";
        
        for (int i = 0; i < matrizAdy.length; i++) {
            for (int j = 0; j < matrizAdy[i].length; j++) {
                matrizAdy[i][j] = "0";
            }
        }
        for (int i = 0; i < matrizAdy.length; i++) {
            for (int j = 0; j < matrizAdy[i].length; j++) {
                
                if (i == 0 && j == 0) {
                    matrizAdy[0][0] = " ";
                    
                } else if (i == 0 && j >0) {
                    matrizAdy[0][j] = getValor(j-1);
                    
                } else if (i >0 && j == 0) {
                    matrizAdy[i][0] = getValor(i-1);
                    
                } else {
                    Arcos nTemp = inicioA;
                    while (nTemp != null) {
                        
                            matrizAdy[nTemp.getI()][nTemp.getJ()] = "1";   
                        
                            matrizAdy[nTemp.getJ()][nTemp.getI()] = "1";
                            
                        nTemp = nTemp.getSig();
                    }
                }
                matrizA += "[" + matrizAdy[i][j] + "] ";
            }
            matrizA += "\n";
        }
        return matrizA;
    }
}
