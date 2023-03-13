package br.com.leonardo.javacore.introducaometodos.test;

import br.com.leonardo.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante estud = new Estudante();

        estud.nome = "CLAUDIO";
        estud.idade = 15;
        // estud.notas= new double [] {1,1,1};

        estud.imprime();

  
        estud.tirarMedia();

    }
}
