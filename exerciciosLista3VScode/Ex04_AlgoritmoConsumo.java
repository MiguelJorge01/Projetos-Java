/*
4. Algoritmo consumo – Elaborar um algoritmo em fluxograma que calcule o consumo médio
de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível
gasto (em litros).
Entrada: A entrada contém dois valores: um valor inteiro dist representando a distância total
percorrida (em Km), e um valor real gasto representando o total de combustível gasto.
Saída: Apresente o valor que representa o consumo médio do automóvel seguido da mensagem
"km/l".
*/

import java.util.Scanner;

public class Ex04_AlgoritmoConsumo {

    final static Scanner LER_TECLADO = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static double lerValorReal() {
        double valor = LER_TECLADO.nextDouble();
        return valor;
    }

    public static int lerValorInt() {
        int valor = LER_TECLADO.nextInt();
        return valor;
    }

    public static double calcularConsumo(int distanciaTotal, double combustGasto) {
        double resultado = (distanciaTotal / combustGasto);
        return resultado;
    }

    public static void main(String[] args) {
        
        int distanciaTotal = 0;
        double combustGasto = 0;
        double consumoMedia = 0;

        imprimir("Informe a distância percorrida em KM (sem vírgulas); ");
        distanciaTotal = lerValorInt();

        imprimir("Informe o combustível gasto em Litros: ");
        combustGasto = lerValorReal();

        consumoMedia = calcularConsumo(distanciaTotal, combustGasto);

        String consumoMediaFormat = String.format("%.2f", consumoMedia);

        String saida = ("A média de consumo do veículo foi de " + consumoMediaFormat + " km/L.");

        imprimir(saida);

    }

}

