package br.com.leonardo.javacore.introducaometodos.test;

import br.com.leonardo.javacore.introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        
        Professor prof = new Professor();

        prof.cpf = 1310123;
        prof.matricula = "0e8j9e23nr9";
        prof.nome = "leonardo";
        prof.rg = 123123;
        

        Professor prof2 = new Professor();

        prof2.cpf = 111111;
        prof2.matricula = "1m3021n9";
        prof2.nome = "Rafael";
        prof2.rg = 222222;

        // prof.imprime(prof);     //fala para a variavel AUZ (da classe imprime ) fazer referencia para o objeto prof
        // prof.imprime(prof2);    //fala para a variavel AUZ (da classe imprime ) fazer referencia para o objeto prof2

        prof.imprime();
        prof2.imprime();
        
    }
}
