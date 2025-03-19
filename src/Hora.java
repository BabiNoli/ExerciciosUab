import java.util.Scanner;

public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Hora(int horas, int minutos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = 0;
    }

    public Hora(int horas) {
        this.horas = horas;
        this.minutos = 0;
        this.segundos = 0;
    }

    public static void condicoesEntrada(int horas, int minutos, int segundos) {

        if ( (horas <= 23 && horas >= 0) && (minutos <= 60 && minutos >= 0) && (segundos <= 60 && segundos >= 0) ) {
            System.out.println("Entrada válida!");

        }else {
            throw new EntradaInvalidaException("Entrada Invalida");
        }
    }

    public static void before(Hora hora1, Hora hora2) {
        if (hora1.horas > hora2.horas) {
            System.out.println("Hora 1 é maior que a Hora 2 - Hora");
        }else if(hora1.horas < hora2.horas){
            System.out.println("Hora 2 é maior que a Hora 1 - Hora");
        }else{ //se a hora for igual
            if (hora1.minutos > hora2.minutos) {
                System.out.println("Hora 1 é maior que a Hora 2 - minutos");
            }else if(hora1.minutos < hora2.minutos) {
                System.out.println("Hora 2 é maior que a Hora 1 - minutos");
            }else { // se a hora e os minutos sao iguais
                if (hora1.segundos > hora2.segundos) {
                    System.out.println("Hora 1 é maior que a Hora 2 - segundos");
                }else if (hora1.segundos < hora2.segundos){
                    System.out.println("Hora 2 é maior que a Hora 1 - segundos");
                }else{
                    System.out.println("Hora 1 e Hora 2 são iguais");
                }
            }
        }

    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return horas + " horas, " + minutos +
                " minutos, " + segundos +
                " segundos";
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int hora = 0;
        int minuto = 0;
        int segundo = 0;

        try {
            System.out.println("Digite o hora: ");
            hora = entrada.nextInt();
            System.out.println("Digite o minuto: ");
            minuto = entrada.nextInt();
            System.out.println("Digite o segundo: ");
            segundo = entrada.nextInt();
            condicoesEntrada(hora, minuto, segundo);
        } catch (EntradaInvalidaException e) {
            System.out.println(e.getMessage());
        }

        Hora hora1 = new Hora(hora, minuto);
        System.out.println(hora1);

        System.out.println("Digite uma segunda hora: ");
        try {
            System.out.println("Digite o hora: ");
            hora = entrada.nextInt();
            System.out.println("Digite o minuto: ");
            minuto = entrada.nextInt();
            System.out.println("Digite o segundo: ");
            segundo = entrada.nextInt();
            condicoesEntrada(hora, minuto, segundo);
        } catch (EntradaInvalidaException e) {
            System.out.println(e.getMessage());
        }

        Hora hora2 = new Hora(hora, minuto, segundo);
        System.out.println(hora2);


        before(hora1, hora2);


        System.out.println("\n===============\n");

        System.out.println(hora1);
        System.out.println(hora2);



    }
}
