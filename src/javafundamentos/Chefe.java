package javafundamentos;

public class Chefe extends Trabalhador {

    @Override
    public float getSalario() {
        return super.getSalario() * 2;

    }

    @Override
    public int getTempoDeTrabalho() {
        return 24;
    }
}
