package ConverterDecimal;

import javax.swing.JOptionPane;

/**
 *
 * @author Ailton Lima de Andrade
 */
public class Converter_Decimal{

    /*
    * Método: converterDecimal()
    * @param: numero.
    * @return: restoDivisao.
    * Funcionalidade: Realiza a conversão de binário para decimal.
     */
    public static double converterDecimal(int numero) {
        /*Declaração das váriaveis "i" que representa o contador 
        e "restoDivisao" que representa o resto da divisão*/
        int i;
        double restoDivisao;

        //Inicialização das váriveis.
        i = 0;
        restoDivisao = 0;

        //Realiza a conversão da váriavel "numero" de binário para decimal.
        while (numero / 10 != 0) {
            restoDivisao = restoDivisao + ((numero % 10) * Math.pow(2, i));
            numero = numero / 10;
            i = i + 1;
        }
        restoDivisao = restoDivisao + ((numero % 10) * Math.pow(2, i));

        return restoDivisao;
    }

    /*
    * Método: main()
    * @param: String [] args: vetor de argumentos fornecidos na linha de comando durante a chamada do sistema.
    * @return: nenhum valor de retorno.
    * Funcionalidades: Realizar a leitura da váriavel "numero" e apresentar a váriavel "numero" 
    * e o retorno do método "converterDecimal".      
     */
    public static void main(String[] args) {
        //Declaração da váriavel "número" que representa o número que é digitado pelo usuário.
        int numero;

        //Leitura da váriavel "número".
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ",
                "Número", JOptionPane.INFORMATION_MESSAGE));

        //Apresentação da váriavel "número" e do retorno do método "converterDecimal".
        JOptionPane.showMessageDialog(null, "O número em binário é: " + numero
                + "\nO número em decimal é: " + converterDecimal(numero));
    }
}
