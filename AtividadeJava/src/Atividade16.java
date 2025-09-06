import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leia.nextInt();

        int quadrado = numero;
        quadrado *= numero;

        System.out.println("O quadrado de " + numero + " é: " + quadrado);
    }
}