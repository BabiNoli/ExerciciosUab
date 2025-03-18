import java.util.Scanner;

public class TresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número: ");
            int n = sc.nextInt();
            System.out.println("Digite o segundo número: ");
            int m = sc.nextInt();
            System.out.println("Digite o terceiro número: ");
            int s = sc.nextInt();
            condicaoEntrada(n, m, s);
        }catch (CondicaoEntradaException e) {
            System.out.println("O primeiro número deve ser menor que o segundo e o terceiro número deve ser menor que o segundo menos o primeiro");
        }
        sc.close();

    }

    private static void condicaoEntrada(int n, int m, int s) throws CondicaoEntradaException{
        if (n < m && s < m - n){
            // a) Contagem de n a m (inclusive)
            System.out.println("\na) Contagem de n a m (inclusive)");
            for (int i = n; i <= m; i++){
                System.out.print(i + "  ");
            }
            // b) Contagem de n a m (excluindo n)
            System.out.println("\nb) Contagem de n a m (excluindo n)");
            for (int i = n + 1; i <= m; i++){
                System.out.print(i + "  ");
            }
            // c) Contagem de n a m (excluindo m)
            System.out.println("\nc) Contagem de n a m (excluindo m)");
            for (int i = n ; i < m; i++){
                System.out.print(i + "  ");
            }
            // d) Contagem de n a m de s em s
            System.out.println("\nd) Contagem de n a m de s a s");
            for (int i = n ; i < m; i += s){
                System.out.print(i + "  ");
            }
            // e) Contagem para trás de m a n (inclusive)
            System.out.println("\ne) Contagem para trás de m a n (inclusive)");
            for (int i = m; i >= n; i--){
                System.out.print(i + "  ");
            }
            // f) Contagem para trás de m a n (excluindo n)
            System.out.println("\nf) Contagem para trás de m a n (excluindo n)");
            for (int i = m; i > n; i--){
                System.out.print(i + "  ");
            }
            // g) Contagem para trás de m a n de s em s
            System.out.println("\ng) Contagem para trás de m a n de s a s");
            for (int i = m ; i > n; i -= s){
                System.out.print(i + "  ");
            }

       } else {
            throw new CondicaoEntradaException();
        }
    }
}
