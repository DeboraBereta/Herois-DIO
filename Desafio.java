import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do herói");
        String nome = scanner.nextLine();

        System.out.println("Digite a Experiência (XP) do herói");
        int xp = Integer.parseInt(scanner.nextLine());

        Object[][] xpHeroi = {
            {0, 1000, "Ferro"},
            {1001, 2000, "Bronze"},
            {2001, 5000, "Prata"},
            {6001, 7000, "Ouro"},
            {7001, 8000, "Platina"},
            {8001, 9000, "Ascendente"},
            {9001, 10000, "Imortal"},
            {10001, Integer.MAX_VALUE, "Radiante"}
        };

        for (int i = 0; i < xpHeroi.length; i++) {
            int min = (int) xpHeroi[i][0];
            int max = (int) xpHeroi[i][1];
            String mensagem = (String) xpHeroi[i][2];

            if (xp >= min && xp <= max) {
                System.out.println("O Herói " + nome + " está no nível de " + mensagem);
                break; // Encerra o loop assim que a faixa de XP for encontrada
            }
        }
    }
}
