package br.com.leonardo.javacore.introducaometodos.classes;

public class Calculadora {

    public void somaDoisNumeros() { // void = sera executado metodo que não retornará nada.
        System.out.println(5 + 5);
    }

    public void subtraiDoisNumeros() {
        System.out.println(533 - 9);
    }

    public void multiplicaDoisNumeros(int num1, int num2) { // num1 e num2 são parametros
        System.out.println(num1 * num2);

    }

    public int divideDoisNumeros1(int num1, int num2) { // Return tem que ser compatível com o metodo da classe

        if (num2 == 0) {
            return 0;
        }
        return num1 / num2; // return quando da match o IF ele sai fora do IF e volta para a classe que chamou.

    }

    public void divideDoisNumeros(int num1, int num2) { // Return tem que ser compatível com o metodo da classe

        if (num2 != 0) {
            System.out.println(num1 / num2);
            return; //return funciona como um BREAK no método
        }
        System.out.println("Não é possível dividir por 0.");
    }

    public void alteraDoisParametros(int num1, int num2){
       int a1num = 20;      //Variaveis primtivias são impressas diretamente no valor de sua chamada.
       int a2num = 10;

        System.out.println("num1: "+a1num);
        System.out.println("num2: "+a2num);
    }

    

    public void somaArraysAntigo(int [] numeros){
        int soma =0;

        for (int num : numeros){
            soma = soma+num;
        }
        System.out.println(soma); 
    }



    public void somaArrays(int...numeros){
        int soma=0;

        for (int num : numeros){
            soma = soma+num;
        }
        System.out.println(soma);

    }

}