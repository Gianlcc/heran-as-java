package javafundamentos;

public class ThreadEstudar implements Runnable {

    private String materia;
    private int tempoDeEstudo;

    public static void main(String[] args) {
        ThreadEstudar matematica = new ThreadEstudar("matematica", 30);
        ThreadEstudar java = new ThreadEstudar("java", 15);

        new Thread(matematica).start();
        new Thread(java).start();
    }

    /**
     * quando criamos um metodo com o mesmo nome da classe sem tipo de retorno,
     * é chamado de constuctor;
     *
     * o constructor fica responsável por realizar o processo de inicialização
     * da nossa classe;
     *
     * pode receber ou não parametros
     *
     * @param materia
     */
    public ThreadEstudar(String materia, int tempoDeEstudo) {
        this.materia = materia;
        this.tempoDeEstudo = tempoDeEstudo;
    }

    public void run() {
        int i = 0;
        while (i < 10) {
            try {
                System.out.println("estudando " + this.materia);
                // faz com que o thread espere para continuar 
                //devemos informar o tempo em milisegundos
                // 100 milisegundos = 1 segundo
                Thread.sleep(this.tempoDeEstudo * 100);
            } catch (Exception e) {
                //ignoravel neste caso
            }

            i += 1;
        }
    }
}
