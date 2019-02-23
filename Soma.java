package MeuPrimeiroProjeto;

import javax.swing.JOptionPane;

/**
 *
 * @ Ailton Lima de Andrade
 */
public class Soma{
    public static void main(String[] args) {
        //Declaração das váriaveis
        String nome;
        double primeiroValor, segundoValor, soma; 
        
        //Faz a leitura do nome
        nome = JOptionPane.showInputDialog(null, "Digite o seu nome:", "nome",JOptionPane.INFORMATION_MESSAGE);
        
        //Faz a leitura dos números
        primeiroValor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número: ", "Primeiro Número",JOptionPane.INFORMATION_MESSAGE));
        segundoValor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número: ", "Segundo Número",JOptionPane.INFORMATION_MESSAGE));
        
        //Efetua a soma dos números digitados
        soma = primeiroValor + segundoValor;
        
        //Acresenta o nome e a soma dos números digitados
        System.out.println("O meu nome é: " + nome + " o valor da soma é: " + soma);
    } 
}
