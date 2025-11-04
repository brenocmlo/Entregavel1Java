
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner prompt = new Scanner(System.in);
    
    System.out.println("=== Menu de Algoritmos ===");
    System.out.println("1 - Somatório");
    System.out.println("2 - Contagem de aprovados");
    System.out.println("3 - QuickSort");
    System.out.println("4 - Fibonacci");
    System.out.println("5 - MDC (Máximo Divisor Comum)");
    System.out.println("6 - Verificar Número Primo");
    System.out.print("Escolha uma opção: ");
    
    int opcao = prompt.nextInt();
    
    switch(opcao) {
      case 1:
        Somatorio s = new Somatorio();
        s.Somatorio();
        break;
      case 2:
        Contagem c = new Contagem();
        c.contagem();
        break;
      case 3:
        Quicksort qs = new Quicksort();
        qs.executarQuickSort();
        break;
      case 4:
        Fibonacci fib = new Fibonacci();
        fib.calcularFibonacci();
        break;
      case 5:
        MDC mdc = new MDC();
        mdc.executarMDC();
        break;
      case 6:
        NumeroPrimo np = new NumeroPrimo();
        np.verificarPrimo();
        break;
      default:
        System.out.println("Opção inválida!");
    }
    
    prompt.close();
  }
}    
