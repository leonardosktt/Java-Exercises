package br.com.leonardo.javacore.introducaometodos.test;

import br.com.leonardo.javacore.introducaometodos.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        
    Pessoa pessoa = new Pessoa();

    pessoa.setNome("RAFAELO");
    pessoa.setIdade(12);

    System.out.println(pessoa.getNome());
    System.out.println(pessoa.getIdade());
    // pessoa.imprime();

    }
}
