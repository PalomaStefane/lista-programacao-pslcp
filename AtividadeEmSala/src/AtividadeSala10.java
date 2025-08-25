import java.util.Scanner;
public class AtividadeSala10 {
    public static void main(String[] args) {
        // Estrutura WHILE

        int x = 5, contador = 0;


        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número inteiro de 0 a 10");
        int numero = leia.nextInt();
        contador = 0;

        System.out.println("A tabuáda de " + numero + " é:");
        while(contador <= 10){
            System.out.println(numero + "*" + contador + " = " + (numero * contador));
            contador++;
        }


    }
}