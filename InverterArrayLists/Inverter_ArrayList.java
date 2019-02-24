package InverterArrayLists;

import java.util.ArrayList;

/*
*
* @author Ailton Lima de Andrade
*/
public class Inverter_ArrayList {
    
    /*
    * Método: inverterArrayList()
    * @param: array.
    * @return: nenhum valor de retorno.
    * Funcionalidade: Realizar  inversão do ArrayList".
     */
    public static void inverterArrayList(ArrayList array){
        /*Declaração do ArrayList "arrayTemporario" que representa o ArrayList que armazena
        temporariamente os elementos do ArrayList "array" e "i" que representa o contador.*/
        ArrayList arrayTemporario = new ArrayList();
        int i;
        
        //Realiza a inversão do Arraylist "array".
        for(i=array.size()-1; i>=0;i--){
            arrayTemporario.add(array.get(i));
            array.remove(i);

        }
        array.clear();
        for(i=0;i<arrayTemporario.size();i++){
            array.add(arrayTemporario.get(i));
        }

 
    }
    
    /*
    * Método: visualizaArrayList()
    * @param: array.
    * @return: nenhum valor de retorno.
    * Funcionalidade: Realiza a apresentação do ArrayList".
     */
    public static void visualizaArrayList(ArrayList array) {
        //Declaração da váriavel "i" que representa o contador.
        int i;
        
        //Realiza a apresentação do ArrayList.
        for (i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + "  ||  ");
        }
        System.out.println();
    }
    
    /*
    * Método: main()
    * @param: String [] args: vetor de argumentos fornecidos na linha de comando durante a chamada do sistema.
    * @return: nenhum valor de retorno.
    * Funcionalidades: Realizar a chamada dos metódos "visualizaArrayList" e "inverterArrayList".      
     */
    public static void main(String[] args) {
        //Declaração e preenchimento do ArrayList "array".
        ArrayList array = new ArrayList();
        array.add(4.3f); array.add(6.1f); array.add(0.1f); array.add(1.9f);
        array.add(2.4f); array.add(7.2f); array.add(5.5f);
        
        //Apresentação do ArrayList original e retorno do método "visualizaArrayList".
        System.out.println("ArrayList Original: ");
        visualizaArrayList(array);
        
        //Realiza a chamada do método "inverterArrayList".
        inverterArrayList(array);
        
        //Apresentação do ArrayList invertido e retorno do método "visualizaArrayList".
        System.out.println("ArrayList Invertido: ");
        visualizaArrayList(array);
    }
}
