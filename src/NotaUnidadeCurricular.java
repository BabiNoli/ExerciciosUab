import java.util.Scanner;

public class NotaUnidadeCurricular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas notas deseja inserir?");
        int numeroNotas = sc.nextInt();
        float[] notasFloat = new float[numeroNotas];


        char[][] infoCurso = {{'L','I','C','E','N','C','I','A','T','U','R','A',' ','I','N','F','O','R','M','A','T','I','C','A'},
            {'L','I','N','G','U','A','G','E','N','S',' ','D','E',' ','P','R','O','G','R','A','M','A','C','A','O'}};

        for (int i = 0; i < numeroNotas; i++){
            System.out.println("\nInsira a nota " + (i + 1) + " : ");
            notasFloat[i] = sc.nextFloat();
        }

        imprimirArray(notasFloat);
        int[] notasInteiro = deFloatParaInt(notasFloat);
        imprimirArray(notasInteiro);

        mediaDoCurso(infoCurso, notasInteiro);
        System.out.println("\n=======================\n");
        maximoNota(infoCurso, notasInteiro);
        System.out.println("\n=======================\n");
        minimoNota(infoCurso, notasInteiro);

        /*
        int[] m1 = {0, 0, 0, 0};
        mediaDoCurso(m1);
        maximoNota(m1);
        minimoNota(m1);
        System.out.println("\n=================\n");

        int[] m2 = {20};
        mediaDoCurso(m2);
        maximoNota(m2);
        minimoNota(m2);
        System.out.println("\n=================\n");

        int[] m3 = {11, 12, 13, 14, 15, 16, 17};
        mediaDoCurso(m3);
        maximoNota(m3);
        minimoNota(m3);
        System.out.println("\n=================\n");

        int[] m4 = {11, 12, 13, 14, 15};
        mediaDoCurso(m4);
        maximoNota(m4);
        minimoNota(m4);
        */

    }
    public static void mediaDoCurso(char[][] info, int[] notas){
        imprimirCurso(info);
        int media = 0;
        for (int nota : notas) {
            media += nota;
        }
        media = media / notas.length;
        System.out.println("Media das notas: " + media);
    }
    public static void maximoNota(char[][] info, int[] notas){
        imprimirCurso(info);
        int max = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > max){
                max = notas[i];
            }
        }
        System.out.println("Nota máxima: " + max);
    }
    public static void minimoNota(char[][] info, int[] notas){
        imprimirCurso(info);
        int min = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < min){
                min = notas[i];
            }
        }
        System.out.println("Notas mínimas: " + min);
    }

    public static int[] deFloatParaInt(float[] notas){
        int[] notasInteiro = new int[notas.length];
        for (int i = 0; i < notas.length; i++){
            notasInteiro[i] = Math.round(notas[i]);
        }
        return notasInteiro;
    }

    public static void imprimirCurso(char [][] info){
        for (int i = 0; i < info.length; i++){
            for (int j = 0; j < info[i].length; j++){
                System.out.print(info[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void imprimirArray(int[] notas){
        System.out.println("\nArray de notas inteiras\n");
        for (int nota : notas) {
            System.out.print(nota + " ");
        }
        System.out.println("\n----------------------------\n");
    }

    public static void imprimirArray(float[] notas){
        System.out.println("\nArray de notas com casas decimais\n");
        for (float nota : notas) {
            System.out.print(nota + " ");
        }
        System.out.println("\n----------------------------\n");
    }
}
