#include <stdio.h> 
#include <stdlib.h> 

typedef struct{ 
    int codigo; 
    char nome[50]; 
    float preco; 
}Produto; 

void print_produtos(Produto produto[]); 
void clear(); 

int main() { 
    Produto produtos[2] = { 
        {1, "Camiseta", 29.99}, 
        {2, "Calça", 59.99} 
    }; 

    int escolha, quantidade, cartao; 
    float total = 0, desconto = 0.1;  

    do { 
        void clear(); 
        printf("\n--- Bem-vindo à nossa loja! ---\n"); 
        printf("1. Adicionar produto ao carrinho\n"); 
        printf("2. Ver carrinho\n"); 
        printf("3. Finalizar compra\n"); 
        printf("0. Sair\n"); 
        printf("Escolha uma opção: "); 
        scanf("%d", &escolha); 

        switch (escolha) { 
            case 1: 
                print_produtos(produtos); 
                printf("Digite o código do produto: "); 
                scanf("%d", &escolha); 
                if (escolha >= 1 && escolha <= 2) { 
                    printf("Digite a quantidade: "); 
                    scanf("%d", &quantidade); 
                    total += produtos[escolha - 1].preco * quantidade; 
                    void clear(); 
                } else { 
                    printf("Produto inválido.\n"); 
                } 
                break; 
            case 2: 
                printf("Valor total da compra: R$ %.2f\n", total); 
                break; 
            case 3: 
                printf("Digite o número do cartão da loja (ou 0 para continuar sem desconto): "); 
                scanf("%d", &cartao); 
                void clear(); 
                if (cartao != 0) { 
                    printf("Parabéns! Você tem direito a 10%% de desconto.\n"); 
                    total *= (1 - desconto); 
                } 
                printf("Valor final da compra: R$ %.2f\n", total); 
                break; 
        } 
    } while (escolha != 0); 
    return 0; 
} 

void print_produtos(Produto produtos[]){ 
    int i; 
    for (i = 0; i < 2; i++) {
        printf("código: %d\nNome: %s\npreço: %.2f\n", produtos[i].codigo, produtos[i].nome, produtos[i].preco); 
        printf("\n"); 
    } 
} 
void clear(){ 
    #if defined(__linux__) || defined(__unix__) || defined(__APPLE__) 
        system("clear"); 
    #endif 
    #if defined(_WIN32) || defined(_WIN64) 
        system("cls"); 
    #endif 
} 
