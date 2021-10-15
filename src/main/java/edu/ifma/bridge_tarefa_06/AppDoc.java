package edu.ifma.bridge_tarefa_06;

import edu.ifma.bridge_tarefa_06.docs.Comprovante;
import edu.ifma.bridge_tarefa_06.docs.Documento;
import edu.ifma.bridge_tarefa_06.docs.Requisicao;
import edu.ifma.bridge_tarefa_06.formatacao.Formatacao;
import edu.ifma.bridge_tarefa_06.formatacao.Menor;
import edu.ifma.bridge_tarefa_06.formatacao.Padrao;

public class AppDoc {
    public static void main(String[] args) {
        Formatacao menor = new Menor();
        Formatacao padrao = new Padrao(); 

        Documento doc1 = new Comprovante(menor);
        Documento doc2 = new Requisicao(padrao);

        System.out.println(doc2.toString());
        System.out.println(doc1.toString());
    }
}
