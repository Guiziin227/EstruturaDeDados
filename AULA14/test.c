#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#include "lista.h"

int main() {
    srand(time(NULL));
    Lista *lista = NULL;
    for (int i = 0; i < 50; i++) {
        lista = inserir(rand() % 100, lista);
    }
    printf("Total elementos %d\n", contar(lista));
    exibir(lista);
    localizar(6,lista);
    localizar(95,lista);
    localizar(33,lista);
    return 1;
}
