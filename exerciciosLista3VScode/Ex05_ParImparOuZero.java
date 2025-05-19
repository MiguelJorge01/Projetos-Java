import java.util.Scanner;


public class Ex05_ParImparOuZero {

    public static Scanner tecladoScanner = new Scanner(System.in);  

    // método que recebe um texto e imprime na tela
    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static double lerValorReal() {
        double valor = tecladoScanner.nextDouble();
        return valor;
    }

    public static int lerValorInt() {
        int valor = tecladoScanner.nextInt();
        return valor;
    }

    public static void main(String[] args) {
        
        double numero = 0;
        imprimir("Digite um número");
        numero = lerValorReal();

        if (numero == 0) {
            imprimir("O número é ZERO");
        } else if (numero > 0) {
            imprimir("O número é POSITIVO");
        } else {
            imprimir("O número é NEGATIVO");
        }
    }
}