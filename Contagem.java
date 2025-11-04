import java.util.Scanner;

public class Contagem {
    public void contagem() {
        Scanner prompt = new Scanner(System.in);
        int n, nota, cont = 0, i = 0;

        System.out.print("Digite a quantidade de alunos: ");
        n = prompt.nextInt();

        while (i < n) {
            System.out.print("Digite a nota do aluno: ");
            nota = prompt.nextInt();

            if (nota >= 70) {
                cont++;
            }

            i++; 
        }
        prompt.close();
        System.out.println("Quantidade de alunos: " + n);
        System.out.println("Quantidade de alunos aprovados: " + cont);
    }
}
