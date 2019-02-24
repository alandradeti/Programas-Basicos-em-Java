package ConverterBinario;

import javax.swing.JOptionPane;

/**
 *
 * @author Ailton Lima de Andrade
 */
public class Converter_Binario{

    /*
    * Método: converterBinario()
    * @param: numero.
    * @return: restoDivisao.
    * Funcionalidade: Realiza a conversão de decimal para binário.
     */
    public static int converterBinario(int numero) {
        /*Declaração das váriaveis "restoDivisao" que representa o resto da divisão inteira
        e "i" que representa contador*/
        int restoDivisao, i;

        //Inicialização das váriaveis
        i = 1;
        restoDivisao = 0;

        //Conversão do valor da váriavel "numero" para binário
        while (numero / 2 != 0) {
            restoDivisao = restoDivisao + ((numero % 2) * i);
            numero = numero / 2;
            i = i * 10;
        }

        //Armzenamento do número em binários
        restoDivisao = restoDivisao + ((numero % 2) * i);
        return restoDivisao;
    }

    /*
    * Método: main()
    * @param: String [] args: vetor de argumentos fornecidos na linha de comando durante a chamada do sistema.
    * @return: nenhum valor de retorno.
    * Funcionalidades: Realizar a leitura da váriavel "numero" e apresentar a váriavel "numero" 
    * e o retorno do método "converterBinario".      
     */
    public static void main(String[] args) {
        //Declaração da váriavel "número" que representa o número que é digitado pelo usuário
        int numero;

        //Leitura da váriavel "número"
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ",
                "Número", JOptionPane.INFORMATION_MESSAGE));

        //Apresentação da váriavel "número" e do retorno do método "converterBinario"
        JOptionPane.showMessageDialog(null, "O número em decimal é: " + numero
                + "\nO número em binário é: " + converterBinario(numero));
    }
}
