import java.util.Scanner;
/*Essa solução foi inspirada no código um colega da Unversidade,
// ele colocou as mensagens como parametro para o metodo, achei interessante
 e decidi reproduyir adaptando meu código origunal a essa solução */

public class ResolucaoColegaTresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número: ");
            int n = sc.nextInt();
            System.out.println("Digite o segundo número: ");
            int m = sc.nextInt();
            System.out.println("Digite o terceiro número: ");
            int s = sc.nextInt();
            if (CondicaoEntrada(n, m, s)){
                Contagem(n, m, 1, "\na) Contagem de n a m (inclusive)");
                Contagem(n+1, m,1 ,"\nb) Contagem de n a m (excluindo n)");
                Contagem(n, m-1, 1, "\nc) Contagem de n a m (excluindo m)");
                Contagem(n, m, s, "\nd) Contagem de n a m de s a s");
                Contagem(m, n, 1, "\ne) Contagem para trás de m a n (inclusive)");
                Contagem(m,n+1, 1, "\nf) Contagem para trás de m a n (excluindo n)");
                Contagem(m, n, s, "\ng) Contagem para trás de m a n de s a s");
            }

        }catch (CondicaoEntradaException e) {
            System.out.println("O primeiro número deve ser menor que o segundo e o terceiro número deve ser menor que o segundo menos o primeiro");
        }
        sc.close();
    }

    public static boolean CondicaoEntrada(int n, int m, int s) throws CondicaoEntradaException {
        if ((n != 0 && m != 0 &&s != 0) && (n < m && s < m - n)){
            return true;
        } else {
            throw new CondicaoEntradaException();
        }
    }

    public static void Contagem(int primeiro, int segundo, int salto, String msg)  {
        int i;

        System.out.println(msg);
        if (primeiro < segundo) { //Crescente
            for (i = primeiro; i <= segundo; i += salto) {
                System.out.print(i + "  ");
            }
        } else { //Decrescente
            for (i = primeiro; i >= segundo; i -= salto) {
                System.out.print(i + "  ");
            }
        }
        System.out.println();
    }
}
