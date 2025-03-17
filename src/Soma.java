import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Exercício 3 a) Dois números inteiros
        System.out.println("Digite um número: ");
        int a = sc.nextInt();
        System.out.println("Digite um segundo número: ");
        int b = sc.nextInt();
        System.out.println(a + b);

        //Exercício 3 a) Dois números inteiros
        System.out.println("Digite um número com casas decimal (utilize vírgula): ");
        float c = sc.nextFloat();
        System.out.println("Digite um segundo número com casas decimal (utilize vírgula): ");
        float d = sc.nextFloat();
        System.out.println(c + d);
    }
}
