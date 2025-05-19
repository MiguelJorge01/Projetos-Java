/* 
3. Algoritmo Classificação Triângulo – Elaborar um algoritmo em fluxograma que leia os três
lados de um triângulo e classifique-o como sendo:
• Equilátero: possui os três lados iguais; isósceles
• Isósceles: possui pelo menos dois lados iguais;
• Escaleno: três lados distintos. 
*/

import java.util.Scanner;

public class Ex03_ClassificacaoTriangulo {

    final static Scanner LER_TECLADO = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static double lerValorReal() {
        double valor = LER_TECLADO.nextDouble();
        return valor;
    }

    public static String classificarTriangulo(double lado1, double lado2, double lado3) {
        String resultado = null;
        if (lado1 == lado2 && lado1 == lado3) {
            resultado = "EQUILÁTERO";
        } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            resultado = "ESCALENO";
        } else {
            resultado = "ISÓSCELES";
        }
        return resultado;
    }

    public static void main(String[] args) {
        
        double lado1 = 0;
        double lado2 = 0;
        double lado3 = 0;
        String tipoTriangulo = null;

        imprimir("Informe o o tamanho do primeiro lado: ");
        lado1 = lerValorReal();

        imprimir("Informe o o tamanho do segundo lado: ");
        lado2 = lerValorReal();

        imprimir("Informe o o tamanho do terceiro lado: ");
        lado3 = lerValorReal();

        tipoTriangulo = classificarTriangulo(lado1, lado2, lado3);

        String saida = ("Triângulo " + tipoTriangulo + "!");
        
        imprimir(saida);

    }

}
