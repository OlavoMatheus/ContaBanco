import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da agência: ");
        int numero=scanner.nextInt();

        System.out.println("Por favor, digite sua agência: ");
        String agencia=scanner.next();

        System.out.println("Por favor, digite seu nome: ");
        String nome=scanner.next();

        System.out.println("Por favor, digite seu saldo: ");
        double saldo=scanner.nextDouble();
    }
}
