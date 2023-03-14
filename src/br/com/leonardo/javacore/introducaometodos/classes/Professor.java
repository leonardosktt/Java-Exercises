package br.com.leonardo.javacore.introducaometodos.classes;

// CLASSE = Professor
public class Professor {

    // ATRIBUTOS = nome, matricula, cpf...
    public String nome;
    public String matricula;
    public int cpf;
    public int rg;

    //MÉTODO = imprime ()
    public void imprime() { // variavel AUZ espera um objeto do tipo PROFESSOR
        System.out.println("---------");
        System.out.println(this.cpf);
        System.out.println(this.matricula); // this pega valores de dentro do próprio objeto
        System.out.println(this.nome);
        System.out.println(this.rg);
    }
}
