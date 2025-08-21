public class AtividadeSala06 {
    public static void main(String[] args){
        int a = 5, b = -5, x = 30, y = 9;
        boolean teste, verdedeiro = true, falso = false;
        teste = (a > b) || (a < b);
        System.out.println("(a > b) || (a < b):" + teste);
        teste = (x > a) && (y > a);
        System.out.println("(x > a) && (y > a)" + teste);
        teste = !verdedeiro;
        System.out.println("Negação de um valor verdadeiro" + teste);

        teste = verdedeiro || falso;
        System.out.println("verdedeiro || falso" + teste);
        teste = !(falso || falso) &&verdedeiro;
        System.out.println("!(falso || falso) &&verdedeiro" + teste);
        teste = verdedeiro || falso && verdedeiro;
        System.out.println(" verdedeiro || falso && verdedeiro" + teste);
        teste = verdedeiro && !(falso && falso);
        System.out.println("verdedeiro && !(falso && falso)" + teste);
    }
}
