import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento:");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Deixe sua avaliação para o filme:");
        double avaliacao = leitura.nextDouble();

        System.out.println("\n--- Dados do Filme ---");
        System.out.println("Filme: " + filme);
        System.out.println("Ano: " + anoDeLancamento);
        System.out.println("Nota: " + avaliacao);

        if (avaliacao > 8) {
            System.out.println("Filme recomendado!");
        } else {
            System.out.println("Vale assistir depois.");
        }

        leitura.close();
    }
}