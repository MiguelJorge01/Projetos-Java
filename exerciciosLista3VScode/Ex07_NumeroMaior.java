/*
Algoritmo maior – Elaborar um algoritmo em fluxograma que leia três valores inteiros dis-
tintos e diga qual é o maior valor digitado.
*/
import java.util.Scanner;

public class Ex07_NumeroMaior {

    final static Scanner LER_TECLADO = new Scanner(System.in);

    public static int lerValorInt() {
        int valor = LER_TECLADO.nextInt();
        return valor;
    }

    public static void main(String[] args) {   

        int valor1 = 0;
        int valor2 = 0;
        int valor3 = 0;
        int valorMaior = 0;

        System.out.println("Informe o primeiro valor: ");
        valor1 = lerValorInt();

        System.out.println("Informe o segundo valor: ");
        valor2 = lerValorInt();

        System.out.println("Informe o terceiro valor: ");
        valor3 = lerValorInt();
            

        if (valor1 > valor2 && valor1 > valor3) {
            valorMaior = valor1;
        } else if (valor2 > valor1 && valor2 > valor3) {
            valorMaior = valor2;
        } else if (valor3 > valor1 && valor3 > valor2) {
            valorMaior = valor3;
        } else if (valor1 == valor2 && valor1 == valor3) {
            System.out.println("Todos os valores são iguais!");
        return;
        } else {
            System.out.println("Há 2 valores iguais nessa sequência, não há número maior!");
        return;
        }

        String saida = ("O maior valor é o " + valorMaior + ".");

        System.out.println(saida);

    }

}