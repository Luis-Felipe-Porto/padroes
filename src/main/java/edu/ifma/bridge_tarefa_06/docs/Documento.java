package edu.ifma.bridge_tarefa_06.docs;

import edu.ifma.bridge_tarefa_06.formatacao.Formatacao;

public abstract class Documento {
    private Formatacao estilo;

    public Documento(Formatacao estilo) {
        this.estilo = estilo;
    }

    public Formatacao getEstilo() {
        return estilo;
    }

    public void setEstilo(Formatacao estilo) {
        this.estilo = estilo;
    }

    public String formatar(String str){
        this.estilo.formatar();
        return "Formatando Documento";
    }  
}
