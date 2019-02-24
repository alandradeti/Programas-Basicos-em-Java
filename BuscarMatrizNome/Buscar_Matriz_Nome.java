package BuscarMatrizNome;

import javax.swing.JOptionPane;

/*
*
* @ Ailton Lima de Andrade
*/
public class Buscar_Matriz_Nome{
    /*
    * Método: existe()
    * @param: nomeBuscado.
    * @return: true ou false.
    * Funcionalidade: Verifica se a váriavel "nomeBuscado" existe na matriz "nome[][]".
    */
    static boolean existe(String nomeBuscado){
        //Declaração da matriz "nome[][]"
        String nome [][] = new String [2][2];
        //Preenchimento estático da Matriz
        nome[0][0] = "Caio";
        nome[0][1] = "Marcos";
        nome[1][0] = "Pablo";     
        nome[1][1] = "Felipe";
        
        //Verifica se a váriavel "nomeBuscado" digitado pelo usuário está dentro da matriz "nome[][]" e retorno "Verdadeiro"
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2;j++){
                if(nome[i][j].equals(nomeBuscado)){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    /*
    * Método: main()
    * @param: String [] args: vetor de argumentos fornecidos na linha de comando durante a chamada do sistema.
    * @return: nenhum valor de retorno.
    * Funcionalidades: Realizar a leitura da váriavel "nomeBuscado", a chamada do método "existe"
    * e apresentar a mensagem conforme o retorno do método.      
    */
    public static void main(String[] args) {
        //Declaração da váriavel "nomeBuscado" que representa o nome digitado pelo usuário
        String nomeBuscado;
        
        //Leitura da váriavel "nomeBuscado"
        nomeBuscado = JOptionPane.showInputDialog(null,"Digite o seu nome", "Nome", JOptionPane.INFORMATION_MESSAGE);
        
        //Verifica se o retorno do método "existe" é "Verdadeiro" ou "Falso" e apresentar a mensagem conforme o retorno.
        if(existe(nomeBuscado)==true){
            JOptionPane.showMessageDialog(null,"O nome está na matriz!");
        }else{
            JOptionPane.showMessageDialog(null,"O nome não está na matriz!");
        }
        
    }
}
