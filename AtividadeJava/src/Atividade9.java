import java.util.Scanner;
public class Atividade9 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a base: ");
        double base = leia.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = leia.nextDouble();
        double perimetro = 2 * (base + altura);
        System.out.println("O perímetro é: " + perimetro);
    }
}