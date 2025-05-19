/*
8. Algoritmo dia – Elaborar um algoritmo em fluxograma que leia um valor inteiro representando
o dia da semana, verifique e imprima o dia correspondente.
Exemplo: Entrada = 5; Saída = Quinta-feira.

Fazer a validação se é o número digitado é valido, caso não seja imprimir uma mensagem infor-
mando.
*/

import java.util.Scanner;

public class Ex08_DiaSemana {

    final static Scanner LER_TECLADO = new Scanner(System.in);

    public static int lerValorInt() {
        int valor = LER_TECLADO.nextInt();
        return valor;
    }

    public static void main(String[] args) {

        int numeroDia = 0;
        String diaSemana = null;

        while (true) {
            System.out.println("Digite o número do dia da semana (1 a 7): ");
            numeroDia = lerValorInt();

            if (numeroDia >= 1 && numeroDia <= 7) {
                break;
            } else {
                System.out.println("Número inválido. Tente novamente.");
            }
        }

        if (numeroDia == 1) {
            diaSemana = "Domingo";
        } else if (numeroDia == 2) {
            diaSemana = "Segunda-feira";
        } else if (numeroDia == 3) {
            diaSemana = "Terça-feira";
        } else if (numeroDia == 4) {
            diaSemana = "Quarta-feira";
        } else if (numeroDia == 5) {
            diaSemana = "Quinta-feira";
        } else if (numeroDia == 6) {
            diaSemana = "Sexta-feira";
        } else if (numeroDia == 7) {
            diaSemana = "Sábado";
        }

        String saida = ("Hoje é " + diaSemana + "!");

        System.out.println(saida);
    }

}