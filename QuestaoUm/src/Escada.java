import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Escada {

    public static void main(String[] args) {

        Scanner quantDegraus = new Scanner(System.in);
        List<String> quantidade = new ArrayList<String>();

        System.out.println("Qual a quantidade de degraus? ");
        int degraus = quantDegraus.nextInt();

        for (int i = 0; i < degraus; i++) {
            quantidade.add(" ".repeat(degraus - i) + "*".repeat(i + 1));
        }
        for (String q : quantidade) {
            System.out.println(q);
        }
    }
}
