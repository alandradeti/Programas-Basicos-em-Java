package TipoTriangulo;

import javax.swing.JOptionPane;

/*
*
* @author Ailton Lima de Andrade
*/
public class Classificar_Triangulo {
    /*
    * Método: classificarTriangulo()
    * @param: a , b , c.
    * @return: nenhum valor de retorno.
    * Funcionalidade: Classificar o tipo de triângulo conforme os lados digitados pelo usuário".
    */
    static void classificarTriangulo(float a,float b,float c){
        //Fazer a verificação do tipo de triângulo
        if(a == b && a == c){
            JOptionPane.showMessageDialog(null, "O Triângulo é Equilátero!", 
                    "Triangulo", JOptionPane.INFORMATION_MESSAGE);
        }else if(a != b && c != a && b != c){
            JOptionPane.showMessageDialog(null, "O Triângulo é Escaleno!", 
                    "Triangulo", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "O Triângulo é Isósceles!", 
                    "Triangulo", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    /*
    * Método: main()
    * @param: String [] args: vetor de argumentos fornecidos na linha de comando durante a chamada do sistema.
    * @return: nenhum valor de retorno.
    * Funcionalidades: Realizar a leitura das váriaveis "a","b","c" e a chamada do método classificaTriangulo.      
    */
    public static void main(String[] args) {
        /*Declaração das variáveis "a", "b" e "c", que representam 
        os lados do triângulo informados pelo usuário*/
        float a ,b ,c;
        
        //Leitura das variáveis "a","b" e "c"
        a = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o tamanho do lado A: ", 
                "Lado A", JOptionPane.INFORMATION_MESSAGE));
        b = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o tamanho do lado B: ", 
                "Lado B", JOptionPane.INFORMATION_MESSAGE));
        c = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o tamanho do lado C: ", 
                "Lado C", JOptionPane.INFORMATION_MESSAGE));
        
        classificarTriangulo(a,b,c);
    }
}
