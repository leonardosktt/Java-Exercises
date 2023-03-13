package br.com.leonardo.javacore.introducaometodos.test;

import br.com.leonardo.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();     //somaDoisNumeros é o metodo = (), Atributos não usam ().
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(5, 5); //colocar os numeros nos parametros é = argumento

        calc.divideDoisNumeros (20,1);

        System.out.println("Continua execução!");
        System.out.println("---------");

        int[] numeros ={1,2,3,4,5,6};
        calc.somaArraysAntigo(numeros);

        calc.somaArrays(1,2,3,4,5,6 );

    }

}
