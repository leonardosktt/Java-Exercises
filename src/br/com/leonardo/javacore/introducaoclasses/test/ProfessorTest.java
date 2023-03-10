package br.com.leonardo.javacore.introducaoclasses.test;

import br.com.leonardo.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();

        prof.nome = "Mario";
        prof.matricula = "F8J98H4";
        prof.cpf = 1093810;
        prof.rg = 16893;

        Professor prof2 = new Professor();
        prof2.nome = "Juliana";
        prof2.matricula = "U9293JR";
        prof2.cpf = 12311;
        prof2.rg = 242424;

        System.out.println(prof.nome);
        System.out.println(prof.matricula);
        System.out.println(prof.cpf);
        System.out.println(prof.rg);
        System.out.println("---------");
        System.out.println(prof2.nome);
        System.out.println(prof2.matricula);
        System.out.println(prof2.cpf);
        System.out.println(prof2.rg);
    }
    
}
