
package javafundamentos;


public class Loops {
    public static void main(String[] args) {
        //criando uma pilha de textos
        String[] pilhaTextos = new String[3];
        pilhaTextos[0] = "gian";
        pilhaTextos[1] = "lucca";
        pilhaTextos[2] = "thielke";
      
        for (int index = 0; index < pilhaTextos.length;  index += 1) {
            System.out.println(
            "index" + index + ";"
            + " dado: " + pilhaTextos[index] + ";"
                   
            );
        } System.out.println("finalizado o loop");
        
        int[] vector = new int [10];
        for (int index = 0; index < 10; index += 1) {
            vector [index] = index + 1;
        }
    }
}
