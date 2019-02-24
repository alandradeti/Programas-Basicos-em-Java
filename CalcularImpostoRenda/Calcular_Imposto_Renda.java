
package CalcularImpostoRenda;

import javax.swing.JOptionPane;

/*
*
* @author Ailton Lima de Andrade
*/
public class Calcular_Imposto_Renda {
    /*
    * Método: calculaImpostoRenda()
    * @param: salario.
    * @return: imposto.
    * Funcionalidade: Realizar o cálculo de um imposto de renda".
    */
    public static double calcularImpostoRenda(double salario){
        //Declaração da váriavel "imposto" que representa o imposto.
        double imposto;
        
        //Inicialização da váriavel.
        imposto = 0;
        
        //Realizar o cálculo do imposto.
        if(salario<=2000){
            imposto = salario * 0;
        }else if(salario <= 4000){
            imposto = salario * 0.05;
        }else if(salario <= 10000){
            imposto = salario * 0.08;
        }else if(salario > 10000){
            imposto = salario * 0.10;
        }
        
       return imposto;
    }
    
    /*
    * Método: main()
    * @param: String [] args: vetor de argumentos fornecidos na linha de comando durante a chamada do sistema.
    * @return: nenhum valor de retorno.
    * Funcionalidades: Realizar a leitura da váriavel "salario" e a chamada do método "calcularImpostoRenda".      
    */ 
    public static void main(String[] args) {
        //Declaração da váriavel "salario"  que representa o salário.
        double salario;
        
        //Leitura da váriavel "salário".
        salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o salário: ",
                "Salário", JOptionPane.INFORMATION_MESSAGE));
        
        //Apresentação da variável "salário" e o retorno do método "calcularImpostoRenda".
        JOptionPane.showMessageDialog(null,"O salário é: R$" + salario 
                + "\nO imposto é de : R$" + calcularImpostoRenda(salario));
    }
}
