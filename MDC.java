
import java.util.Scanner;

public class MDC {
    public int calcularMDC(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        return a;
    }
    
    public void executarMDC() {
        Scanner prompt = new Scanner(System.in);
        
        System.out.println("=== Cálculo do Máximo Divisor Comum (MDC) ===");
        System.out.print("Digite o primeiro número: ");
        int a = prompt.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int b = prompt.nextInt();
        
        if (a == 0 && b == 0) {
            System.out.println("MDC não está definido para (0, 0).");
        } else {
            int resultado = calcularMDC(a, b);
            System.out.println("\nO MDC de " + a + " e " + b + " é: " + resultado);
            System.out.println("\nVerificação:");
            System.out.println(a + " ÷ " + resultado + " = " + (a / resultado));
            System.out.println(b + " ÷ " + resultado + " = " + (b / resultado));
        }
        
        prompt.close();
    }

}
