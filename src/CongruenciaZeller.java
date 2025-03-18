import java.util.Scanner;

public class CongruenciaZeller {
    public static void main(String[] args) {

        //calculo do dia da semana
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um dia: ");
        int dia = sc.nextInt();
        System.out.println("Digite o número do mês: ");
        int mes = sc.nextInt();
        System.out.println("Digite um ano: ");
        int ano = sc.nextInt();

        int seculo = ano / 100;
        int anoSeculo = ano % 100;

        int diaSemana = (dia + 26 * (mes + 1) / 10 + anoSeculo + anoSeculo / 4 + seculo / 4 + 5 * seculo) % 7;

        System.out.println(diaSemana);
        imprimirDiaSemana(diaSemana);
        AnoBissexto.calcularBissexto(ano);

    }
    public static void imprimirDiaSemana(int diaSemana) {
        switch (diaSemana) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terca");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 0 -> System.out.println("Sabado");
        }
    }

}
