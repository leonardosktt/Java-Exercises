package br.com.leonardo.javacore.introducaoclasses.test;

import br.com.leonardo.javacore.introducaoclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        
        Carro carro = new Carro();

        carro.modelo = "Celta";
        carro.placa="EGN9431";
        carro.veloMax = 200;

        System.out.println("O modelo é: "+carro.modelo);
        System.out.println("A placa é: "+carro.placa);
        System.out.println("A velocidade máxima é: "+carro.veloMax);

    }
    
}
