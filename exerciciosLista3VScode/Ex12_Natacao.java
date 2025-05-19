/*
12. Algoritmo natação - A confederação brasileira de natação irá promover eliminatórias para o
próximo mundial de natação das categorias de base. Elabore um algoritmo em fluxograma que
receba a idade de um nadador e determine (imprima) a sua idade e a categoria segundo a tabela
a seguir:

Categoria:  Idade:
Infantil A  3 – 5 anos
Infantil B  6 – 9 anos
Juvenil A   10 – 13 anos
Juvenil B   14 – 17 anos
Sênior      Maiores de 18 anos
*/

import java.util.Scanner;

public class Ex12_Natacao {
    
    final static Scanner LER_TECLADO = new Scanner(System.in);

    public static int lerValorInt() {
    int valor = LER_TECLADO.nextInt();
    return valor;
    }

    public static void main(String[] args) {
        
        int idade = 0;
        String categoria = null;

        System.out.println("Informe a idade do atleta: ");
        idade = lerValorInt();

        if (idade < 3){
            System.out.println("Idade inválida: O atleta deve ter no mínimo 3 anos.");
            return;
        }

        if (idade <= 5) {
            categoria = "Infantil A";
        } else if (idade <= 9) {
            categoria = "Infantil B";
        } else if (idade <= 13) {
            categoria = "Juvenil A";
        } else if (idade <= 17) {
            categoria = "Juvenil B";
        } else {
            categoria = "Sênior";
        }

        String saida = ("A classificação de um atleta de " + idade + " anos é " + categoria + "!");

        System.out.println(saida);

    }

}
