package javafundamentos;

public class Pilha {

    public static void main(String[] args) {
        //pilha de texto com 5 espaços
        String[] pilhaTextos = new String[5];
        //pilha de números inteiros com 3 espaços
        int[] pilhaNumeros = new int[3];
        //colocando valor na pilha
        pilhaTextos[0] = "Gian Lucca";
        // pegando o valor da pilha
        String nome = pilhaTextos[0];
        
        System.out.println("posição 0: " + pilhaTextos[0]);
        System.out.println("posição 1: " + pilhaTextos[1]);
        System.out.println("posição 2  " + pilhaTextos[2]);
        
       pilhaNumeros[0] = 1500;
       pilhaNumeros[1] = 19;
       pilhaNumeros[2] = 576;
       
        System.out.println("posição 0: " + pilhaNumeros[0]);
        System.out.println("posição 1:  " + pilhaNumeros[1]);
        System.out.println("posição 2 "   + pilhaNumeros[2]);
                
    }

}
