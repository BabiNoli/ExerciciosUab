import java.util.Scanner;

public class AnoBissexto {
    static boolean bissexto;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String mes = " ";
        int ano = 0;
        try {
            System.out.println("Digite um mês: ");
            mes = sc.nextLine();

            System.out.println("Digite um ano: ");
            ano = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Erro ao receber mês ou ano. " + e);
        }

        calcularDiasMes(mes, ano);

    }

    public static boolean calcularBissexto(int ano) {
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("O ano " + ano + " é bissexto.");
            return bissexto = true;
        }else {
            System.out.println("O ano " + ano + " não é bissexto.");
            return false;
        }
    }

    public static void calcularDiasMes(String mes, int ano) {
        bissexto = calcularBissexto(ano);
        if (mes.equalsIgnoreCase("Janeiro")  || mes.equalsIgnoreCase("Março") || mes.equalsIgnoreCase("Maio") || mes.equalsIgnoreCase("Julho") || mes.equalsIgnoreCase("Agosto")|| mes.equalsIgnoreCase("Outubro") || mes.equalsIgnoreCase("Dezembro")){
            System.out.println("O mês " + mes + " tem 31 Dias");
        }else if (mes.equalsIgnoreCase("Abril") || mes.equalsIgnoreCase("Junho") || mes.equalsIgnoreCase("Setembro") || mes.equalsIgnoreCase("Novembro")) {
            System.out.println("O mês " + mes + " tem 30 Dias");
        }else if(mes.equalsIgnoreCase("Fevereiro")){
            if (bissexto) {
                System.out.println( "O mês " + mes + " tem 29 Dias");
            }else {
                System.out.println( "O mês " + mes + " tem 28 Dias");
            }
        }
    }
}
