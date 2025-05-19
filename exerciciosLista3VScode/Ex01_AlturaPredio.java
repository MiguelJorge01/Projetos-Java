import java.util.Scanner;


public class Ex01_AlturaPredio {

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

    public static double calcularAlturaPredio(double alturaAndar, int qtdAndares){
        double resultado;
        resultado = alturaAndar * qtdAndares;
        return resultado;
    }

    /* 
    Algoritmo prédio – Elaborar um algoritmo em fluxograma que leia a altura dos andares de
    um prédio e o número de andares, calcule e imprima a altura do prédio.
    */

    public static void main(String[] args) {

        double alturaAndar;
        double alturaPredio;
        int qtdAndares;
        String saida;

        // entrada
        imprimir("Digite a altura do andar: ");
        alturaAndar = lerValorReal();

        imprimir("Digite a quantidade de andares: ");
        qtdAndares = lerValorInt();

        // processamento
        alturaPredio = calcularAlturaPredio(alturaAndar, qtdAndares);

        // saida
        saida = "A altura do prédio é: " + alturaPredio;
        imprimir(saida);   
    }
}