package CompraDesconto;

import javax.swing.JOptionPane;

/*
*
* @author Ailton Lima de Andrade
*/
public class Calcular_Desconto {
    
    /*
    * Método: calcularDesconto()
    * @param: valor.
    * @return: nenhum valor de retorno.
    * Funcionalidade: Realizar o cálculo do desconto conforme o valor da variável "valor" 
    * e apresenta a variável "valor" e "desconto".
    */
    static void calcularDesconto(float valor){
        //Realiza o cálculo do desconto.
        if(valor >= 200){
            JOptionPane.showMessageDialog(null, "O valor da compra é " + (valor - (valor * 0.20) + " com desconto de 20%"), 
                        "Compra", JOptionPane.INFORMATION_MESSAGE);
        }else if(valor < 200){
            JOptionPane.showMessageDialog(null, "O valor é de: " + valor + " sem desconto!", 
                        "Compra", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    /*
    * Método: main()
    * @param: String [] args: vetor de argumentos fornecidos na linha de comando durante a chamada do sistema.
    * @return: nenhum valor de retorno.
    * Funcionalidades: Realizar a leitura da váriavel "valor" e a chamada do método "calcularDesconto".      
    */ 
    public static void main(String[] args) {
        //Declaração da variável "valor".
        int valor;
        
        //Leitura da variável "valor".
        valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da compra: ", 
                    "Compra", JOptionPane.INFORMATION_MESSAGE));
        
        calcularDesconto(valor);
    }
}
