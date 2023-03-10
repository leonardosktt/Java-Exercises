package br.com.leonardo.javacore.introducaoclasses.test;

import br.com.leonardo.javacore.introducaoclasses.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante denis = new Estudante(); // New Estudantes() = Objetos, Classe Estudante = Molde.
                                           // Denis = Variável de referencia.

        denis.nome = "Denis";
        denis.idade = 15;
        denis.matricula = "G4547G0";

        System.out.println(denis.nome);
        System.out.println(denis.idade);
        System.out.println(denis.matricula);

    }
}