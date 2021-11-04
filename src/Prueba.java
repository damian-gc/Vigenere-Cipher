

public class Prueba {
    public static final int COLUMNS=256;
    public static final int ROWS=256;
    public static final int VALUE=256;
    public static int tablaCifrar[][] = new int[ROWS][COLUMNS];
    public static int tablaDescifrar[][] = new int[ROWS][COLUMNS];
    public static void main(String args[]){
        fillMatrix(tablaCifrar, tablaDescifrar); //Llenamos la matriz de 256x256
        String ct = cifrar("!", "\"");
        String pt = descifrar(ct, "\"");
        System.out.println("Texto cifrado: "+ct);
        System.out.println("Texto descifrado: "+pt);

    }

    public static void fillMatrix(int tabla[][], int tablaDes[][]){
        int aux = 0;
        int aux2 = 0;
        for(int i=0; i<ROWS; i++){
             aux=i;
            for(int j=0; j<COLUMNS; j++){
                if(aux == VALUE)
                    aux = 0;
                tabla[i][j] = aux;
                aux++;
                if(aux2 == VALUE)
                    aux2 = 0;
                tablaDes[i][j] = aux2;
                aux2++;
            }
            aux2--;
            if(aux2 == -1)
                aux2 = 255;
            
        }
    }

    public static String cifrar(String textoLlano, String llave){
        String cypherText="";
        int i=0;
        for(char letter: textoLlano.toCharArray()){
            if(i == llave.length())
                i=0;
            cypherText += (char)(tablaCifrar[llave.toCharArray()[i]][letter]);
            i++;
        }
        return cypherText;        
    }

    public static String descifrar(String cypherText, String llave){
        String plainText="";
        int i=0;
        for(char letter: cypherText.toCharArray()){
            if(i == llave.length())
                i=0;
            plainText += (char)(tablaDescifrar[llave.toCharArray()[i]][letter]);
            i++;
        }
        return plainText;        
    }

}
