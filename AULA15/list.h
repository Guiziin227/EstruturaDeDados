typedef struct no{
    int dado;
    struct no *prox;
}Celula;

Celula *inserir(int dado, Celula *lista){ //Inserir implementado dos exercicios de aula
    Celula *novo = (Celula*)malloc(sizeof(Celula));

    novo->dado = dado;
    novo->prox = NULL;

    if (!lista){
        return novo;
    }

    Celula *p;
    for(p = lista; p->prox != NULL; p = p->prox);

    p->prox = novo;
    return lista;
}

void exibir(Celula *lista){ //Exibir implementado dos exercicios de aula
    for(Celula *p = lista; p!=NULL; p= p->prox){
        printf("%d\n",p->dado);
    }
}

void exibirNumerosIguais(Celula *listaA, Celula*listaB){
     for(Celula *p1 = listaA; p1!=NULL; p1= p1->prox){
        for(Celula *p2 = listaB; p2!=NULL; p2= p2->prox){
            if(p1->dado == p2->dado){
                printf("%d\n", p1->dado);
            }
        }
     }
}


Celula *deletarPares(Celula *lista){
    Celula *p = lista, *pR = NULL;

    for(p = lista, pR = NULL; p; pR=p, p=p->prox){
        if(p->dado % 2 == 0){
            if(p == lista){
                lista = lista->prox;
                free(p);
                p = lista;
            } else if(p->prox == NULL){
                pR->prox = NULL;
                free(p);
                p = NULL;
            } else {
                pR->prox = p->prox;
                free(p);
                p = pR->prox;
            }
        }
    }
    return lista;
}

Celula *unirListas(Celula *listaA, Celula*listaB){
    Celula *listaC = NULL;

    for(Celula *p1 = listaA; p1!=NULL; p1= p1->prox){
        int numero = p1->dado;
        listaC = inserir(numero,listaC);
     }

      for(Celula *p1 = listaB; p1!=NULL; p1= p1->prox){
        int numero = p1->dado;
        listaC = inserir(numero,listaC);
     }

     return listaC;
}

Celula *ordenar(Celula *lista) { //Usei como havia te mostrado em aula
    int testeParada;
    Celula *p;
    Celula *q;

    do {
        testeParada = 0;
        for (p = lista; p != NULL && p->prox != NULL; p = p->prox) {
            q = p->prox;
            if (p->dado > q->dado) {
                int temp = p->dado;
                p->dado = q->dado;
                q->dado = temp;
                testeParada = 1;
            }
        }
    } while (testeParada != 0);

    return lista;
}

Celula *deletarTodosElementos(Celula *lista){
    while(lista){
        Celula *temp = lista;
        lista = lista->prox;
        free(temp);
    }
    return NULL;
}
