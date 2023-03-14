package br.com.leonardo.javacore.introducaometodos.test;

import br.com.leonardo.javacore.introducaometodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();

        func1.nome="RONALDO";
        func1.idade=24;
        func1.salario = new double [] {200,200,400,200};

        func2.nome = "MARIANA";
        func2.idade = 28;
        func2.salario = new double [] {800,100,400};


        func1.imprime();
        func2.imprime();

    }
    
}
