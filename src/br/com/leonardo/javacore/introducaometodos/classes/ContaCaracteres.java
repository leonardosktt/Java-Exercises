package br.com.leonardo.javacore.introducaometodos.classes;

public class ContaCaracteres {

    public String[] frase;

    public void calculaQtdeCaracteres() {

        for (String aux : frase) {

            System.out.println(aux.length());
        }
    }

    public static void main(String[] args) {
        ContaCaracteres carac = new ContaCaracteres();

        String [] cara = {"123456789"};
        carac.frase = cara;

        carac.calculaQtdeCaracteres();
        
    }

}