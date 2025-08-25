import java.util.Scanner;
public class AtividadeSala13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double[][] boletim = {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };

        String[] materias = {" Matemática"," Português"," Física"};

        for (int linha= 0; linha < 3; linha ++){
            System.out.println("Digite as notas do trimestre de" + materias[linha]);
            for (int coluna = 0; coluna <3; coluna ++){
                System.out.println("Digite as notas do "+(coluna+1)+" trimestre");
                boletim[linha][coluna] = leia.nextDouble();
            }
        }
        System.out.println("Boletim:");

        //Matemática:
        //1ª etapa:10  pontos
        //2ª etapa:10  pontos
        //3ª etapa:10  pontos
        //Media final: 10 pontos
    }
}