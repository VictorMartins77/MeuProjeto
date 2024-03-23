<<<<<<< HEAD
import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " e " + numero2 + " é " + soma);
=======
import javax.swing.JOptionPane;

public class Soma {
    public static void main(String[] args) {
        String primeiroNumero = JOptionPane.showInputDialog("Digite o primeiro número:");
        String segundoNumero = JOptionPane.showInputDialog("Digite o segundo número:");

        int numero1 = Integer.parseInt(primeiroNumero);
        int numero2 = Integer.parseInt(segundoNumero);

        int soma = numero1 + numero2;

        JOptionPane.showMessageDialog(null, "A soma de " + numero1 + " e " + numero2 + " é " + soma);
>>>>>>> minha-nova-branch
    }
}

