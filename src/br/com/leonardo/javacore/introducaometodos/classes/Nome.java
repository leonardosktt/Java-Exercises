package br.com.leonardo.javacore.introducaometodos.classes;

import javax.swing.JOptionPane;

public class Nome {

    public String nomeCompleto;
    public String caixaAlta;
    public String caixaBaixa;

    public void formatarNome(){
        
        nomeCompleto = JOptionPane.showInputDialog(null, "Digite o nome: ");

        caixaAlta = nomeCompleto.toUpperCase();
        caixaBaixa = nomeCompleto.toLowerCase();

        System.out.println(caixaAlta);
    }
    
}
