package br.com.leonardo.javacore.introducaometodos.test;

import br.com.leonardo.javacore.introducaometodos.classes.Calculadora;

public class ParametrosTest {  
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        int num1= 10;
        int num2 = 20;

        calc.alteraDoisParametros(num1, num2);
    }
    
}