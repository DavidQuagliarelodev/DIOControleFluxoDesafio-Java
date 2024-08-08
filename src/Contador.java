import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro paramêtro: ");
        int primeiroParametro = sc.nextInt();
        System.out.print("Digite o segundo paramêtro: ");
        int segundoParametro = sc.nextInt();
        sc.close();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int paremtro1, int parametro2) throws ParametrosInvalidosException {
        if (paremtro1 > parametro2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            int contagem = parametro2 - paremtro1;
            for (int i = 0; i <= contagem; i++) {
                System.out.println("Imprimindo o numero: " + i);
            }
        }
    }
}