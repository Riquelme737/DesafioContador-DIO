import java.util.Scanner;

public class Sistema {

    public static void lancarSistema() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro parâmetro: ");
        int parametroUm = scanner.nextInt();
        System.out.print("Segundo parâmetro: ");
        int parametroDois = scanner.nextInt();

        try {
            Contador.contar(parametroUm, parametroDois);
        } catch (ParametroInvalidoException e) {
            System.err.println("Digitação equivocada: " + e.getMessage());
        }

    }
}
