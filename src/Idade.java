import java.util.Scanner;

public class Idade {


    public static void calcularIdade(int idade) {

        if (idade >= 0 && idade <= 14) {
            System.out.println("Criança");
        }else if (idade >= 15 && idade < 18) {
            System.out.println("adolescente");
        }else if (idade >= 18 && idade < 65) {
            System.out.println("adulto");
        }else {
            System.out.println("idoso");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idadeDaPessoa = sc.nextInt();

        calcularIdade(idadeDaPessoa);
    }
}
