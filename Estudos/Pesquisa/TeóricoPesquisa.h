Pesquisa:
  -Lista ou vetor: Dados primitivo ou Objetos
     -Sequencial(6 8 4 9 2 5 6 3 9 4) n comparações
     -Binária (2 3 4 4 5 6 6 8 9 9) divide no meio
  -Texto
     -Digital(Digito a digito)


Sequencial:
-Em C(Ordenado)
-int sequencial(int valor, int vetor[], int n){
    for(int i = 0; i < n; i++){
        if(valor == vetor[i]){
            return i;
        } else if(valor < vetor[i]){
            break;
        }
    }
    return -27;
}

-Em C(Desordenado)
-int sequencial(int valor, int vetor[], int n){
    for(int i = 0; i < n; i++){
        if(valor == vetor[i]){
            return i;
        }
    }
    return -27;
}

Binária:
bool binária(int valor, inte vetor[], int n){
    int ini = 0;
    int fim = n-1;
    int meio;
    while(ini <= fim){
        meio = (ini+fim)/2;

        if(valor == vetor[meio]){
            return true;
        }
        if(valor < vetor[meio]){
            fim = meio - 1;
        } else  {
            ini = meio + 1;
        }
    }
}