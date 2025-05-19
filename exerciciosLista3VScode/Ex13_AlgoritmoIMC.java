/*13. Algoritmo IMC – Elabore um algoritmo em fluxograma para calcular o IMC de uma pessoa
e mostre a sua classificação.

IMC = Peso(Kg) / Altura2(m)

Realizar o cálculo, verificar e dizer a classificação.
IMC Classificação
<18.5           Abaixo do peso
18.6 - 24.9     Peso ideal
25 -29.9        Peso em excesso
30 - 34.9       Obesidade Grau I
35 - 39.9       Obesidade Grau II (severa)
>= 40           Obesidade Grau III (mórbida)
 */

import java.util.Scanner;

public class Ex13_AlgoritmoIMC {

    final static Scanner LER_TECLADO = new Scanner(System.in); 

    public static void imprimir(String texto) {
    System.out.println(texto); 
    }

    public static double lerValorReal() {
        double valor = LER_TECLADO.nextDouble();
        return valor;    
    }

    public static double calcularIMC(double pesoPessoa, double alturaPessoa) {
        double resultado = pesoPessoa / Math.pow(alturaPessoa, 2);
        return resultado;

    }

    public static void main(String[] args) {
        double pesoPessoa = 0;
        double alturaPessoa = 0;
        double IMC = 0;
        String imcResultado = null;

        imprimir("Informe o seu peso: ");
        pesoPessoa = lerValorReal();

        imprimir("Agora, informe sua altura (em metros e com vírgula): ");
        alturaPessoa = lerValorReal();

        IMC = calcularIMC(pesoPessoa, alturaPessoa);

        if (IMC < 18.5) {
            imcResultado = "ABAIXO DO PESO";
        } else if (IMC < 25) {
            imcResultado = "PESO IDEAL";
        } else if (IMC < 30) {
            imcResultado = "PESO EM EXCESSO";
        } else if (IMC < 35) {
            imcResultado = "OBESIDADE GRAU I";
        } else if (IMC < 40) {
            imcResultado = "OBESIDADE GRAU II";
        } else {
            imcResultado = "OBESIDADE GRAU III (Mórbida)";
        }

        imprimir("O IMC correspondente a um indivíduo de " 
        + pesoPessoa + "kg e com " + alturaPessoa + "m de altura é de " + IMC + ". E equivale a " + imcResultado);
    }

}