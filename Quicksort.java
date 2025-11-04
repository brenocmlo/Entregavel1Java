
import java.util.Scanner;

public class Quicksort {
    
    public void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }
    
    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        
        return i + 1;
    }
    
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    public void executarQuickSort() {
        Scanner prompt = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do array: ");
        int n = prompt.nextInt();
        
        int[] array = new int[n];
        
        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = prompt.nextInt();
        }
        
        System.out.println("\nArray original:");
        printArray(array);
        
        quickSort(array, 0, n - 1);
        
        System.out.println("\nArray ordenado:");
        printArray(array);
        
        prompt.close();
    }
    public static void main(String[] args) {
        Quicksort qs = new Quicksort();
        qs.executarQuickSort();
    }
}
