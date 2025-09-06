import java.util.Scanner;
public class Atividade10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a celsius: ");
        double celsius = leia.nextDouble();
        double fahrenheit = (9 * celsius) / 5 + 32;
        System.out.println("O fahrenheit é: " + fahrenheit);
    }
}