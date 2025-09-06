import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idade = leia.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}