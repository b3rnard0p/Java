package Ordenação;

import java.util.ArrayList;

public class Ordenacao {
    
    public static void pente(ArrayList<Aluno>lista){
        Aluno tmp;
        boolean houveTroca;
        int i;
        int distancia = lista.size();
        
        do {
            distancia = (int)(distancia / 1.3);
            if (distancia < 1) distancia = 1;
            houveTroca = false;
           for(i=0;i+distancia < lista.size();i++){
               if(lista.get(i).compareTo(lista.get(i+1)) > 0){
                   tmp = lista.get(i);
                   lista.set(i, lista.get(i+1));
                   lista.set(i+1, tmp);
                   houveTroca = true;
               }
               
            }
        }while(distancia > 1 || houveTroca);
    }
       
        
 }
    
