package br.com.leonardo.javacore.introducaometodos.test;

import br.com.leonardo.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();     //somaDoisNumeros é o metodo = (), Atributos não usam ().
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(5, 5); //colocar os numeros nos parametros é = argumento
        System.out.println("Continua execução!");
        
    }
}
