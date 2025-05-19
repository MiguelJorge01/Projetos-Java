/*
2. Algoritmo cotação dólar – Elaborar um algoritmo em fluxograma que leia a cotação do dólar,
o valor em dólares e mostra o valor correspondente em reais.
 */

import java.util.Scanner;

public class Ex02_CotacaoDolar {

    final static Scanner LER_TECLADO = new Scanner(System.in); 

    public static void imprimir(String texto) {
    System.out.println(texto); 
    }

    public static double lerValorReal() {
        double valor = LER_TECLADO.nextDouble();
        return valor;   
    }

    public static double calcularDolarReal(double cotacaoDolar, double valorDolares) {
        double resultadoDolarReal = (cotacaoDolar * valorDolares);
        return resultadoDolarReal;
    }

    public static void main(String[] args) {
        
        double cotacaoDolar = 0;
        double valorDolares = 0;
        double valorReais = 0;

        imprimir("Informe a cotação do dólar: ");
        cotacaoDolar = lerValorReal();

        imprimir("Informe o valor em dólares que deseja converter: ");
        valorDolares = lerValorReal();

        valorReais =  calcularDolarReal(cotacaoDolar, valorDolares);

        String valReaisFormat = String.format("%.2f", valorReais);
        String valDolaresFormat = String.format("%.2f", valorDolares);

        String saida = ("Conversão: " + valDolaresFormat + " dólares equivalem a " + valReaisFormat + " reais!");

        imprimir(saida);

    }
}
