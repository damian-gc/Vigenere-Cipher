
public class Cifrar {
    public final int COLUMNS=256;
    public final int ROWS=256;
    public final int VALUE=256;
    public int tablaCifrar[][];
    public int tablaDescifrar[][];
    
    public Cifrar(){
        this.tablaCifrar = new int[ROWS][COLUMNS];
        this.tablaDescifrar = new int[ROWS][COLUMNS];
    }

    public void fillMatrix(){
        int aux = 0;
        int aux2 = 0;
        for(int i=0; i<ROWS; i++){
             aux=i;
            for(int j=0; j<COLUMNS; j++){
                if(aux == VALUE)
                    aux = 0;
                this.tablaCifrar[i][j] = aux;
                aux++;
                if(aux2 == VALUE)
                    aux2 = 0;
                this.tablaDescifrar[i][j] = aux2;
                aux2++;
            }
            aux2--;
            if(aux2 == -1)
                aux2 = 255;
            
        }
    }

    public String cifrar1(String textoLlano, String llave){
        String cypherText="";
        int i=0;
        for(char letter: textoLlano.toCharArray()){
            if(i == llave.length())
                i=0;
            cypherText += (char)(this.tablaCifrar[llave.toCharArray()[i]][letter]);
            i++;
        }
        return cypherText;        
    }

    public String descifrar(String cypherText, String llave){
        String plainText="";
        int i=0;
        for(char letter: cypherText.toCharArray()){
            if(i == llave.length())
                i=0;
            plainText += (char)(this.tablaDescifrar[llave.toCharArray()[i]][letter]);
            i++;
        }
        return plainText;        
    }
}
