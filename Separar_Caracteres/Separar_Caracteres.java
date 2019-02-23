package Separar_Caracteres;

import javax.swing.JOptionPane;

/**
 *
 * @author Ailton Lima de Andrade
 */
public class Separar_Caracteres {

    //Declaração da variável global “cadeiaCaracteres” que representa o que foi digitado pelo usuário
    public static String cadeiaCaracteres;

    /*
    * Método: calcularDigitos()
    * @param: cadeiaCaracteres.
    * @return: qtdCaracteres.
    * Funcionalidade: Realizar o cálculo da quantidade de caracteres".
    */
    public static int calcularCaracteres(String cadeiaCaracteres) {
        /*Declaração da váriavel interna "qtdCaracteres" do método "calcularDigitos" 
        que representa a quantidade de caracteres da váriavel "cadeiaCaracteres"*/
        int qtdCaracteres;

        //Calcular "qtdCaracteres"
        qtdCaracteres = cadeiaCaracteres.length();

        return qtdCaracteres;
    }

    /*
    * Método: separarCaracteres()
    * @param: valor, qtdDigitos.
    * @return: caracteres.
    * Funcionalidade: Realizar a separação dos caracteres".
    */
    public static String separarCaracteres(String valor, int qtdDigitos) {
        //Declaração da váriavel interna "caracteres" do método "separarDigitos" que representa os caracteres separados
        String caracteres = "";

        //Realiza a separação dos caracteres
        for (int i = 0; i < cadeiaCaracteres.length(); i++) {
            if (i < cadeiaCaracteres.length() - 1) {
                caracteres += cadeiaCaracteres.charAt(i) + ", ";
            } else {
                caracteres += cadeiaCaracteres.charAt(i) + ". ";
            }
        }

        return caracteres;
    }

    /*
    * Método: menu()
    * @param: parâmetros inexistente.
    * @return: opcaoSelecionada.
    * Funcionalidade: Apresentar as opções do menu para a seleção de "Caracteres" ou "Números".
    */
    public static int menu() {
        //Declaração das váriaveis internas do método "menu" que representam as opções do menu
        int opcaoSelecionada;
        //Armazenamento das opções a serem selecionas no vetor "opcoes[]" 
        String[] opcoes = {"Caracteres", "Números"};

        //Armazenamento da opção selecionada na váriavel "opcaoSelecionada"
        opcaoSelecionada = JOptionPane.showOptionDialog(null, "Escolha o que deseja separar: ",
                "Separador",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );

        //Leitura da várivel "cadeiaCaracteres" conforme a opção selecionada
        if (opcaoSelecionada == 0) {
            cadeiaCaracteres = JOptionPane.showInputDialog(null, "Digite uma palavra: ");
        } else {
            cadeiaCaracteres = JOptionPane.showInputDialog(null, "Digite um número: ");
        }

        return opcaoSelecionada;
    }

    /*
    * Método: visualizarDados()
    * @param: opcaoMenu.
    * @return: nenhum valor de retorno.
    * Funcionalidade: Apresentar a váriavel "cadeiaCaracteres", "qtdCaracteres" e o retorno do método "separarCaracteres".
    */
    public static void visualizarDados(int opcaoMenu) {
        //Declaração da variável interna "qtdCaracteres" do método visualizarDados que representa a quantidade de caracteres
        int qtdCaracteres;

        //Armzanamento do retorno do método "calcularDigitos"
        qtdCaracteres = calcularCaracteres(cadeiaCaracteres);

        if (opcaoMenu == 0) {
            //Apresentar as váriaveis "cadeiaCaracteres", "qtdCaracteres" e a "Caracteres" retornada do método "separarDigitos"
            JOptionPane.showMessageDialog(null, "A palavra digitada foi: " + cadeiaCaracteres + "."
                    + "\nNúmero de caracteres: " + qtdCaracteres + " caracteres."
                    + "\nOs caracteres são: " + separarCaracteres(cadeiaCaracteres, qtdCaracteres));

        } else {
            //Apresentar as váriaveis "cadeiaCaracteres", "qtdCaracteres" e a "Caracteres" retornada do método "separarDigitos"
            JOptionPane.showMessageDialog(null, "O número digitado foi: " + cadeiaCaracteres + "."
                    + "\nNúmero de dígitos: " + qtdCaracteres + " dígitos."
                    + "\nOs dígitos são: " + separarCaracteres(cadeiaCaracteres, qtdCaracteres));
        }

    }

    /*
    * Método: main()
    * @param: String [] args: vetor de argumentos fornecidos na linha de comando durante a chamada do sistema.
    * @return: nenhum valor de retorno.
    * Funcionalidades: Realizar a chamada dos metódos "menu" e "visualizarDados".      
    */ 
    public static void main(String[] args) {
        //Declaração da váriavel "opcaoMenu" que representa a opção selecionada no menu
        int opcaoMenu;

        //Armazenamento do retorno do método "menu"
        opcaoMenu = menu();

        //Armazenar a "qtdDigitos" retornada pelo método "calcularDigitos"
        visualizarDados(opcaoMenu);

    }
}
