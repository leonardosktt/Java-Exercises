package br.com.leonardo.javacore.test;

import br.com.leonardo.javacore.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante denis = new Estudante();

        denis.nome = "Denis";
        denis.idade = 15;
        denis.matricula = "G4547G0";

        System.out.println(denis.nome);
        System.out.println(denis.idade);
        System.out.println(denis.matricula);

    }
}
