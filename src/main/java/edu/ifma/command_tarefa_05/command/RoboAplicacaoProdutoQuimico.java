package edu.ifma.command_tarefa_05.command;

import edu.ifma.command_tarefa_05.Experimento;
import edu.ifma.command_tarefa_05.RoboAction;

public class RoboAplicacaoProdutoQuimico implements RoboAction{
    private Experimento experimento;
    
    public RoboAplicacaoProdutoQuimico(Experimento experimento) {
        this.experimento = experimento;
    }

    @Override
    public void execute() {
        this.experimento.aplicacaoDeProdutoQuimico();
        
    }
}
