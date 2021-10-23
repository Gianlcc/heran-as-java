
package javafundamentos;

import java.util.ArrayList;


public class TratamentoDeErros {
    public static void main(String[] args) {
      
        ArrayList<Integer> contas = new ArrayList<>();
       
        
        //o try (tentar), faz com que o codigo tente executar
        // e se der errado ele executa o catch
        try {
            // vai dar erro pois não existe este item dentro
            // do array ainda
            int conta = contas.get(0);
            
            System.out.println(" conta = " + conta);
        } catch (Exception e) {
            System.out.println("conta não encontrada");
                    
            
            
            
        }
    }
}
