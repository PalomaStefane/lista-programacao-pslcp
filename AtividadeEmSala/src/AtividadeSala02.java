public class AtividadeSala02 {
    public static void main (String [] args){
        String nome = "Paloma";
        String sobrenome = "Stefane";
        System.out.println(nome + " " + sobrenome);
        int idade = 25;
        int anoNasc = 2025 - idade;
        System.out.println("Ano de nascimento:" + anoNasc);
        double peso = 70;
        double altura = 1.70;
        String txtPesoAltura = "Peso: " + peso + "; Altura:" + altura;
        System.out.println(txtPesoAltura);
        double imc = 0;
        imc = peso/(altura*altura);
        System.out.println("IMC é:" + imc);
    }
}
