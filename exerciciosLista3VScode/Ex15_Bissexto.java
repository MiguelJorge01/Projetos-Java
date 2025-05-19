/* 
15. Algoritmo bissexto – Elabore um algoritmo em fluxograma para determinar se um ano é
bissexto. Para ser um ano bissexto deve ser divisível por 400 ou ser divisível por 4 e não for
divisível por 100. O usuário vai digitar um valor inteiro. 
*/

import java.util.Scanner;

public class Ex15_Bissexto {

    final static Scanner LER_TECLADO = new Scanner(System.in); 

    public static int lerValorInt() {
    int valor = LER_TECLADO.nextInt();
    return valor;
    }

    public static void main(String[] args) {
        
        int ano = 0;
        String resultBissexto = null;

        System.out.println("Informe o ano para verificar se ele é bissexto: ");
        ano = lerValorInt();

        if ((ano % 400 == 0 || ano % 4 == 0) && ano % 100 != 0) {
            resultBissexto = "É";
        } else {
            resultBissexto = "NÃO É";
        }

        String saida = ("O ano " + ano + " " + resultBissexto + " bissexto!");

        System.out.println(saida);

    }

}