#include<stdio.h>
#include<time.h>

#include"list.h"

int main(){

    srand(time(NULL));

    Celula *listaA = NULL;
    Celula *listaB = NULL;


    for (int i = 0; i < 20; i++) {
        listaA = inserir(rand() % 100, listaA);
        listaB = inserir(rand() % 100, listaB);
    }

    printf("===== LISTA A =====\n");
    exibir(listaA);
    printf("===== LISTA B =====\n");
    exibir(listaB);

    printf("===== EXIBIR NUMEROS IGUAIS =====\n");
    exibirNumerosIguais(listaA,listaB);

    printf("===== DELETAR PARES =====\n");
    listaA = deletarPares(listaA);
    exibir(listaA);

    printf("===== UNIAO A e B =====\n");
    Celula* listaC = unirListas(listaA,listaB);
    exibir(listaC);

    printf("===== ORDENAR LISTA C =====\n");
    listaC = ordenar(listaC);
    exibir(listaC);

    printf("===== LIMPANDO LISTAS =====\n");
    listaC = deletarTodosElementos(listaC);
    if(listaC == NULL){
        printf("galo cinza");
    }

    return 0;
}
