typedef struct no {
    int dado;
    struct no *prox;
} Lista;

Lista *inserir(int dado, Lista *lista) {
    if (lista && dado >= lista->dado) {
        if (dado != lista->dado) {
            //avançar na lista
            lista->prox = inserir(dado, lista->prox);
        }
        return lista;
    } else { //cheguei no final da lista
        Lista *novo = (Lista*)malloc(sizeof(Lista));
        novo->dado = dado;
        if (lista) {
            novo->prox = lista;
        } else {
            novo->prox = NULL;
        }
        return novo;
    }
}

void exibir(Lista *lista) {
    if (lista) {
        printf("%d\n",lista->dado);
        exibir(lista->prox);
    }
}

int contar(Lista *lista) {
    if (lista) {
        return 1 + contar(lista->prox);
    }
    return 0;
}


void localizar(int dado, Lista *lista){
  if(lista){
    if(dado == lista->dado){
        printf("Existe %p\n",lista->prox);
        return 1;
    }
    localizar(dado,lista->prox);
  }else{
    printf("Nao existe\n");
    return 0;
  }
}
