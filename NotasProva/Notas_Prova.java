package NotasProva;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
*
* @ Ailton Lima de Andrade
*/
public class Notas_Prova{
    
    /*
    * Método: formataNumero()
    * @param: numero.
    * @return: formata.format(numero).
    * Funcionalidade: Realizar a formatação de um número decimal.
    */
    static String formataNumero(double numero) {  
        DecimalFormat formata = new DecimalFormat("#0.00");  
        return formata.format(numero);
    }
    
    /*
    * Método: calcularNotas()
    * @param: numero.
    * @return: nenhum valor de retorno.
    * Funcionalidade: Realizar o cálculo das notas.
    */
    static void calcularNotas(int quantidadeNotas){
        /*Declaração das variáveis "soma" que representa a soma das notas,
        "menorNotas" que representa a menor nota do vetor "notas[]",
        "maiorNotas" que representa a maior nota do vetor "notas[]",
        "media" que representa a media das notas e "notas[]" que que representa as notas */
        int soma, menorNota, maiorNota;
        double media;
        int notas[] = new int[quantidadeNotas];
        
        //Inicialização das variáveis.
        soma = 0;
        media = 0;
        
        //Leitura das notas.
        for(int i=0; i<quantidadeNotas;i++){
            notas[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a " + (i+1) + "° nota: ", "Número", JOptionPane.INFORMATION_MESSAGE));
        }
        
        //Armazenamento da primeira nota.
        menorNota = notas[0];
        maiorNota = notas[0];
        
        //Cálculo da média e das maiores e menores notas.
        for(int i = 0; i<quantidadeNotas; i++){
            System.out.println("A " +(i+1)+ "° nota é: " + notas[i]);
            soma += + notas[i];
            
            //Cálcular a média das notas
            media = (double)soma/quantidadeNotas;
            
            //Encontrar a menor nota.
            if(notas[i] < menorNota){
                menorNota = notas[i];
            }
            
            //Encontrar a maior nota.
            if(notas[i] > maiorNota){
                maiorNota = notas[i];
            }
        }
        
        //Apresentar as váriaveis "maiorNota", "menorNota", "soma" e "media" formatada.
        System.out.println("A maior nota é: " + maiorNota 
                + "\nA menor nota é: " + menorNota 
                + "\nA soma das notas é: " + soma 
                + "\nA média das notas é: " + formataNumero(media));

    }
    
     /*
    * Método: main()
    * @param: String [] args: vetor de argumentos fornecidos na linha de comando durante a chamada do sistema.
    * @return: nenhum valor de retorno.
    * Funcionalidades: Realizar a leitura da variável "quantidadeNotas" e 
    * a chamada do método "calcularNotas".      
    */ 
    public static void main(String[] args) {
        //Declaração da váriavel "quantidadeNotas" que representa a quantidade de notas
        int quantidadeNotas;
        
        //Leitura da variável "quantidadeNotas".
        quantidadeNotas = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de notas: ", 
                "Número", JOptionPane.INFORMATION_MESSAGE));
        
        calcularNotas(quantidadeNotas);
    }
}
