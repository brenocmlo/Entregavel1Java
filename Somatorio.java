
import java.util.Scanner;

public class Somatorio {
    Scanner prompt = new Scanner(System.in);
    int n, num, soma = 0, i = 0;

    public void somatorio() {
        System.out.print("Quantos numeros a serem somados: ");
        int n = prompt.nextInt();

        while (i < n) {
            i = i + 1;
            System.out.println("Entre com o " + i + "º numero");
            num = prompt.nextInt();
            soma = soma + num;
        }

        System.out.println("A soma da: " + soma);
    }
}

