package PesquisaDigital;

public class Util {
    public static int contarOcoreencias(String texto, String expressao){
        int ocorrencias = 0;
        String sequencia;
        for(int i = 0; !expressao.equals("") && i <= texto.length() - expressao.length(); i++){
            sequencia = texto.substring(i,i+expressao.length());
            if(expressao.equalsIgnoreCase(sequencia)){
            ocorrencias++;
            
            //texto = texto .replace(sequencia, sequencia.toUpperCase());
        }
        }
        //System.out.println(texto);
        return ocorrencias;
    }
}
