
import java.util.Scanner;

public class Fibonacci {

    public void calcularFibonacci() {
        Scanner prompt = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos da sequência de Fibonacci: ");
        int n = prompt.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, digite um número maior que 0.");
            prompt.close();
            return;
        }

        System.out.println("\nSequência de Fibonacci com " + n + " termos:");

        if (n >= 1) {
            System.out.print("0");
        }
        if (n >= 2) {
            System.out.print(", 1");
        }

        // Calcula e exibe os demais termos
        int anterior = 0;
        int atual = 1;

        for (int i = 3; i <= n; i++) {
            int proximo = anterior + atual;
            System.out.print(", " + proximo);
            anterior = atual;
            atual = proximo;
        }

        System.out.println(); // Nova linha no final

        // Exibe também o valor do n-ésimo termo
        if (n > 2) {
            System.out.println("\nO " + n + "º termo da sequência é: " + atual);
        } else if (n == 2) {
            System.out.println("\nO " + n + "º termo da sequência é: 1");
        } else {
            System.out.println("\nO " + n + "º termo da sequência é: 0");
        }

        prompt.close();
    }

    // Método main para executar diretamente o Fibonacci
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        fib.calcularFibonacci();
    }
}
