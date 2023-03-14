package br.com.leonardo.javacore.introducaometodos.classes;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salario;

    public void imprime() {
        System.out.println("--------------------------");
        System.out.println("Funcionário: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if (salario != null) {
            for (double aux : salario) {
                System.out.print(aux + " ");
            }
        }
        tirarMedia();

    }

    public void tirarMedia() {

        if (salario == null) {
            System.out.println("Salário não informado!");
            return;
        }
        double somaSalario = 0;
        for (double aux : salario) {
            somaSalario += aux;
            somaSalario = somaSalario / salario.length;
        }
        somaSalario = somaSalario / salario.length;
        System.out.println("\nA Média salarial dos ultimos " + salario.length + " salarios do(a) " + this.nome
                + " é: " + somaSalario);

    }

}
