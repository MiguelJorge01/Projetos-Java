import java.util.Scanner;

public class Util {

    final static Scanner LER_TECLADO = new Scanner(System.in); 

    public static void main(String[] args) {
       
    }

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

    public static double calcularAlturaPredio(double alturaAndar, int qtdAndares){
        double resultado;
        resultado = alturaAndar * qtdAndares;
        return resultado;
    }
}