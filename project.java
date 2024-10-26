public class project {
    public static void main(String[] args) {
        {
                String filePath = "C:\\Users\\<USER>\\Á10000_numbers.txt"; //Caminho do .txt
                int[] dados = BubbleSort.readDataFromFile(filePath); // Lê os dados do arquivotxt
        
                if (dados.length > 0) {
                    System.out.println("Array original:");
                    BubbleSort.printArray(dados); // Imprime o array original
        
                    // Marca o tempo de início
                    long comecar = System.nanoTime();
        
                    BubbleSort.bubbleSort(dados); // Ordena o array
        
                    // Marca o tempo de término
                    long finalizar = System.nanoTime();
        
                    // Calcula o tempo de execução
                    long duracao = finalizar - comecar;
        
                    System.out.println("Array ordenado:");
                    BubbleSort.printArray(dados); // Imprime o array ordenado
        
                    // Imprime o tempo de execução
                    System.out.println("Tempo de execucao do Bubble Sort: " + duracao/1000000 + " milisegundos");
                } else {
                    System.out.println("Nenhum dado foi lido do arquivo.");
                    }
                }
            }
        }
