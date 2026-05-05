import java.util.Scanner;

public class TesteFila {
    public static void main(String[] args) {
        Fila<Character> f = new Fila<Character>();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um caractere para ser adicionado a fila (um por linha). Digite '.' para encerrar: ");
        while (teclado.hasNext()) {
            char caractere = teclado.next().charAt(0);
            if (caractere == '.') {
                break;
            }
            f.enfileirar(caractere);
        }
        System.out.println("imprimindo...");
        if (!f.vazia()) {
            System.out.println(f.consultarPrimeiro());
        } else {
            System.out.println("Fila vazia.");
        }
        teclado.close();
    }
}
