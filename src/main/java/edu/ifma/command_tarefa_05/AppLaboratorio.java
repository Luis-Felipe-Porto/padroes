package edu.ifma.command_tarefa_05;

import edu.ifma.command_tarefa_05.command.RoboAplicacaoProdutoQuimico;
import edu.ifma.command_tarefa_05.command.RoboElevacaoTemperatura;

public class AppLaboratorio {
    public static void main(String[] args) {
        LabAutomate automate = new LabAutomate();

        Experimento experimento = new Experimento();

        /*Chamando os dois robores */
        RoboAplicacaoProdutoQuimico robo1 = new RoboAplicacaoProdutoQuimico(experimento);
        RoboElevacaoTemperatura robo2 = new RoboElevacaoTemperatura(experimento);

        /*Atomatizando os processos do laboratorio*/
        automate.addCommand(robo1);
        automate.addCommand(robo2);

        automate.executeCommands();
    }
}
