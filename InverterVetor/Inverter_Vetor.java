package InverterVetor;

/*
*
* @author Ailton Lima de Andrade
*/
public class Inverter_Vetor {

    /*
    * Método: inverterVetor()
    * @param: vet[], N.
    * @return: nenhum valor de retorno.
    * Funcionalidade: Realizar  inversão do vetor".
     */
    public static void inverterVetor(double vetor[], int N) {
        //Declaração das váriaveis "posicao" que representa o índice do vetor e "i" que representa o contador.
        int posicao, i;
        double vetorTemporario[] = new double[N];

        //Inicialização das váriaveis.
        posicao = 0;
        i = 0;

        //Realiza a inversão dos vetores.
        for (i = N - 1; i >= 0; i--) {
            vetorTemporario[posicao] = vetor[i];
            posicao++;
        }
        for (i = 0; i < N; i++) {
            vetor[i] = vetorTemporario[i];
        }

    }

    /*
    * Método: visualizaVetor()
    * @param: vet[], N.
    * @return: nenhum valor de retorno.
    * Funcionalidade: Realiza a apresentação do vetor".
     */
    public static void visualizaVetor(double vetor[], int N) {
        //Declaração da váriavel "i" que representa o contador.
        int i;

        //Realiza a apresentação do vetor.
        for (i = 0; i < N; i++) {
            System.out.print(vetor[i] + "  ||  ");
        }
        System.out.println();
    }

    /*
    * Método: main()
    * @param: String [] args: vetor de argumentos fornecidos na linha de comando durante a chamada do sistema.
    * @return: nenhum valor de retorno.
    * Funcionalidades: Realizar a chamada dos metódos "visualizaVetor" e "inverterVetor".      
     */
    public static void main(String[] args) {
        //Declaração e preenchimento do vetor "vetor[]" e "N" que representa o número de elementos do vetor.
        double vetor[] = {4.3, 6.1, 0.1, 1.9, 2.4, 7.2, 5.5};
        int N = 7;

        //Apresentação do vetor original e retorno do método "visualizaVetor".
        System.out.println("Vetor Original: ");
        visualizaVetor(vetor, N);

        //Realiza a chamada do método "inverterVetor".
        inverterVetor(vetor, N);

        //Apresentação do vetor invertido e retorno do método "visualizaVetor".
        System.out.println("Vetor Invertido: ");
        visualizaVetor(vetor, N);
    }

}
