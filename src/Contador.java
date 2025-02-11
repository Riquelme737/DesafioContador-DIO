public class Contador {

    public static void contar(int parametroUm, int paramentroDois) throws ParametroInvalidoException {

        if (parametroUm > paramentroDois) {
            throw new ParametroInvalidoException("O parametro dois tem que ser maior que o primeiro.");
        }

        int contagem = paramentroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}
