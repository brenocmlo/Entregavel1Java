
import java.util.Scanner;

public class NumeroPrimo {
    

    public boolean ehPrimo(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        
        if (n % 2 == 0) {
            return false;
        }
       
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public void verificarPrimo() {
        Scanner prompt = new Scanner(System.in);
        
        System.out.println("=== Verificação de Número Primo ===");
        System.out.print("Digite um número inteiro positivo: ");
        int numero = prompt.nextInt();
        
        if (numero <= 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
        } else {
            boolean primo = ehPrimo(numero);
            
            if (primo) {
                System.out.println("\nO número " + numero + " é PRIMO!");
                System.out.println("Ele só é divisível por 1 e por " + numero + ".");
            } else {
                System.out.println("\nO número " + numero + " NÃO é primo.");

                System.out.print("Alguns divisores de " + numero + ": 1");
                for (int i = 2; i <= numero; i++) {
                    if (numero % i == 0) {
                        System.out.print(", " + i);
                    }
                }
                System.out.println();
            }
        }
        
        prompt.close();
    }
    
   
   
}
