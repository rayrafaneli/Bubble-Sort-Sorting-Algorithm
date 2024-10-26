import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    // Método para realizar o Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Troca se o elemento encontrado for maior que o próximo
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Método para imprimir o array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Método para ler dados de um arquivo e retornar um array de inteiros
    public static int[] readDataFromFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("O arquivo não foi encontrado: " + filePath);
            return new int[0]; // Retorna um array vazio se o arquivo não existir
        }

        List<Integer> dataList = new ArrayList<>(); // Usando ArrayList para armazenar os dados

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            // Lê cada linha do arquivo e converte para inteiro
            while ((line = br.readLine()) != null) {
                dataList.add(Integer.parseInt(line)); // Adiciona o inteiro ao ArrayList
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            return new int[0]; // Retorna um array vazio em caso de erro
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter dados: " + e.getMessage());
            return new int[0]; // Retorna um array vazio em caso de erro
        }

        // Converte o ArrayList de inteiros para um array de inteiros
        int[] result = new int[dataList.size()];
        for (int i = 0; i < dataList.size(); i++) {
            result[i] = dataList.get(i);
        }
        return result;
    }
}