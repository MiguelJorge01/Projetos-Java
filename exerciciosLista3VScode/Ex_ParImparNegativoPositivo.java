import java.util.Scanner;


public class Ex_ParImparNegativoPositivo {

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

        boolean numeroMaiorQueZero = (numero > 0);
        boolean numeroPar = (numero % 2 == 0);
        if (numero == 0) {
            return;
        }

        if (numeroMaiorQueZero && numeroPar) {
            imprimir("O número é PAR e maior que ZERO");
        }else if (numeroMaiorQueZero) {
            imprimir("O número é IMPAR e maior que ZERO");
        }else if (numeroPar) {
            imprimir("O número é PAR e menor que ZERO");
        } else {
            imprimir("O número é IMPAR e menor que ZERO");
        }

    }
}