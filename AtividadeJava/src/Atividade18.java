import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor de p: ");
        int p = leia.nextInt();

        System.out.println("Digite o valor de q: ");
        int q = leia.nextInt();

        if (p > q) {
            System.out.println("p é maior que q");
        } else if (p < q) {
            System.out.println("p é menor que q");
        } else {
            System.out.println("p é igual a q");
        }
    }
}