/*
Algoritmo par ou ímpar – Elaborar um algoritmo em fluxograma que solicite para o usuário
digitar um valor inteiro maior que zero e verifique se este valor é par ou ímpar.
*/

import java.util.Scanner;

public class Ex06_ParOuImpar {

    final static Scanner LER_TECLADO = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }
    
    public static int lerValorInt() {
        int valor = LER_TECLADO.nextInt();
        return valor;
    }

    public static void main(String[] args) {

        int numero = 0;
        String parImpar = null;
        
        imprimir("Digite um número inteiro maior que 0: ");
        numero = lerValorInt();

        if (numero <= 0) {
            return;
        }

        boolean numeroPar = (numero % 2 == 0);

        if (numeroPar) {
            parImpar = "PAR";
        } else {
            parImpar = "ÍMPAR";
        }

        String saida = ("O número " + numero + " é " + parImpar + "!");

        imprimir(saida);
    }

}