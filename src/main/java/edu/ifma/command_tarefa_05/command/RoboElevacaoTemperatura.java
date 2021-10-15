package edu.ifma.command_tarefa_05.command;

import edu.ifma.command_tarefa_05.Experimento;
import edu.ifma.command_tarefa_05.RoboAction;

public class RoboElevacaoTemperatura implements RoboAction{
    private Experimento  experimento;

    public RoboElevacaoTemperatura(Experimento experimento) {
        this.experimento = experimento;
    }
    @Override
    public void execute() {
        this.experimento.elevacaoDeTemperatura();
    }
}
