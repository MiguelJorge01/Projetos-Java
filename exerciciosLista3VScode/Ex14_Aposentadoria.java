/*
14. Algoritmo aposentadoria – Elabore um algoritmo em fluxograma para ler a idade e o tempo
de serviço de um trabalhador e escreva se ele pode se aposentar. As condições de aposentadoria
são:
• Ter pelo menos 65 anos,
• ou ter trabalhado pelo menos 30 anos,
• ou ter pelo menos 60 anos de idade e trabalhado pelo menos 25 anos.
 */

import java.util.Scanner;

public class Ex14_Aposentadoria {

    final static Scanner LER_TECLADO = new Scanner(System.in);

    public static int lerValorInt() {
        int valor = LER_TECLADO.nextInt();
        return valor;
    }

    public static void main(String[] args) {
        
        int idade = 0;
        int tempoServico = 0;
        String resultAposentadoria = null;

        System.out.println("Informe a idade do trabalhador: ");
        idade = lerValorInt();

        System.out.println("Informe por quantos anos o trabalhador esteve empregado: ");
        tempoServico = lerValorInt();

        if (idade > 64 || tempoServico > 29 || (idade > 59 && tempoServico > 24)) {
            resultAposentadoria = "ESTÁ APTO";
        } else {
            resultAposentadoria = "NÃO ESTÁ APTO";
        }

        String saida = ("O trabalhador " + resultAposentadoria + " para aposentar.");

        System.out.println(saida);
    }
}
