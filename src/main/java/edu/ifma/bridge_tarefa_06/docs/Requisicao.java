package edu.ifma.bridge_tarefa_06.docs;

import edu.ifma.bridge_tarefa_06.formatacao.Formatacao;

public class Requisicao extends Documento{


    public Requisicao(Formatacao estilo) {
        super(estilo);
    }

    @Override
    public String toString() {
        return this.formatar("Formatar teste");
    }

    
    
}
