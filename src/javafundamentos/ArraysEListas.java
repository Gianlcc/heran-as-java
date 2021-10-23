
package javafundamentos;

import java.util.ArrayList;
import java.util.List;


public class ArraysEListas {
    public static void main(String[] args) {
        //crie uma pilha de textos dinamicas, ou sja
        // sem limete pré estabelecido de tamanho
        ArrayList<String> nomes = new ArrayList<String>();
        
        nomes.add("Gian");
        nomes.add("Lucca");
        nomes.add("Pedro");
        
        for (String nome : nomes) {
            System.out.println("Nome = " + nome);
        } 
        //verifica se contem o valor passado9
        if (nomes.contains("gian")) {
            System.out.println("Gian esta na lista");
            
        }
         // tenta remover um item  e se conseguiu retorna true
         boolean foiRemovido = nomes.remove("gian");
         if (foiRemovido) {
             System.out.println(" Gian foi removido da lista agora");
             
         }
         //tamebm funciona com o for int normal
         for (int i = 0; i< nomes.size(); i++) {
             nomes.get(i);
             
             //tambem podemos removerpassando a posição do item
             //na nossa pilha/array
             nomes.remove(0);
             
             //a lista nada mais é que um array list simplificado
             List<String> lista = new ArrayList<>();
             lista.add("Gian");
             lista.add("Lucca");
             lista.add("Carol");
             
                   
                     
             
         }
    }
}
