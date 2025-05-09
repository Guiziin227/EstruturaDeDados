#include <stdio.h>
#include <time.h>
#include <stdlib.h>

#define TAM 3

void popularR(int vetor[], int n) {
    if (n > 0) {
        vetor[n - 1] = rand() % 10;
        printf("%d\n", vetor[n - 1]);
        popularR(vetor, n - 1);
    }
}

void exibir(int vetor[], int n) {
    if (n > 0) {
        exibir(vetor, n - 1);
        printf("%d\n", vetor[n - 1]);
    }
}

int somarR(int vetor[], int n) {
    if (n > 0) {
        return vetor[n - 1] + somarR(vetor, n - 1);
    }
    return 0;
}

int paresR(int vetor[], int n) {
    if (n > 0) {
        if (vetor[n - 1] % 2 == 0) {
            return vetor[n - 1] + paresR(vetor, n - 1);
        } else {
            return paresR(vetor, n - 1);
        }
    }
    return 0;
}


int contaParesR(int vetor[], int n) {
    if (n > 0) {
        if(vetor[n - 1] % 2 == 0){
            return 1 + contaParesR(vetor, n - 1);
        } else {
            return contaParesR(vetor, n - 1);
        }
    }
    return 0;
}

int main() {

    srand(time(0));

    int vetor[TAM];

    popularR(vetor, TAM);
    printf("===EXIBIR===\n");
    exibir(vetor, TAM);
    printf("===SOMAR===\n");
    int sum = somarR(vetor, TAM);
    printf("A soma deu %d\n", sum);

    printf("===SOMAR PARES===\n");
    sum = paresR(vetor, TAM);
    printf("A soma deu %d\n", sum);

    printf("===CONTAR PARES===\n");
    sum = contaParesR(vetor, TAM);
    printf("A soma deu %d\n", sum);


    return 0;
}
