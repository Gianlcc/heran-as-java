package javafundamentos;

public class Matriz {

    public static void main(String[] args) {
        int[][] jogoDaVelha = new int[3][3];
        jogoDaVelha[0][0] = 2;
        jogoDaVelha[1][0] = 1;
        jogoDaVelha[2][2] = 2;

        for (int i = 0; i < 3; i += 1) {
            for (int j = 0; j < 3; j += 1) {
                System.out.println(jogoDaVelha[i][j]);
            }
        }

        // bidimensional  = pilha dentro de pilha
        int[][] matrizNumeros = new int [3] [3];
        
        //posso pegar a referencia de uma pilha para editar ela
        //sem precisar ficar chamando a matriz diretamente
        int[] posicao0 = matrizNumeros[0];
        //ate
        int[] posicao2 = matrizNumeros[2];
        //editamos a matriz atravez de uma referencia
        posicao0[0] = 1;
        posicao0[1] = 2;
        posicao0[2] = 3;
        
        for (int i = 0; i < matrizNumeros.length; i++ ) {
            for(int j = 0; j < matrizNumeros[i].length; j++) {
                System.out.println(
                "i = " + i + "; "
                + "j = " +j +"; "
                + "= "  + matrizNumeros[i][j]       
                );
            }
        }        
        
                
    }
}
