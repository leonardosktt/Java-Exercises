package br.com.leonardo.javacore.introducaometodos.test;

import br.com.leonardo.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante estud = new Estudante();
        Estudante estud2 = new Estudante();

        estud.nome = "CLAUDIO";
        estud.idade = 15;
        estud.notas= new double [] {1,1,1};

        

        estud2.nome = "teste";
        estud2.idade = 12;
        estud2.notas= new double [] {10,10,10};

        estud.imprime();
        estud.tirarMedia();

        estud2.imprime();
        estud2.tirarMedia();
        

    }
}
