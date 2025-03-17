import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Unicode {

    public static void main(String[] parametros) {
        // Primeira parte: letra para Unicode
        System.out.println("Insira uma letra: ");
        char c = ' ';
        int i = 0;

        try {
            i = System.in.read();
            c = (char)i;
            // Limpar o buffer
            System.in.skip(System.in.available());
        } catch(IOException e) {
            System.out.println("Erro ao capturar da letra: " + e);
        }
        System.out.println(c + ": " + i);

        // Segunda parte: Unicode para letra
        System.out.println("Insira um Unicode (número): ");
        char c2 = ' ';
        int i2 = 0;

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();
            i2 = Integer.parseInt(input);
            c2 = (char)i2;
        } catch(IOException e) {
            System.out.println("Erro ao capturar do Unicode: " + e);
        } catch(NumberFormatException e) {
            System.out.println("Entrada inválida. Digite um número: " + e);
        }
        System.out.println(i2 + ": " + c2);
    }
}