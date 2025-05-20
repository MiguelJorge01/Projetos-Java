/*
Algoritmo trapézio – Elabore um algoritmo em fluxograma para calcular a área de um
trapézio. Sabe-se que:

areatrapezio = ((baseMaior + baseMenor) ∗ altura) / 2

Lembre-se a altura, a base maior e a base menor devem ser números maiores que zero. Se o
usuário digitar algo inválido informar do erro.
*/

import java.util.Scanner;

public class Ex09_Trapezio {

    public static Scanner tecladoScanner = new Scanner (System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static double lerValorReal() {
        double valor = tecladoScanner.nextDouble();
        return valor;
    }

    public static double calcularAreaTrapezio(double baseMaior, double baseMenor, double altura) {
        double resultado = ((baseMaior + baseMenor) * altura) / 2;
        return resultado;
    }

    public static void main(String[] args) {

        double baseMaior = 0;
        double baseMenor = 0;
        double altura = 0;
        double areaTrapezio = 0;
        String saida = null;

        //entrada
        imprimir("Informe o tamanho da base maior do trapézio em metros: ");
        baseMaior = lerValorReal();

        imprimir("Agora, informe o tamanho da base menor em metros: ");
        baseMenor = lerValorReal();

        imprimir("Por fim, digite a altura do trapézio em metros: ");
        altura = lerValorReal();
        
        //processo
        areaTrapezio = calcularAreaTrapezio(baseMaior, baseMenor, altura);

        //saida
        saida = "A área deste trapézio é: " + areaTrapezio + "m²";
        imprimir(saida);

    }
}