package br.com.leonardo.javacore.introducaometodos.classes;

public class Estudante { // CLASSE = Estudante

    // ATRIBUTOS = nome, idade, notas... 
    public String nome;
    public int idade;
    public double[] notas;

    // MÉTODOS = imprime()
    public void imprime() {

        System.out.println(this.nome);
        System.out.println(this.idade);
        if (notas != null) {
            for (double nota : notas)
                System.out.print(nota + " ");
        }
    }

    // MÉTODOS = tirarMedia ()
    public void tirarMedia() {
        if (notas == null) {
            System.out.println("Este aluno não possui notas!");
            return;
        }
        double media = 0;
        for (double nota : notas) {
            media += nota;
        }
        media = media / notas.length;

        if (media > 6) {
            System.out.println("Aluno Aprovado!");
            return;
        }
        System.out.println("Aluno Reprovado!");

    }
}
