package javafundamentos;

import java.util.ArrayList;

public class JavaFundamentos {

    public static void main(String[] args) {

        // instanciando uma pessoa
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Gian");
        pessoa.setIdade(13);

        //instanciando um trabalhador que herda as caracteristicas
        //de uma pessoa
        Trabalhador trabalhador = new Trabalhador();
        //caracteristicas de uma pessoa
        trabalhador.setNome("paulo");
        trabalhador.setIdade(30);
        //caracteristicas do trabalhador
        trabalhador.setProfissao("pedreiro");
        trabalhador.setSalario(800);
        trabalhador.andar("Rua Maurício Cardoso, Jardim Mauá, Novo Hamburgo RS");
        int tempoDeTrabalho = trabalhador.getTempoDeTrabalho();

        // instanciando o chefe que vai herdar características
        // de um trabalhador e por sua vez como o trabalhador herda
        //as características de uma pessoa, o chefe tambem herdara
        Chefe chefe = new Chefe();
        //caracteristicas de uma pessoa
        chefe.setNome("paulo");
        chefe.setIdade(30);
        //caracteristicas de um trabalhador
        chefe.setProfissao("pedreiro");
        chefe.setSalario(800);
        chefe.andar("Rua Maurício Cardoso, Jardim Mauá, Novo Hamburgo RS");
        //caracteristicas do chefe que sobreescrevem o trabalhador
        int tempoDeTrabalhoChefe = chefe.getTempoDeTrabalho();

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(pessoa);
        pessoas.add(trabalhador);
        pessoas.add(chefe);

        for (Pessoa pessoa1 : pessoas) {
            String mensagem = "seja bem vindo" + pessoa1.getNome();

            if (pessoa1 instanceof Chefe) {
                mensagem = "chefe: " + mensagem;

            } else if (pessoa1 instanceof Trabalhador) {
                Trabalhador pessoa1Trabalhador = (Trabalhador) pessoa1;
                mensagem = pessoa1Trabalhador.getProfissao() + ": " + mensagem;

            }
            System.out.println(mensagem);
            ;

        }

    }
}
