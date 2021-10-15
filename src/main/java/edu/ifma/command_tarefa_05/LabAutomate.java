package edu.ifma.command_tarefa_05;

import java.util.ArrayList;
import java.util.List;

public class LabAutomate {
    private List <RoboAction> commandList;

    public LabAutomate() {
        this.commandList = new ArrayList<>();
    }
    public void addCommand(RoboAction command){
		this.commandList.add(command);
	}
	
	public void executeCommands(){
		for(RoboAction command : this.commandList){
			command.execute();
		}
	}
}
