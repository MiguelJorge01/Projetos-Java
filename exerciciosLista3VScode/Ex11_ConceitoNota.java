import java.util.Scanner;


public class Ex11_ConceitoNota {

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
        double nota = 0;
        imprimir("Informe a nota: ");
        nota = lerValorReal();

        if (nota >= 9) {
            imprimir("Conceito A");
        } else if (nota >= 8) {
            imprimir("Conceito B");
        } else if (nota >= 7) {
            imprimir("Conceito C");
        } else {
            imprimir("Conceito D");
        }
    }
}