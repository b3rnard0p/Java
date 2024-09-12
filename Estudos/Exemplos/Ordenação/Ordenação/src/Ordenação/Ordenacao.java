package Ordenação;

import java.util.ArrayList;

public class Ordenacao {
    
    public static void bolha(ArrayList<Aluno>lista){
        Aluno tmp;
        boolean houveTroca;
        int i;
        
        do {
            houveTroca = false;
           for(i=0;i<lista.size()-1;i++){
               if(lista.get(i).compareTo(lista.get(i+1)) > 0){
                   tmp = lista.get(i);
                   lista.set(i, lista.get(i+1));
                   lista.set(i+1, tmp);
                   houveTroca = true;
               }
               
            }
        }while(houveTroca);
    }
       
        
 }
    
